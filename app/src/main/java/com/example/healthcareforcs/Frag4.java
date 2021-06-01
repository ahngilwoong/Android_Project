package com.example.healthcareforcs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Frag4 extends Fragment {

    RadioGroup radioGroup;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;
    TextView View4;
    Button btns;
    int cnt=0;

    public Frag4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v2 = inflater.inflate(R.layout.fragment4, null);
        radioGroup = v2.findViewById(R.id.radio_group);
        radioGroup2 = v2.findViewById(R.id.radio_group2);
        radioGroup3 = v2.findViewById(R.id.radio_group3);
        radioGroup4 = v2.findViewById(R.id.radio_group4);
        radioGroup5 = v2.findViewById(R.id.radio_group5);
        radioGroup6 = v2.findViewById(R.id.radio_group6);
        radioGroup7 = v2.findViewById(R.id.radio_group7);
        radioGroup8 = v2.findViewById(R.id.radio_group8);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.bul_0:
                        cnt+=0;
                        break;
                    case R.id.bul_1:
                        cnt+=1;
                        break;
                    case R.id.bul_2:
                        cnt+=2;
                        break;
                    case R.id.bul_3:
                        cnt+=3;
                        break;
                }
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.sim_0:
                        cnt+=0;
                        break;
                    case R.id.sim_1:
                        cnt+=1;
                        break;
                    case R.id.sim_2:
                        cnt+=2;
                        break;
                    case R.id.sim_3:
                        cnt+=3;
                        break;
                }
            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.face_0:
                        cnt+=0;
                        break;
                    case R.id.face_1:
                        cnt+=1;
                        break;
                    case R.id.face_2:
                        cnt+=2;
                        break;
                    case R.id.face_3:
                        cnt+=3;
                        break;
                }
            }
        });
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.hyun_0:
                        cnt+=0;
                        break;
                    case R.id.hyun_1:
                        cnt+=1;
                        break;
                    case R.id.hyun_2:
                        cnt+=2;
                        break;
                    case R.id.hyun_3:
                        cnt+=3;
                        break;
                }
            }
        });
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ddam_0:
                        cnt+=0;
                        break;
                    case R.id.ddam_1:
                        cnt+=1;
                        break;
                    case R.id.ddam_2:
                        cnt+=2;
                        break;
                    case R.id.ddam_3:
                        cnt+=3;
                        break;
                }
            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.gam_0:
                        cnt+=0;
                        break;
                    case R.id.gam_1:
                        cnt+=1;
                        break;
                    case R.id.gam_2:
                        cnt+=2;
                        break;
                    case R.id.gam_3:
                        cnt+=3;
                        break;
                }
            }
        });
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.eyes_0:
                        cnt+=0;
                        break;
                    case R.id.eyes_1:
                        cnt+=1;
                        break;
                    case R.id.eyes_2:
                        cnt+=2;
                        break;
                    case R.id.eyes_3:
                        cnt+=3;
                        break;
                }
            }
        });
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.byun_0:
                        cnt+=0;
                        break;
                    case R.id.byun_1:
                        cnt+=1;
                        break;
                    case R.id.byun_2:
                        cnt+=2;
                        break;
                    case R.id.byun_3:
                        cnt+=3;
                        break;
                }
            }
        });

        btns = (Button) v2.findViewById(R.id.stsBtn);
        btns.setOnClickListener(new View.OnClickListener() {
            String warning = null;


            @Override
            public void onClick(View view) {
                if(cnt<=3){
                    warning = "특별히 문제가 없습니다.";
                }else if(cnt<=8){
                    warning = "평균 수준입니다.";
                }else if(cnt<=13){
                    warning = "주의 수준 입니다. 약간의 주의가 필요합니다.";
                }else if(cnt>13){
                    warning = "경고 수준 입니다. 의사 상담이 필요합니다.";
                }
                View4 = (TextView)v2.findViewById(R.id.tV2);
                View4.setText(warning);
                cnt=0;
            }
        });
        return v2;
    }
}
