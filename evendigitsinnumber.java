import java.util.Scanner;
public class evendigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int digit;
        System.out.print("Even digits in the number: ");
         while (number > 0) {
            digit = number % 10; 
            if (digit % 2 == 0) { 
                System.out.print(digit + " ");
            }
            number /= 10;
        }
        
        scanner.close();

	}

}
