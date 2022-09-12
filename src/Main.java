import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> myRectangles = new ArrayList<>();
        Rectangle r1 = new Rectangle();
        output(r1.toString());

        myRectangles.add(r1);
        output(myRectangles.get(0).toString());

        Rectangle r2 = new Rectangle(10,12,25, 4);

        myRectangles.add(r2);

        listRectangles(myRectangles);
        System.out.println(r2.calculateArea());
        System.out.println(r2.calculatePerimeter());

        Rectangle r3 = new Rectangle(34, 62, 64, 23.87);
        myRectangles.add(r3);

        listRectangles(myRectangles);

        myRectangles.get(2).setHeight(43.9876);

        listRectangles(myRectangles);

        myRectangles.get(1).setXY(234.5, 67.32);
        listRectangles(myRectangles);

    }

    static void output(String output){
        System.out.println(output);
    }

    static void listRectangles(ArrayList<Rectangle> myRectangles){
        for(Rectangle rectangle : myRectangles){
            output(rectangle.toString());
        }
        System.out.println("--------------------------");
    }
}