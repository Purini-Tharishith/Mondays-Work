package Interface;

public class Car implements Engine,Brake{

    int a = 30;
    @Override
    public void brake() {
        System.out.println("this is  normal brake");
    }

    @Override
    public void start() {
        System.out.println("this is  normal start");
    }

    @Override
    public void stop() {
        System.out.println("this is  normal stop");
    }

    @Override
    public void acc() {
        System.out.println("this is  normal acc");
    }
}
