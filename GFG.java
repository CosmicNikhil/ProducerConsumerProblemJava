import java.lang.Thread;
//Shared memory needs to be synchronised
//Producer and consumer cannot siultaneously access share memory space
//synchronisation and inter thread communication

class GFG{

    //flag == false ==> item is not present,Consumer shiuld wait producer is producing item
    //flag == true ==> item is present
    int buffer;
    boolean flag = false;

    synchronized public void produce_item(int item) throws Exception
    {
        if(flag == true)
        {
            wait();
        }
        buffer = item;
        System.out.println("Produced item: "+buffer);
        flag = true;
        notify();
    }

    synchronized public int consume_item() throws Exception
    {
        if(flag == false)
        {
            wait();
        }
        System.out.println("Consumed item: "+buffer);
        flag = false;
        notify();
        return buffer;
    }
}