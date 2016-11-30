package com.ybon.anim;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {
    public static final java.lang.String EXTRA_IMAGE = DetailActivity.class.getSimpleName() + ".IMAGE";
    private CircleImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        toolbar.setTitle("美人");
        getSupportActionBar().setTitle("美人");
        toolbar.setTitleTextColor(Color.WHITE);

        int imageResId = getIntent().getExtras().getInt(EXTRA_IMAGE);
        mImageView = (CircleImageView) findViewById(R.id.image);
        mImageView.setImageResource(imageResId);

        TextView text  = (TextView) findViewById(R.id.textView);
        TextView text1 = (TextView) findViewById(R.id.textView1);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        TextView text4 = (TextView) findViewById(R.id.textView4);
        TextView text5 = (TextView) findViewById(R.id.textView5);
        //修改显示时间的字体
        AssetManager assetManager = getAssets();
        Typeface     typeface     = Typeface.createFromAsset(assetManager, "fonts/STXINGKA.TTF");
        text.setTypeface(typeface);
        text1.setTypeface(typeface);
        text2.setTypeface(typeface);
        text3.setTypeface(typeface);
        text4.setTypeface(typeface);
        text5.setTypeface(typeface);
    }
}
