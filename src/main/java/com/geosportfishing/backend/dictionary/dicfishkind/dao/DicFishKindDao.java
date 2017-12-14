package com.geosportfishing.backend.dictionary.dicfishkind.dao;

import com.geosportfishing.backend.dictionary.dicfishkind.entity.DicFishKind;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository

public class DicFishKindDao implements IDicFishKindDao {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<DicFishKind> getAllDicFishKind() {
        String hql = "FROM DicFishKind as dft ORDER BY dft.fishKindId DESC";
        return (List<DicFishKind>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public DicFishKind getDicFishKindById(int fishKindId) {
        return entityManager.find(DicFishKind.class, fishKindId);
    }

    @Override
    public void createDicFishKind(DicFishKind dicFishKind) {
        entityManager.persist(dicFishKind);
    }

    @Override
    public void updateDicFishKind(DicFishKind dicFishKind) {
        DicFishKind dft = getDicFishKindById(dicFishKind.getFishKindId());
        dft.setFishKindName(dft.getFishKindName());
        entityManager.flush();
    }

    @Override
    public void deleteDicFishKind(int dicFishKindId) {
        entityManager.remove(getDicFishKindById(dicFishKindId));
    }

    @Override
    public boolean dicFishKindExists(String fishKindName) {
        String hql = "FROM DicFishKind as dft WHERE dft.fishKindKind = ?";
        int count = entityManager.createQuery(hql)
                .setParameter(1, fishKindName)
                .getResultList().size();
        return count > 0 ? true : false;
    }
}
