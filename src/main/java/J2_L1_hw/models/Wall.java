package J2_L1_hw.models;

import J2_L1_hw.actions.Actions;
import J2_L1_hw.services.ActionsService;

public class Wall extends ActionsService {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean doIt(Actions actions) {
        System.out.println("Cтена имеет высоту " + height);
        actions.leap();
        if (actions.getAgility() >= getHeight()) {
            System.out.println("Стена перепрыгнута");
            return true;
        } else {
            System.out.println("Перепрыгнуть стену не удалось");
            return false;
        }
    }
}
