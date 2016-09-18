package zickinc.thing.surveys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) this.findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Launch();
            }
        });
    }



    private void Launch()
    {
        Intent i = new Intent(this,NewSurvey.class);
        startActivity(i);
    }
}
