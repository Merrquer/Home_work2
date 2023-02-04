import java.util.Scanner;

public class Home_work2_1 {
    public static void main(String[] args) {
        System.out.println("Напиши любое число:" );
        Scanner frstNum = new Scanner(System.in);
        float a = frstNum.nextInt(); //Обозначаем первое число

        System.out.println("Напиши ещё одно любое число:" );
        Scanner scndNum = new Scanner(System.in);
        int b = scndNum.nextInt(); //Обозначаем второе число

        System.out.println("И ещё одно:" );
        Scanner thrdNum = new Scanner(System.in);
        int c = thrdNum.nextInt(); //Обозначаем третье число

        System.out.println("Последнее число:" );
        Scanner fourNum = new Scanner(System.in);
        int d = fourNum.nextInt(); //Обозначаем четвертое число

        if (a > b && a > c && a > d)
            System.out.println("Самое большое число: " + a);

            else if (b > a && b > c && b > d)
                System.out.println("Самое большое число: " + b);

                else if (c > a && c > b && c > d)
                     System.out.println("Самое большое число: " + c);

                    else System.out.println("Самое большое число" + d);

    }
}