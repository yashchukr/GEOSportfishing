package com.geosportfishing.backend.dictionary.dicfishtype.dao;

import com.geosportfishing.backend.dictionary.dicfishtype.entity.DicFishType;

import java.util.List;

public interface IDicFishTypeDao {

    List<DicFishType> getAllDicFishType();

    List<DicFishType> getAllDicFishTypeByKindId(int fishTypeKindId);

    DicFishType getDicFishTypeById(int fishTypeId);

    void createDicFishType(DicFishType dicFishType);

    void updateDicFishType(DicFishType dicFishType);

    void deleteDicFishType(int fishTypeId);

    boolean dicFishTypeExists(String fishTypeName);
}
