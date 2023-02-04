import java.util.Scanner;
//Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
//начинается с единицы. На одном этаже 4 квартиры. Напишите программу
//которая получит номер квартиры с клавиатуры, и выведет на экран на
//каком этаже, какого подъезда расположенна эта квартира. Если такой
//квартиры нет в этом доме то нужно сообщить об этом пользователю.
public class Home_work2_2 {

    public static void main(String[] args) {

        System.out.println("Введите номер нужной вам квартиры: ");
        Scanner apartUser = new Scanner(System.in);
        int apartNum = apartUser.nextInt();
        int a = 1;
        for (; apartNum >= 36; apartNum -= 36, a += 1) ;
        int level = apartNum / 4;
        System.out.println("Нужная вам квартира находится в " + a + " подъезде, на " + level + " этаже.");

    }
}
