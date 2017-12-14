package com.geosportfishing.backend.dictionary.dicfishtype.service;

import com.geosportfishing.backend.dictionary.dicfishtype.entity.DicFishType;

import java.util.List;

public interface IDicFishTypeServise {

    List<DicFishType> getAllDicFishType();

    DicFishType getDicFishTypeById(int dicFishTypeId);

    boolean createDicFishType(DicFishType dicFishType);

    void updateDicFishType(DicFishType dicFishType);

    void deleteDicFishType(int dicFishTypeId);

}
