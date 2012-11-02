package com.plumtreegroup.gridview;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	static final String[] mobile_OS = new String[]{"Android", "Windows", "iOS", "Blackberry"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        GridView gridView = (GridView)findViewById(R.id.grid1);
        
      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mobile_OS);
       
        gridView.setAdapter(new ImageAdapter(this,mobile_OS));
        
        gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), ((TextView)v.findViewById(R.id.grid_item_label)).getText(), Toast.LENGTH_SHORT).show();
				
			}
		});
    }

  
}
