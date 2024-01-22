package Inheritance;

public class BoxPrice extends Boxweight{

  double price;

  BoxPrice(){
      super();
      this.price=-1;
  }

  BoxPrice(BoxPrice other){
      super(other);
      this.price= other.price;
  }

    public BoxPrice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }

    public BoxPrice(double side,double weight, double cost){
      super(side, weight);
      this.price=price;
    }
}
