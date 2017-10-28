package nyc.c4q.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private TextView answer;
    private EditText input;

    private Button radians;
    private Button inverse;
    private Button pi;
    private Button e;
    private Button asnwer;

    private Button degree;
    private Button sin;
    private Button cos;
    private Button tan;
    private Button exp;

    private Button factorial;
    private Button ln;
    private Button log;
    private Button squareRoot;
    private Button exponent;

    private Button radians2;
    private Button inverse2;
    private Button pi2;
    private Button e2;
    private Button rnd;

    private Button degree2;
    private Button sinInverse;
    private Button cosInverse;
    private Button tanInverse;
    private Button exp2;

    private Button factorial2;
    private Button eX;
    private Button tenX;
    private Button square;
    private Button root;

    private Button leftBracket;
    private Button seven;
    private Button four;
    private Button one;
    private Button zero;

    private Button rightBracket;
    private Button eight;
    private Button five;
    private Button two;
    private Button dot;

    private Button percent;
    private Button nine;
    private Button six;
    private Button three;
    private Button equals;

    private Button clear;
    private Button division;
    private Button multiply;
    private Button substratction;
    private Button plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViews();
        businessLogic();

    }

    private void setUpViews() {

        answer = (TextView) findViewById(R.id.output_text_view);
        input = (EditText) findViewById(R.id.input_edit_text);

        radians = (Button) findViewById(R.id.rad_button);
        inverse = (Button) findViewById(R.id.inv_button);
        pi = (Button) findViewById(R.id.pi_button);
        e = (Button) findViewById(R.id.e_button);
        answer = (Button) findViewById(R.id.ans_button);

        degree = (Button) findViewById(R.id.deg_button);
        sin = (Button) findViewById(R.id.sin_button);
        cos = (Button) findViewById(R.id.cos_button);
        tan = (Button) findViewById(R.id.tan_button);
        exp = (Button) findViewById(R.id.exp_button);

        factorial = (Button) findViewById(R.id.factorial_button);
        ln = (Button) findViewById(R.id.ln_button);
        log = (Button) findViewById(R.id.log_button);
        squareRoot = (Button) findViewById(R.id.square_button);
        exponent = (Button) findViewById(R.id.exp_button);

        radians2 = (Button) findViewById(R.id.rad_button_2);
        inverse2 =(Button) findViewById(R.id.inv_button_2);
        pi2 = (Button) findViewById(R.id.pi_button_2);
        e2 = (Button) findViewById(R.id.e_button_2);
        rnd = (Button) findViewById(R.id.rnd_button);

        degree2 = (Button) findViewById(R.id.deg_button_2);
        sinInverse = (Button) findViewById(R.id.sin_1_button);
        cosInverse =(Button) findViewById(R.id.cos_1_button);
        tanInverse = (Button) findViewById(R.id.tan_1_button);
        exp2 = (Button) findViewById(R.id.exp_button_2);

        factorial2 = (Button) findViewById(R.id.factorial_button_2);
        eX = (Button) findViewById(R.id.e_x_button);
        tenX = (Button) findViewById(R.id.ten_x_button);
        square = (Button) findViewById(R.id.square_button);
        root = (Button) findViewById(R.id.root_button);

        leftBracket =(Button) findViewById(R.id.leftBracket_button);
        seven = (Button) findViewById(R.id.seven_button);
        four = (Button) findViewById(R.id.four_button);
        one = (Button) findViewById(R.id.one_button);
        zero = (Button) findViewById(R.id.zero_button);

        rightBracket = (Button) findViewById(R.id.rightBracket_button);
        eight = (Button) findViewById(R.id.eight_button);
        five = (Button) findViewById(R.id.five_button);
        two = (Button) findViewById(R.id.two_button);
        dot = (Button) findViewById(R.id.dot_button);

        percent = (Button) findViewById(R.id.percent_button);
        nine = (Button) findViewById(R.id.nine_button);
        six = (Button) findViewById(R.id.six_button);
        three = (Button) findViewById(R.id.three_button);
        equals = (Button) findViewById(R.id.equals_button);

        clear = (Button) findViewById(R.id.clear_button);
        division = (Button) findViewById(R.id.division_button);
        multiply = (Button) findViewById(R.id.multiply_button);
        substratction = (Button) findViewById(R.id.subtraction_button);
        plus = (Button) findViewById(R.id.plus_button);

    }

    private void businessLogic() {

        radians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        inverse = (Button) findViewById(R.id.inv_button);
        pi = (Button) findViewById(R.id.pi_button);
        e = (Button) findViewById(R.id.e_button);
        answer = (Button) findViewById(R.id.ans_button);

        degree = (Button) findViewById(R.id.deg_button);
        sin = (Button) findViewById(R.id.sin_button);
        cos = (Button) findViewById(R.id.cos_button);
        tan = (Button) findViewById(R.id.tan_button);
        exp = (Button) findViewById(R.id.exp_button);

        factorial = (Button) findViewById(R.id.factorial_button);
        ln = (Button) findViewById(R.id.ln_button);
        log = (Button) findViewById(R.id.log_button);
        squareRoot = (Button) findViewById(R.id.square_button);
        exponent = (Button) findViewById(R.id.exp_button);

        radians2 = (Button) findViewById(R.id.rad_button_2);
        inverse2 =(Button) findViewById(R.id.inv_button_2);
        pi2 = (Button) findViewById(R.id.pi_button_2);
        e2 = (Button) findViewById(R.id.e_button_2);
        rnd = (Button) findViewById(R.id.rnd_button);

        degree2 = (Button) findViewById(R.id.deg_button_2);
        sinInverse = (Button) findViewById(R.id.sin_1_button);
        cosInverse =(Button) findViewById(R.id.cos_1_button);
        tanInverse = (Button) findViewById(R.id.tan_1_button);
        exp2 = (Button) findViewById(R.id.exp_button_2);

        factorial2 = (Button) findViewById(R.id.factorial_button_2);
        eX = (Button) findViewById(R.id.e_x_button);
        tenX = (Button) findViewById(R.id.ten_x_button);
        square = (Button) findViewById(R.id.square_button);
        root = (Button) findViewById(R.id.root_button);

        leftBracket =(Button) findViewById(R.id.leftBracket_button);
        seven = (Button) findViewById(R.id.seven_button);
        four = (Button) findViewById(R.id.four_button);
        one = (Button) findViewById(R.id.one_button);
        zero = (Button) findViewById(R.id.zero_button);

        rightBracket = (Button) findViewById(R.id.rightBracket_button);
        eight = (Button) findViewById(R.id.eight_button);
        five = (Button) findViewById(R.id.five_button);
        two = (Button) findViewById(R.id.two_button);
        dot = (Button) findViewById(R.id.dot_button);

        percent = (Button) findViewById(R.id.percent_button);
        nine = (Button) findViewById(R.id.nine_button);
        six = (Button) findViewById(R.id.six_button);
        three = (Button) findViewById(R.id.three_button);
        equals = (Button) findViewById(R.id.equals_button);

        clear = (Button) findViewById(R.id.clear_button);
        division = (Button) findViewById(R.id.division_button);
        multiply = (Button) findViewById(R.id.multiply_button);
        substratction = (Button) findViewById(R.id.subtraction_button);
        plus = (Button) findViewById(R.id.plus_button);

    }
}


