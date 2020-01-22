package com.example.demo.Logical;

import com.example.demo.Model.Automobili;
import com.example.demo.Model.Vozitesi;
import com.example.demo.Model.Automobili;

import java.util.HashMap;
import java.util.Map;

import static org.jboss.logging.MDC.getMap;
import static org.jboss.logging.MDC.remove;

public class LogjikaVozitesi {
    public static   LogjikaVozitesi l_vozitesi;
    Vozitesi vozitesi;
    Map<String,String> map = new HashMap<>();
    //Singleton pattern
    public static LogjikaVozitesi getInstance() throws Exception{
        if (l_vozitesi==null){
            l_vozitesi=new LogjikaVozitesi();
        }else if (l_vozitesi!=l_vozitesi){
            l_vozitesi=new LogjikaVozitesi();
        }
        else if (l_vozitesi==l_vozitesi){
            System.out.println("Error, nuk mund ti krijosh dy objekte me nje instanc te njejt");
        }
        return l_vozitesi;
    }

    //metoda posedon kthen Emrin e vozitesit i cili posedon veturen ne baze te
    //targave te dhena te dhena ne parameter
    //ne DDD eshte i shenuar si posedon(int i):String
    public String posedon(Automobili auto,Vozitesi v,String targat){
          String emri=v.getEmri();
          String mbiemri=v.getMbiemri();
        return emri+" "+mbiemri+", posedon: "+auto.getLlojiAutomjetit()+","+auto.getTipiAutomjetit();
    }

}
