package string;

import java.util.Scanner;

public class Test01 {
    public static void doSum(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // 有返回值的方法
    public static int doSum2(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // sting是引用类型
        String str = "abg";
        String s = "xyz";
        String b = "abg";
        String ss = str + s;
        // Char c = ss.charAt(ss.length());
        int index = ss.indexOf("x");
        Scanner sc = new Scanner(System.in);
        String sca = sc.next();
        System.out.println(index);
        System.out.println(str == b);
        if (str == sca) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
        if (str.equals(sca)) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
        sc.close();

        doSum(100);
    }
}