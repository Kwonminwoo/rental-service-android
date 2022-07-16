package com.example.rental_service;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_service.setting_user.BsAdapter;
import com.example.rental_service.setting_user.BsData;
import com.example.rental_service.setting_user.BsAdapter;
import com.example.rental_service.setting_user.BsData;
import com.example.rental_service.setting_user.ReviewAdapter;
import com.example.rental_service.setting_user.ReviewData;

import java.util.ArrayList;

public class Fragment_Setting_User_Info extends Fragment {

    private ArrayList<ReviewData> review_ArrayList;
    private ArrayList<BsData> b_ArrayList;
    private ArrayList<BsData> s_ArrayList;
    private ReviewAdapter review_Adapter;
    private BsAdapter b_Adapter;
    private BsAdapter s_Adapter;
    private RecyclerView review_recyclerView;
    private RecyclerView b_recyclerView;
    private RecyclerView s_recyclerView;
    private LinearLayoutManager r_linearLayoutManager;
    private LinearLayoutManager b_linearLayoutManager;
    private LinearLayoutManager s_linearLayoutManager;

    private Button b1;

    private ImageView imageView;
    private TextView text_name;
    private TextView text_extra1;
    private TextView text_extra2;

    public Fragment_Setting_User_Info() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_setting_user_info, container, false);
        review_recyclerView = v.findViewById(R.id.setting_rv_review);
        b_recyclerView = v.findViewById(R.id.setting_rv_borrow);
        s_recyclerView = v.findViewById(R.id.setting_rv_serve);
        set_up_recylcler_view();

        b1=v.findViewById(R.id.button);
        text_name=v.findViewById(R.id.text_name_fieild);
        text_extra1=v.findViewById(R.id.text_additional_1);
        text_extra2=v.findViewById(R.id.text_additional_2);


        b1.setOnClickListener(view -> {
            get_review_data();
            get_B_data();
            get_S_data();
        });



        return v;
    }

    public void set_up_recylcler_view(){


        r_linearLayoutManager = new LinearLayoutManager(getContext());
        b_linearLayoutManager = new LinearLayoutManager(getContext());
        s_linearLayoutManager = new LinearLayoutManager(getContext());

        review_recyclerView.setLayoutManager(r_linearLayoutManager);
        b_recyclerView.setLayoutManager(b_linearLayoutManager);
        s_recyclerView.setLayoutManager(s_linearLayoutManager);

        review_ArrayList=new ArrayList<>();
        s_ArrayList=new ArrayList<>();
        b_ArrayList=new ArrayList<>();

        review_Adapter=new ReviewAdapter(review_ArrayList);
        b_Adapter=new BsAdapter(b_ArrayList);
        s_Adapter=new BsAdapter(s_ArrayList);

        review_recyclerView.setAdapter(review_Adapter);
        b_recyclerView.setAdapter(b_Adapter);
        s_recyclerView.setAdapter(s_Adapter);
    }

    public void get_review_data(){
        //여기에 DB내용 불러와서 for문으로 arraylist에 추가하면 될듯

        for (int i=0;i<1;i++) {

            ReviewData reviewData = new ReviewData(223, "전원주택 좋았네요 ㅋ", "★★★", "2022-07-30");
            review_ArrayList.add(reviewData);
        }
        review_Adapter.notifyDataSetChanged();
    }

    public void get_B_data(){
        //여기에 DB내용 불러와서 for문으로 arraylist에 추가하면 될듯
        
        for (int i=0;i<1;i++) {
            
            BsData bsData = new BsData(223, "고급 가죽가방", "2022-07-11", "2022-07-30");
            b_ArrayList.add(bsData);
        }
        b_Adapter.notifyDataSetChanged();
    }

    public void get_S_data(){
        //여기에 DB내용 불러와서 for문으로 arraylist에 추가하면 될듯

        for (int i=0;i<1;i++) {

            BsData bsData = new BsData(223,"정선 크나큰 정원","2022-07-11","2022-07-30");
            s_ArrayList.add(bsData);
        }
        s_Adapter.notifyDataSetChanged();
    }

}