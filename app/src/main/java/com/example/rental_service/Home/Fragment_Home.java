package com.example.rental_service.Home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rental_service.PlaceList.PlaceList;
import com.example.rental_service.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment_Home extends Fragment {
    TextView textNotice;
    CardView cdView_loanable, cdView_loan_requested, cdView_rentable;
    LinearLayout notice;


    RecyclerView reStuffPos, reStuffReq, rePlacePos, rePlaceReq;
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
        View placeBtn = view.findViewById(R.id.action_Place);
        View stuffBtn = view.findViewById(R.id.action_Stuff);
        setData(view);

        placeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PlaceList.class);
                startActivity(intent);
            }
        });

        stuffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

//        cdView_loanable.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//
//        cdView_loan_requested.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
//
//        cdView_rentable.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        //https://github.com/Droppers/AnimatedBottomBar
        //https://github.com/zendesk/android-floating-action-button
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

    private void setData(View view){
        reStuffPos = view.findViewById(R.id.recyclerStuffPos);
        reStuffReq = view.findViewById(R.id.recyclerStuffReque);
        rePlacePos = view.findViewById(R.id.recyclerPlacePos);
        rePlaceReq = view.findViewById(R.id.recyclerPlaceReque);

        reStuffPos.setLayoutManager(new LinearLayoutManager(getContext()));
        reStuffReq.setLayoutManager(new LinearLayoutManager(getContext()));
        rePlacePos.setLayoutManager(new LinearLayoutManager(getContext()));
        rePlaceReq.setLayoutManager(new LinearLayoutManager(getContext()));

        ItemAdapter sPosAdapter = new ItemAdapter();
        ItemAdapter sReqAdapter = new ItemAdapter();
        ItemAdapter pReqAdapter = new ItemAdapter();
        ItemAdapter pPosAdapter = new ItemAdapter();


        reStuffPos.setAdapter(sPosAdapter);
        reStuffReq.setAdapter(sReqAdapter);
        rePlacePos.setAdapter(pPosAdapter);
        rePlaceReq.setAdapter(pReqAdapter);

        // 대여 가능 물건
        sPosAdapter.addItem(setItem("밥솥", "2022.12.12.", R.drawable.rice, "밥솥 빌려드려요", "고양이"));
        sPosAdapter.addItem(setItem("냄비", "2022.12.19.", R.drawable.pot, "냄비 빌려드려요", "김이런"));
        sPosAdapter.addItem(setItem("가스 버너", "2022.12.23.", R.drawable.burner, "가스버너 남습니다", "aggqw"));

        // 요청된 물건
        sReqAdapter.addItem(setItem("텐트", "2022.11.30.", R.drawable.tent, "대형 텐트 있으신 분", "5ffrqwe"));
        sReqAdapter.addItem(setItem("캐리어", "2022.12.04.", R.drawable.carrier, "캐리어 하루만 빌립니다", "여행"));
        sReqAdapter.addItem(setItem("아이스박스", "2022.12.11.", R.drawable.icebox, "작은 아이스박스 하나만 빌리고 싶어요", "도리"));

        // 대여 가능 장소
        pPosAdapter.addItem(setItem("파티룸", "2022.11.24.", R.drawable.partiroom, "작은 파티룸입니다!", "아22d"));
        pPosAdapter.addItem(setItem("스터디 카페 회의실", "2022.11.30.", R.drawable.studyroom, "스터디 카페 내부의 회의실 대여입니다", "스터디룸"));
        pPosAdapter.addItem(setItem("강당", "2022.12.02.", R.drawable.auditourium, "강당 자유롭게 쓰실 분", "학교체육"));

        // 요청된 장소
        pReqAdapter.addItem(setItem("노래", "2022.11.22.", R.drawable.singingroom, "노래방 기계 있는 공간 빌려주세요", "rkrkrk"));
        pReqAdapter.addItem(setItem("수영장", "2022.12.11.", R.drawable.swummingpool, "수영장 빌려봐요", "수영강사"));
        pReqAdapter.addItem(setItem("멀티방", "2022.12.21.", R.drawable.multiroom, "플스 있는 방 빌립니다", "qqlqlQQ2"));
    }

    private Item setItem(String name, String date, int img, String title, String userName){
        Item item = new Item();
        item.setName(name);
        item.setDate(date);
        item.setMainImage(img);
        item.setTitle(title);
        item.setUserName(userName);
        return item;
    }
}