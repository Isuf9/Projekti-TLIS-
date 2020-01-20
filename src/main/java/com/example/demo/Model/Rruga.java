package com.example.demo.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Rruga implements Njoftimet {

    private Connection con;
    private Statement st;
    private ResultSet rs;

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
//////////////////////////////////////////////////////////////////////////////////////
    static  int max;
    static ShenjatKomunikacionit[] shenjatKomunikacionit=new ShenjatKomunikacionit[10];
    public String emriRruges;
    public String lloijRruges;
    private String gjendja;
    public int ID_semaforit;
    static List<String> list=new ArrayList<String>(3);
    Rruga rruga;
    public void run(){
        System.out.println("Semafori eshte aktiv");
    }
    public void start() throws InterruptedException {

        while(true)  {
            //ndryshoNgjyren();
            redK();
            yellow();
            green();
        }
        }

        public int nrAutomjeteve(int count){

        return count;
        }


    public String shtoRrugen(String emri, String vendi){
        emri="emri";
        vendi="vendi";

        return "Rruga"+emri+"ne "+ vendi+", u shtua me sukses!";
    }

    //////////////////////////////////////////////////////
    public static int getMax() {
        return max;
    }

    public static void setMax(int max) {
        Rruga.max = max;
    }

    public static ShenjatKomunikacionit[] getShenjatKomunikacionit() {
        return shenjatKomunikacionit;
    }

    public static void setShenjatKomunikacionit(ShenjatKomunikacionit[] shenjatKomunikacionit) {
        Rruga.shenjatKomunikacionit = shenjatKomunikacionit;
    }

    public String getGjendja() {
        return gjendja;
    }

    public void setGjendja(String gjendja) {
        this.gjendja = gjendja;
    }

    public String getEmriRruges() {
        return emriRruges;
    }

    public void setEmriRruges(String emriRruges) {
        this.emriRruges = emriRruges;
    }

    public String getLloijRruges() {
        return lloijRruges;
    }

    public void setLloijRruges(String lloijRruges) {
        this.lloijRruges = lloijRruges;
    }

    public int getID_semaforit() {
        return ID_semaforit;
    }

    public void setID_semaforit(int ID_semaforit) {
        this.ID_semaforit = ID_semaforit;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
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
    public void redK() throws InterruptedException {
        System.out.println("Semafori: Kuq");
       for (int i=35; i>=0; i--){
           System.out.print(i);
           Thread.sleep(1000);
           System.out.print("\b\b");
       }
    }

    @Override
    public void yellow() throws InterruptedException {

       System.out.print("Semafori: Verdhe");
        for (int i = 7; i >= 0; i--) {
            System.out.print(i);
            Thread.sleep(1000);
            System.out.print("\b\b");
        }

    }

    @Override
    public void green() throws InterruptedException {

        System.out.println("Semafori: Gjelbert");
        for (int i=35; i>=0; i--){
            System.out.print(i);
            Thread.sleep(1000);
            System.out.print("\b\b");
        }
    }

    @Override
    public void newInfo(int m) {
     //m=0;
        if (max>m) {

            System.out.println("Nje njoftim i ri");
        }
        else if (max==m){
            System.out.println("Nuk keni nje njoftim te ri");
        }
        m=max;
    }


}
