import java.util.Scanner;

public class Home_work2_3 {

    public static void main(String[] args) {
        System.out.println("Напишите любой год");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int coef = days % 4;
        if (coef == 0) {
            int coefScnd = days % 100;
            if (coefScnd > 0)
                System.out.println("Этот код высокосный и в нём 366 дней");
            else {
                int coefThrd = days % 400;
                if (coefThrd == 0) System.out.println("Этот код высокосный и в нём 366 дней");
                else System.out.println("Этот год не высокосный и в нём 365 дней");
            }
        } else System.out.println("Этот год не высокосный и в нём 365 дней");
    }
}
