package point;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }
    public Point(int x, int y) {
        x = x;
        y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        /*'this Point' são as variaveis de instancias x e y.
        * xA = this.x
        * yA = this.y
        * xB = 0.0
        * yB = 0.0
        * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        * d(A,B) =√ (0.0 - this.x) * (0.0 - this.x) + (0.0 - this.y) * (0.0 - this.y)
        *  */
        // primeiro implementa o Math.pow. Depois o Math.sqrt
        return Math.sqrt(Math.pow((0.0 - this.x), 2) + Math.pow((0.0 - this.y), 2));
    }
    public double distance(int x, int y) {

        return -1;
    }
    public double distance(Point another) {

        return -1;
    }
}
