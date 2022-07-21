package Lecture19_20;
//Прямоугольник у которого тоже будет возможность породить обьект с помощью точек.
// И еще пусть будет private метод на определение квадрат это или нет и public метод для описания обьекта.
// Можете добавить еще private метод для расчета площади и использовать его в методе описания обьекта.

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getDistance(Point other) {
        return (x - other.x) * (x - other.x) + (y - other.y) * (y - other.y);
    }
}

class Rectangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        if (sideA > 0 && sideB > 0 && sideC > 0 && sideD > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.sideD = sideD;
        } else {
            throw new IllegalArgumentException("Invalid argument");
        }
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        this(a.getDistance(b), b.getDistance(c), c.getDistance(d), d.getDistance(a));
    }

    public boolean isSquare() {
        return sideA == sideB && sideB == sideC && sideC == sideD;
    }
}

public class Lecture20 {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 1);
        Point d = new Point(0, 1);
        Rectangle rectangle = new Rectangle(a, b, c, d);
        System.out.println(rectangle.isSquare() ? "Прямоугольник является квадратом" : "Прямоугольник не является квадратом");
    }
}
