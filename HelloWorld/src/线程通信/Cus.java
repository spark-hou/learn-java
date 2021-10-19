package 线程通信;

public class Cus implements Runnable {
    Pack pack;

    public Cus(Pack pack) {
        this.pack = pack;
    }

    @Override
    public void run() {
        eat();
    }

    private void eat() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pack.num--;
            System.out.println("eat pack:" + pack.num);
        }
    }
}
