// Methods assignement

class Methods {
    public double areaOfTriangle(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        System.out.println(obj.areaOfTriangle(4, 5));
    }
}
