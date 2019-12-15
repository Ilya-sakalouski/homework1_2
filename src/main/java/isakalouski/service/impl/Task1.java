package isakalouski.service.impl;

import java.lang.invoke.MethodHandles;

import isakalouski.service.Task1Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task1 implements Task1Service {

    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private static final int TEN = 10;
    private static final int THREE = 3;

    private int X = (int) (Math.random() * TEN);
    private int Y = (int) (Math.random() * TEN);
    private int Z = (int) (Math.random() * TEN);
    private int sum = X + Y;
    private double average = (double) (X + Y + Z) / THREE;

    @Override
    public void runTask1() {
        if (X > Z) {
            logger.debug(sum);
        } else {
            logger.debug(Z);
        }
        logger.info(average + "\n");

    }

}
