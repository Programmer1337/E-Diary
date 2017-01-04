package cgamesmyapplication.electrodie;

import android.opengl.Visibility;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button Butlog;
    Button logo;
    TextView cociety;
    TextView cociety_marks;


    public void summonButlog()    {

        logo = (Button) findViewById(R.id.buttonlogotype);
        cociety = (TextView) findViewById(R.id.sosayte);
        cociety.setOnClickListener(Clickcociety);
        cociety_marks = (TextView) findViewById(R.id.sosayte_marks);
        cociety_marks.setOnClickListener(Clickcociety);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Butlog = (Button) findViewById(R.id.butlog);
        Butlog.setOnClickListener(OkListener);

    }

    private   final View.OnClickListener OkListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
         setContentView(R.layout.mark);
            summonButlog();
            }
        };



    private   final View.OnClickListener Clickcociety = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
         switch (v.getId()){

             case R.id.sosayte:
                 cociety.setVisibility(v.INVISIBLE);
                 cociety_marks.setVisibility(v.VISIBLE);
                 break;

             case R.id.sosayte_marks:
                 cociety.setVisibility(v.VISIBLE);
                 cociety_marks.setVisibility(v.INVISIBLE);
                 break;




         }

        }






    };






    };







