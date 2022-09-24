import java.util.Scanner;

public class part2_2 {
    public String inpuString() throws Exception {
        String pattern = "^SE\\d{3}";
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string:");
        s = sc.nextLine();
        if (!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }

    public static void main(String[] args) {
        part2_2 obj = new part2_2();
        boolean cont = false;
        do {
            try {
                String s = obj.inpuString();
                System.out.println("The string is:" + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The String is invalid");
                cont = true;
            }
        } while (cont);
    }
}
