package com.example.demo.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Rruga implements Njoftimet{
    static  int max;
    static ShenjatKomunikacionit[] shenjatKomunikacionit=new ShenjatKomunikacionit[10];
    public String emriRruges;
    public String lloijRruges;
    private String gjendja;
    public int ID_semaforit;
    public List<Color> list;



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

    public String getGjendja() {
        return gjendja;
    }

    public void setGjendja(String gjendja) {
        this.gjendja = gjendja;
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



    @Override
    public void shtoShenjat(ShenjatKomunikacionit sh) {
        shenjatKomunikacionit[max++]=sh;
        max++;
        System.out.println("Rruga u shtua me sukse!");
    }

    @Override
    public void njofto(int i) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Ndeshje");
        map.put(2,"Ri ndertim");
        map.put(3,"Rreshqites(ngrica)");
        System.out.println(map.get(i));
    }

    @Override
    public void newInfo(int m) {
     //   m=0;
        if (max>m) {

            System.out.println("Nje njoftim i ri");
        }
        else if (max==m){
            System.out.println("Nuk keni nje njoftim te ri");
        }
        m=max;
    }


}
