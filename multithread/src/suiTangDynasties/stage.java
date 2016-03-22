package suiTangDynasties;

/**
 * Created by pupil on 2016/3/22.
 */
public class stage extends Thread {
    @Override
    public void run() {
        System.out.println("欢迎收看");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("马上开始");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("开始");
        ArmyRunnable armySuiDynasty=new ArmyRunnable();
        ArmyRunnable armyTangDynasty=new ArmyRunnable();

        Thread armyOfSuiDynasty=new Thread(armySuiDynasty,"隋军");
        Thread armyOfTangDynasty=new Thread(armyTangDynasty,"农民");

        armyOfSuiDynasty.start();
        armyOfTangDynasty.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        armySuiDynasty.keepRunning=false;
        armyTangDynasty.keepRunning=false;

        try {
            armyOfTangDynasty.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("半路杀出个程咬金");
        Thread mrCheng=new keyPersonThread();
        mrCheng.setName("程咬金");

        System.out.println("程咬金的理想结束战斗");

        armySuiDynasty.keepRunning=false;
        armyTangDynasty.keepRunning=false;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mrCheng.start();
        try {
            mrCheng.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("战争结束");
    }

    public static void main(String args[]){
        new stage().start();
    }
}
