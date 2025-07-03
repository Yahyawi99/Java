
class Main {
    public static void main(String[] args) {
        Circle s = new Circle();
        s.radius = 4;
        System.out.println(s.perimeter());
    }

    static abstract class Shape {
        public abstract double perimeter();

        public abstract double area();
    }

    static class Circle extends Shape {
        int radius;

        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }
}