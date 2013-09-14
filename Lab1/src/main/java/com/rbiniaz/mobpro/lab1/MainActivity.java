package com.rbiniaz.mobpro.lab1;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = (ListView) findViewById(R.id.list);
        Button addButton = (Button) findViewById(R.id.add_button);
        final EditText editText = (EditText) findViewById(R.id.edit_text);


        final ArrayList<String> listItems = new ArrayList<String>();
//        final ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
        final ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, listItems){
            @Override
            public View getView(final int position, View convertView, ViewGroup parent) {
                convertView = ((LayoutInflater)MainActivity.this.getSystemService(LAYOUT_INFLATER_SERVICE)).inflate(R.layout.list_item, null);
                ((TextView) convertView.findViewById(R.id.task_text)).setText(getItem(position));
                convertView.findViewById(R.id.delete_button).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        remove(getItem(position));
                    }
                });
                return convertView;
            }
        };

        list.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.add(editText.getText().toString());
                editText.setText("");
                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
