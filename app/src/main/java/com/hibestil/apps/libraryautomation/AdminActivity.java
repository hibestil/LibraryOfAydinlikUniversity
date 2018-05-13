package com.hibestil.apps.libraryautomation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hibestil.apps.libraryautomation.Classses.User;

public class AdminActivity extends AppCompatActivity {

    private User currentUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        currentUser = (User) getIntent().getSerializableExtra("currentUser");

        if(!isAdmin(currentUser)) finish();// Admin değilse giremesin


    }
    public boolean isAdmin(User u){
        return u.getUserType().equals("admin");
    }
}
