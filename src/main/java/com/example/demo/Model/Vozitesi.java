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
    //key e kemi targat, value e kemi vozitesin
    Map<String,String> map = new HashMap<>();

    Vozitesi(String emri, String mbiemri, String shtetsia, int nrL_Njoftimit){
        this.emri=emri;
        this.mbiemri=mbiemri;
        this.shtetsia=shtetsia;
        this.nrL_Njoftimit=nrL_Njoftimit;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(String targat,String emri) {
        this.map.put(targat,emri);
    }

    public void maini(){
        Automobili a = new Automobili();
        Vozitesi v = new Vozitesi("Arlind","P","K",1);
        setMap(a.getNrTargat(),v.emri);
        Map m = getMap();
    }

    Vozitesi vozitesi=new Vozitesi(emri, mbiemri, shtetsia, nrL_Njoftimit);



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

    //metoda posedon kthen Emrin e vozitesit i cili posedon veturen ne baze te
    //targave te dhena te dhena ne parameter
    //ne DDD eshte i shenuar si posedon(int i):String
    public String posedon(String targat){
        automobili = new Automobili();
        String a;
        a = map.get(targat);
        return a;
    }

}
