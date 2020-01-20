package com.example.demo.Model;

public interface Njoftimet  {
    void newInfo(int m);

    void shtoShenjat(ShenjatKomunikacionit sh);

    void njofto(int i);

    void redK() throws InterruptedException;
    void yellow() throws InterruptedException;
    void green() throws InterruptedException;
    //void ndryshoNgjyren() throws InterruptedException;
    void connectToDB();





}
