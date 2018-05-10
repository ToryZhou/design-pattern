package com.job.designpattern.memento;

import lombok.Data;

@Data
public class GameRole {

    private int vitality;
    private int attack;
    private int defense;

    public void initState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vitality, attack, defense);
    }

    public void recoveryState(RoleStateMemento roleStateMemento) {
        this.vitality = roleStateMemento.getVitality();
        this.attack = roleStateMemento.getAttack();
        this.defense = roleStateMemento.getDefense();
    }
}
