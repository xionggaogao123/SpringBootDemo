package com.example.demo.model;

import java.io.Serializable;

/**
 * @author keven
 * @date 2018-07-06 下午2:05
 * @Description
 */
public class CMP_NO implements Serializable{

    private static final long serialVersionUID = -2734359550459789675L;


    private Long id;

    private String NAME;

    private String TYPE;

    private String ITYPE;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getITYPE() {
        return ITYPE;
    }

    public void setITYPE(String ITYPE) {
        this.ITYPE = ITYPE;
    }
}
