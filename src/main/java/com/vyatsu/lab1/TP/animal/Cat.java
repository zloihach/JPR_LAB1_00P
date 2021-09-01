package com.vyatsu.lab1.TP.animal;

import javax.naming.Name;

public class Cat extends Animal{
    private String name;
    private int runDist;
    private int swimDist;
    
    public Cat(String name, int runDist, int swimDist){
        this.name=name;
        this.runDist=runDist;
        this.swimDist=swimDist;
    }
}
