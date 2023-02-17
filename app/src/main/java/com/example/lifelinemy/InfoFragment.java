package com.example.lifelinemy;

import android.animation.LayoutTransition;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;


public class InfoFragment extends Fragment {

    private TextView first_details;
    private TextView second_details;
    private TextView third_details;
    private TextView fourth_details;
    private TextView fifth_details;
    private LinearLayout first_layout;
    private LinearLayout second_layout;
    private LinearLayout third_layout;
    private LinearLayout fourth_layout;
    private LinearLayout fifth_layout;
    private CardView firstBar;
    private CardView secondBar;
    private CardView thirdBar;
    private CardView fourthBar;
    private CardView fifthBar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_info, container, false);

        first_details = view.findViewById(R.id.details);
        second_details = view.findViewById(R.id.second_details);
        third_details = view.findViewById(R.id.third_details);
        fourth_details = view.findViewById(R.id.fourth_details);
        fifth_details = view.findViewById(R.id.fifth_details);
        //        details
        first_layout = view.findViewById(R.id.first_layout);
        second_layout = view.findViewById(R.id.second_layout);
        third_layout = view.findViewById(R.id.third_layout);
        fourth_layout = view.findViewById(R.id.fourth_layout);
        fifth_layout = view.findViewById(R.id.fifth_layout);
        //        layout
        firstBar = view.findViewById(R.id.firstBar);
        secondBar = view.findViewById(R.id.secondBar);
        thirdBar = view.findViewById(R.id.thirdBar);
        fourthBar = view.findViewById(R.id.fourthBar);
        fifthBar = view.findViewById(R.id.fifthBar);

        first_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        second_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        third_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        fourth_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        fifth_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        firstBar.setOnClickListener(view1 -> {
        int v = (first_details.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(first_layout, new AutoTransition());
        first_details.setVisibility(v);
        });

        secondBar.setOnClickListener(view1-> {
            int v = (second_details.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(second_layout, new AutoTransition());
            second_details.setVisibility(v);
        });
        thirdBar.setOnClickListener(view1 -> {
            int v = (third_details.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(third_layout, new AutoTransition());
            third_details.setVisibility(v);
        });
        fourthBar.setOnClickListener(view1 -> {
            int v = (fourth_details.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(fourth_layout, new AutoTransition());
            fourth_details.setVisibility(v);
        });
        fifthBar.setOnClickListener(view1 -> {
            int v = (fifth_details.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

            TransitionManager.beginDelayedTransition(fifth_layout, new AutoTransition());
            fifth_details.setVisibility(v);
        });
        return view;

    }



}