package com.geosportfishing.backend.dictionary.dicfishkind.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dic_fish_kind")
public class DicFishKind implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="fish_kind_id")
    private int fishKindId;

    @Column(name="fish_kind_name")
    private String fishKindName;

    public int getFishKindId() {
        return fishKindId;
    }

    public void setFishKindId(int fishTypeId) {
        this.fishKindId = fishKindId;
    }

    public String getFishKindName() {
        return fishKindName;
    }

    public void setFishKindName(String fishKindName) {
        this.fishKindName = fishKindName;
    }
}
