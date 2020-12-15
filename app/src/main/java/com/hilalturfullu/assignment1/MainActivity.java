package com.hilalturfullu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            dot, sum, minus, multiply, divide, equal, C, cos, sin, pow;
    TextView inputText, resultText;
    private String input, result;
    private boolean clearResult = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        resultText = findViewById(R.id.resultText);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        dot = findViewById(R.id.dot);
        sum = findViewById(R.id.sum);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        equal = findViewById(R.id.equal);
        C = findViewById(R.id.C);
        cos = findViewById(R.id.cos);
        sin = findViewById(R.id.sin);
        pow = findViewById(R.id.pow);

        /*clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText("");
                resultText.setText("");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "9");
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "×");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "÷");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + ".");
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input = inputText.getText().toString();
                inputText.setText(input + "^");
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                input = inputText.getText().toString();
             //   inputText.setText(Math.sin(Double.parseDouble(input)) + "");
                inputText.setText("sin");
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                input = inputText.getText().toString();
                //   inputText.setText(Math.sin(Double.parseDouble(input)) + "");
                inputText.setText("cos");
            }
        });
        equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                input = inputText.getText().toString();
                input = input.replaceAll("×","*");
                input = input.replaceAll("÷","/");
                Solve();
            }
        });
    */
    }

        public void ButtonClick (View view){
            Button button = (Button) view;
            String data = button.getText().toString();
            switch (data) {
                case "C":
                    input = "";
                    resultText.setText(null);
                    break;
                case "sum":
                    clearResult = false;
                    Solve();
                    inputText.setText(input + "+");
                    break;
                case "minus":
                    clearResult = false;
                    Solve();
                    inputText.setText(input + "-");
                    break;
                case "multiply":
                    clearResult = false;
                    Solve();
                    inputText.setText(input + "×");
                    break;
                case "divide":
                    clearResult = false;
                    Solve();
                    inputText.setText(input + "÷");
                    break;
                case "pow":
                    clearResult = false;
                    Solve();
                    inputText.setText(input + "^");
                    break;
                case "equal":
                    clearResult = true;
                    input = inputText.getText().toString();
                    input = input.replaceAll("×","*");
                    input = input.replaceAll("÷","/");
                    Solve();
                    result = input;
                    break;
                default:
                    if (input == null) {
                        input = "";
                    }
                    if (data.equals("+") || data.equals("-") || data.equals("*") || data.equals("^") || data.equals("/") || data.equals("=") ) {
                        clearResult = false;
                        Solve();
                    } else if (clearResult == true) {
                        input = "";
                        clearResult = false;
                    }
                    input += data;
            }
            inputText.setText(input);
        }
        private void Solve () {
            if (input.split("\\+").length == 2) {
                String number[] = input.split("\\+");
                try {
                    double sum = Double.parseDouble(number[0]) + Double.parseDouble(number[1]);
                    input = sum + "";
                } catch (Exception e) {
                    //Toggle error
                }
            } else if (input.split("\\-").length > 1) {
                String number[] = input.split("\\-");
                if (number[0] == "" && number.length == 2) {
                    number[0] = 0 + "";
                }
                try {
                    double minus = 0;
                    if (number.length == 2) {
                        minus = Double.parseDouble(number[0]) - Double.parseDouble(number[1]);
                    } else if (number.length == 3) {
                        minus = -Double.parseDouble(number[1]) - Double.parseDouble(number[2]);
                    }
                    input = minus + "";
                } catch (Exception e) {
                    //Toggle error
                }
            } else if (input.split("\\×").length == 2) {
                String number[] = input.split("\\×");
                try {
                    double multiply = Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
                    input = multiply + "";
                } catch (Exception e) {
                    //Toggle error
                }
            } else if (input.split("\\÷").length == 2) {
                String number[] = input.split("\\÷");
                try {
                    double division = (Double.parseDouble(number[0]) / Double.parseDouble(number[1]));
                    input = division + "";
                } catch (Exception e) {
                    //Toggle error
                }
            } else if (input.split("pow").length == 2) {
                String number[] = input.split("pow");
                try {
                    double power = Math.pow(Double.parseDouble(number[0]), Double.parseDouble(number[1]));
                    input = power + "";
                } catch (Exception e) {
                    //Toggle error
                }
            } else if (input.split("sin").length == 2) {
                String number[] = input.split("sin");
                try {
                    double sin = Math.sin(Double.parseDouble(number[1]));
                    input = Math.sin(sin) + "";
                } catch (Exception e) {
                    //Toggle error
                }
            } else if (input.split("cos").length == 2) {
                String number[] = input.split("cos");
                try {
                    double cos = Math.cos(Double.parseDouble(number[1]));
                    input = Math.cos(cos) + "";
                } catch (Exception e) {
                    //Toggle error
                }
            }
            //to delete the decimal .0 of an integer
            String n[] = input.split("\\.");
            if (n.length > 1) {
                if (n[1].equals("0")) {
                    input = n[0];
                }
            }
            resultText.setText(input);
        }
    }