package task_4.IV_stereometry;

class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D reflect(double planeZ) {
        // Зеркальное отражение относительно плоскости z = planeZ
        double reflectedZ = 2 * planeZ - z;
        return new Point3D(x, y, reflectedZ);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}