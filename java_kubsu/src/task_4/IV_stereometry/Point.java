package task_4.IV_stereometry;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point reflect(Point linePoint1, Point linePoint2) {
        // Уравнение прямой: Ax + By + C = 0
        double A = linePoint2.getY() - linePoint1.getY();
        double B = linePoint1.getX() - linePoint2.getX();
        double C = linePoint2.getX() * linePoint1.getY() - linePoint1.getX() * linePoint2.getY();

        // Расчет расстояния от точки до прямой
        double distance = (A * x + B * y + C) / Math.sqrt(A * A + B * B);
        
        // Зеркальное отражение
        double reflectedX = x - 2 * A * distance / Math.sqrt(A * A + B * B);
        double reflectedY = y - 2 * B * distance / Math.sqrt(A * A + B * B);
        
        return new Point(reflectedX, reflectedY);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}