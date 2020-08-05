package com.hzcominfo.gradlegrammar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Gradle语法主要体现在.gradle文件中，参考build.gradle和config.gradle文件
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //根据配置自动获取 正式/测试 开发环境
        BuildConfig buildConfig = new BuildConfig();
        String url = buildConfig.url;

        ((TextView)findViewById(R.id.tv_url)).setText(url);
    }
}
