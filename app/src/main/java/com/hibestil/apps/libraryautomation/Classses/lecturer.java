package com.hibestil.apps.libraryautomation.Classses;

public class lecturer extends User {
    private int itemLimit;
    private int itemDuration;

    public lecturer(String cardNo, String name, String userType, String email, double penaltyAmount,int itemLimit,int itemDuration) {
        super(cardNo, name, userType, email, penaltyAmount);
        this.itemLimit = itemLimit;
        this.itemDuration = itemDuration;
    }

    public int getItemLimit() {
        return itemLimit;
    }

    public void setItemLimit(int itemLimit) {
        this.itemLimit = itemLimit;
    }

    public int getItemDuration() {
        return itemDuration;
    }

    public void setItemDuration(int itemDuration) {
        this.itemDuration = itemDuration;
    }
}
