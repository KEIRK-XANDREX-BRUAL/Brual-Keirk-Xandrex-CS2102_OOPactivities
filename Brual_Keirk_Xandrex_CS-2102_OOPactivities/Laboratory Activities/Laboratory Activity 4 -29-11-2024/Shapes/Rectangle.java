class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public void printShapeType(){
        System.out.println("Rectangle");
    }
}
