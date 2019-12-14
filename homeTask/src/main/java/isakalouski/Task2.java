package isakalouski;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Task2 {
    private static final Logger logger2 = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private static final int MIN = (-300);
    private static final int MAX = 300;

    void getArray() {
        ArrayList<Integer> randArrList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int a = r.nextInt((MAX - MIN) + 1) + MIN;
            randArrList.add(a);
        }
        logger2.info(randArrList);
        logger2.info(Collections.max(randArrList));
        logger2.info(Collections.min(randArrList));
    }
}
