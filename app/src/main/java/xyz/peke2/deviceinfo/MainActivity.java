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
        //  端末情報の確認
        Log.d("device_info", "MANUFACTURER["+ Build.MANUFACTURER + "] MODEL["+Build.MODEL+"]");
        Log.d("device_info", "VERSION SDK_INT["+Build.VERSION.SDK_INT+"]");
    }

}
