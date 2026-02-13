package TechnicalSkills;

import java.util.Scanner;

public class SumOfDiagonal {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the rows: ");//No. of Rows input krane ke liye
        int rows = sc.nextInt();
        System.out.print("Enter the columns: ");//No. of Columns input krane ke liye 
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];//Array ka iput krane ke liye
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
         for(int i=0; i<rows; i++){     //Sum print krane ke liye
            for(int j=0; j<columns; j++){
                if(i==j){
                    sum += arr[i][j];
               
            }
        }

    }
    System.out.print(" Sum is :"+ sum);        
}   
}
