package com.example.appty.uiux3_navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by appty on 06/04/18.
 */

public class TopLevelFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();

        if (view != null)
        {
            TextView title = view.findViewById(R.id.textTitle);
            TextView desc = view.findViewById(R.id.textDesc);
            ImageView img = view.findViewById(R.id.imageView2);

            title.setText(R.string.P21);
            desc.setText(R.string.P22);
            img.setImageResource(R.drawable.kotlin);
            img.setContentDescription("Image");
        }
    }
}
