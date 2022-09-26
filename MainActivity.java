package gvs.com.cat3_2147158;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button fragment1, fragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = findViewById(R.id.button1);
        fragment2 = findViewById(R.id.button2);

        listener();
    }

    private void listener() {
        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
                Fragment ff1 = new Fragment1();
                ft1.replace(R.id.fragment_container, ff1);
                ft1.commit();
            }
        });

        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                Fragment ff2 = new Fragment2();
                ft2.replace(R.id.fragment_container, ff2);
                ft2.commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        switch (item.getItemId()){
//            case R.id.setting:
//
//        }
//    }

}