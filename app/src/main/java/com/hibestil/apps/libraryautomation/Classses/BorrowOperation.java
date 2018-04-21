package com.hibestil.apps.libraryautomation.Classses;

import java.util.Date;

public class BorrowOperation {
    private Date borrowDate;
    private Date returnDate;
    private Item item;
    private User user;

    public BorrowOperation(Date borrowDate, Date returnDate, Item item, User user) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.item = item;
        this.user = user;
    }

    public double calculateReturnDate(User user){
        // TODO: Hesaplamalar neye göre yapılacak. Yönetimin bunları değiştirebilmesi gerek. Şuan statik
        String userType = user.getUserType();
        if(userType.equals("student") || userType.equals("officer"))
            return 3;
        else if(userType.equals("lecturer"))
            return 6;
        return -1;
    }

    public double calculatePenalty(){
        // TODO: Penalty hesaplaması formülasyonu
        return 0;
    }
}
