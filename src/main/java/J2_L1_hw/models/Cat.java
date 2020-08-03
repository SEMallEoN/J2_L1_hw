package J2_L1_hw.models;

import J2_L1_hw.actions.Actions;

public class Cat implements Actions {
    private String name;
    private int stamina;
    private int agility;

    public Cat(String name, int stamina, int agility) {
        this.name = name;
        this.stamina = stamina;
        this.agility = agility;
    }

    @Override
    public void run() {
        System.out.println("Кот " + this.name + " бежит " + this.getStamina());
    }

    @Override
    public void leap() {
        System.out.println("Кот " + this.name + " прыгает " + this.getAgility());
    }

    public int getStamina() {
        return stamina;
    }

    public int getAgility() {
        return agility;
    }
}
