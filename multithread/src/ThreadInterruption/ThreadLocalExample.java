package ThreadInterruption;

/**
 * Created by pupil on 2017/7/7.
 */
public class ThreadLocalExample {
    public static class TheR implements Runnable{
//        ThreadLocal类的作用是创建一个对象的时候，不同线程访问这个对象的时候不能共享其值，只能读取这个线程本身的赋值，除非先定义一个ThreadLocal的子类，重写initialValue()
        ThreadLocal threadLocal=new ThreadLocal();
        @Override
        public void run() {
            threadLocal.set(Math.random()*100);
            try{
                Thread.sleep(2);
            }catch (InterruptedException e){

            }
            System.out.println(threadLocal.get());
        }
    }

    public static void main(String[] args) {
        TheR theR=new TheR();
        Thread thread0=new Thread(theR);
        Thread thread1=new Thread(theR);
        thread0.start();
        thread1.start();
    }
}
