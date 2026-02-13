package TechnicalSkills;



    public class MinimumTimeToEqualArray {
    public static void main(String[] args) {

        int arr[] = {2, 4, 1, 3};
        int max = arr[0];
        int time = 0;

        for (int i =0; i<arr.length; i++){
            if (arr[i]>max) max = arr[i];

        }
        for (int i=0; i<arr.length; i++){
            time =+ max - arr[i];

            System.out.print(time);
        }

    }

    
}

// Write a program to read and print a user defined matrix.
