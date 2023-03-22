class Rectangle extends Shape {
    double length;
    double width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
}
