package Arrays;

public class MaxElement {
    public static void main(String[] args){

        int[] arr = {12, 45, 89, 121, 1, 89};
        int n = arr.length;
        int max = arr[0];
        
        for(int i=0; i<n; i++){
            if(arr[i]>max) 
                max = arr[i];
        }
        System.out.println("Max : "+max);
      
    }
    
}
