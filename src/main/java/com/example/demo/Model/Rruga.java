package com.example.demo.Model;


import com.example.demo.Logical.LogjikaRruga;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Rruga {

    private Connection con;
    private Statement st;
    private ResultSet rs;


//Attributes of Rruga
    Rruga rruga;
    static   int max;
    static ShenjatKomunikacionit[] shenjatKomunikacionit=new ShenjatKomunikacionit[10];
    public String emriRruges;
    public String lloijRruges;
    private String gjendja;
    public int ID_semaforit;
    private int idRruges;

//Constructor
    public Rruga(String emriRruges, String lloijRruges, String gjendja, int idRruges){

        this.emriRruges=emriRruges;
        this.lloijRruges=lloijRruges;
        this.gjendja=gjendja;
        this.idRruges= idRruges;

    }

    //Get & Set
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

    //Crud read
    public String getEmriRruges() {
        return emriRruges;
    }

    //Crud Edit
    public void setEmriRruges(String emriRruges) {
        this.emriRruges = emriRruges;
    }

    //Crud delete
    public void deleteEmriRruges(){
        String s="";
        this.emriRruges=s;
        System.out.println("Emri i Rruges u fshi"+emriRruges);
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

    public int getIdRruges() {
        return idRruges; }

    public void setIdRruges(int idRruges) {
        this.idRruges = idRruges; }


      public String toString(){
        return "Emri i rruges:"+emriRruges+", lloij i rruges:"+lloijRruges+", gjendja"+gjendja+", id:"+idRruges;
      }




}
