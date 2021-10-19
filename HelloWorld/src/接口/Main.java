package 接口;

public class Main {
    public static void main(String[] args) {
        Main g = new Main();
        g.run();
    }

    public void run() {
        NewThread t1 = new NewThread(1);
        Thread t = new Thread(t1);
        t.start();
    }
}
