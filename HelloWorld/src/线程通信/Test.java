package 线程通信;

public class Test {
    public static void main(String[] args) {
        Pack p = new Pack();
        p.num = 10;
        Cooker co = new Cooker(p);
        Cus cus = new Cus(p);

        Thread t1 = new Thread(co);
        Thread t2 = new Thread(cus);

        t1.start();
        t2.start();
    }
}
