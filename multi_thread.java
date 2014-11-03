class multi_thread extends Thread
{
public String name;
multi_thread(String name)
{
this.name=name;
}

public void run()
{
	for(int i=0;i<10;i++)
	System.out.println(name+" "+i);
}

class thread_by_runnable implements Runnable{
private String name;
thread_by_runnable(String name)
{
this.name=name;
}

public void run()
{
for(int i =0;i<20;i++)
{
System.out.println("Name is "+name+" "+i);
}
}


}

public static void main(String argv[])
{
	//multi_thread a=new multi_thread("A");
	//multi_thread b=new multi_thread("B");
	//a.start();
	//b.start();
	
	thread_by_runnable thread1=new thread_by_runnable("Rocky");
	thread_by_runnable thread2=new thread_by_runnable("NVIDIA");
	thread1.start();
	thread2.start();
	

}

}