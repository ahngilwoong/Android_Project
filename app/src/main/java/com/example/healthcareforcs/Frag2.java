package com.example.healthcareforcs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Frag2 extends Fragment {
    Button cbtn,cbtn2;
    ImageView imgV;
    TextView textvv;
    EditText editT;
    String res = "[ 시력 테스트 ] \n아직 테스트 전 입니다. \n테스트 후 결과가 표시됩니다.";
    Frag1 frag1 = new Frag1();
    boolean a = true;
    int data[] = new int[8];
    public Frag2() {
        // Required empty public constructor
    }

    int cnt =0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vs = inflater.inflate(R.layout.fragment2, null);


        // Inflate the layout for this fragment
        data[0] = R.drawable.one;
        data[1] = R.drawable.two;
        data[2] = R.drawable.three;
        data[3] = R.drawable.four;
        data[4] = R.drawable.five;
        data[5] = R.drawable.six;
        data[6] = R.drawable.seven;
        data[7] = R.drawable.eight;


        cbtn = vs.findViewById(R.id.change_btn);
        cbtn2 = vs.findViewById(R.id.frag_ok);
        imgV = vs.findViewById(R.id.change_img);
        editT = (EditText)vs.findViewById(R.id.frag_edit);
        textvv = (TextView)vs.findViewById(R.id.frag2_result);
        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt==data.length-1){
                    imgV.setImageResource(data[cnt]);
                    cnt=0;
                }else{

                    cnt++;
                    imgV.setImageResource(data[cnt]);
                }
            }
        });
        cbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int count_1 = Integer.parseInt( editT.getText().toString());
                if(count_1<=2){
                    res = "[시력 테스트]\n색맹/색약 테스트 결과 정상 입니다.";
                    textvv.setText(res);
                }else{
                    res = "[시력 테스트]\n색맹/색약 테스트 결과 비 정상 입니다.";
                    textvv.setText(res);
                }
            }
        });

        return vs;
    }
}
