//Wap to find wheather number is Even or Odd. :----



import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n % 2 == 0 ){
            System.out.print("Number is Even.");
        }
        else{
            System.out.print("Number is Odd.");
        }
    }
}
