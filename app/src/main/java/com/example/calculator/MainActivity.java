package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero, comma, plusOrminus, equal, one, two, three, four;
    private Button five, six, seven, eight, nine, leftbracket, rightbracket;
    private Button mul, division, subtract, addition, yToTheX, inverse, eToTheX;
    private Button xSquared, log, nlog, pi, s_root, delete, sine, cos, tan;
    private Button larrow, uarrow, barrow, rarrow;
    private TextView tocalc, answer;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUAL = '0';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocalc.setText(tocalc.getText().toString()+"9");
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = ADDITION;

            }
        });
    }

    private void calculate() {
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(tocalc.getText().toString());

             switch (ACTION) {

                 case ADDITION:
                     val1 = val1 + val2;
                     break;

                 case SUBTRACTION:
                     val1 = val1 - val2;
                     break;

                 case MULTIPLICATION:
                     val1 = val1 * val2;
                     break;

                 case DIVISION:
                     val1 = val1 / val2;
                     break;

                 case EQUAL:
                     break;

             }
        } else {
            val1 = Double.parseDouble(tocalc.getText().toString());
        }
    }

    private void setupUIViews() {

        zero=findViewById(R.id.number0);
        one=findViewById(R.id.number1);
        two=findViewById(R.id.number2);
        three=findViewById(R.id.number3);
        four=findViewById(R.id.number4);
        five=findViewById(R.id.number5);
        six=findViewById(R.id.number6);
        seven=findViewById(R.id.number7);
        eight=findViewById(R.id.number8);
        nine=findViewById(R.id.number9);
        leftbracket=findViewById(R.id.parenthL);
        rightbracket=findViewById(R.id.parenthR);
        comma=findViewById(R.id.numberComma);
        plusOrminus=findViewById(R.id.numberNegate);
        equal=findViewById(R.id.equal);
        mul=findViewById(R.id.multiply);
        division=findViewById(R.id.divide);
        addition=findViewById(R.id.plus);
        subtract=findViewById(R.id.minus);
        yToTheX=findViewById(R.id.power);
        inverse=findViewById(R.id.inverseVal);
        eToTheX=findViewById(R.id.exponential);
        xSquared=findViewById(R.id.square);
        one=findViewById(R.id.number1);
        log=findViewById(R.id.logarithm);
        nlog=findViewById(R.id.naturalLog);
        pi=findViewById(R.id.pie);
        s_root=findViewById(R.id.squarer);
        delete=findViewById(R.id.delete);
        sine=findViewById(R.id.sin);
        cos=findViewById(R.id.cosine);
        tan=findViewById(R.id.cosine);
        larrow=findViewById(R.id.arrowleft);
        rarrow=findViewById(R.id.arrowright);
        barrow=findViewById(R.id.arrowbottom);
        uarrow=findViewById(R.id.arrowtop);
        tocalc=findViewById(R.id.tocalculate);
        answer=findViewById(R.id.display);
    }
}
