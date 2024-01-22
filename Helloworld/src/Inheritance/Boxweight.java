package Inheritance;

import javax.swing.*;

public class Boxweight extends B{

    double weight;

    public Boxweight(){
     this.weight=-1;
    }

    public Boxweight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public Boxweight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public Boxweight(B old, double weight) {
        super(old);
        this.weight = weight;
    }

    Boxweight(Boxweight other){
        weight = other.weight;
    }

}
