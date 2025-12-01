class dog{
    void bark(){
        System.out.print("\n Dog is barking");
    }
    void bark(int n){
        for (int i=1; i<=n; i++){
            System.out.print("\n Dog is barking");
        }

    }
}

class pitbul extends dog {
    void bark(){
        System.out.print("\n Bark is methodoverriding");
        System.out.print("\n Dog is barking");
    }
}
public class MethodOveriding {

    public static void main(){
        pitbul obj = new pitbul();
        obj.bark();
        obj.bark(5);
    }
    
}
