package com.example.spingdatajpa.entity;

import lombok.Data;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

//@Embeddable
public class ChungNhanID implements Serializable {
    @Basic(optional = false)
    @Column(name = "MaNV")
    private String MaNV;

    @Basic(optional = false)
    @Column(name = "MaMB")
    private Integer MaMB;
}