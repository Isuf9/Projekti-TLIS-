package com.example.demo.Logical;
import com.example.demo.Model.Automobili;
import com.example.demo.Model.Rruga;
import com.example.demo.Model.Vozitesi;

import java.util.HashMap;
import java.util.Map;

public class TLIS
{
    public static void main(String[] args) {
        Automobili automobili=new Automobili("03-672-FF","Mercedes","Sprinter","Ne rregull",80,true);
        Vozitesi vozitesi=new Vozitesi("Rifat","Bajraktaraj","Kosovar",111111111);
        LogjikaVozitesi logjikaVozitesi=new LogjikaVozitesi();
        Rruga rruga=new Rruga("Imzot Nike Prela","Ne rregull","Super",12);
        LogjikaRruga logjikaRruga=new LogjikaRruga();
        //ruajtja e te dhenave te objektit ne variabla
        String automobili_1=automobili.toString();




        Map<String, String> map=new HashMap<>();
        map.put(vozitesi.getEmri(),automobili_1);

            System.out.println(map);
        String s= logjikaVozitesi.posedon(automobili,vozitesi,"03-672-FF");
        System.out.println(s);
        String rr=logjikaRruga.vendnodhja(rruga,12);
        System.out.println(rr);
//        LogjikaAutomobili lo1=new LogjikaAutomobili();
//        lo1.roliAutomjetei("03-626-FF");

    }
}
