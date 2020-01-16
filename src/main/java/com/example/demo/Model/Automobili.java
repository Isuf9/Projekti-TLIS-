package com.example.demo.Model;

public class Automobili {
    private int nrTargat;
    private String llojiAutomjetit;
    private String tipiAutomjetit;
    private String pronariAutomjetit;
    private String statusiAutomjetit;
    private int shpejtesia;
    private boolean isInInto;

    public int getNrTargat(){
        return nrTargat;
    }

    public void setNrTargat(int nrTargat){
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
}