package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //TextView
    Button  mrcButton,sevenButton,fourButton,oneButton,zeroButton,
            mMinusButton,eightButton,fiveButton,twoButton,periodButton,
            mPlusButton,nineButton,sixButton,threeButton,plusMinusButton;

            ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mrcButton= (Button) findViewById(R.id.mrc_button);
        sevenButton=(Button) findViewById(R.id.seven_button);
        fourButton= (Button) findViewById(R.id.four_button);
        oneButton = (Button) findViewById(R.id.one_button);
        zeroButton = (Button) findViewById(R.id.zero_button);
        mMinusButton = (Button)findViewById(R.id.mMinus_button);
        eightButton= (Button) findViewById(R.id.eight_button);
        fiveButton= (Button) findViewById(R.id.five_button);
        twoButton= (Button) findViewById(R.id.two_button);
        periodButton= (Button) findViewById(R.id.period_button);
        mPlusButton = (Button) findViewById(R.id.mPlus_button);
        nineButton = (Button) findViewById(R.id.nine_button);
        sixButton = (Button) findViewById(R.id.six_button);
        threeButton = (Button) findViewById(R.id.three_button);
        plusMinusButton= (Button) findViewById(R.id.plusMinus_button);


    }
}
