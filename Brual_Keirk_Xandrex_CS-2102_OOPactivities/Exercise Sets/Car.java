
class Car {

    private String color; 
    private double price;
    private char size;

    public Car(String color, double price, char size){
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getcolor(){
        return color;
    }

    public double getprice(){
        return price;
    }

    public char getsize(){
        return size;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public void setprice(double price){
        this.price = price;
    }

    public void setsize(char size){
        this.size = Character.toUpperCase(size);
    }
    
    private String SizeDescriptor(){
        switch (size){
            case 'S':
                return "small";
            case 'M':
                return "medium";
            case 'L': 
                return "large";
            default:
                return "invalid"; 
        }
    }

    public String toString(){
        String formatprice = String.format("%.2f", price);

        return "Car (" + color + ") - P(" + formatprice + ") "+ SizeDescriptor() + ".";
    }

    public static void main(String[] args){
        
        Car RedCar = new Car("red", 19999.85, 'M');
        System.out.println(RedCar.toString());
        Car BlueCar = new Car("blue", 50000.00, 'L');
        System.out.println(BlueCar.toString());
    }
}

