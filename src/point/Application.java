package point;

public class Application {

    public static void main(String[] args) {

        Point pointFirst = new Point(6,5);
        System.out.println("First point = " + pointFirst.distance());

//        Point pointSecond = new Point(3, 1);
//        System.out.println("Second Point = " + pointSecond.distance());
        Point pointSecond = new Point();
        System.out.println(pointSecond.distance());
    }
}
