package J2_L1_hw;

import J2_L1_hw.actions.Actions;
import J2_L1_hw.models.*;
import J2_L1_hw.services.ActionsService;

import java.util.Random;

public class Java2_Lesson1_hw {
    public static void main(String[] args) {
        Random rand = new Random();
        Actions[] participant = new Actions[3];
        participant[0] = new Human("Жорик", 200, 2);
        participant[1] = new Robot("R2D2", 1000, 5);
        participant[2] = new Cat("Барсик", 150, 5);

        boolean isTreadmill;

        ActionsService[] obstacle = new ActionsService[6];
        for (int i = 0; i < obstacle.length; i++) {
            isTreadmill = rand.nextBoolean();
            if (isTreadmill) {
                obstacle[i] = new Treadmill(150 + rand.nextInt(50));
            } else {
                obstacle[i] = new Wall(3 + rand.nextInt(3));
            }
        }
        for (int i = 0; i < participant.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacle.length; j++) {
                result = obstacle[j].doIt(participant[i]);
                if (result == false) {
                    break;
                }
            }
            if (result) {
                System.out.println("Преодолеть препятствия получилось!!!");
            } else {
                System.out.println("Преодолеть препятствия не получилось, участник сходит с дистанции =(");
            }
        }
    }
}

