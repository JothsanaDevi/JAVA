import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        
        while (number != 0) {
            int digit = number % 10;
            sum = sum * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Reversed Number: " + sum);
        
        scanner.close();
    }
}
