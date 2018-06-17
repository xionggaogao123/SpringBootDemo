package com.example.demo.model;

import java.io.Serializable;

/**
 * @author keven
 * @date 2018-06-17 上午10:15
 * @Description
 */
public class REQ_ANS_DATA implements Serializable{


    private static final long serialVersionUID = 8409213164794491154L;

    private Long ID;

    private String NAME;

    private String CONDITION;


    private String QUESTION;


    private String ANSWER;

    private String NEXTNAME;


    private Integer WEIGHT;


    private Integer SCORE;


    private String RECORD;

    private Integer PRIORITY;

    private String LEVEL;

    private String SKIP_CONDITION;


    private String SKIP_TO;


    private Integer TEST;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCONDITION() {
        return CONDITION;
    }

    public void setCONDITION(String CONDITION) {
        this.CONDITION = CONDITION;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public void setANSWER(String ANSWER) {
        this.ANSWER = ANSWER;
    }

    public String getNEXTNAME() {
        return NEXTNAME;
    }

    public void setNEXTNAME(String NEXTNAME) {
        this.NEXTNAME = NEXTNAME;
    }

    public Integer getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(Integer WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public Integer getSCORE() {
        return SCORE;
    }

    public void setSCORE(Integer SCORE) {
        this.SCORE = SCORE;
    }

    public String getRECORD() {
        return RECORD;
    }

    public void setRECORD(String RECORD) {
        this.RECORD = RECORD;
    }

    public Integer getPRIORITY() {
        return PRIORITY;
    }

    public void setPRIORITY(Integer PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    public String getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(String LEVEL) {
        this.LEVEL = LEVEL;
    }

    public String getSKIP_CONDITION() {
        return SKIP_CONDITION;
    }

    public void setSKIP_CONDITION(String SKIP_CONDITION) {
        this.SKIP_CONDITION = SKIP_CONDITION;
    }

    public String getSKIP_TO() {
        return SKIP_TO;
    }

    public void setSKIP_TO(String SKIP_TO) {
        this.SKIP_TO = SKIP_TO;
    }

    public Integer getTEST() {
        return TEST;
    }

    public void setTEST(Integer TEST) {
        this.TEST = TEST;
    }
}
