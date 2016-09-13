package cn.ben.googletraininguseplatformstylesandthemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDialog = (Button) findViewById(R.id.btn_dialog);
        btnDialog.setOnClickListener(this);

        Button btnTransparent = (Button) findViewById(R.id.btn_transparent);
        btnTransparent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_dialog:
                startActivity(new Intent(this, DialogActivity.class));
                break;
            case R.id.btn_transparent:
                startActivity(new Intent(this, TransparentActivity.class));
                break;
        }
    }
}
