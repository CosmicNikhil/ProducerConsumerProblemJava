public class Main {
    public static void main(String[] args) {

        GFG gfg = new GFG();
        Producer producer = new Producer(gfg);
        Consumer consumer = new Consumer(gfg);

        producer.start();
        consumer.start();


    }
}
