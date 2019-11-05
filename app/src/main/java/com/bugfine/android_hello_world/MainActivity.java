package com.bugfine.android_hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //根据 id 获取按钮，按钮的id 时在 xml 文件中通过 android:id="@+id/btn" 添加的
        Button button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(on_click_listener);
    }

    //添加点击事件
    private View.OnClickListener on_click_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //使用 Toast 显示 hello world
            Toast.makeText(MainActivity.this, "hello world", Toast.LENGTH_LONG).show();
        }
    };
}
