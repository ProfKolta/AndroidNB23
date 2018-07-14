package com.mkolta.android.nb23;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment{

    static TextView mTopTextView;
    static TextView mBottomTextView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        mTopTextView = view.findViewById(R.id.topTextView);
        mBottomTextView = view.findViewById(R.id.bottomTextView);
        return view;
    }

    public void setMemeText(String top, String bottom)
    {
        mTopTextView.setText(top);
        mBottomTextView.setText(bottom);
    }
}
