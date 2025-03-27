public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private double sideC = Math.sqrt((sideB*sideB) + (sideA*sideA));

    public Triangle(Point location, int sideB, int sideA) {
        super(location);
        this.sideB = sideB;
        this.sideA = sideA;
        this.sideC = Math.sqrt((sideB*sideB) + (sideA*sideA));
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }


    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        return sideA * sideB / 2;
    }
}
