//done by Krishna Kanth
/**Write a program to simulate a deadlock situation? */


public class DeadlockSim {
   public static Object a = new Object();
   public static Object b = new Object();
   
   public static void main(String args[]) {
      Thread1 t1 = new Thread1();
      Thread2 t2 = new Thread2();
      t1.start();
      t2.start();
   }
   
   private static class Thread1 extends Thread {
      public void run() {
         synchronized (a) {
            System.out.println("Thread 1: Holding 'a'");
            
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 1: Waiting for 'b'");
            
            synchronized (b) {
               System.out.println("Thread 1: Holding 'a' and 'b'");
            }
         }
      }
   }
   private static class Thread2 extends Thread {
      public void run() {
         synchronized (b) {
            System.out.println("Thread 2: Holding 'b'");
            
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 2: Waiting for lock 'a'");
            
            synchronized (a) {
               System.out.println("Thread 2: Holding 'a' and 'b'");
            }
         }
      }
   } 
}