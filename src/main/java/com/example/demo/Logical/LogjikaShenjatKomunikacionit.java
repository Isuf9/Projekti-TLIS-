package com.example.demo.Logical;

import com.example.demo.Model.Rruga;
import com.example.demo.Model.ShenjatKomunikacionit;

public class LogjikaShenjatKomunikacionit {
    private Rruga rr;
    public ShenjatKomunikacionit shenjatKomunikacionit;
    public int id;
    public String emriShenjes;
    public String lloijshenjes;
    public String infoShtesShenja;


    public void factory(Rruga rr1){
        if (rr1.lloijRruges=="Ruale") {

                ShenjatKomunikacionit sh1 = new ShenjatKomunikacionit("Rruga me gunga", "Kujdes", "Ju lutem ngasni me ngadal", 1);
                System.out.println("U shtua me sukses");

        }
        else if (rr1.lloijRruges=="Qytet") {

                ShenjatKomunikacionit sh2 = new ShenjatKomunikacionit("Max shpejtesia [20h]", "Shpejtesia e lejuar", "Mos tejkalo shpejtesin e dhene shenjes", 2);
                System.out.println("U shtua me sukses");

        }
        else if(rr1.lloijRruges=="Autostrad") {

                ShenjatKomunikacionit sh3 = new ShenjatKomunikacionit("Lejohet tejkalimi", "Tejkalo", "Asgje", 3);
                System.out.println("U shtua me sukses");

        }

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


    //Factory Patterni
    public void factoryPattern(ShenjatKomunikacionit sh){
        if (sh.getId()==1){
            sh.shenjatRrugeAutostrade(sh.getId());
        }else if (sh.getId()==2){
            sh.shenjatRrugeLokale(sh.getId());
        }else{
            sh.shenjatRrugeRrurale(sh.getId());
        }
    }


}
