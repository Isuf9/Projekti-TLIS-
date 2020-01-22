package com.example.demo.Model;
import com.example.demo.Logical.LogjikaAutomobili;
import com.example.demo.Logical.LogjikaVozitesi;

import java.util.HashMap;
import java.util.Map;

public class Automobili {
    private String nrTargat_inicialet;
    private String nrTargat;
    private String llojiAutomjetit;
    private String tipiAutomjetit;
    private String pronariAutomjetit;
    private String statusiAutomjetit;
    private int shpejtesia;
    private boolean isInInto;
    private String lokacioni;

    public Automobili(String nrTargat_inicialet,String nrTargat, String llojiAutomjetit, String tipiAutomjetit, String statusiAutomjetit, int shpejtesia,String lokacioni, boolean isInInto){
            this.nrTargat_inicialet=nrTargat_inicialet;
            this.nrTargat=nrTargat;
            this.llojiAutomjetit=llojiAutomjetit;
            this.tipiAutomjetit=tipiAutomjetit;
            this.statusiAutomjetit=statusiAutomjetit;
            this.shpejtesia=shpejtesia;
            this.lokacioni=lokacioni;
            this.isInInto=isInInto;
    }

    public String getNrTargat(){
        return nrTargat;
    }

    public void setNrTargat(String nrTargat){
        this.nrTargat = nrTargat;
    }

    public String getLlojiAutomjetit() {
        return llojiAutomjetit;
    }

    public void setLlojiAutomjetit(String llojiAutomjetit) {
        this.llojiAutomjetit = llojiAutomjetit;
    }

    public String getTipiAutomjetit() {
        return tipiAutomjetit;
    }

    public void setTipiAutomjetit(String tipiAutomjetit) {
        this.tipiAutomjetit = tipiAutomjetit;
    }

    public String getPronariAutomjetit() {
        return pronariAutomjetit;
    }

    public void setPronariAutomjetit(String pronariAutomjetit) {
        this.pronariAutomjetit = pronariAutomjetit;
    }

    public String getStatusiAutomjetit() {
        return statusiAutomjetit;
    }

    public void setStatusiAutomjetit(String statusiAutomjetit) {
        this.statusiAutomjetit = statusiAutomjetit;
    }

    public int getShpejtesia() {
        return shpejtesia;
    }

    public void setShpejtesia(int shpejtesia) {
        this.shpejtesia = shpejtesia;
    }

    public boolean isInInto() {
        return isInInto;
    }

    public void setInInto(boolean inInto) {
        isInInto = inInto;
    }

    public String getLokacioni() {
        return lokacioni;
    }

    public void setLokacioni(String lokacioni) {
        this.lokacioni = lokacioni;
    }

    public String getNrTargat_inicialet() {
        return nrTargat_inicialet;
    }

    public void setNrTargat_inicialet(String nrTargat_inicialet) {
        this.nrTargat_inicialet = nrTargat_inicialet;
    }

    public String kugjendet(boolean isInInto){
        if (isInInto==true){

            String op1="eshte ne rruge";
            return op1;
        }else {
            String op2 = "nuk eshte ne rruge";
            return op2;
        }

    }

    public String toString(){

        return "Ka: "+llojiAutomjetit+",me targat: "+nrTargat_inicialet+nrTargat+", tipi: "+tipiAutomjetit+", gjendja e automjetit: "+statusiAutomjetit+", eshte duke ngasur"+shpejtesia+"/ore, "+"lokacioni(ku gjendet), "+lokacioni+kugjendet(true);
    }

}