class multi_thread extends Thread
{

public String name;
public multi_thread(String name)
{
this.name=name;
}

public void run()
{
	for(int i=0;i<10;i++)
	System.out.println(name+" "+i);
}


public static void main(String argv[])
{
	multi_thread a=new multi_thread("A");
	multi_thread b=new multi_thread("B");
	a.start();
	b.start();
		

}

}