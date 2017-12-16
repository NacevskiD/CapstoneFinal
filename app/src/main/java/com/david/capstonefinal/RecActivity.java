package com.david.capstonefinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RecActivity extends AppCompatActivity {

    ArrayList<RecItem> mItems;
    ListView mItemList;
    CustomRowAdapter3 mArrayAdapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec);

        mItems = (ArrayList<RecItem>)getIntent().getSerializableExtra(MainActivity.REC_LIST);


        mItemList = (ListView) findViewById(R.id.item_list);

        //ArrayList<FirebaseData> mListItems = new ArrayList<FirebaseData>();

        mArrayAdapter3 = new CustomRowAdapter3(this,R.layout.list_item,mItems);
        mItemList.setAdapter(mArrayAdapter3);

        mArrayAdapter3.notifyDataSetChanged();
    }
}
