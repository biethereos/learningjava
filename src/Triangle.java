public class Triangle {
    static int numberOfSide = 3;
    private double base;
    private double heigth;
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(double base, double heigth, double side1, double side2, double side3) {
        this.base = base;
        this.heigth = heigth;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
    }
    
    public double getBase() {
        return base;
    }
    
    public double getHeigth() {
        return heigth;
    }
    
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        return (base * heigth) / 2;
    }
}