package suiTangDynasties;

/**
 * Created by pupil on 2016/3/22.
 */
public class keyPersonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"beginTHeWar");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"killSuiArmyAround");
        }

        System.out.println(Thread.currentThread().getName()+"endTHeWar");
    }
}
