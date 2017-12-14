package com.geosportfishing.backend.dictionary.dicfishkind.controller;

import com.geosportfishing.backend.dictionary.dicfishkind.entity.DicFishKind;
import com.geosportfishing.backend.dictionary.dicfishkind.service.IDicFishKindServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Controller
//@RequestMapping("user")
@CrossOrigin(origins = {"http://localhost:4200"})
public class DicFishKindController {

    @Autowired
    private IDicFishKindServise dicFishKindServise;

    @GetMapping("/dicfishkind")
    public ResponseEntity<DicFishKind> getDicFishKindById(@RequestParam("id") String id) {
        DicFishKind dicFishKind = dicFishKindServise.getDicFishKindById(Integer.parseInt(id));
        return new ResponseEntity<DicFishKind>(dicFishKind, HttpStatus.OK);
    }

    @GetMapping("/all-dicfishkinds")
    public ResponseEntity<List<DicFishKind>> getAllFishKind() {
        List<DicFishKind> list = dicFishKindServise.getAllDicFishKind();
        return new ResponseEntity<List<DicFishKind>>(list, HttpStatus.OK);
    }

    /*{"articleId": null,"title": "Test","category": "Test"}*/
    @PostMapping("/dicfishkind")
    public ResponseEntity<Void> createArticle(@RequestBody DicFishKind dicFishKind, UriComponentsBuilder builder) {
        boolean flag = dicFishKindServise.createDicFishKind(dicFishKind);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/dicfishkind?id={id}").buildAndExpand(dicFishKind.getFishKindId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/dicfishkind")
    public ResponseEntity<DicFishKind> updateArticle(@RequestBody DicFishKind dicFishKind) {
        dicFishKindServise.updateDicFishKind(dicFishKind);
        return new ResponseEntity<DicFishKind>(dicFishKind, HttpStatus.OK);
    }

    @DeleteMapping("/dicfishkind")
    public ResponseEntity<Void> deleteArticle(@RequestParam("id") String id) {
        dicFishKindServise.deleteDicFishKind(Integer.parseInt(id));
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
