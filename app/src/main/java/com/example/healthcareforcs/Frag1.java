package com.example.healthcareforcs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Frag1 extends Fragment {
    TextView View1,View2;
    ImageView imgVw;
    Button wbtn;
    int cnt2=0;
    int data2[] = new int[3];
    public Frag1() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1, null);
//
        Bundle bundle = getArguments();
        data2[0] = R.drawable.s0;
        data2[1] = R.drawable.s1;
        data2[2] = R.drawable.s2;      wbtn = v.findViewById(R.id.change_bu);
        imgVw = v.findViewById(R.id.imvv2);

        wbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cnt2==data2.length-1){
                    imgVw.setImageResource(data2[cnt2]);
                    cnt2=0;
                }else{

                    cnt2++;
                    imgVw.setImageResource(data2[cnt2]);

                }
            }
        });
        if(bundle !=null){
            String name = bundle.getString("NAME"); // 전달한 key 값
            String age = bundle.getString("AGE"); // 전달한 key 값
            String tall = bundle.getString("TALL"); // 전달한 key 값
            String weight = bundle.getString("WEIGHT"); // 전달한 key 값
            String ng = bundle.getString("NG"); // 전달한 key 값
            String body = null;
            double bmi = Double.parseDouble(weight)/((Double.parseDouble(tall)/100)*(Double.parseDouble(tall)/100));
            if(bmi<18.5){
                body = "저체중";
            }else if(bmi>=18.5 && bmi<23){
                body = "정상체중";
            }else if(bmi>=23 && bmi<25){
                body = "과체중";
            }else if(bmi>=25){
                body = "비만";
            }
            View1 = (TextView)v.findViewById(R.id.textView1);
            View2 = (TextView)v.findViewById(R.id.textView2);
            View1.setText("   "+name+"님 환영합니다."+"\n"+"   "+name+"님의 나이 : "+age+" 성별 : "+ ng +"\n"+"   키 : "+tall+" 몸무게 : " +weight); //전달 받은 문자열로 TextView의 글씨를 변경
            View2.setText(name+"님의 BMI 수치는 "+(Math.round(bmi*1000)/1000.0)+" 입니다. \n" + name +"님의 체중상태는 "+body+"입니다.");

        }

//
//


        // Inflate the layout for this fragment
        return v;
    }



}
