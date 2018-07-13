package com.example.demo.model;

import java.io.Serializable;

/**
 * @author keven
 * @date 2018-07-02 下午2:44
 * @Description
 */

public class REQ_ANS_FLOW implements Serializable{

    private static final long serialVersionUID = -1825665812297396915L;


    private Long ID;

    private Integer LEVEL;

    private Integer FLOOR;

    private String QUESTION;

    private String NAME;

    private String TYPE;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Integer getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(Integer LEVEL) {
        this.LEVEL = LEVEL;
    }

    public Integer getFLOOR() {
        return FLOOR;
    }

    public void setFLOOR(Integer FLOOR) {
        this.FLOOR = FLOOR;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
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
}
