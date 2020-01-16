package com.example.demo.Model;

import java.util.List;

public class Rruga {
    static  int max;
    static ShenjatKomunikacionit[] shenjatKomunikacionit=new ShenjatKomunikacionit[max];
    public int ID;
    public String emriRruges;
    public String lloijRruges;
    public int ID_semaforit;
    public List<Color> list;


    void addShenja(ShenjatKomunikacionit sh){
        shenjatKomunikacionit[max++]=sh;
        max++;
    }
    public String shtoRrugen(String emri, String vendi){

        return "Rruga u shtua me Sukses!";
    }

    //////////////////////////////////////////////////////
    public static int getMax() {
        return max;
    }

    public static void setMax(int max) {
        Rruga.max = max;
    }

    public static ShenjatKomunikacionit[] getShenjatKomunikacionit() {
        return shenjatKomunikacionit;
    }

    public static void setShenjatKomunikacionit(ShenjatKomunikacionit[] shenjatKomunikacionit) {
        Rruga.shenjatKomunikacionit = shenjatKomunikacionit;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmriRruges() {
        return emriRruges;
    }

    public void setEmriRruges(String emriRruges) {
        this.emriRruges = emriRruges;
    }

    public String getLloijRruges() {
        return lloijRruges;
    }

    public void setLloijRruges(String lloijRruges) {
        this.lloijRruges = lloijRruges;
    }

    public int getID_semaforit() {
        return ID_semaforit;
    }

    public void setID_semaforit(int ID_semaforit) {
        this.ID_semaforit = ID_semaforit;
    }

    public List<Color> getList() {
        return list;
    }

    public void setList(List<Color> list) {
        this.list = list;
    }
}
