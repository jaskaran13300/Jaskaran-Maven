package org.example;
import java.util.*;
public class Gift {
    Vector<Sweets> sl;
    String message;
    int tweight;

    public Gift(Vector<Sweets> sl,String message) {
        this.sl = sl;
        this.message=message;
    }
    public int totalWeight()
    {
        for(Sweets s1:sl)
        {
            tweight+=s1.weight;
        }
        return tweight;
    }
}