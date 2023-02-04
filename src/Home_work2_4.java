import java.util.Scanner;

public class Home_work2_4 {

    public static void main(String[] args) {
        System.out.println("Напишите какой будет сторона A треугольника");
        Scanner frstSide = new Scanner(System.in);
        int a = frstSide.nextInt();

        System.out.println("Напишите какой будет сторона B треугольника");
        Scanner scndSide = new Scanner(System.in);
        int b = scndSide.nextInt();

        System.out.println("Напишите какой будет сторона C треугольника");
        Scanner thrdSide = new Scanner(System.in);
        int c = thrdSide.nextInt();

        if (a + b > c) {
            if (a + c > b) {
                if (c + b > a) {
                    System.out.println("Такой треугольник может существовать");
                }
            }
        } else System.out.println("Такой треугольник не может существовать");
    }
}
