package com.geosportfishing.backend.dictionary.dicfishkind.entity;

import com.geosportfishing.backend.dictionary.dicfishtype.entity.DicFishType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "dic_fish_kind")
public class DicFishKind implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //@Column(name="fish_kind_id")

    @SequenceGenerator(name = "dic_fish_kind_id_id_seq", sequenceName = "dic_fish_kind_id_id_seq", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dic_fish_kind_id_id_seq")
    @Column(name = "fish_kind_id")
    private int fishKindId;

    @Column(name="fish_kind_name")
    private String fishKindName;

    public Set<DicFishType> getDicFishTypeSet() {
        return dicFishTypeSet;
    }

    public void setDicFishTypeSet(Set<DicFishType> dicFishTypeSet) {
        this.dicFishTypeSet = dicFishTypeSet;
    }

    @OneToMany(mappedBy = "fishTypeKindId", fetch = EAGER)
    private Set<DicFishType> dicFishTypeSet;

    public int getFishKindId() {
        return fishKindId;
    }

    public void setFishKindId(int fishKindId) {
        this.fishKindId = fishKindId;
    }

    public String getFishKindName() {
        return fishKindName;
    }

    public void setFishKindName(String fishKindName) {
        this.fishKindName = fishKindName;
    }
}
