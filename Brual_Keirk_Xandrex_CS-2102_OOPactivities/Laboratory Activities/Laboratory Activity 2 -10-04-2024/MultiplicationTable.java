import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the size of Multiplication Table: ");
        int size = input.nextInt();
        int row = size, col= size;

        int [][]table = new int [row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Multiplication table: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        input.close();
    }
}
