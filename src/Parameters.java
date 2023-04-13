import java.awt.*;

public class Parameters {


    public void main() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 10);



        System.out.println(p1);
        System.out.println(p2);

        swap(p1, p2);

        System.out.println(p1);  // 0, 0
        System.out.println(p2);  // 10, 10
    }
    /*public  static  void process(Parameters p){
        p.stampa();
    }*/


    public void swap (Point p1, Point p2) {
        Point tmp = p1;
        p1 = p2;
        p2 = tmp;
    }
}

