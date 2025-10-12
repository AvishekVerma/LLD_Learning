package inheritanceAndPolymorphism;

public class C  extends B {

    int z;

    public C(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void helloC() {
        System.out.println("Hello world from C");
        super.helloB(); // it will call the parent class implementation of helloB
        super.helloA(); // it will cal the overridden implementation of helloA inside immediate parent B
        super.helloB(); // calling helloB implementation of the current class
        this.helloA();
        super.helloAOriginal();
    }

    // overridden method
    public void helloB() {
        System.out.println("Hello world form B but from inside of C");
    }

    public void helloA() {
        System.out.println("Hello world form A but from inside of C");
    }

    // C is child of B, B is child of A
}

