class threadTest_4th {

public static void main(String argv[])
{
Runnable r=new name_test();
Thread t=new Thread(r,"defined_thread_name");
t.start();
}
}

class name_test implements Runnable {
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Name:"+Thread.currentThread().getName()+" i: "+i);
}
}
}

