class sync_thread 
{
public static void main (String argv[])
{
/*
Runnable r=new runnable_fun();
Thread t1=new Thread(r);
Thread t2=new Thread(r);
t1.start();
t2.start();
*/

/*
Runnable r=new sleep_test();
Thread t1=new Thread(r);
Thread t2=new Thread(r);
t2.setPriority(Thread.MAX_PRIORITY);
t1.setPriority(Thread.MIN_PRIORITY);

t1.start();
t2.start();
*/

/*
Runnable r=new sleep_test_sync();
Thread t1=new Thread(r);
Thread t2=new Thread(r);
t2.setPriority(Thread.MAX_PRIORITY);
t1.setPriority(Thread.MIN_PRIORITY);

t1.start();
t2.start();
*/

/*
Runnable r=new join_fun();
Thread t1=new Thread(r);
//Thread t2=new Thread(r);
//t2.setPriority(Thread.MAX_PRIORITY);
t1.setPriority(Thread.MIN_PRIORITY);

t1.start();
//t2.start();
//System.out.println("a="+r.a);
}
*/

/*
Runnable r1=new join_test("Rocky");
Thread t1=new Thread(r1);
Thread t2=new Thread(r1);
t1.start();
try{
t1.join();
}
catch (Exception e)
{

}
t2.start();
*/

Runnable r=new wait_test();
Thread t1=new Thread(r,"t1");
Thread t2=new Thread(r,"t2");
//t1.setPriority(Thread.MAX_PRIORITY);
//t2.setPriority(Thread.MIN_PRIORITY);

t1.start();

t2.start();

}

}



/*11.4
****
*/

class wait_test implements Runnable{
public static int shareVal=0;

public synchronized void run()
{
if(0==shareVal)
{
for(int i =0;i<10;i++)
{
shareVal++;
if(5==shareVal)
{
try{
this.wait();
}
catch (Exception e)
{}

}
}
}

if(0!=shareVal)
{
System.out.println("Thread Name : "+Thread.currentThread().getName());
System.out.println("shareVal :"+shareVal);
this.notify();
}

}
}
class name_test implements Runnable {

public void run()
{
for(int i=0;i<10;i++)
{
/*
if(i==5 && Thread.currentThread().getName().equals("t1"))
{
Thread.yield();
}
*/
System.out.println("Name:"+Thread.currentThread().getName()+" i: "+i);

}
}
}






/*
******
11.3
*/


class join_fun implements Runnable
{
static int a=0;
public  void run(){
for(int i=0;i<5;i++)
{
a=a+1;
}

System.out.println(a);
}

}

class sleep_test_sync implements Runnable
{
public synchronized void run(){
for(int j=0;j<10;j++)
{
if(j%2==0)
{
try{

System.out.println("Running "+j +" in "+Thread.currentThread().getName());
Thread.currentThread().sleep(5000);
}
catch (Exception e)
{
System.out.println("Sleep error"+j);
}

}

}
}
}


class sleep_test implements Runnable
{
public void run(){
for(int j=0;j<10;j++)
{
if(j%2==0)
{
try{

System.out.println("Running "+j +" in "+Thread.currentThread().getName());
Thread.currentThread().sleep(5000);
}
catch (Exception e)
{
System.out.println("Sleep error"+j);
}

}

}
}
}

class runnable_fun implements Runnable
{
public String name;
/*
public runnable(String name)
{
this.name=name;
}
*/
public void run(){
for (int i=0; i <10; i++)
{
System.out.println("Loop:"+i);
}

synchronized(this)
{
for(int j=0;j<5;j++)
{
System.out.println("inside synchronized"+j);
}
}
}
}

class join_test implements Runnable
{
public String name;

public join_test(String name)
{
this.name=name;
}

public void run(){
for (int i=0; i <10; i++)
{
System.out.println("thread name :"+Thread.currentThread().getName()+" define name :"+name+i);
}

}

}

