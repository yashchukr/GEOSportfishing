package com.geosportfishing.backend.dictionary.dicfishtype.service;

import com.geosportfishing.backend.dictionary.dicfishtype.dao.IDicFishTypeDao;
import com.geosportfishing.backend.dictionary.dicfishtype.entity.DicFishType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicFishTypeServise implements IDicFishTypeServise {

    @Autowired
    private IDicFishTypeDao dicFishTypeDao;

    @Override
    public List<DicFishType> getAllDicFishType() {
        return dicFishTypeDao.getAllDicFishType();
    }

    @Override
    public List<DicFishType> getAllDicFishTypeByKindId(int fishTypeKindId) {
        return dicFishTypeDao.getAllDicFishTypeByKindId(fishTypeKindId);
    }

    @Override
    public DicFishType getDicFishTypeById(int dicFishTypeId) {
        DicFishType obj = dicFishTypeDao.getDicFishTypeById(dicFishTypeId);
        return obj;
    }

    @Override
    public boolean createDicFishType(DicFishType dicFishType) {
        if (dicFishTypeDao.dicFishTypeExists(dicFishType.getFishTypeName())) {
            return false;
        } else {
            dicFishTypeDao.createDicFishType(dicFishType);
            return true;
        }
    }

    @Override
    public void updateDicFishType(DicFishType dicFishType) {
        dicFishTypeDao.updateDicFishType(dicFishType);
    }

    @Override
    public void deleteDicFishType(int dicFishTypeId) {
        dicFishTypeDao.deleteDicFishType(dicFishTypeId);
    }
}
