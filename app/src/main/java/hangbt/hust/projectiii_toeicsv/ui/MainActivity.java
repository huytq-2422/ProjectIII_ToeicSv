package hangbt.hust.projectiii_toeicsv.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hangbt.hust.projectiii_toeicsv.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
}
