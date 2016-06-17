package me.soaresfelipef.complextasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button localComplexity1;
    private Button localComplexity2;
    private Button localComplexity3;
    private Button offloadCompletixy1;
    private Button offloadCompletixy2;
    private Button offloadCompletixy3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        localComplexity1 = (Button) findViewById(R.id.button);
        localComplexity2 = (Button) findViewById(R.id.button2);
        localComplexity3 = (Button) findViewById(R.id.button3);
        offloadCompletixy1 = (Button) findViewById(R.id.button4);
        offloadCompletixy2 = (Button) findViewById(R.id.button5);
        offloadCompletixy3 = (Button) findViewById(R.id.button6);

        View.OnClickListener localClickListenerComplexity1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Teste");
            }
        };

        View.OnClickListener localClickListenerComplexity2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Teste 2");
            }
        };

        View.OnClickListener localClickListenerComplexity3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Teste 3");
            }
        };

        localComplexity1.setOnClickListener(localClickListenerComplexity1);
        localComplexity2.setOnClickListener(localClickListenerComplexity2);
        localComplexity3.setOnClickListener(localClickListenerComplexity3);
    }
}
