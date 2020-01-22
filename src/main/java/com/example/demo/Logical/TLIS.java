package com.example.demo.Logical;
import com.example.demo.Model.Automobili;
import com.example.demo.Model.Rruga;
import com.example.demo.Model.ShenjatKomunikacionit;
import com.example.demo.Model.Vozitesi;

import java.util.HashMap;
import java.util.Map;

public class TLIS
{
    public static void main(String[] args) throws InterruptedException {
        // Objektet e krijume
        Automobili automobili=new Automobili("03","-672-FF","Mercedes","Sprinter 311 CDI","Ne rregull",80,"Lagjia Kalabria",true);
        Automobili automobil_dyte=new Automobili("3Z","-111-VB","VV","Golf 6","Ne rregull",80,"Lagjia Kalabria",true);
        Vozitesi vozitesi=new Vozitesi("Rifat","Bajraktaraj","Kosovar",111111111);
        LogjikaVozitesi logjikaVozitesi=new LogjikaVozitesi();
        Rruga rruga=new Rruga("Imzot Nike Prela","Rurale","Ne rregull",12);
        ShenjatKomunikacionit shenjatKomunikacionit=new ShenjatKomunikacionit("Rruga me gunga","Kujdes","Ju lutem ngasni me ngadal",1);
        LogjikaRruga logjikaRruga=new LogjikaRruga();
        LogjikaAutomobili logjikaAutomobili=new LogjikaAutomobili();
        LogjikaSemaforit logjikaSemaforit=new LogjikaSemaforit();
        LogjikaShenjatKomunikacionit logjikaShenjatKomunikacionit=new LogjikaShenjatKomunikacionit();
        String shfaqja_e_shenjave=logjikaShenjatKomunikacionit.toString();
        //System.out.println(shfaqja_e_shenjave);

       //Metodat nga moduli LogjikaAutomobili
       logjikaAutomobili.dedektimi(automobili, "03-672-FF");
       //tregon se qfar automjeti eshte(zyretar apo jozyrtar)
       logjikaAutomobili.klasifiko_automobilet(automobil_dyte,"3Z");
       System.out.println("Vazhdojn metodat nga moduli LogjikaRruga\n");
       System.out.println("-----------------------------------------------------------------------");
       /////////////////////////////////////////////////////////////////////////////

       //Metodat nga moduli LogjikaRruga
       //lidhja me databaze
       logjikaRruga.connectToDB();
       //shton nje shenje te komunikacionit ne vektor
       logjikaRruga.shtoShenjat(shenjatKomunikacionit);
       //nese rruga u shtu  e lajmron perdoruesin se eshte shtuar nje rruge, perndryshe nuk keni ndonje njoftim te ri
       logjikaRruga.newInfo(0);
       //njofton vozitesin se rruga mund te jete(ne ri ndertim, ndeshje, reshqitje(ngrica))
       logjikaRruga.njofto(1);
       //metoda tregon lokacionin e juaj te sakt se ku ndodhet automobili
       String vendodhja=logjikaRruga.vendnodhja(automobili,12);
       System.out.println(vendodhja);
       //Crud forma
       logjikaRruga.delete(rruga);
       logjikaRruga.edit(rruga,"Agim Ramadani");
       System.out.println("Vazhdojn metodat nga moduli LogjikaShenjatKomunikacionit\n");
        System.out.println("-----------------------------------------------------------------------");

       //////////////////////////////////////////////////////////////////////////////

        logjikaShenjatKomunikacionit.factory(rruga);
        logjikaShenjatKomunikacionit.lloijRruges(shenjatKomunikacionit);
        System.out.println("Vazhdojn metodat nga moduli LogjikaVozitesi\n");
        System.out.println("-----------------------------------------------------------------------");

        /////////////////////////////////////////////////////////////////////////////

        //Metoda tek moduli LogjkaVozitesi
        //metoda tregon se kush(emrin e pronarit) e permbane kete makin por duke i plotsuar kushtet(parametrat hyers)
        String posedon=logjikaVozitesi.posedon(automobili,vozitesi,"03-672-FF");
        System.out.println(posedon);
        System.out.println("-----------------------------------------------------------------------");




        //Metodat nga moduli LogjikaSemafori
        //metoda tregon gjendjen e semaforit
        logjikaSemaforit.run();
        //metoda shfaq gjendje e semaforit(ngjyra e kuq, jeshile(verdhe), gjelbert...)
        logjikaSemaforit.start();
        System.out.println("Vazhdojn metodat nga moduli LogjikaSemaforit");
        System.out.println("-----------------------------------------------------------------------");

    }
}
