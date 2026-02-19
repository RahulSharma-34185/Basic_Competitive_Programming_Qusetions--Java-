package Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row(m) : ");
        int m = sc.nextInt();
        System.out.print("Enter number of column(n) : ");
        int n = sc.nextInt();

        int A[][] = new int[m][n];
        System.out.println("Enter the elements of the matrix(A) : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : "+ A[i][j]);
        int T[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                T[j][i] = A[i][j];
            }
        }
        System.out.println("Transpose of the matrix is :" + T[n][m]);
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(T[i][j] + " ");
                
            }
            System.out.println();
         }

    }
    

}