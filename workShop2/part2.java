import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        boolean condt = false;
        do {
            try {
                String s = "";
                String pattern = "^SE\\d{3}";
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the string:");
                s = sc.nextLine();
                if (!s.matches(pattern)) {
                    throw new Exception();
                }
                System.out.println("The string is " + s);
                condt = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                condt = true;
            }
        } while (condt);
    }
}
