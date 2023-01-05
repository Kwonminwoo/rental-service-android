package com.example.rental_service;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Chatting extends Fragment {

    public Fragment_Chatting() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chating, container, false);

        View chat1 = view.findViewById(R.id.chatlist1);
        View chat2 = view.findViewById(R.id.chatlist2);
        View chat3 = view.findViewById(R.id.chatlist3);
        View chat4 = view.findViewById(R.id.chatlist4);
        View chat5 = view.findViewById(R.id.chatlist5);

        chat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ChattingRoomActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}