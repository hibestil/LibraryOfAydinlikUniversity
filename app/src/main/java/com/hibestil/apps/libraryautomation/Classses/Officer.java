package com.hibestil.apps.libraryautomation.Classses;

public class Officer extends User {

    private int itemLimit;
    private int itemDuration;

    public Officer(String cardNo, String name, String userType, String email, double penaltyAmount,int itemLimit,int itemDuration) {
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
