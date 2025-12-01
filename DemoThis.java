class Person{
    String name;
    int age;
    
    Person()
    {

    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.print("\n name : "+ name);
        System.out.print("\n age : "+ age);
    }

    
}
public class DemoThis {
    public static void main(String[] args) {
        
        Person p1 = new Person("Ajay", 19);
        p1.display();
    }

    
}