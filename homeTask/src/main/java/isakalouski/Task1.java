package isakalouski;

import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class Task1 {
    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    private static final int TEN = 10;
    private static final int THREE = 3;

    private int X = (int) (Math.random() * TEN);
    private int Y = (int) (Math.random() * TEN);
    private int Z = (int) (Math.random() * TEN);
    private int sum = X + Y;
    private double average = (double) (X + Y + Z) / THREE;

    void sum() {
        if (X > Z) {
            logger.debug(sum);
        } else logger.debug(Z);
    }

    void averageValue() {
        logger.info(average + "\n");
    }
}
