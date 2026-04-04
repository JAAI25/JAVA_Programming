class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of: "+Thread.currentThread().getName());
    }
}



class ThreadUserDefinedJoinSerialAlive
{
    public static void main(String A[]) 
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        System.out.println("Inside main Thread");

        dobj1.setName("First");
        dobj2.setName("Second");

        //checked Exception
        try
        {
            dobj1.start();
            System.out.println("Is first thread alive? :"+dobj1.isAlive);
            dobj1.join();
            System.out.println("End of frist thread");

            System.out.println("Is first thread alive? :"+dobj2.isAlive);
            dobj2.start();
            dobj2.join();
            System.out.println("End of second thread");

        }

        catch(InterruptedException iobj)
        {
            
        }

        

        System.out.println("End of main thread");
    }
}