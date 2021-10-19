package thread;

public class Main {
    public static void main(String[] args) {
        Main g = new Main();
        g.run();
    }

    public void run() {
        NewThread t = new NewThread(1);
        t.start();
        NewThread t2 = new NewThread(2);
        t2.start();
    }
}
