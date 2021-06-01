package com.example.healthcareforcs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        EditText et1,et2,et3,et4;
        et1 = (EditText)findViewById(R.id.n1);
        et1.setPrivateImeOptions("defaultInputmode=korean;");
        et2 = (EditText)findViewById(R.id.n2);
        et3 = (EditText)findViewById(R.id.n3);
        et4 = (EditText)findViewById(R.id.n4);



        findViewById(R.id.Male).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Checked(v); // 체크되었을 때 동작코드
            }
        });

        // option2 체크박스가 눌렸을 때
        findViewById(R.id.Female).setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Checked(v); // 체크되었을 때 동작코드
            }
        });


        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                final String TEXT = et1.getText().toString();
                final String TEXT2 = et2.getText().toString();
                final String TEXT3 = et3.getText().toString();
                final String TEXT4 = et4.getText().toString();
                intent.putExtra("TEXT", TEXT);
                intent.putExtra("TEXT2", TEXT2);
                intent.putExtra("TEXT3", TEXT3);
                intent.putExtra("TEXT4", TEXT4);
                intent.putExtra("it_check", Checked(view));
                startActivity(intent);
            }
        });




    }
    public String Checked(View v) { // 체크되었을 때 동작할 메소드 구현
        // TODO Auto-generated method stub
        CheckBox option1 = (CheckBox) findViewById(R.id.Male); // option1체크박스
        // 선언
        CheckBox option2 = (CheckBox) findViewById(R.id.Female); // option1체크박스
        // 선언

        String resultText = ""; // 체크되었을 때 값을 저장할 스트링 값
        if (option1.isChecked()) { // option1 이 체크되었다면
            resultText = "남자";
        }
        if (option2.isChecked()) {
            resultText = "여자"; // option2 이 체크되었다면
        }

        return resultText; // 체크된 값 리턴
    }

}




