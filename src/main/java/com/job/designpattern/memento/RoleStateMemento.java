package com.job.designpattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoleStateMemento {
    private int vitality;
    private int attack;
    private int defense;
}
