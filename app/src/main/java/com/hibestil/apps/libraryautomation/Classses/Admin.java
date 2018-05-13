package com.hibestil.apps.libraryautomation.Classses;

import android.annotation.SuppressLint;

@SuppressLint("ParcelCreator")
public class Admin extends User {
    private String name;
    private Kiosk kiosk;
    private User user;
    public Admin(String cardNo, String name, String userType, String email, double penaltyAmount) {
        super(cardNo, name, userType, email, penaltyAmount);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void changeItemLimit(String userType, int newLimit){
        // TODO: Mantık hatası var. Bu kısımda item limit ayarlamak DB'siz imkansız gibi duruyor.

    }
    public void changeItemDuration(String userType,int newDuration){
        // TODO : Mantık hatası var. DB olmadan ayarlama yapmak imaknsız duruyor
    }

    public Kiosk getKiosk() {
        return kiosk;
    }

    public void setKiosk(Kiosk kiosk) {
        this.kiosk = kiosk;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
