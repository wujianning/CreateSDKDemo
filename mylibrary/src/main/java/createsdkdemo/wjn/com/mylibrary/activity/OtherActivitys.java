package createsdkdemo.wjn.com.mylibrary.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import createsdkdemo.wjn.com.mylibrary.R;

public class OtherActivitys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otheractivitys);

        ImageView imageView=findViewById(R.id.activity_otheractivitys_imageview);
        String url="http://i.imgur.com/DvpvklR.png";
        Glide.with(this)
                .load(url)
                .into(imageView);

    }

}
