package Inheritance;

import Inheritance.B;

public class Main {

    public static void main(String[] args) {

//        Boxweight box3 = new Boxweight();
//        System.out.println(box3.l + "  " + box3.weight);

        BoxPrice box = new BoxPrice(7, 64, 340);
        System.out.println(box.l);
    }
}