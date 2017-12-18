package com.geosportfishing.backend.dictionary.dicfishtype.entity;

import com.geosportfishing.backend.dictionary.dicfishkind.entity.DicFishKind;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "dic_fish_type")
public class DicFishType implements Serializable {

    private static final long serialVersionUID = 1L;
    //----------------------------------------------
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //@Column(name="fish_type_id")

    @SequenceGenerator(name = "dic_fish_type_id_id_seq", sequenceName = "dic_fish_type_id_id_seq", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dic_fish_type_id_id_seq")
    @Column(name = "fish_type_id")
    private int fishTypeId;

    public int getFishTypeId() {
        return fishTypeId;
    }

    public void setFishTypeId(int fishTypeId) {
        this.fishTypeId = fishTypeId;
    }
    //----------------------------------------------
    @Column(name="fish_type_kind_id")
    private int fishTypeKindId;

    public int getFishTypeKindId() {
        return fishTypeKindId;
    }

    public void setFishTypeKindId(int fishTypeKindId) {
        this.fishTypeKindId = fishTypeKindId;
    }
    //----------------------------------------------
    @Column(name="fish_type_name")
    private String fishTypeName;

    public String getFishTypeName() {
        return fishTypeName;
    }

    public void setFishTypeName(String fishTypeName) {
        this.fishTypeName = fishTypeName;
    }
    //----------------------------------------------
    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "fish_kind_id")
    private DicFishKind dicFishKind;
/*
    public DicFishKind getDicFishKind() {
        return dicFishKind;
    }

    public void setDicFishKind(DicFishKind dicFishKind) {
        this.dicFishKind = dicFishKind;
    }
*/
}
