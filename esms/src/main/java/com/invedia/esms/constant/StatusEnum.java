package com.invedia.esms.constant;

import java.util.HashSet;
import java.util.Set;

public enum StatusEnum {
    ACTIVATED(1), DEACTIVATED(0), SUSPENDED(2);

    private int value;

    StatusEnum(int value) {
        this.setValue(value);
    }

    public static Set<Integer> getValues() {
        Set<Integer> values = new HashSet<>();
        for (StatusEnum statusEnum : StatusEnum.values()) {
            values.add(statusEnum.getValue());
        }

        return values;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
