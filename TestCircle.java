import java.util.Scanner;

class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    // Constructor to initialize the radius and center coordinates
    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    // Method to compute the area of the circle
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute the perimeter of the circle
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to check if a given point is inside the circle
    public boolean isPointInside(double x, double y) {
        // Calculate the distance between the point and the center of the circle
        double distance = Math.sqrt(Math.pow((x - centerX), 2) + Math.pow((y - centerY), 2));
        // Check if the distance is less than the radius
        return distance < radius;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;

        System.out.println("Enter the radius of the circle (negative value to exit):");
        while ((radius = scanner.nextDouble()) >= 0) {
            System.out.println("Enter the x-coordinate of the center:");
            double centerX = scanner.nextDouble();
            System.out.println("Enter the y-coordinate of the center:");
            double centerY = scanner.nextDouble();

            Circle circle = new Circle(radius, centerX, centerY);

            System.out.println("Area of the circle: " + circle.computeArea());
            System.out.println("Perimeter of the circle: " + circle.computePerimeter());

            System.out.println("Enter the x-coordinate of a point:");
            double pointX = scanner.nextDouble();
            System.out.println("Enter the y-coordinate of a point:");
            double pointY = scanner.nextDouble();

            if (circle.isPointInside(pointX, pointY)) {
                System.out.println("The point (" + pointX + ", " + pointY + ") is inside the circle.");
            } else {
                System.out.println("The point (" + pointX + ", " + pointY + ") is outside the circle.");
            }

            System.out.println("Enter the radius of the circle (negative value to exit):");
        }
        scanner.close();
    }
}
