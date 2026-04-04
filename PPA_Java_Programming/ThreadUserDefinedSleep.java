//Code to demonstrate thread scheduling
class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        for(i = 1; i<=5; i++)
        {
            System.out.println("Inside run method of: "+Thread.currentThread().getName());

        }
    }
}



class ThreadUserDefinedSleep
{
    public static void main(String A[]) 
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        System.out.println("Inside main Thread");

        dobj1.setName("First");
        dobj2.setName("Second");

        try
        {
            dobj1.start();
            dobj2.start();
            
            System.out.println("End of frist thread");

           
            dobj1.join();
            dobj2.join();
            System.out.println("End of second thread");

        }

        catch(InterruptedException iobj)
        {
            
        }

        

        System.out.println("End of main thread");
    }
}