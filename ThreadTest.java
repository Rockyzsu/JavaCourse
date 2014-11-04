public class ThreadTest implements Runnable { 
public static int a = 0; 
public void run() { 
for (int k = 0; k < 5; k++) { 
a = a + 1; 
System.out.println("Run"+a);
} 
} 

public static void main(String[] args) { 
Runnable r = new ThreadTest(); 
Thread t = new Thread(r); 
t.start(); 
try{
Thread.currentThread().sleep(1);
//t.join();
}
catch (Exception e)
{
System.out.println("error");
}
System.out.println(a); 
} 
} 
