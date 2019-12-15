package isakalouski.service.impl;

import isakalouski.service.Task2Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2 implements Task2Service {

    private static final Logger logger2 = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private static final int MIN = (-300);
    private static final int MAX = 300;

    @Override
    public void runTask2() {
        ArrayList<Integer> randArrList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int a = r.nextInt((MAX - MIN) + 1) + MIN;
            randArrList.add(a);
        }
        logger2.info(randArrList);
        logger2.info("Max value is: " + Collections.max(randArrList));
        logger2.info("Min value is: " + Collections.min(randArrList));

        int maxIndex = randArrList.indexOf(Collections.max(randArrList));
        randArrList.set(maxIndex, (Collections.max(randArrList)) * (Collections.min(randArrList)));
        logger2.error(randArrList);
    }

}
