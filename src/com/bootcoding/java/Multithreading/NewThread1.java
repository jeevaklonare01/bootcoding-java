package com.bootcoding.java.Multithreading;

class NewThread1 implements Runnable
{
    Thread t;
    NewThread1()
    {
        t= new Thread(this,"Raju");
        t.start();
    }
    public void run()
    {
        System.out.println("Hello");
    }
}

class MyThread1
{
    public static void main(String[] args) {
        NewThread1 N1 = new NewThread1();
        NewThread1 N2 = new NewThread1();
        NewThread1 N3 = new NewThread1();
        for (int i = 1 ; i<=5;i++)
        {
            System.out.println(i);
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
