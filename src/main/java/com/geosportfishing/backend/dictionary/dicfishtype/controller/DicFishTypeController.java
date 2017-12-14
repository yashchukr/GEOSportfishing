package com.geosportfishing.backend.dictionary.dicfishtype.controller;

import com.geosportfishing.backend.dictionary.dicfishtype.entity.DicFishType;
import com.geosportfishing.backend.dictionary.dicfishtype.service.IDicFishTypeServise;
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
public class DicFishTypeController {

    @Autowired
    private IDicFishTypeServise dicFishTypeServise;

    @GetMapping("/dicfishtype")
    public ResponseEntity<DicFishType> getDicFishTypeById(@RequestParam("id") String id) {
        DicFishType dicFishType = dicFishTypeServise.getDicFishTypeById(Integer.parseInt(id));
        return new ResponseEntity<DicFishType>(dicFishType, HttpStatus.OK);
    }

    @GetMapping("/all-dicfishtypes")
    public ResponseEntity<List<DicFishType>> getAllFishType() {
        List<DicFishType> list = dicFishTypeServise.getAllDicFishType();
        return new ResponseEntity<List<DicFishType>>(list, HttpStatus.OK);
    }

    /*
    {
        "articleId": null,
        "title": "Test",
        "category": "Test"
     }
     */
    @PostMapping("/dicfishtype")
    public ResponseEntity<Void> createArticle(@RequestBody DicFishType dicFishType, UriComponentsBuilder builder) {
        boolean flag = dicFishTypeServise.createDicFishType(dicFishType);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/dicfishtype?id={id}").buildAndExpand(dicFishType.getFishTypeId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/dicfishtype")
    public ResponseEntity<DicFishType> updateArticle(@RequestBody DicFishType dicFishType) {
        dicFishTypeServise.updateDicFishType(dicFishType);
        return new ResponseEntity<DicFishType>(dicFishType, HttpStatus.OK);
    }

    @DeleteMapping("/dicfishtype")
    public ResponseEntity<Void> deleteArticle(@RequestParam("id") String id) {
        dicFishTypeServise.deleteDicFishType(Integer.parseInt(id));
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
