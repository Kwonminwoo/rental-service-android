package com.example.rental_service.setting_user;
import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_service.R;
import com.example.rental_service.setting_user.BsAdapter;
import com.example.rental_service.setting_user.BsData;
import com.example.rental_service.setting_user.BsAdapter;
import com.example.rental_service.setting_user.BsData;
import com.example.rental_service.setting_user.ReviewAdapter;
import com.example.rental_service.setting_user.ReviewData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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

    private ImageView image_profile_view;
    private TextView text_name;
    private TextView text_extra1;
    private TextView text_extra2;


    private Uri uri;

    ActivityResultLauncher<Intent> startActivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if( result.getResultCode() == RESULT_OK && result.getData() != null){
                        uri = result.getData().getData();
                        try {
                            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContext().getContentResolver(), uri);
                            image_profile_view.setImageBitmap(bitmap);
                            System.out.println(uri);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            });


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
        image_profile_view=v.findViewById(R.id.image_profile);
        LinearLayout layout = v.findViewById(R.id.texts_layout_on_setting);
        image_profile_view.setMinimumHeight(layout.getHeight());
        image_profile_view.setMinimumWidth(layout.getHeight());
        image_profile_view.setImageResource(R.drawable.profile_images);
        image_profile_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setImageOnLayout();

            }
        });
        text_name.setText("정선 하늘 정원");
        text_extra1.setText("깅원도 정선군 하늘길 332-1");
        text_extra2.setText("010-2222-1111");
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


        BsData bData = new BsData(223,"일본식 온천 가옥","2022-07-01","2022-07-03");
        BsData bData1 = new BsData(223,"기모노","2022-07-01","2022-07-03");
        BsData bData2 = new BsData(223,"가죽 가방","2022-07-01","2022-07-03");
        BsData bData3 = new BsData(223,"여행용 캐리어","2022-07-01","2022-07-03");
        BsData sData = new BsData(223,"정선 크나큰 정원","2022-07-11","2022-07-30");
        BsData sData1 = new BsData(223,"정선 크나큰 정원","2022-08-01","2022-08-15");
        BsData sData2 = new BsData(223,"정선 크나큰 정원","2022-08-17","2022-08-20");
        BsData sData3 = new BsData(223,"정선 크나큰 정원","2022-08-21","2022-08-30");
        ReviewData reviewData = new ReviewData(223, "주변도 조용하고 실내도 깨..", "★★★★★", "2022-07-30");
        ReviewData reviewData1 = new ReviewData(223, "전원주택 한번 살아보고 싶었..", "★★★★", "2022-08-23");
        ReviewData reviewData2 = new ReviewData(223, "급하게 필요했는데 잘 이용했..", "★★★★", "2022-09-21");
        ReviewData reviewData3 = new ReviewData(223, "판매자분이 친절해요", "★★★★", "2022-11-15");

        b_ArrayList.add(bData);
        b_ArrayList.add(bData1);
        b_ArrayList.add(bData2);
        b_ArrayList.add(bData3);
        s_ArrayList.add(sData);
        s_ArrayList.add(sData1);
        s_ArrayList.add(sData2);
        s_ArrayList.add(sData3);

        review_ArrayList.add(reviewData);
        review_ArrayList.add(reviewData1);
        review_ArrayList.add(reviewData2);
        review_ArrayList.add(reviewData3);
    }

    public void get_review_data(){
        //여기에 DB내용 불러와서 for문으로 arraylist에 추가하면 될듯

        for (int i=0;i<1;i++) {

            ReviewData reviewData = new ReviewData(223, "전원주택 좋았습니", "★★★", "2022-07-30");
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
    void setImageOnLayout(){
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        Thread t = new Thread (){
            @Override
            public void run() {
                super.run();
                startActivityResult.launch(intent);
            }
        };
        t.start();

    }//해당 날짜의 식단 사진을 업로드 하는 메서드,예지

}