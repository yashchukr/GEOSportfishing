package com.geosportfishing.backend.dictionary.dicfishkind.service;

import com.geosportfishing.backend.dictionary.dicfishkind.entity.DicFishKind;

import java.util.List;

public interface IDicFishKindServise {

    List<DicFishKind> getAllDicFishKind();

    DicFishKind getDicFishKindById(int dicFishKindId);

    boolean createDicFishKind(DicFishKind dicFishKind);

    void updateDicFishKind(DicFishKind dicFishKind);

    void deleteDicFishKind(int dicFishKindId);

}
