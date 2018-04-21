package com.hibestil.apps.libraryautomation.Classses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Item {
    private User owner;
    private String itemId;
    private String itemName;
    private String itemClass;
    private String classType;
    private List<User> canTake;
    private List<User> waitingList;
    private boolean isAvailable;

    public Item(String itemId, String itemName, String itemClass, String classType, List<User> canTake) {
        isAvailable = true ;// Obje oluşturulduğunda alınabilir olduğu varsayılmıştır.
        waitingList = new LinkedList<>();
        this.canTake = canTake;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemClass = itemClass;
        this.classType = classType;
        this.canTake = canTake;
    }
    public User sendMailToNextUser(){
        // TODO: Mail gönderme işlemi eklenmedi
        return waitingList.get(0);
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemClass() {
        return itemClass;
    }

    public void setItemClass(String itemClass) {
        this.itemClass = itemClass;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public List<User> getCanTake() {
        return canTake;
    }

    public void setCanTake(List<User> canTake) {
        this.canTake = canTake;
    }

    public List<User> getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(List<User> waitingList) {
        this.waitingList = waitingList;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
