package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Nav extends AppCompatActivity {
    /*Filtro para logcat [info] para mejor visualización*/
    private String flag = ">>";

    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        System.out.println(this.getFlag() + "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(this.getFlag() + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(this.getFlag() + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println(this.getFlag() + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(this.getFlag() + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(this.getFlag() + "onDestroy");
    }
}