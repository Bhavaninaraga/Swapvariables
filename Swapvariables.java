import java.util.Scanner;

public class Swapvariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using a third variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}
