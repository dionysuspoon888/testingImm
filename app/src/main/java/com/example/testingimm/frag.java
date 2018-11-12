package com.example.testingimm;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by D on 11/12/2018.
 */

public class frag extends Fragment {
    private EditText et_1;
    private Button b_100,b_200,b_confrim;
    private TextView tv_1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_frag,container,false);
        et_1 = v.findViewById(R.id.et_1);
        b_100 = v.findViewById(R.id.b_100);
        b_200 = v.findViewById(R.id.b_200);
        b_confrim = v.findViewById(R.id.b_confirm);
        tv_1 = v.findViewById(R.id.tv_1);

        b_100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText("$ 100");
                et_1.setFocusable(false);
                et_1.setFocusableInTouchMode(false);
//                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
//                imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);

            }
        });

        b_200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setText("$ 200");
                et_1.setFocusable(false);
                et_1.setFocusableInTouchMode(false);
//                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
//                imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);

            }
        });

        et_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_1.setFocusableInTouchMode(true);
                et_1.setFocusable(true);
                et_1.requestFocus();
                et_1.setText("");
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(et_1,0);
            }
        });

        et_1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    hideKeyboard(getActivity(),v);
                }
            }
        });





        b_confrim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_1.setText("test: "+et_1.getText().toString().trim().replaceAll("\\D", ""));
            }
        });

        return v;
    }

    private void showKeyboard(Context context,View view){
        if(view != null) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(getView(), InputMethodManager.SHOW_IMPLICIT);
        }
    }
    private void hideKeyboard(Context context, View view) {
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
