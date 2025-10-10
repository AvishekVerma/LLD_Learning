package demo;

import encapsulation.Student;

public class Demo {
    public static void main(String[] args) {

        Student s = new Student();
        s.id = 1;
        s.marks = 100;
        s.name="Avishek";

        System.out.println(s.id);
        System.out.println(s.marks);
        System.out.println(s.name);

        s.printDetails();
    }
}
