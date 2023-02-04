import java.util.Scanner;
//Определить количество дней в году, который вводит пользователь. В
//високосном годе - 366 дней, тогда как в обычном 365. Високосный год
//определяется по следующему правилу: Год високосный, если он делится на четыре без остатка, но если он
//делится на 100 без остатка, это не високосный год. Однако, если он
//делится без остатка на 400, это високосный год.
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
