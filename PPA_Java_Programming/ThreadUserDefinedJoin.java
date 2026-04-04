class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of:"+Thread.currentThread().getName());
    }
}



class ThreadUserDefinedJoin
{
    public static void main(String A[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        System.out.println("Inside main Thread");

        dobj1.setName("First");
        dobj2.setName("Second");
        dobj1.start();
        dobj2.start();

        System.out.println("End of main thread");
    }
}