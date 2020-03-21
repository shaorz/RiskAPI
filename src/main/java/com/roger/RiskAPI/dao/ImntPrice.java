package com.roger.RiskAPI.dao;

public class ImntPrice {

    private final String imnt_id;
    private final String imnt_name;
    private final String imnt_t0;
    private final float imnt_p0;
    private int t;

    public ImntPrice(String imnt_id, String imnt_name, String imnt_t0, float imnt_p0, int t) {
        this.imnt_id = imnt_id;
        this.imnt_name = imnt_name;
        this.imnt_t0 = imnt_t0;
        this.imnt_p0 = imnt_p0;
        this.t = t;
    }

    public String getImnt_id() {
        return imnt_id;
    }

    public String getImnt_name() {
        return imnt_name;
    }

    public String getImnt_t0() {
        return imnt_t0;
    }

    public float getImnt_p0() {
        return imnt_p0;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
}
