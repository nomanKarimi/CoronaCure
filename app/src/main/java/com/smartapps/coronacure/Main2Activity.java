package com.smartapps.coronacure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Main2Activity extends Activity {
    private Button btnSubmet;
    private RadioButton yes1;
    private RadioButton yes2;
    private RadioButton yes3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        yes1 = (RadioButton) findViewById(R.id.rbYes);
        yes2 = (RadioButton) findViewById(R.id.rbdrool_Yes);
        yes3 =findViewById(R.id.rbFeverYes);

        btnSubmet = (Button)findViewById(R.id.btnSubmit);
        btnSubmet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yes1.isChecked() && yes2.isChecked() && yes3.isChecked()){
                    Intent j = new Intent(Main2Activity.this,Checkup.class);
                    j.putExtra("name","allYes");
                    startActivity(j);

                }
                else if(yes1.isChecked() && yes2.isChecked()){

                    Intent j = new Intent(Main2Activity.this,Checkup.class);
                    j.putExtra("name","onlyOneAndTwo");
                    startActivity(j);
                }
                else if(yes1.isChecked() && yes3.isChecked()){

                    Intent j = new Intent(Main2Activity.this,Checkup.class);
                    j.putExtra("name","onlyOneAndThree");
                    startActivity(j);
                }
                else if(yes2.isChecked() && yes3.isChecked()){

                    Intent j = new Intent(Main2Activity.this,Checkup.class);
                    j.putExtra("name","onlyTwoAndThree");
                    startActivity(j);
                }
                else if(yes1.isChecked()){
                    Intent j = new Intent(Main2Activity.this,Checkup.class);
                    j.putExtra("name","onlyOne");
                    startActivity(j);

                }else if(yes2.isChecked()){
                    Intent j = new Intent(Main2Activity.this,Checkup.class);
                    j.putExtra("name","onlyTwo");
                    startActivity(j);

                }else if(yes3.isChecked()){
                    Intent j = new Intent(Main2Activity.this,Checkup.class);
                    j.putExtra("name","onlyThree");
                    startActivity(j);

                }else{

                    Intent k = new Intent(Main2Activity.this,Checkup2.class);
                    k.putExtra("name","allNo");
                    startActivity(k);


                }
            }
        });

    }
}
