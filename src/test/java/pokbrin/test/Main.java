package pokbrin.test;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

class Main {

    @Test
    void threadLocalTest() {
        ThreadLocal<SimpleDateFormat> tl = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        SimpleDateFormat simpleDateFormat = tl.get();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 11; i++) {
            executorService.execute(() -> {
                try {
                    Date parse = tl.get().parse("2022-08-01 00:01:45");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    @Test
    void weakRefTest(){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.schedule()
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        Timer timer = new Timer();
        timer.schedule();

    }


}
