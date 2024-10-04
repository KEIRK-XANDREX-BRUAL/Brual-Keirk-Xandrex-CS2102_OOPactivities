import java.util.Scanner;

public class ArrayMean {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int num_array = input.nextInt();

        getArrayMean(num_array, input);
        
    }
    
    public static void getArrayMean(int num_array, Scanner input){
        int []array = new int [num_array];
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter number: ");
            array[i] = input.nextInt();
            sum += array[i];
        }
        
        double mean = (double) sum/array.length;
        System.out.println("Mean of array is: " + mean);

    }
}
