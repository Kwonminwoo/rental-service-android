package com.example.rental_service;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Fragment_Home extends Fragment {
    TextView textNotice;
    CardView cdView_loanable, cdView_loan_requested, cdView_rentable;
    LinearLayout notice;

    public Fragment_Home() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        textNotice = (TextView) view.findViewById(R.id.textNotice);

        cdView_loanable = (CardView) view.findViewById(R.id.cdView_loanable_stuff);
        cdView_loan_requested = (CardView) view.findViewById(R.id.cdView_loan_requested_stuff);
        cdView_rentable = (CardView) view.findViewById(R.id.cdView_rentable_place);

        notice = (LinearLayout) view.findViewById(R.id.notice);

        cdView_loanable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cdView_loan_requested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cdView_rentable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

//
//        final View actionB = view.findViewById(R.id.action_b);
//
//        FloatingActionButton actionC = new FloatingActionButton(view.getContext());
//        actionC.setTitle("Hide/Show Action above");
//        actionC.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                actionB.setVisibility(actionB.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
//            }
//        });
//
//        final FloatingActionsMenu menuMultipleActions = (FloatingActionsMenu) view.findViewById(R.id.multiple_actions);
//        menuMultipleActions.addButton(actionC);
//
//
//        ShapeDrawable drawable = new ShapeDrawable(new OvalShape());
//        drawable.getPaint().setColor(getResources().getColor(R.color.white));
//
//        final FloatingActionButton actionA = (FloatingActionButton) view.findViewById(R.id.action_a);
//        actionA.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                actionA.setTitle("Action A clicked");
//            }
//        });

        return view;
    }
}