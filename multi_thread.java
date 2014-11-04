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
	if(count>0){
	System.out.println("Name is "+name+" Time : "+i+" Count: "+count);
	count--;
}
}


public static void main(String argv[])
{
	multi_thread a=new multi_thread("A");
	multi_thread b=new multi_thread("B");
	a.start();
	b.start();
		

}
public int count=10;
//public static int count=10;
}