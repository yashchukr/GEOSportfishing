package com.geosportfishing.backend.dictionary.dicfishkind.dao;

import com.geosportfishing.backend.dictionary.dicfishkind.entity.DicFishKind;

import java.util.List;

public interface IDicFishKindDao {

    List<DicFishKind> getAllDicFishKind();

    DicFishKind getDicFishKindById(int fishKindId);

    void createDicFishKind(DicFishKind dicFishKind);

    void updateDicFishKind(DicFishKind dicFishKind);

    void deleteDicFishKind(int fishKindId);

    boolean dicFishKindExists(String fishKindName);
}
