import java.util.Random;
import com.beust.jcommander.JCommander;


class Producer implements Runnable {
    BoundedBuffer b = null;

    public Producer(BoundedBuffer initb) {
        b = initb;
        new Thread(this).start();
    }
    public void run() {
        double item;
        Random r = new Random();
        while (true) {
            item = r.nextDouble();
            System.out.println("produced item " + item);
            b.deposit(item);
            Util.mySleep(200);
        }
    }
}
class Consumer implements Runnable {
    BoundedBuffer b = null;

    public Consumer(BoundedBuffer initb) {
        b = initb;
        new Thread(this).start();
    }
    public void run() {
        double item;
        while (true) {
            item = b.fetch();
            System.out.println("fetched item " + item);
             Util.mySleep(50);
        }
    }
}
class ProducerConsumer {
    public static void main(String[] args) {

        new JCommander(param, args);
        parameters param = new parameters();
        BoundedBuffer buffer = new BoundedBuffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = param.totalConsumeNumber;//new Consumer(buffer);
    }
}

