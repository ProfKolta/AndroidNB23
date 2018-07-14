package com.mkolta.android.nb23;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;


public class TopSectionFragment extends Fragment{
    private static EditText mTopTextInput;
    private static EditText mBottomTextInput;
    private static Button mButton;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopSectionListener) context;
        } catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);
        mTopTextInput = view.findViewById(R.id.TopTextInput);
        mBottomTextInput = view.findViewById(R.id.BottomTextInput);
        mButton = view.findViewById(R.id.TheButton);

        mButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }

    public void buttonClicked(View v){
        activityCommander.createMeme(mTopTextInput.getText().toString(), mBottomTextInput.getText().toString());
    }
}
