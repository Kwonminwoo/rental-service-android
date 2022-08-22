package com.example.rental_service._Network_retrofit2;

import android.util.Log;

import com.example.rental_service.Data_objects.Item_DTO;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CallRetrofit {
    /*클래스 설명 - 세진 -
    여기 선언 되는 메서드는 전부 스태틱 메서드임.
    여기 선언된 메서드를 각 액티비티에서 호출하여 네트워크 request를 보내고 response를 받을 수 있음.
    기본적으로 RetrofitApi 인터페이스 클래스에 선언된 메서드와 1대1로 매칭되어 사용함.
            Retrofit retrofit = RetrofitClient.getInstance();
            RetrofitAPI service= retrofit.create(RetrofitAPI.class);
            Call<CustomDto> call = service.getComments(day);
                 ^ Call의 제너릭 변수   ^RetrofitApi 인터페이스 클래스에 선언된 메서드를 좌변에 할당함.
                      ^ 꺽쇠 안에는 json 응답을 받아들이는 Dto 클래스를 만들어 사용함
    call.excute().body();
    Call형 변수의 excute()함수는 동기 요청(즉 응답이 올때까지 시스템이 대기)
    excute().body()로 호출하면 도착한 http 응답의 body 부분을 반환한다.
    CustomDto customdto = call.excute().body();를 사용한 뒤 함수의 반환형을 CustomDto 형으로 하면
    받아온 데이터를 넘겨주기에 편리하다. 하지만 excute()함수는 동기 실행이기에 함수 호출지에서 적절히 스레드를 활용해 주어야 한다.

    Retrofit retrofit = RetrofitClient.getInstance();
    RetrofitAPI service= retrofit.create(RetrofitAPI.class);
    Call<CustomDto> call = service.getComments(day);
    call.enqueue()함수는 비동기 실행이다. 따라서 응답이 왔을때 동작과 안왔을때 동작을 어떻게 할지 정하는 클래스를 만들어서 매개변수로 넣어줘야 한다.
    call.enqueue(new Callback<CommentDto>() {
            @Override
            public void onResponse(Call<CommentDto> call, Response<CommentDto> response) {
                if(response.isSuccessful()){
                    CommentDto result= response.body();
                    Log.d("연결이 성공적 : ", response.body().getContent());
                    return;
                }
                Log.e("연결이 비정상적 : ", "error code : " + response.code());
            }
            @Override
            public void onFailure(Call<CommentDto> call, Throwable t) {
                Log.e("연결실패", t.getMessage());
            }
        });
   위 소스 코드를 보면 알 수 있듯, Callback<T> 클래스를 익명 클래스?로 메서드를 사용자 정의 하고 해당 클래스의 객체를 매개변수로 전달한다.
   Callback<T>에서 T 자리에는 응답으로 날아올 json객체를 받아들일 데이터 객체(또는 8가지 기본자료형) 을 이용하면 된다.
   필요한 경우 함수의 반환형을 지정하여 return result; 하면 된다.
   설명이 더 필요하면 세진이를 찾아주세요..
*/
    public static void post_profile_image(String user_id,String encoded_image){
        Retrofit retrofit = RetrofitClient.getInstance();
        RetrofitAPI service= retrofit.create(RetrofitAPI.class);
        Call<String> call = service.post_profile_image(user_id,encoded_image);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.e("upload Profile Image()", "성공 : ");
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("upload Profile Image()", "에러 : "+t.getMessage());
            }
        });
    }
    public static String get_profile_image(String user_id){
        String encoded_profile_img = null;
        Retrofit retrofit = RetrofitClient.getInstance();
        RetrofitAPI service= retrofit.create(RetrofitAPI.class);
        Call<String> call = service.get_profile_image(user_id);
        try {
            encoded_profile_img = call.execute().body();
        }catch (Exception e){e.printStackTrace();}
        return encoded_profile_img;
    }
    public static void post_item(Item_DTO item_dto){
        Retrofit retrofit = RetrofitClient.getInstance();
        RetrofitAPI service= retrofit.create(RetrofitAPI.class);
        Call<String> call = service.post_item(item_dto);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.e("upload Profile Image()", "성공 : ");
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("upload Profile Image()", "에러 : "+t.getMessage());
            }
        });
    }
    public static Item_DTO get_item(int item_index){
        Item_DTO item_dto = null;
        Retrofit retrofit = RetrofitClient.getInstance();
        RetrofitAPI service= retrofit.create(RetrofitAPI.class);
        Call<Item_DTO> call = service.get_item(item_index);
        try {
            item_dto = call.execute().body();
        }catch (Exception e){e.printStackTrace();}
        return item_dto;
    }
}

