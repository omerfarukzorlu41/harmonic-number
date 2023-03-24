import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        double total = 0;
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();

        for(int i = 1 ; i <= number ;i++){
            total += (1.0/i);
        }
        System.out.println("Total: "+total);
    }
}
