import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 100 && a < 1000) {
            System.out.println("Вы ввели трёхзначное положительное число");
        } else if (a <= -100 && a > -1000) {
            System.out.println("Вы ввели трёхзначное отрицательное число");
        } else if (a >= 10 && a <= 99) {
            System.out.println("Вы ввели двухзначное положительное число");
        } else if (a <= -10 && a >= -99) {
            System.out.println("Вы ввели двухзначное отрицательное число");
        } else if (a <= -1 && a >-10) {
            System.out.println("Вы ввели однозначное отрицательное число");
        } else if (a < 10 && a > 0) {
            System.out.println("Вы ввели однозначное положительное число");
        } else if (a==0) {
            System.out.println("Вы ввели 0");
        }
    }
}