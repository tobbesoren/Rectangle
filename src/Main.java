// new branch, adds checkCollision method in Rectangle class
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> myRectangles = new ArrayList<>();
        Rectangle r1 = new Rectangle(1,9,3,6);
        Rectangle r2 = new Rectangle(5,14,4, 6);
        Rectangle r3 = new Rectangle(8, 9, 4, 8);
        Rectangle r4 = new Rectangle(3, 5, 6, 7);

        /*
        y              ____________
        |             |            |
        |             |            |
        |             |    r2      |
        |             |            |
        |  ________   |          __|_________
        | |        |  |_________|__|         |
        | |        |            |            |
        | |   r1   |            |    r3      |
        | |      __|____________|___         |
        | |     |  |            |   |        |
        | |_____|_ |            |   |        |
        |       |               |   |        |
        |       |     r4        |___|________|
        |_______|___________________|___________ x
                |                   |
                |___________________|
         */


        myRectangles.add(r1);
        myRectangles.add(r2);
        myRectangles.add(r3);
        myRectangles.add(r4);


        listRectangles(myRectangles);
        System.out.println("The area of Rectangle r2 is: " + r2.calculateArea());
        System.out.println("The perimeter of Rectangle r2 is: " + r2.calculatePerimeter());

        System.out.println("r1 overlaps r2: " + r1.checkCollision(r2));
        System.out.println("r1 overlaps r3: " + r1.checkCollision(r3));
        System.out.println("r1 overlaps r4: " + r1.checkCollision(r4));

        System.out.println("r2 overlaps r3: " + r2.checkCollision(r3));
        System.out.println("r2 overlaps r4: " + r2.checkCollision(r4));

        System.out.println("r3 overlaps r4: " + r3.checkCollision(r4));

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