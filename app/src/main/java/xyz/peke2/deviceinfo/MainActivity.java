package xyz.peke2.deviceinfo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        identifyDevice();
    }

    void identifyDevice()
    {
        Log.d("device_info", "MANUFACTURER["+ Build.MANUFACTURER + "] MODEL["+Build.MODEL+"]");
    }

}
