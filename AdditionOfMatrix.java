package Arrays;

import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of row : ");
    int n = sc.nextInt();
    System.out.print("Enter number of column : ");
    int m = sc.nextInt();

    int A[][] = new int[n][m];

    for(int i=0; i<n; i++){
       for(int j=0; j<m; j++){
        A[i][j] = sc.nextInt();
       }
    }

    System.out.println("Matrix is: ");
    for(int i=0; i<n; i++){
       for(int j=0; j<m; j++){
       System.out.print(A[i][j]+ " ");
       }
       System.out.println();
    }
    System.out.print("Enter number of row of 2nd Matrix : ");
    int k = sc.nextInt();
    System.out.print("Enter number of column of 2nd Matrix : ");
    int l = sc.nextInt();

    int B[][] = new int[k][l];

    for(int i=0; i<k; i++){
       for(int j=0; j<l; j++){
        B[i][j] = sc.nextInt();
       }
    }

    System.out.println("Matrix is: ");
    for(int i=0; i<k; i++){
       for(int j=0; j<l; j++){
       System.out.print(A[i][j]+ " ");
       }
       System.out.println();
    }

    int C[][] = new int[k][l];

    for(int i=0; i<k; i++){
       for(int j=0; j<l; j++){
        C[i][j] =  A[i][j] +  B[i][j];
       }
    }

    System.out.println("Matrix is: ");
    for(int i=0; i<k; i++){
       for(int j=0; j<l; j++){
       System.out.print(C[i][j]+ " ");
       }
       System.out.println();
    }

    
    }
    
}
