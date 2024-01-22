package Inheritance;

public class B {

    double l;
    double w;
    double h;

    B(){
        this.l = -1;
        this.w=-1;
        this.h=-1;
    }

    B(double side){
        this.l=side;
        this.w=side;
        this.h= side;
    }
    B(double l,double h,double w){
        this.l =l;
        this.w=w;
        this.h=h;
    }

    B(B old){
        this.l = old.l;
        this.w= old.w;
        this.h = old.h;
    }

    public void learn(){
        System.out.println("I am learning Java");
    }

    public static void main(String[] args) {
        B a = new B(4,4,6);
        B t = new B(a);
        System.out.println(a.h);
        System.out.println(a.l);
        System.out.println(a.w);
    }
}


