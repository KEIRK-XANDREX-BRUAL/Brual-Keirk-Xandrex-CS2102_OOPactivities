import java.util.Scanner;

class GettingGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char letter1 = input.next().charAt(0);
        System.out.print("Enter second character: ");
        char letter2 = input.next().charAt(0);
        int a = (int) letter1;
        int b = (int) letter2;
        int high = Math.max(a, b);
        char ch1 = (char) high;
        System.out.println("--------------------------------");
        System.out.println("The character with the greater value is: " + ch1);
        System.out.println("--------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println( letter1 + ": " + a);
        System.out.println( letter2 + ": " + b);
        input.close();
    }
}
