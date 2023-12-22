package com.example.lab_3_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import com.example.lab_3_calculator.CalculatorUtilsUsingLibraries;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView resultTv,solutionTv;
    MaterialButton buttonC,buttonSqrt,buttonChangeSign;
    MaterialButton buttonDivide,buttonMultiply,buttonPlus,buttonMinus,buttonEquals;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    MaterialButton buttonAC,buttonDot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);

        assignId(buttonC,R.id.button_c);
        assignId(buttonSqrt,R.id.button_sqrt);
        assignId(buttonChangeSign,R.id.button_change_sign);
        assignId(buttonDivide,R.id.button_divide);
        assignId(buttonMultiply,R.id.button_multiply);
        assignId(buttonPlus,R.id.button_plus);
        assignId(buttonMinus,R.id.button_minus);
        assignId(buttonEquals,R.id.button_equals);
        assignId(button0,R.id.button_0);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(buttonAC,R.id.button_ac);
        assignId(buttonDot,R.id.button_dot);





    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

   boolean isNegative=false;
    @Override
    public void onClick(View view) {

        MaterialButton button =(MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();
        boolean sqrt=false;
        if(buttonText.equals("sqrt")) {
            sqrt=true;}

        else if(buttonText.equals("AC")){
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        else if(buttonText.equals("=")){
            solutionTv.setText(resultTv.getText());
            return;
        }
        else if (buttonText.equals("+-")) {
            dataToCalculate = isNegative ? dataToCalculate.substring(1) : "-" + dataToCalculate;
            isNegative = !isNegative;
        }
        else if(buttonText.equals("C")){
            if(resultTv.getText().length()!=1)
          dataToCalculate = dataToCalculate.substring(0,dataToCalculate.length()-1);
            else{
                solutionTv.setText("");
                resultTv.setText("0");
                return;
            }
        }else{
            dataToCalculate = dataToCalculate+buttonText;
        }

        if(sqrt){

            Double finalResult = Math.sqrt(Double.parseDouble(CalculatorUtilsUsingLibraries.getResult(dataToCalculate))) ;
            solutionTv.setText(finalResult.toString());

            if(!finalResult.equals("Err")){
                resultTv.setText(Double.toString(finalResult));
            }
        }
        else{
            solutionTv.setText(dataToCalculate);

            String finalResult = CalculatorUtilsUsingLibraries.getResult(dataToCalculate);

            if(!finalResult.equals("Err")){
                resultTv.setText(finalResult);
            }
        }

    }

}