package J2_L1_hw.models;

import J2_L1_hw.actions.Actions;
import J2_L1_hw.services.ActionsService;

public class Treadmill extends ActionsService {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean doIt(Actions actions) {
        System.out.println("Беговая дорожка имеет длину " + length);
        actions.run();
        if (actions.getStamina() >= getLength()) {
            System.out.println("Пробежка успешна");
            return true;
        } else {
            System.out.println("Пробежать не удалось");
            return false;
        }

    }
}
