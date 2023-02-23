package com.bootcoding.java.Multithreading;

class NewThread2 implements Runnable
{
    Thread t;
    NewThread2()
    {
        t=new Thread(this,"Raja");
        t.start();
    }
    public void run()
    {
        for(int i = 1;i<=5;i++)
        {
            System.out.println("Raja="+i);
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread2
{
    public static void main(String[] args)
    {
      NewThread2 N1 = new NewThread2();
      NewThread2 N2 = new NewThread2();
      NewThread2 N3 = new NewThread2();
      for(int i = 1; i<=5; i++)
      {
          System.out.println("Main="+i);
          try
          {
              Thread.sleep(1000);
          }
          catch (Exception e)
          {
              System.out.println(e);
          }
      }
    }
}
