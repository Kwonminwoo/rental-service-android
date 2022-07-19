package com.example.rental_service;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Fragment_Home extends Fragment {
    TextView textNotice;
    ImageButton btnPlace, btnStuff;
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
        btnPlace = (ImageButton) view.findViewById(R.id.btnPlace);
        btnStuff = (ImageButton) view.findViewById(R.id.btnStuff);

        cdView_loanable = (CardView) view.findViewById(R.id.cdView_loanable_stuff);
        cdView_loan_requested = (CardView) view.findViewById(R.id.cdView_loan_requested_stuff);
        cdView_rentable = (CardView) view.findViewById(R.id.cdView_rentable_place);

        notice = (LinearLayout) view.findViewById(R.id.notice);

        btnPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnStuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

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

        return view;
    }
}