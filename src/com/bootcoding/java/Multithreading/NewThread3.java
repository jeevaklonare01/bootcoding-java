package com.bootcoding.java.Multithreading;

import jdk.jshell.spi.ExecutionControl;

public class NewThread3 implements Runnable
{
    Thread t;
    NewThread3(String name)
    {
        t = new Thread(this, name);
        t.start();
    }
    public void run()
    {
        for(int i = 1; i<=5; i++)
        {
            System.out.println(t.getName()+"="+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class MyThread3
{
    public static void main(String[] args)
    {
     NewThread3 N1 = new NewThread3("Banti");
     NewThread3 N2 = new NewThread3("Babli");
     NewThread3 N3 = new NewThread3("Babulal");
     for (int i = 1; i<=5; i++)
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
