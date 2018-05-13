package com.hibestil.apps.libraryautomation;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;

import com.hibestil.apps.libraryautomation.Classses.Admin;
import com.hibestil.apps.libraryautomation.Classses.BorrowOperation;
import com.hibestil.apps.libraryautomation.Classses.Item;
import com.hibestil.apps.libraryautomation.Classses.Officer;
import com.hibestil.apps.libraryautomation.Classses.Student;
import com.hibestil.apps.libraryautomation.Classses.User;
import com.hibestil.apps.libraryautomation.Classses.lecturer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button admin;
    private Button loan;
    private Button deliver;
    private ArrayList<Item> itemlist;
    private ArrayList<User> userList;
    public static ArrayList<BorrowOperation> borrowList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        itemlist = new ArrayList<>();
        itemlist.add(new Item("1","Cin Ali 1","kitap","okuma kitabı",null));
        itemlist.add(new Item("2","Cin Ali 2","kitap","okuma kitabı",null));
        itemlist.add(new Item("3","Cin Ali 3","kitap","okuma kitabı",null));
        itemlist.add(new Item("4","Cin Ali 4","kitap","okuma kitabı",null));
        itemlist.add(new Item("5","Cin Ali 5","kitap","okuma kitabı",null));

        userList = new ArrayList<>();
        userList.add(new Admin("123","İbrahim","admin","h@b.com",6));
        userList.add(new Student("234","Omer","student","g@q.com",1,3,30));
        userList.add(new Student("345","Ömer Faruk","student","g@q.com",1,3,30));
        userList.add(new lecturer("456","Yunus","lecturer","y@y.com",1,6,90));
        userList.add(new Officer("567","Güvenlik Ali","officer","g@sec.com",1,3,30));

        borrowList =new ArrayList<>();


        loan = (Button) findViewById(R.id.loan);
        deliver = (Button) findViewById(R.id.deliver);
        admin = (Button) findViewById(R.id.admin);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AdminActivity.class);
                startActivity(i);
            }
        });

        deliver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),UserLoginActivity.class);
                i.putExtra("goToActivity","deliver");
                i.putExtra("users",userList);
                i.putExtra("items",itemlist);
                startActivity(i);
            }
        });

        loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),UserLoginActivity.class);
                i.putExtra("goToActivity","loan");
                i.putExtra("users",userList);
                i.putExtra("items",itemlist);
                startActivity(i);
            }
        });
    }


}
