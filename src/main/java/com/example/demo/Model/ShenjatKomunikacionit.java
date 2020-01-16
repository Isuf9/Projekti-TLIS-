package com.example.demo.Model;

public class ShenjatKomunikacionit {
    public String emriShenjes;
    public String lloijshenjes;
    public String infoShtesShenja;

    public ShenjatKomunikacionit(String emriShenjes, String lloijshenjes, String infoShtesShenja) {
        this.emriShenjes = emriShenjes;
        this.lloijshenjes = lloijshenjes;
        this.infoShtesShenja = infoShtesShenja;
    }

    public void shenjatRrugeRuale(int Id){
        System.out.println("Ju jeni ne dekuke ngasur ne nje rruge Ruale");
    }

    public void shenjatRrugeLokale(int Id){
        System.out.println("Ju jeni ne dekuke ngasur ne nje rruge ne Qytet");
    }

    public void shenjatRrugeAutostrade(int Id){
        System.out.println("Ju jeni ne dekuke ngasur ne nje rruge Ruale");
    }

    private String vendodhjaJuaj(int idRruges){
        return "ju jeni ne kete rruge ";
    }

      public String getEmriShenjes() {
        return emriShenjes;
    }

    public void setEmriShenjes(String emriShenjes) {
        this.emriShenjes = emriShenjes;
    }

    public String getLloijshenjes() {
        return lloijshenjes;
    }

    public void setLloijshenjes(String lloijshenjes) {
        this.lloijshenjes = lloijshenjes;
    }

    public String getInfoShtesShenja() {
        return infoShtesShenja;
    }

    public void setInfoShtesShenja(String infoShtesShenja) {
        this.infoShtesShenja = infoShtesShenja;
    }
}
