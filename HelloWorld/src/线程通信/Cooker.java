package 线程通信;

public class Cooker implements Runnable {
    Pack pack;

    public Cooker(Pack pack) {
        this.pack = pack;
    }

    @Override
    public void run() {
        cook();
    }

    private void cook() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pack.num++;
            System.out.println("do pack:" + pack.num);
        }
    }
}
