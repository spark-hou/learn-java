package 接口;

public class NewThread implements Runnable {
    private int begin;

    public NewThread(int begin) {
        this.begin = begin;
        System.out.println(this.begin + "begin");
    }

    @Override
    public void run() {
        for (int i = begin; i < 50; i = i + 2) {
            System.out.println(i + " ");
        }
    }
}
