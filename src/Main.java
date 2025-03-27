public class Main {
    public static void main(String[] args) {
        /*
        Point p =  new Point(3,4);
        Rectangle r1 = new Rectangle(p,3,4);
        System.out.println(r1.counterforobject);
        System.out.println(Rectangle.counter);
        Rectangle r2 = new Rectangle(p,5,6);
        System.out.println(r1.counterforobject);
        System.out.println(r2.counterforobject);
        System.out.println(Rectangle.counter);
        System.out.println(Integer.max(3,4));
        System.out.println(Integer.parseInt("1"));
        System.out.println(r1);
        String a = new String("aaa");
        System.out.println(a);
        }
        */
        /*
        Rectangle r1 = new Rectangle(new Point(3,4),2,5);
        Shape shape = new Shape(new Point(3, 4));
        System.out.println(shape.toString());
        Circle c = new Circle(new Point());
        */
        Triangle t1 = new Triangle(new Point(3,4),3,4);
        System.out.println(t1.perimeter());
        System.out.println(t1.area());
    }

}