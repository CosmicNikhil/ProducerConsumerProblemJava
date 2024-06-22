public class Consumer extends Thread {
    GFG gfg;

    Consumer(GFG gfg)
    {
        this.gfg = gfg;
    }

    @Override
    public void run()
    {
        while(true)
        {
            try {
                int item = gfg.consume_item();


           //Consumer has other tasks as well
           //after prooducing items,producer will be sleepy
     
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        }
    }


}
