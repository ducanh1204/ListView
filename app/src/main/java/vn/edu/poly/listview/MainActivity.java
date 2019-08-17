package vn.edu.poly.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvList;

    private List<Sinhvien> sinhvienList;

    private SinhvienAdapter sinhvienAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvList=findViewById(R.id.lvList);

        sinhvienList = new ArrayList<>();

        for(int i=0;i<40;i++){
            sinhvienList.add(new Sinhvien("ID" +(i+1),"Name "+(i+1),"Class "+(i+1)));
        }

        sinhvienAdapter = new SinhvienAdapter(MainActivity.this,sinhvienList);
        lvList.setAdapter(sinhvienAdapter);

    }
}
