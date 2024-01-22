package ExceptionHandling;

public class Main {
    public static void main(String args[]){
        int a = 7;
        int b = 0;

        try{
           divide(a,b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("this is a normal exception");
        }
        finally {
            System.out.println("this is will be run at everytime");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by 0");
        }
        return a/b;
    }
}
