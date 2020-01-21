package com.example.demo.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Vozitesi {
    private ArrayList<Automobili> auto = new ArrayList<>();
    private Automobili automobili;
    private String emri;
    private String mbiemri;
    private String shtetsia;
    private int nrL_Njoftimit;
    public static   Vozitesi vozitesi;
    //key e kemi targat, value e kemi vozitesin
    Map<String,String> map = new HashMap<>();

    public Vozitesi(String emri, String mbiemri, String shtetsia, int nrL_Njoftimit){
        this.emri=emri;
        this.mbiemri=mbiemri;
        this.shtetsia=shtetsia;
        this.nrL_Njoftimit=nrL_Njoftimit;
    }

    //Vozitesi v=new Vozitesi(emri, mbiemri, shtetsia, nrL_Njoftimit);

    //Get & Set
    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(String targat,String emri) {
        this.map.put(targat,emri);
    }

    public ArrayList<Automobili> getAuto() {
        return auto;
    }

    public void setAuto(ArrayList<Automobili> auto) {
        this.auto = auto;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getShtetsia() {
        return shtetsia;
    }

    public void setShtetsia(String shtetsia) {
        this.shtetsia = shtetsia;
    }

    public int getNrL_Njoftimit() {
        return nrL_Njoftimit;
    }

    public void setNrL_Njoftimit(int nrL_Njoftimit) {
        this.nrL_Njoftimit = nrL_Njoftimit;
    }



}
