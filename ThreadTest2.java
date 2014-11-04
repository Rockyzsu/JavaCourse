public class ThreadTest2 implements Runnable { 
public void run() { 

for (int k = 0; k < 10; k++) { 
if (k == 3 && Thread.currentThread().getName().equals("t1")) { 
Thread.yield(); 
} 
System.out.println(Thread.currentThread().getName() 
+ " : " + k); 
} 
} 

public static void main(String[] args) { 
Runnable r = new ThreadTest2(); 
Thread t1 = new Thread(r, "t1"); 
Thread t2 = new Thread(r, "t2"); 
t1.setPriority(Thread.MAX_PRIORITY); 
t2.setPriority(Thread.MIN_PRIORITY); 
t1.start(); 
t2.start(); 
} 
}