package com.example.demo.Logical;

import com.example.demo.Model.Automobili;
import com.example.demo.Model.Vozitesi;
import com.example.demo.Model.Automobili;

import java.util.HashMap;
import java.util.Map;

import static org.jboss.logging.MDC.getMap;

public class LogjikaVozitesi {
    public static   LogjikaVozitesi l_vozitesi;
    Vozitesi vozitesi;
    Map<String,String> map = new HashMap<>();
    //Singleton pattern
    public static LogjikaVozitesi getInstance(){
        if (l_vozitesi==null){
            l_vozitesi=new LogjikaVozitesi();
        }
        return l_vozitesi;
    }

    //


    public void setMap(String targat,String emri) {
        this.map.put(targat,emri);
    }

    public void maini(){
        Automobili a = new Automobili("Audi");
        Vozitesi v = new Vozitesi("Arlind","P","K",1);
        setMap(a.getNrTargat(),vozitesi.getEmri());
        Map m = getMap();
    }
    //metoda posedon kthen Emrin e vozitesit i cili posedon veturen ne baze te
    //targave te dhena te dhena ne parameter
    //ne DDD eshte i shenuar si posedon(int i):String
    public String posedon(Automobili auto,String targat){
        auto = new Automobili();
        String a;
        a = map.get(targat);
        return a;
    }

}
