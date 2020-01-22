package com.example.demo.Logical;
import com.example.demo.Model.Automobili;
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
    private    int max;
    private ShenjatKomunikacionit[] shenjatKomunikacionit=new ShenjatKomunikacionit[10];
    public String emriRruges;
    public String lloijRruges;
    private String gjendja;
    public int ID_semaforit;
    private int idRruges;
    Rruga rruga;


//    public LogjikaRruga(String emriRruges, String lloijRruges, String gjendja, int idRruges){
//
//        this.emriRruges=emriRruges;
//        this.lloijRruges=lloijRruges;
//        this.gjendja=gjendja;
//        this.idRruges= idRruges;
//
//    }

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

    @Override
    public void newInfo(int m) {
        if (max>m) {

            System.out.println("Nje njoftim i ri");
        }
        else if (max==m){
            System.out.println("Nuk keni nje njoftim te ri");
        }
        m=max;
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

    @Override
    public String vendnodhja(Automobili a, int id) {
        String s=a.getLokacioni();
        return "Ju gjendeni ne rrugen:" + s;

    }

    //CRUD FORMA
    public void edit(Rruga r,String value){
      r.setEmriRruges(value);
    }
    public void delete(Rruga r){
        r.setEmriRruges(null);
    }

}
