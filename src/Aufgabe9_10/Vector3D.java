package Aufgabe9_10;

public class Vector3D {
    public static void main(String[] args) {
        // create two vectors for testing
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);

        // test the methods of the class
        System.out.println("Vector v1: " + v1);
        System.out.println("Vector v2: " + v2);
        System.out.println("v1 + v2 = " + v1.add(v2));
        System.out.println("v1 - v2 = " + v1.subtract(v2));
        System.out.println("v1 * 2 = " + v1.multiply(2));
        System.out.println("v1 / 2 = " + v1.divide(2));
        System.out.println("v1 dot v2 = " + v1.dotProduct(v2));
        System.out.println("v1 cross v2 = " + v1.crossProduct(v2));
    }


        private double x;
        private double y;
        private double z;


    // Constructor
        public Vector3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    // Getters and setters
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getZ() {
            return z;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setZ(double z) {
            this.z = z;
        }
    // Addition of two vectors
        public Vector3D add(Vector3D other) {
            return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
        }
    // Subtraction of two vectors
        public Vector3D subtract(Vector3D other) {
            return new Vector3D(this.x - other.x, this.y - other.y, this.z - other.z);
        }
    // Scalar multiplication of a vector
        public Vector3D multiply(double scalar) {
            return new Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
        }
    // Scalar division of a vector
        public Vector3D divide(double divisor) {
            return new Vector3D(this.x / divisor, this.y / divisor, this.z / divisor);
        }
    // Cross product of two vectors
        public Vector3D crossProduct(Vector3D other) {
            double cx = this.y * other.z - this.z * other.y;
            double cy = this.z * other.x - this.x * other.z;
            double cz = this.x * other.y - this.y * other.x;
            return new Vector3D(cx, cy, cz);
        }
    // Dot product of two vectors
    public double dotProduct(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }
    // String representation of a vector
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Vector3D)) {
            return false;
        }
        Vector3D other = (Vector3D) obj;
        return Double.compare(x, other.x) == 0 &&
                Double.compare(y, other.y) == 0 &&
                Double.compare(z, other.z) == 0;
    }
    }

