package com.geosportfishing.backend.dictionary.dicfishtype.dao;

import com.geosportfishing.backend.dictionary.dicfishtype.entity.DicFishType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository

public class DicFishTypeDao implements IDicFishTypeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<DicFishType> getAllDicFishType() {
        String hql = "FROM DicFishType as dft ORDER BY dft.fishTypeId DESC";
        return (List<DicFishType>) entityManager.createQuery(hql).getResultList();
    }

    //@SuppressWarnings("unchecked")
    @Override
    public List<DicFishType> getAllDicFishTypeByKindId(int fishTypeKindId) {
        String hql = "FROM DicFishType as dft WHERE dft.fishTypeKindId = ?";

        return (List<DicFishType>) entityManager.createQuery(hql)
                .setParameter(1, fishTypeKindId)
                .getResultList();
    }
/*
    @SuppressWarnings("unchecked")
    @Override
    public List<DicFishType> getAllDicFishType() {
        String hql = "FROM DicFishType as dft,DicFishKind as dfk WHERE dft.fishTypeKindId = dfk.fishKindId ORDER BY dft.fishTypeId DESC";
        return (List<DicFishType>) entityManager.createQuery(hql).getResultList();
    }
*/
    @Override
    public DicFishType getDicFishTypeById(int fishTypeId) {
        return entityManager.find(DicFishType.class, fishTypeId);
    }

    @Override
    public void createDicFishType(DicFishType dicFishType) {
        entityManager.persist(dicFishType);
    }

    @Override
    public void updateDicFishType(DicFishType dicFishType) {
        DicFishType dft = getDicFishTypeById(dicFishType.getFishTypeId());
        dft.setFishTypeName(dft.getFishTypeName());
        entityManager.flush();
    }

    @Override
    public void deleteDicFishType(int dicFishTypeId) {
        entityManager.remove(getDicFishTypeById(dicFishTypeId));
    }

    @Override
    public boolean dicFishTypeExists(String fishTypeName) {
        String hql = "FROM DicFishType as dft WHERE dft.fishTypeName = ?";
        int count = entityManager.createQuery(hql)
                .setParameter(1, fishTypeName)
                .getResultList().size();
        return count > 0 ? true : false;
    }
}
