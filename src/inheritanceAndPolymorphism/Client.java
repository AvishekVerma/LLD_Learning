package inheritanceAndPolymorphism;


public class Client {

    public static void main(String[] args) {
        C objC = new C(1, 2, 3);
        System.out.println(objC.x);
        System.out.println(objC.y);
        System.out.println(objC.z);
        objC.helloC();

        //A-> x(cons of A), B-> y(cons of B), C-> z(cons of C)
        // super is always for immediate parent.
        // super from C = B
        // super form B = A
    }


}
