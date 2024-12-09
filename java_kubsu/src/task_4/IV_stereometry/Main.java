package task_4.IV_stereometry;

public class Main {
    public static void main(String[] args) {
        // Пример использования класса Point
        Point p1 = new Point(3, 4);
        Point linePoint1 = new Point(1, 1);
        Point linePoint2 = new Point(4, 5);
        Point reflectedP1 = p1.reflect(linePoint1, linePoint2);
        System.out.println("Изначальная точка: " + p1);
        System.out.println("Зеркальная точка: " + reflectedP1);

        // Пример использования класса Point3D
        Point3D p3d = new Point3D(3, 4, 5);
        double planeZ = 2; // Плоскость z = 2
        Point3D reflectedP3D = p3d.reflect(planeZ);
        System.out.println("Изначальная точка 3D: " + p3d);
        System.out.println("Зеркальная точка 3D: " + reflectedP3D);
    }
}