package com.geosportfishing.backend.dictionary.dicfishkind.service;

import com.geosportfishing.backend.dictionary.dicfishkind.dao.IDicFishKindDao;
import com.geosportfishing.backend.dictionary.dicfishkind.entity.DicFishKind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicFishKindServise implements IDicFishKindServise {

    @Autowired
    private IDicFishKindDao dicFishKindDao;

    @Override
    public List<DicFishKind> getAllDicFishKind() {
        return dicFishKindDao.getAllDicFishKind();
    }

    @Override
    public DicFishKind getDicFishKindById(int dicFishKindId) {
        DicFishKind obj = dicFishKindDao.getDicFishKindById(dicFishKindId);
        return obj;
    }

    @Override
    public boolean createDicFishKind(DicFishKind dicFishKind) {
        if (dicFishKindDao.dicFishKindExists(dicFishKind.getFishKindName())) {
            return false;
        } else {
            dicFishKindDao.createDicFishKind(dicFishKind);
            return true;
        }
    }

    @Override
    public void updateDicFishKind(DicFishKind dicFishKind) {
        dicFishKindDao.updateDicFishKind(dicFishKind);
    }

    @Override
    public void deleteDicFishKind(int dicFishKindId) {
        dicFishKindDao.deleteDicFishKind(dicFishKindId);
    }
}
