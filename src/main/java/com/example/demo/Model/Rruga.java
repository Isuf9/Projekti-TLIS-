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

}
