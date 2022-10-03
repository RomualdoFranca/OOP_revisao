package point;

public class Point {

    private int x;
    private int y;

    public Point() {
//        this(0,0);
    }
    public Point(int x, int y) {
        // Ficar atento ao construtor automatico. A falta do this.x e this.y ocasionou erro
        this.x = x;
        this.y = y;
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

        *  */
        // primeiro implementa o Math.pow. Depois o Math.sqrt
        return Math.sqrt(Math.pow((0.0 - this.x), 2) + Math.pow((0.0 - this.y), 2));

//        return Math.sqrt((0.0 - this.x) * (0.0 - this.x) + (0.0 - this.y) * (0.0 - this.y));

    }
    public double distance(int x, int y) {

//        return Math.sqrt(Math.pow((getX() - x), 2) + Math.pow((getY() - y), 2));
        return getX();
    }
    public double distance(Point another) {

        return -1;
    }
}
