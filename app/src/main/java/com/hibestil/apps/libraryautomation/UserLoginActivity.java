package com.hibestil.apps.libraryautomation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hibestil.apps.libraryautomation.Classses.BorrowOperation;
import com.hibestil.apps.libraryautomation.Classses.Item;
import com.hibestil.apps.libraryautomation.Classses.User;

import java.util.ArrayList;

public class UserLoginActivity extends AppCompatActivity {
    private String goToActivity;
    private ArrayList<User> usersList;
    private ArrayList<Item> itemList;
    private ArrayList<BorrowOperation> borrowList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        goToActivity = getIntent().getStringExtra("goToActivity");
        usersList = (ArrayList<User>) getIntent().getSerializableExtra("users");
        itemList = (ArrayList<Item>) getIntent().getSerializableExtra("items");

        Button scan = (Button) findViewById(R.id.scan);
        final EditText edt = (EditText) findViewById(R.id.card);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String handle = edt.getText().toString();

                for(User u : usersList){
                    if(u.getCardNo().equals(handle)){

                        if(goToActivity.equals("loan")){
                            Intent i = new Intent(getApplicationContext(),LoanActivity.class);
                            i.putExtra("items",itemList);
                            i.putExtra("currentUser",u);
                            i.putExtra("activityType","loan");
                            startActivity(i);
                        }else if(goToActivity.equals("deliver")){
                            Intent i = new Intent(getApplicationContext(),LoanActivity.class);
                            i.putExtra("items",itemList);
                            i.putExtra("currentUser",u);
                            i.putExtra("activityType","deliver");
                            startActivity(i);
                        }else if(goToActivity.equals("admin")){
                            Intent i = new Intent(getApplicationContext(),AdminActivity.class);
                            i.putExtra("currentUser",u);
                            startActivity(i);
                        }

                    }
                }
            }
        });

    }
}
