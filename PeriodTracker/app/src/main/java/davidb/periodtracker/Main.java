package davidb.periodtracker;

import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(),MakeProfile.class);
                startActivity(intent);

            }

        });
        Button b2 = (Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(),ChangeProfile.class);
                startActivity(intent);

            }

        });
        Button b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(),Calender.class);
                startActivity(intent);
            }

        });
        Button b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(),MakeEntry.class);
                startActivity(intent);

            }

        });
    }
}
