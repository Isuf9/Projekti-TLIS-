package com.example.demo.Logical;

import com.example.demo.Model.Rruga;
import com.example.demo.Model.ShenjatKomunikacionit;

public interface Njoftimet {
    void newInfo(int m);
    void shtoShenjat(ShenjatKomunikacionit sh);
    void njofto(int i);
    String vendnodhja(Rruga rr, int id);
    void connectToDB();
}
