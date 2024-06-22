public class Producer extends Thread{
     GFG gfg;

     Producer(GFG gfg)
     {
        this.gfg = gfg;
     }

     @Override
     public void run()
     {
        int i = 1;
        while(true)
        {
            try {
                gfg.produce_item(i);

            i++;

            //producer has other tasks as well
           //after prooducing items,producer will be sleepy

                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }




     }
}
