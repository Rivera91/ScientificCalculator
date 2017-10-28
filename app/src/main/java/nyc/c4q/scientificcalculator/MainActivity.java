package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fathzer.soft.javaluator.*;

import com.fathzer.soft.javaluator.DoubleEvaluator;


public class MainActivity extends AppCompatActivity {

    //TextView

    Button  radButton,sevenButton,fourButton,oneButton,zeroButton,invButton,
            piButton,eButton,ansButton,degButton,sinButton,cosButton,tanButton,
            expButton,lnButton,logButton,squareRootButton,exponentButton,leftParButton,
            rightParButton,eightButton,fiveButton,twoButton,dotButton,
            nineButton,sixButton,threeButton;


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
        dotButton= (Button) findViewById(R.id.dot_button);
        nineButton = (Button) findViewById(R.id.nine_button);
        sixButton = (Button) findViewById(R.id.six_button);
        threeButton = (Button) findViewById(R.id.three_button);
        invButton = (Button) findViewById(R.id.inv_button);
        rightParButton = (Button) findViewById(R.id.rightPar_button);
        piButton = (Button) findViewById(R.id.pi_button);
        eButton = (Button) findViewById(R.id.e_button);
        ansButton = (Button) findViewById(R.id.ans_button);
        degButton = (Button) findViewById(R.id.deg_button);
        sinButton = (Button) findViewById(R.id.sin_button);
        cosButton = (Button) findViewById(R.id.cos_button);
        tanButton = (Button) findViewById(R.id.tan_button);
        expButton = (Button) findViewById(R.id.exp_button);
        lnButton = (Button) findViewById(R.id.ln_button);
        logButton = (Button) findViewById(R.id.log_button);
        squareRootButton = (Button) findViewById(R.id.squareRoot_button);
        exponentButton = (Button) findViewById(R.id.exponent_button);
        leftParButton = (Button) findViewById(R.id.leftPar_button);








    }

    public void getAnswer(View view) {
        DoubleEvaluator evaluator = new DoubleEvaluator();
        Log.d("ANSWER", "getAnswer: = " + evaluator.evaluate("4+3+55-3-4") );
    }
}
