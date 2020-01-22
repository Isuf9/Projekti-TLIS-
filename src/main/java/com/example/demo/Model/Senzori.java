package com.example.demo.Model;

public class Senzori {
    private int id;
    private int id_ne_semafor;
    private int id_ne_automobil;
    private String lokacioni;
    private String lokacioni_automobilit;

    public Senzori(int id, int id_ne_semafor, int id_ne_automobil, String lokacioni, String lokacioni_automobilit) {
        this.id = id;
        this.id_ne_semafor = id_ne_semafor;
        this.id_ne_automobil = id_ne_automobil;
        this.lokacioni = lokacioni;
        this.lokacioni_automobilit = lokacioni_automobilit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ne_semafor() {
        return id_ne_semafor;
    }

    public void setId_ne_semafor(int id_ne_semafor) {
        this.id_ne_semafor = id_ne_semafor;
    }

    public int getId_ne_automobil() {
        return id_ne_automobil;
    }

    public void setId_ne_automobil(int id_ne_automobil) {
        this.id_ne_automobil = id_ne_automobil;
    }

    public String getLokacioni() {
        return lokacioni;
    }

    public void setLokacioni(String lokacioni) {
        this.lokacioni = lokacioni;
    }

    public String getLokacioni_automobilit() {
        return lokacioni_automobilit;
    }

    public void setLokacioni_automobilit(String lokacioni_automobilit) {
        this.lokacioni_automobilit = lokacioni_automobilit;
    }
}
