class Calculator
{
    int z;
    public void addition(double x, double y)
    {
        System.out.println("The sum off the given numbers is : "+x+y);
    }
    public void difference(double x, double y)
    {
    System.out.println("The difference between the two numbers is : "+ (x-y));
    }
}
class MyCalculator extends Calculator{
    
    public void  multiplication(double x, double y)
    {
        double z=x*y;
        System.out.println("The multiple of the two given numbers is : "+z);
    }
    public void  division(double x, double y )
    {
        System.out.println( "The divison of the two numbers is :"+x/y);
    }
}
public class Inheritance {
    public static void main(String [] args)
    {
            Calculator cal = new Calculator();
            MyCalculator mycal = new MyCalculator();
            Calculator cal2 = new MyCalculator();
        mycal.addition(5,56);
           mycal.difference(7,9);
           mycal.multiplication(4,5);
           //cal2.multiplication(4,5); //I can't use like this because superclass reference varable can access only the methods of the superclass only

    }
}
