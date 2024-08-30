import java.util.Scanner;

 class Tempconvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Celsius: ");
        float Cel = input.nextInt();
        double Fahr = Cel*(1.8)+(32);
        System.out.println( String.format("%.2f Celsius", Cel) + " is " + String.format("%.2f Fahrenheit", Fahr));
        input.close();
    }
}
