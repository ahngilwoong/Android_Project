package com.example.healthcareforcs;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Frag3 extends Fragment {
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_10;
    CheckBox ck1,ck2,ck3,ck4,ck5,ck6,ck7,ck8,ck9,ck10;
    MediaPlayer mp;
    TextView Vw;
    Button buts;
    public Frag3() {
        // Required empty public constructor
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mp != null) {
            mp.release();
            mp = null;
        }

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v3 = inflater.inflate(R.layout.fragment3, null);
        btn_1 = (Button) v3.findViewById(R.id.btn_play1);
        btn_2 = (Button) v3.findViewById(R.id.btn_play2);
        btn_3 = (Button) v3.findViewById(R.id.btn_play3);
        btn_4 = (Button) v3.findViewById(R.id.btn_play4);
        btn_5 = (Button) v3.findViewById(R.id.btn_play5);
        btn_6 = (Button) v3.findViewById(R.id.btn_play6);
        btn_7 = (Button) v3.findViewById(R.id.btn_play7);
        btn_8 = (Button) v3.findViewById(R.id.btn_play8);
        btn_9 = (Button) v3.findViewById(R.id.btn_play9);
        btn_10 = (Button) v3.findViewById(R.id.btn_play10);

        ck1 = (CheckBox) v3.findViewById(R.id.check1);
        ck2 = (CheckBox) v3.findViewById(R.id.check2);
        ck3 = (CheckBox) v3.findViewById(R.id.check3);
        ck4 = (CheckBox) v3.findViewById(R.id.check4);
        ck5 = (CheckBox) v3.findViewById(R.id.check5);
        ck6 = (CheckBox) v3.findViewById(R.id.check6);
        ck7 = (CheckBox) v3.findViewById(R.id.check7);
        ck8 = (CheckBox) v3.findViewById(R.id.check8);
        ck9 = (CheckBox) v3.findViewById(R.id.check9);
        ck10 = (CheckBox) v3.findViewById(R.id.check10);

        //Fragment?????? (util?????? ???????????????) ??????????????? getContext()??? ???????????????..
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.one);
                mp.start();
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.two);
                mp.start();
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.three);
                mp.start();
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.four);
                mp.start();
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.five);
                mp.start();
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.six);
                mp.start();
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.seven);
                mp.start();
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.eight);
                mp.start();
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.nine);
                mp.start();
            }
        });
        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getContext(), R.raw.ten);
                mp.start();
            }
        });

        Vw = (TextView)v3.findViewById(R.id.textV2);
        final String[] frag3Result = {"ggood"};


        //fragment?????? ??????????????? ???????????? ???????????? onchecked?????????????????? ?????? compound????????? ???????????? String????????? ?????????????????????.
        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "?????? ????????? ?????????, ????????? ????????? ?????? ??????";
                    Vw.setText(frag3Result[0]);
                }
            }
        });
        ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "??? ??? ????????? ??????";
                    Vw.setText(frag3Result[0]);
                }
            }
        });
        ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "?????? ????????? ??????";
                    Vw.setText(frag3Result[0]);
                }
            }
        });
        ck4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "30??? ????????? ??????";
                    Vw.setText(frag3Result[0]);
                }
            }
        });
        ck5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "20??? ????????? ??????";
                    Vw.setText(frag3Result[0]);
                }
            }
        });
        ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "20??? ???????????? 10??? ?????? ????????? ??????";
                    Vw.setText(frag3Result[0]);
                }
            }
        });
        ck7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "10??? ????????? ??????(?????? ?????? ?????? ??? ??????)";
                    Vw.setText(frag3Result[0]);
                }
            }
        });
        ck8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "10??? ?????? ????????? ??????";
                    Vw.setText(frag3Result[0]);
                }
            }
        });
        ck9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "10?????? ?????? ?????? ????????? ??????";
                    Vw.setText(frag3Result[0]);
                }
            }
        });
        ck10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) { // option1 ??? ??????????????????
                    frag3Result[0] = "????????? 8?????? ?????? ??? ????????? ??????";
                    Vw.setText(frag3Result[0]);
                }
            }
        });




        return v3;
    }





}
