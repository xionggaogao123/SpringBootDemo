package com.example.demo.model;

import java.io.Serializable;

/**
 * @author keven
 * @date 2018-07-16 下午4:49
 * @Description
 */
public class NORMATIVE_WORD implements Serializable{


    private Long ID;


    private String CONDITION;


    private String WORD;


    private Integer TNO;


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCONDITION() {
        return CONDITION;
    }

    public void setCONDITION(String CONDITION) {
        this.CONDITION = CONDITION;
    }

    public String getWORD() {
        return WORD;
    }

    public void setWORD(String WORD) {
        this.WORD = WORD;
    }

    public Integer getTNO() {
        return TNO;
    }

    public void setTNO(Integer TNO) {
        this.TNO = TNO;
    }
}
