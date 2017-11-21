package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fathzer.soft.javaluator.*;

import com.fathzer.soft.javaluator.DoubleEvaluator;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    double result;

    String inputNumberText;
    String outputText;

    TextView output;
    EditText input;

    String display = "";

    Button radButton, sevenButton, fourButton, oneButton, zeroButton, invButton,
            piButton, eButton, ansButton, degButton, sinButton, cosButton, tanButton,
            expButton, lnButton, logButton, squareRootButton, exponentButton, leftParButton,
            rightParButton, eightButton, fiveButton, twoButton, dotButton,
            nineButton, sixButton, threeButton;

    Button leftBracketButton, rightBracketButton, percentButton, equalsButton, allClearButton,
            divisionButton, multiplyButton, substractButton, addButton;
    private boolean equalsButtonClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView) findViewById(R.id.output_text_view);
        input = (EditText) findViewById(R.id.input_edit_text);

        radButton = (Button) findViewById(R.id.rad_button);
        sevenButton = (Button) findViewById(R.id.seven_button);
        fourButton = (Button) findViewById(R.id.four_button);
        oneButton = (Button) findViewById(R.id.one_button);
        zeroButton = (Button) findViewById(R.id.zero_button);
        eightButton = (Button) findViewById(R.id.eight_button);
        fiveButton = (Button) findViewById(R.id.five_button);
        twoButton = (Button) findViewById(R.id.two_button);
        dotButton = (Button) findViewById(R.id.dot_button);
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

        leftBracketButton = (Button) findViewById(R.id.leftBracket_button);
        rightBracketButton = (Button) findViewById(R.id.rightBracket_button);
        percentButton = (Button) findViewById(R.id.percent_button);
        equalsButton = (Button) findViewById(R.id.equals_button);
        allClearButton = (Button) findViewById(R.id.clear_button);
        divisionButton = (Button) findViewById(R.id.division_button);
        multiplyButton = (Button) findViewById(R.id.multiply_button);
        substractButton = (Button) findViewById(R.id.subtraction_button);
        addButton = (Button) findViewById(R.id.plus_button);

        zeroButton.setOnClickListener(this);
        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);

        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);

        dotButton.setOnClickListener(this);
        addButton.setOnClickListener(this);
        leftBracketButton.setOnClickListener(this);
        rightBracketButton.setOnClickListener(this);
        equalsButton.setOnClickListener(this);

        allClearButton.setOnClickListener(this);
        substractButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divisionButton.setOnClickListener(this);
        percentButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        equalsButtonClicked = false;
        switch (view.getId()) {
            case R.id.zero_button:
                display += "0";
                inputNumberText += "0";
                break;
            case R.id.one_button:
                display += "1";
                inputNumberText += "1";
                break;
            case R.id.two_button:
                display += "2";
                inputNumberText += "2";
                break;
            case R.id.three_button:
                display += "3";
                inputNumberText += "3";
                break;
            case R.id.four_button:
                display += "4";
                inputNumberText += "4";
                break;
            case R.id.five_button:
                display += "5";
                inputNumberText += "5";
                break;
            case R.id.six_button:
                display += "6";
                inputNumberText += "6";
                break;
            case R.id.seven_button:
                display += "7";
                inputNumberText += "7";
                break;
            case R.id.eight_button:
                display += "8";
                inputNumberText += "8";
                break;
            case R.id.nine_button:
                display += "9";
                inputNumberText += "9";
                break;
            case R.id.dot_button:
                display += ".";
                break;
            case R.id.plus_button:
                display += "+";
                break;
            case R.id.subtraction_button:
                display += "-";
                break;
            case R.id.multiply_button:
                display += "*";
                break;
            case R.id.division_button:
                display += "/";
                break;
            case R.id.leftBracket_button:
                display += "(";
                break;
            case R.id.rightBracket_button:
                display += ")";
                break;
            case R.id.percent_button:
//                display += "%";
                equalsButtonClicked = true;
                getPercent();
                Toast.makeText(getApplicationContext(),"You cannot do percent calculation together with other calculations!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.equals_button:
                getAnswer();
                equalsButtonClicked = true;
                break;
            case R.id.clear_button:
                display = "";
                break;
        }

        if(equalsButtonClicked){
            display = "";
        }else{
            input.setText(display);
        }
    }

    private void getAnswer() {
        if(display != ""){
        DoubleEvaluator evaluator = new DoubleEvaluator();
        result = evaluator.evaluate(display);
        outputText = String.valueOf(result);
        output.setText(outputText);
        input.setText("");
        }else{
         display = "";
         Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT).show();
        }
    }

    private void getPercent(){

        if(display != ""){
            double n = Double.parseDouble(display);
            double percentage = n/100;
            outputText = String.valueOf(percentage);
            output.setText(outputText);
            input.setText("");
        }else{
            display = "";
            Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT).show();
        }
    }
}