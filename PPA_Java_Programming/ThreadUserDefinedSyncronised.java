class TablePrinter
{
    public void PrinterTable(int n)
    {
        int i = 0;

        for(i = 1; i<= 10; i++)
        {
            System.out.println("Name :"+Thread.currentThread().getName()+" :"+n*1);
        }
    }
}
class Demo extends Thread
{
    public void run() 
    {
        
    }
}

class ThreadUserDefinedSyncronised
{
    public static void main(String A[]) 
    {
        TablePrinter tobj = new TablePrinter();
        tobj.PrintTable(5);
        tobj.PrintTable(4);

    }
}