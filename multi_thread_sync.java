class ticket implements Runnable{
public String name;

public ticket(String name)
{
this.name=name;
}
public ticket()
{
name="Penny";
}
public synchronized void run()
{
for(int i=0;i<10;i++)
System.out.println(name+" "+i);
}
}

class multi_thread_sync
{
public static void main(String argv[])
{
/*not sync
Runnable r=new ticket();
Runnable r2=new ticket();
Thread t1=new Thread(r);
Thread t2=new Thread(r2);

t1.start();
t2.start();
*/

Runnable r=new ticket();
//Runnable r2=new ticket();
Thread t1=new Thread(r);
Thread t2=new Thread(r);

t1.start();
t2.start();
}

}


