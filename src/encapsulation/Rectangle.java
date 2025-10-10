package encapsulation;

public class Rectangle {
    int length;
    int breadth;
    Point bottomLeft;

    void area(){
        System.out.println(length*breadth);
    }

    void perimeter(){
        System.out.println(2*(length+breadth));
    }

    void topRightCoordinate(){
        System.out.println("X : " + (bottomLeft.x+length));
        System.out.println("Y : " + (bottomLeft.y+breadth));
    }
}
