public class thread_by_runnable implements Runnable{

public String name;
public thread_by_runnable(String name)
{
this.name=name;
}

public void run()
{
for(int i =0;i<20;i++)
{
if(count>0){
System.out.println("Name is "+name+" Count: "+count);
count--;
}
}
}

public static void main(String argv[])
{	
	
	thread_by_runnable thread1=new thread_by_runnable("Rocky");
	thread_by_runnable thread2=new thread_by_runnable("NVIDIA");
	new Thread(thread1).start();
	new Thread(thread2).start();
	
	
}

public static int count=10;
}