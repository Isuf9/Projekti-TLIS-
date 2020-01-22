package com.example.demo.Logical;
import com.example.demo.Model.Automobili;

public class LogjikaAutomobili implements KlasifokoAutomjetet {
        LogjikaAutomobili logjikaAutomobili;

        //Singelton pattern
    public  LogjikaAutomobili getInstance(){
        if (logjikaAutomobili==null){
            logjikaAutomobili=new LogjikaAutomobili();
        }
        return logjikaAutomobili;
    }
    @Override
    public void dedektimi(Automobili a,String nrTargat) {
        System.out.println("Makina me targat:"+nrTargat+", eshte dedektuar");
    }

    @Override
    public void klasifiko_automobilet(Automobili a,String nrTagave) {
        String s=a.getNrTargat_inicialet()+a.getNrTargat();
        String targat=a.getNrTargat_inicialet();
        if (targat=="3Z") {
            System.out.println("Automobili me targat:" + s + ", eshte makine zyrtare");
        }else if (targat=="03"){
            System.out.println("Automobili me targat:" + s + ", eshte makine jo zyrtare");
        }

    }
}
