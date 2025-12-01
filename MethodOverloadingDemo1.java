class Mathop {

    int add (int a, int b)
    {
        return a+b;
    }
    int add (int a, int b, int c)
    {
        return a+b+c;
    }
    double add (int a, int b)
    {
        return a+b;
    }

    
}
public class MethodOverloadingDemo1 
{
    public static void main(String[] args)
    {
        Mathop obj = new Mathop();
        System.out.print("\n add (4, 5) : " + obj.add (4, 5));
        System.out.print("\n add(4, 5, 6) : "+ obj.add (4, 5, 6));
        System.out.print("\n add(4.5, 5.5): "+ obj.add (4.5, 5.5));
    }
    
}
