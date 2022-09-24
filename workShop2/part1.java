
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {

        boolean condt = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("type  your input:");
                int n = sc.nextInt();
                if (n < 1)
                    throw new Exception();
                condt = false;
                System.out.println("the number is " + n);
            } catch (Exception e) {
                System.out.println("The number is invalid");
                condt = true;
            }
        } while (condt);
    }
}
