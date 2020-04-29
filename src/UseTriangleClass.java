
public class UseTriangleClass {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8 , 15, 8, 7);
        Triangle triangleB = new Triangle(3, 2.598 , 3, 3, 3);
        double triangleArea = triangleA.getArea();
        System.out.println(triangleArea);
        double triangleBArea = triangleB.getArea();
        System.out.println(triangleBArea);
        System.out.println(triangleA.getBase());
        System.out.println(triangleB.getHeigth());
        System.out.println(Triangle.numberOfSide);
    }

}