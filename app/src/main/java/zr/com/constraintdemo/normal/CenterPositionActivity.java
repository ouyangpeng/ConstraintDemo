package zr.com.constraintdemo.normal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import zr.com.constraintdemo.R;

public class CenterPositionActivity extends AppCompatActivity {


    public static void launch(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, CenterPositionActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_position);
    }
}
