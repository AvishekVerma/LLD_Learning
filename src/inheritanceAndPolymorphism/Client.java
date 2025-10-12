package inheritanceAndPolymorphism;


public class Client {

    public static void main(String[] args) {

        Student s = new Student();
        s.id=1;
        s.name="Sam";
        s.address="123 Main St";
        s.phone="267890";
        s.email="avi@emailcom";
        s.password="12345";
        s.getDetails();
        s.attendLecture("LLD OOPs");

        TA t = new TA();
        t.id=2;
        t.name = "Subham";
        t.address = "City A";
        t.phone = "1234567890";
        t.email = "Subham@email.com";
        t.password = "password";
        t.getDetails();

        System.out.println();
        System.out.println("---------------------");
        System.out.println("This is a string");
        System.out.println(100);
        System.out.println(100.11);
        System.out.println(100.1f);
        System.out.println(true);
        System.out.println('A');

        Calculator c = new Calculator();
        c.add(5,6);
        c.add(5.4, 5.3);
        c.add(5.4, 6);
        c.add(6, 7.6);

        // User [parent] -> Student, TA, Mentor, Instructor [Child Classes]
        User uStudent = new Student();
        User uTA = new TA();
        User uMentor = new Mentor();
        User uInstructor = new Instructor();

        ValidationService vs = new ValidationService();
        System.out.println(vs.verifyEmail(uStudent));
        System.out.println(vs.verifyEmail(new TA()));
        System.out.println(vs.verifyEmail(uTA));
        System.out.println(vs.verifyEmail(uMentor));
        System.out.println(vs.verifyEmail(uInstructor));

        Student s1 = new Student();
        s1.attendLecture();

        Instructor i1 = new Instructor();
        i1.attendLecture();

        Mentor m1 = new Mentor();
        m1.attendLecture();

        TA t1 = new TA();
        t1.attendLecture();

        System.out.println("Please choose an option : 1 -> Student, 2-> TA");
        int option = 2;
        if(option == 1){
            vs.validateLectureAttendance(new Student());
        }else{
            vs.validateLectureAttendance(new TA());
        }

        C objC = new C(1, 2, 3);
        System.out.println(objC.x);
        System.out.println(objC.y);
        System.out.println(objC.z);
        objC.helloC();

        //A-> x(cons of A), B-> y(cons of B), C-> z(cons of C)
        // super is always for immediate parent.
        // super from C = B
        // super form B = A

        Product p = new Product(1, "Iphone", 100, 100000);
        p.main();
    }


}
