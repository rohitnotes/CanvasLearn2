package com.liuh.canvaslearn.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.liuh.canvaslearn.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PathMeasureUseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_path_use_detail_path_measure);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_PathMeasureConstructor, R.id.btn_PathMeasureGetSegment})
    void onViewClicked(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.btn_PathMeasureConstructor:
                intent.setClass(this, PathMeasureConstructorUseActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_PathMeasureGetSegment:
                intent.setClass(this, PathMeasureGetSegmentActivity.class);
                startActivity(intent);
                break;
        }

    }

}
