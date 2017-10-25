package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;


public class MainActivity extends AppCompatActivity {

    //TextView
    Button  radButton,sevenButton,fourButton,oneButton,zeroButton,
            mMinusButton,eightButton,fiveButton,twoButton,periodButton,
            mPlusButton,nineButton,sixButton,threeButton,plusMinusButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radButton= (Button) findViewById(R.id.rad_button);
        sevenButton=(Button) findViewById(R.id.seven_button);
        fourButton= (Button) findViewById(R.id.four_button);
        oneButton = (Button) findViewById(R.id.one_button);
        zeroButton = (Button) findViewById(R.id.zero_button);
        eightButton= (Button) findViewById(R.id.eight_button);
        fiveButton= (Button) findViewById(R.id.five_button);
        twoButton= (Button) findViewById(R.id.two_button);
        periodButton= (Button) findViewById(R.id.period_button);
        nineButton = (Button) findViewById(R.id.nine_button);
        sixButton = (Button) findViewById(R.id.six_button);
        threeButton = (Button) findViewById(R.id.three_button);





    }

    public void getAnswer(View view) {
        DoubleEvaluator evaluator = new DoubleEvaluator();
        Log.d("ANSWER", "getAnswer: = " + evaluator.evaluate("4+3+55-3-4") );
    }
}
