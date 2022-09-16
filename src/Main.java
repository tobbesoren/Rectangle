// new branch, adds checkCollision method in Rectangle class
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> myRectangles = new ArrayList<>();
        Rectangle r1 = new Rectangle(21,12,10,10);
        Rectangle r2 = new Rectangle(10,12,10, 10);
        Rectangle r3 = new Rectangle(34, 62, 10, 10);


        myRectangles.add(r1);
        myRectangles.add(r2);
        myRectangles.add(r3);


        listRectangles(myRectangles);
        System.out.println(r2.calculateArea());
        System.out.println(r2.calculatePerimeter());

        System.out.println(r1.checkCollision(r2));

    }

    static void output(Rectangle rectangle){
        System.out.println(rectangle);
    }

    static void listRectangles(ArrayList<Rectangle> myRectangles){
        for(Rectangle rectangle : myRectangles){
            output(rectangle);
        }
        System.out.println("--------------------------");
    }
}