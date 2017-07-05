package ThreadInterruption;

/**
 * Created by pupil on 2017/7/5.
 */
/*
java.lang.Thread类提供了几个方法来操作这个中断状态，这些方法包括：

public static boolean interrupted

测试当前线程是否已经中断。线程的中断状态 由该方法清除。换句话说，如果连续两次调用该方法，则第二次调用将返回 false（在第一次调用已清除了其中断状态之后，且第二次调用检验完中断状态前，当前线程再次中断的情况除外）。

public boolean isInterrupted()

测试线程是否已经中断。线程的中断状态不受该方法的影响。

public void interrupt()

中断线程。
 */
public class InterruptedExample {

    public static void main(String[] args) throws Exception {
        InterruptedExample interruptedExample = new InterruptedExample();
        interruptedExample.start();
    }

    public void start() {
        MyThread myThread = new MyThread();
        myThread.start();

        try {
            Thread.sleep(3000);
            myThread.cancel();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private class MyThread extends Thread{

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("test");
                    System.out.println(interrupted());
                    System.out.println(interrupted());
                    //这里之所以用try{}catch{}就是因为在sleep期间可能有interrupt需求,因此java的机制是：如果在阻塞期间(sleep,wait etc.)检测到中断状态那么就抛出InterruptedException。如果在普通的运行状态就要靠手工判断isInterrupted()的value
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("interrupt");
                    System.out.println("------------"+isInterrupted());
                    System.out.println(interrupted());
                    System.out.println(interrupted());
                    System.out.println(interrupted());
                    System.out.println(interrupted());
                    //抛出InterruptedException后中断标志被清除，标准做法是再次调用interrupt恢复中断
                    Thread.currentThread().interrupt();
                    System.out.println("------------"+isInterrupted());
                    System.out.println(interrupted());
                    System.out.println(interrupted());
                }
            }
            System.out.println("stop");
        }

        public void cancel(){
            interrupt();
        }
    }
}