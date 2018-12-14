package createsdkdemo.wjn.com.mylibrary.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import createsdkdemo.wjn.com.mylibrary.R;

public class OtherActivity extends AppCompatActivity {

    private TextView backTextView;
    private TextView textView;
    private String name;
    private String pwd;
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        backTextView=findViewById(R.id.activity_other_backtextview);
        backTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("name", name);
                data.putExtra("pwd", pwd);
                data.putExtra("result", result);
                setResult(RESULT_OK, data);
                finish();
            }
        });

        textView=findViewById(R.id.activity_other_textview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OtherActivity.this,OtherActivitys.class);
                startActivity(intent);
            }
        });

        Intent intent=getIntent();
        name=intent.getStringExtra("name");
        pwd=intent.getStringExtra("pwd");
        if("17710029800".equals(name)&&"654321".equals(pwd)){
            result="成功";
        }else{
            result="失败";
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent data = new Intent();
            data.putExtra("name", name);
            data.putExtra("pwd", pwd);
            data.putExtra("result", result);
            setResult(RESULT_OK, data);
            finish();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
