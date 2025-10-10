package encapsulation;

public class Client {
    public static void main(String[] args) {
        /*
        public -> access anywhere
        private -> access no where only inside the class
        default -> access anywhere inside package, and no where outside package irrespective of child class or not
         */

        Student student = new Student();
        student.id=1;
        student.marks=100;
        student.name="Avishek";

        System.out.println(student.id);
        System.out.println(student.marks);
        System.out.println(student.name);
        student.printDetails();
        System.out.println("\n");

        Rectangle rectangle = new Rectangle();
        rectangle.length=10;
        rectangle.breadth=20;

        Point point = new Point();
        point.x=5;
        point.y=3;
        rectangle.bottomLeft=point;

        rectangle.area();
        rectangle.perimeter();
        rectangle.topRightCoordinate();

    }
}
