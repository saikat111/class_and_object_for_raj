import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
         try{
             System.out.print("Enter an index (0 to 4): ");
             int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (Exception e) {
            System.out.println("Index out of range");
        }
    }
}
