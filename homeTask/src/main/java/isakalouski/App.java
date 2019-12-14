package isakalouski;

import isakalouski.service.impl.Task1;
import isakalouski.service.impl.Task2;

public class App {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.runTask1();

        Task2 task2 = new Task2();
        task2.runTask2();
    }

}


