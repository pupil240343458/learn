package ThreadInterruption;

import javax.sound.midi.Soundbank;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by pupil on 2017/7/14.
 */
public class QueueAboutReentrantLock {
    ReentrantLock reentrantLock=new ReentrantLock();
    Condition full=reentrantLock.newCondition();
    Condition unFull=reentrantLock.newCondition();
    Object [] array =null;
    public QueueAboutReentrantLock(int newNumber) {
        this.array = new Object[newNumber];
    }

    int begin=0,end=0,size=0;
    public void put(Object object){
        reentrantLock.lock();
        try {
            while(size==array.length){
                System.out.println(Thread.currentThread().getName()+"begin of await");
//                将此线程进入full的等待队列，等到唤醒后从这里开始执行
                full.await();
                System.out.println(Thread.currentThread().getName()+"end of await");
            }
            array[end]=object;
            size++;
            end++;
            if(end==array.length){
                end-=array.length;
            }
            System.out.println(Thread.currentThread().getName()+"finished__put");
            //                执行完以后别忘记唤醒其他线程
            unFull.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
    public void get(){
        reentrantLock.lock();
        try {
            while (size==0){
                System.out.println(Thread.currentThread().getName()+"begin of await");
                unFull.await();
                System.out.println(Thread.currentThread().getName()+"end of await");
            }
            array[begin]=null;
            size--;
            begin++;
            if(begin==array.length){
                begin-=array.length;
            }
            System.out.println(Thread.currentThread().getName()+"finished_get");
            full.signal();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
//                不要忘记最后解锁
            reentrantLock.unlock();
        }
    }

    public static void main(String[] args) {
        QueueAboutReentrantLock queueAboutReentrantLock=new QueueAboutReentrantLock(10);
        for(int i=0;i<100;i++){
            switch (i%5){
                case 0:
                    Thread thread1=new Thread(new Getter(queueAboutReentrantLock));
                    thread1.start();
                    break;
                default:
                    Thread thread2=new Thread(new Putter(queueAboutReentrantLock));
                    thread2.start();
            }
        }
    }
    static class Putter implements Runnable{
        QueueAboutReentrantLock queueAboutReentrantLock=null;
        public Putter(QueueAboutReentrantLock queueAboutReentrantLock) {
            this.queueAboutReentrantLock=queueAboutReentrantLock;
        }
        @Override
        public void run() {
            queueAboutReentrantLock.put("...");
        }
    }
    static class Getter implements Runnable{
        QueueAboutReentrantLock queueAboutReentrantLock=null;
        public Getter(QueueAboutReentrantLock queueAboutReentrantLock) {
            this.queueAboutReentrantLock=queueAboutReentrantLock;
        }
        @Override
        public void run() {
            queueAboutReentrantLock.get();
        }
    }
}
