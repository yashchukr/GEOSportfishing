package com.geosportfishing.backend.dao;

import com.geosportfishing.backend.entity.DicFishType;

import java.util.List;

public interface IDicFishType {

    List<DicFishType> getAllDicFishType();

    DicFishType getDicFishTypeById(int dicFishTypeId);

    void createDicFishType(DicFishType dicFishType);

    void updateDicFishType(DicFishType dicFishType);

    void deleteDicFishType(int dicFishTypeId);

    boolean dicFishTypeExists(String fishTypeName);
}
