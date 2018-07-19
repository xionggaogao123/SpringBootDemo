package com.example.demo.model;

import java.io.Serializable;

/**
 * @author keven
 * @date 2018-07-13 上午9:33
 * @Description
 */
public class REQ_PUBLIC_DATA implements Serializable{


    private Long id;

    private String NAME;

    private String WEIGHT;

    private String CONDITION;

    private String ANSWER;

    private String SCORE;

    private String NEXTNAME;


    private String QUESTION;


    private String LEVEL;


    private String PRIORITY;


    private String RECORD;


    private String SKIP_CONDITION;


    private String SKIP_TO;


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

    public String getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(String WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public String getCONDITION() {
        return CONDITION;
    }

    public void setCONDITION(String CONDITION) {
        this.CONDITION = CONDITION;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public void setANSWER(String ANSWER) {
        this.ANSWER = ANSWER;
    }

    public String getSCORE() {
        return SCORE;
    }

    public void setSCORE(String SCORE) {
        this.SCORE = SCORE;
    }

    public String getNEXTNAME() {
        return NEXTNAME;
    }

    public void setNEXTNAME(String NEXTNAME) {
        this.NEXTNAME = NEXTNAME;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public String getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(String LEVEL) {
        this.LEVEL = LEVEL;
    }

    public String getPRIORITY() {
        return PRIORITY;
    }

    public void setPRIORITY(String PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    public String getRECORD() {
        return RECORD;
    }

    public void setRECORD(String RECORD) {
        this.RECORD = RECORD;
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
}
