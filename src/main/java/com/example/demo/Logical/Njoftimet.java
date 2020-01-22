package com.example.demo.Logical;

import com.example.demo.Model.Automobili;
import com.example.demo.Model.Rruga;
import com.example.demo.Model.ShenjatKomunikacionit;

public interface Njoftimet {
    void newInfo(int m);
    void shtoShenjat(ShenjatKomunikacionit sh);
    void njofto(int i);
    String vendnodhja(Automobili a, int id);
    void connectToDB();
}
