package com.example.demo.Model;

public class ShenjatKomunikacionit {
    private Rruga rr;
    private ShenjatKomunikacionit sh;
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


    public void shenjatRrugeRrurale(int Id){
        System.out.println("Ju jeni ne duke ngasur ne nje rruge Rrurale");
    }

    public void shenjatRrugeLokale(int Id){
        System.out.println("Ju jeni ne duke ngasur ne nje rruge ne Qytet");
    }

    public void shenjatRrugeAutostrade(int Id){
        System.out.println("Ju jeni ne duke ngasur ne nje rruge ne autostrad");
    }


//    //Factory Patterni
//    public void factoryPattern(ShenjatKomunikacionit sh){
//        if (sh.id==1){
//            sh.shenjatRrugeAutostrade(getId());
//        }else if (sh.id==2){
//            sh.shenjatRrugeLokale(getId());
//        }else{
//            sh.shenjatRrugeRrurale(getId());
//     }


  //  }



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

}
