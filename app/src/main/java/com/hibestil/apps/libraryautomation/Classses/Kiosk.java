package com.hibestil.apps.libraryautomation.Classses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Kiosk {
    private String id;
    private List<Item> itemList;
    private List<User> userList;

    public Kiosk(String id) {
        this.id = id;
        itemList = new ArrayList<>();
        userList = new ArrayList<>();
    }
    public void addUser(User user){
        userList.add(user);
    }
    public void giveOperation(String itemId,String cardNo){
        // TODO : Bu fonksiyonun işlevi anlaşılmalı
    }
    public boolean checkUser(User u){
        return userList.contains(u);
    }
    public boolean checkItem(Item i){
        return itemList.contains(i);
    }
    public boolean checkUserPermission(List<User> list,String userType){
        // TODO: Mantık hatası var
        return false;
    }
    public void newBorrowOperation(String itemId,User user){
        // TODO : Eksik
    }
    public boolean reserveItem(String itemId,User user){
        // TODO : Eksik
        return false;
    }
    public void returnOperation(String itemId,String cardNo){
        // TODO : Eksik
    }
    public boolean checkItemDeadline(String itemId){
        // TODO : Eksik
        return false;
    }
    public boolean returnItem(User user,String itemId){
        // TODO : Eksik
        return false;
    }
    public void createItem(String itemId,String itemName){
        // TODO : Eksik
    }
}
