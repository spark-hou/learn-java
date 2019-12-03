package app;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = sc.nextInt();
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                System.out.println(num + "是合数");
                break;
            } else {
                System.out.println(num + "是质数");
            }
        }
        sc.close();

    }

}