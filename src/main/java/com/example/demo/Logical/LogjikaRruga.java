package com.example.demo.Logical;
import com.example.demo.Model.Rruga;
import com.example.demo.Model.ShenjatKomunikacionit;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class LogjikaRruga implements Njoftimet{

    private Connection con;
    private Statement st;
    private ResultSet rs;
    Rruga rruga;
    private int max;
    private ShenjatKomunikacionit[] shenjatKomunikacionit=new ShenjatKomunikacionit[10];
    @Override
    public void connectToDB() {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=TLIS;user=sa;password=isufisuf;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            st = con.createStatement();
            System.out.println("Connected");
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

//Shtoj te dhenat ne databaze
    public String shtoRrugen(String emri, String vendi){
        emri="emri";
        vendi="vendi";

        return "Rruga"+emri+"ne "+ vendi+", u shtua me sukses!";
    }
    //Tregon sa automjete gjende ne rrugen ABC
    public int nrAutomjeteve(int count){

        return count;
    }

    @Override
    public void newInfo(int m) {
        if (rruga.getMax()>m) {

            System.out.println("Nje njoftim i ri");
        }
        else if (rruga.getMax()==m){
            System.out.println("Nuk keni nje njoftim te ri");
        }
        m=rruga.getMax();
    }

    @Override
    public void shtoShenjat(ShenjatKomunikacionit sh) {
        shenjatKomunikacionit[max++]=sh;
        max++;
        System.out.println("Rruga u shtua me sukse!");
    }

    @Override
    public void njofto(int i) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Ndeshje");
        map.put(2,"Ri ndertim");
        map.put(3,"Rreshqites(ngrica)");
        System.out.println(map.get(i));
    }


    //Ekziston nje gabim ne kete metode
    @Override
    public String vendnodhja(Rruga rr, int id) {
        id=rruga.getIdRruges();
        String s=rruga.getEmriRruges();
        System.out.println(s);
        if (id==rruga.getIdRruges()) {
            return "Ju gjendeni ne rrugen:" + s;
        }
        return "Ju gjendeni ne rrugen:" + s;
    }
}
