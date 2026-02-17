package Arrays;
import java.util.Scanner;

public class InputOf2DArray {
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

        
    }
}
