package com.gowhich.androidlistview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SimpleAdapter adapter;
    private List<Map<String, String>> data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = MyDataSource.getDataSource();

        adapter = new SimpleAdapter(MainActivity.this, data, R.layout.activity_main, new String[]{"pname", "pprice", "paddr"}, new int[]{R.id.pname, R.id.pprice, R.id.paddr});

        listView = (ListView) this.findViewById(R.id.listView);

        listView.setAdapter(adapter);
    }
}
