package com.hibestil.apps.libraryautomation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hibestil.apps.libraryautomation.Classses.BorrowOperation;
import com.hibestil.apps.libraryautomation.Classses.Item;
import com.hibestil.apps.libraryautomation.Classses.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanActivity extends AppCompatActivity {
    private ArrayList<BorrowOperation> borrowList;
    private ArrayList<Item> itemList;
    private User currentUser;
    private String activityType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        Button btn = (Button) findViewById(R.id.button);
        final EditText edt = (EditText) findViewById(R.id.barcode);

        borrowList = MainActivity.borrowList;
        itemList = (ArrayList<Item>) getIntent().getSerializableExtra("items");
        currentUser = (User) getIntent().getSerializableExtra("currentUser");
        activityType = getIntent().getStringExtra("activityType");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String barcode = edt.getText().toString();
                int counter =0 ;
                for(Item i: itemList){
                    if(i.getItemId().equals(barcode)){

                        if(activityType.equals("loan")){
                            Date date = new Date();
                            BorrowOperation borrowOperation = new BorrowOperation(date,null,i,currentUser);
                            if(checkExisting(borrowList,i) != null ){
                                Toast.makeText(getApplicationContext(),"Zaten bu öğe alınmış",Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(getApplicationContext(),"Alındı",Toast.LENGTH_SHORT).show();
                                borrowList.add(borrowOperation);
                                MainActivity.borrowList = borrowList;
                                finish();
                            }
                        }else if(activityType.equals("deliver")){
                            BorrowOperation tmp  =checkExisting(borrowList,i);
                            if( tmp != null){
                                borrowList.remove(tmp);
                                MainActivity.borrowList = borrowList;
                                Toast.makeText(getApplicationContext(),"İade Edildi",Toast.LENGTH_SHORT).show();
                                finish(); // Aktiviteyi sonlandır
                            }else {
                                Toast.makeText(getApplicationContext(),"Bu öğe kimse tarafından alınmamış",Toast.LENGTH_SHORT).show();
                            }

                        }


                    }else {
                        counter++;
                    }
                }
                if(counter == itemList.size())
                    Toast.makeText(getApplicationContext(),"Bulunamadı",Toast.LENGTH_SHORT).show();
            }
        });



    }
    public BorrowOperation checkExisting(ArrayList<BorrowOperation> borrowList,Item i){
        for(BorrowOperation bo:borrowList){

            if(bo.getItem().getItemId().equals(i.getItemId()))
                return bo;

        }
        return null;
    }
}
