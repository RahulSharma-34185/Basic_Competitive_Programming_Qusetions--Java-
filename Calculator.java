package Calculator;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);

        //User Interface ke liye 
        System.out.println("Welcome to Calcutor!");
       

        System.out.println("----------------Menu------------");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("5 for Exit");

        //User se input lene ke liye
        System.out.print("What do you want to do ? ");
        int choice = sc.nextInt();
        
        //Agr user exit chahta ho to
        if(choice == 5){
        System.out.print("Thank you");
            
    }
        else{
        
        System.out.print("Enter First Number : ");
        double N1 = sc.nextDouble();
        System.out.print("Enter Second Number : ");
        double N2 = sc.nextDouble();

        //Operations perform karne ke liye
        switch(choice){
            case 1 :
                System.out.print("Addition of two numbers is : " +( N1+N2));
                break;
            case 2 :
                System.out.print("Subtraction of two Numbers is: " + (N1-N2));
                break;
            case 3 :
                System.out.print("Multiplication of two numbers is : " + (N1*N2));
                break;
            case 4 :
                if(N2 == 0){ 
                    System.out.print("Cannot be difine!");

                }
                else{
                System.out.print("Division of two numbers is : " + (N1/N2));
                }
                break;
            default:
                System.out.print("Invalid Choice");
                break;
        }
        
    }
    sc.close();

         }
    }

