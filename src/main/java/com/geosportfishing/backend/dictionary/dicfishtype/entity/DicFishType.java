package com.geosportfishing.backend.dictionary.dicfishtype.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dic_fish_type")
public class DicFishType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="fish_type_id")
    private int fishTypeId;

    @Column(name="fish_type_name")
    private String fishTypeName;

    public int getFishTypeId() {
        return fishTypeId;
    }

    public void setFishTypeId(int fishTypeId) {
        this.fishTypeId = fishTypeId;
    }

    public String getFishTypeName() {
        return fishTypeName;
    }

    public void setFishTypeName(String fishTypeName) {
        this.fishTypeName = fishTypeName;
    }
}
