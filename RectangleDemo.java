class Rectangle {
    int length, breadth, area;
    static int count = 0;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
        this.area = 0;
        count++;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = this.length * this.breadth;
        count++;
    }

    void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
        System.out.println("Area: " + this.area);
    }

    static void display_count() {
        System.out.println("Number of Rectangles created = " + count);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        Rectangle r3 = new Rectangle(7, 4);

        r1.display();
        r2.display();
        r3.display();

        Rectangle.display_count();
    }
}
