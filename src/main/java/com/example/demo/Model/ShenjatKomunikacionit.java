package com.example.demo.Model;

public class ShenjatKomunikacionit {
    private int id;
    public String emriShenjes;
    public String lloijshenjes;
    public String infoShtesShenja;

    public ShenjatKomunikacionit(String emriShenjes, String lloijshenjes, String infoShtesShenja,int id) {
        this.emriShenjes = emriShenjes;
        this.lloijshenjes = lloijshenjes;
        this.infoShtesShenja = infoShtesShenja;
        this.id=id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void shenjatRrugeRurale(int Id){ System.out.println("Ju jeni ne duke ngasur ne nje rruge Rurale");}

    public void shenjatRrugeLokale(int Id){System.out.println("Ju jeni ne duke ngasur ne nje rruge Lokale");}

    public void shenjatRrugeAutostrade(int Id){System.out.println("Ju jeni ne duke ngasur ne nje rruge Autostrad");}

    public String toString(){
        return "Emri shenjes: "+emriShenjes+", lloij shenjes"+lloijshenjes+", info shtes:"+infoShtesShenja;
    }
}
