/*Zadanie 2.
Zdefiniuj w klasie Segment publiczną metodę toSvg(),
która zwróci napis zawierający kod języka znacznikowego SVG pozwalający wyświetlić tę linię.*/
public class Main {
    public static void main(String[] args) {
        //comment
        System.out.println("Hello");
        Point p1=new Point(3, 0);
        Point p2=new Point(3, 3);
        Segment segment=new Segment(p1, p2);
        double distance=segment.getDistance();

        System.out.println(segment.getSvg());
    }
}