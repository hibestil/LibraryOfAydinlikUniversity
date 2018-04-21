package com.hibestil.apps.libraryautomation.Classses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class User {
    private String cardNo;
    private String name;
    private String userType;
    private String email;

    private int itemCount;
    private double cardBalance;
    private double penaltyAmount;

    private List<BorrowOperation> borrowedList;

    public User(String cardNo, String name, String userType, String email, double penaltyAmount) {
        borrowedList = new ArrayList<>();
        this.cardNo = cardNo;
        this.name = name;
        this.userType = userType;
        this.email = email;
        this.penaltyAmount = penaltyAmount;
    }
    public void addToBorrowList(BorrowOperation bo){
        borrowedList.add(bo);
    }
    public void deletefromBorrowList(String itemID){
        /**
         * Eksik
         */
    }
    public List<BorrowOperation> getBorrowedList() {
        return borrowedList;
    }

    public void setBorrowedList(List<BorrowOperation> borrowedList) {
        this.borrowedList = borrowedList;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public double getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(double penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }
}
