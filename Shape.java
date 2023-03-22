abstract class Shape {
    String color;
    public Shape(String color) {
        this.color = color;
    }
    abstract double area();
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}