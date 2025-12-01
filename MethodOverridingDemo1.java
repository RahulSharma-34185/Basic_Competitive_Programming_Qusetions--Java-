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
public class MethodOverridingDemo1 {

    public static void main(String[] args){
        pitbul obj = new pitbul();
        obj.bark();
        obj.bark(6);
    }
    
}
