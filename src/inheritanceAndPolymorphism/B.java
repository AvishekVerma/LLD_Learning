package inheritanceAndPolymorphism;

public class B extends A{

    int y;

    public B(int x, int y){
        super(x);
        this.y = y;
    }

    public void helloB(){
        System.out.println("Hello World form B");
    }

    //Overridden
    public void helloA(){
        System.out.println("Hello World form A but from inside of B");
    }

    public void helloAOriginal(){
        super.helloA();
    }
}
