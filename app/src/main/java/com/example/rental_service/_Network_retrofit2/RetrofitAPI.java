package com.example.rental_service._Network_retrofit2;

import com.example.rental_service.Data_objects.Item;
import com.example.rental_service.Data_objects.Reservation;
import com.example.rental_service.Data_objects.Reservation_pointer;
import com.example.rental_service.Data_objects.User_DTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitAPI {
    /* 설명 작성자 -세진-
    이곳에는 CallRetrofit 에서 호출되는 메서드를 정의만 합니다.
    ... 사실 notation도 조금 달아줘야 합니다.

    RetrofitClient에 BaseURL에 덧붙습니다.
    GET 요청은 다음과 같이 정의합니다.
    @GET()
         ^ 괄호 내부에 상세 URL을 추가하여 RetrofitClient의 BaseURL+괄호내부 URL 하여 해당 주소로 GET요청을 보내는것 입니다.
    다른 HTTP 요청도 비슷합니다.
    @POST() @UPDATE() @DELETE() 등,,
    HTTP 메서드 노테이션과 함수 정의 부분은 1대1로 매칭됩니다.

    @GET("comments")
        Call <CommentsDto> getComments(@Body("day") String day);

    이 경우 BaseURL+comments로 하여 43.200.172.82:8081/comments로 get 요청을 보냅니다.
    언제? getComments()함수를 CallRetrofit 함수 에서 호출했을 때.
    함수의 형식매개변수를 보면 앞에 notation이 달려있음을 알 수 있는데, 이를 통해 매개변수로 들어온 데이터의  key값을 day로 하여 http 요청의 body에 담아 보냅니다.
    key:value
    day:"2022-02-21"
    url 경로에 매개변수로 받아온 값을 넘겨 줄 수 있습니다.
    @GET("comments/{day}")
        Call <CommentsDto> getComments(@Path("day") String day);
    이번엔 GET노테이션옆 괄호에 {day}가 추가된 점을 주목 합니다.
    중괄호 안에 있는 값과 @Path()의 괄호 안의 값이 같다면 url을 동적으로 수정합니다.
    매개변수로 넘어온 스트링 값이 url에 추가될 것 입니다.
    최종적으로 url은 43.200.172.82:8081/comments/2022-02-21이 되고 이 url로 get 요청을 보낼 것 입니다.*/
    //


//아이템 관련
    @GET("items/{item_index}")//인덱스에 해당하는 단일 아이템 객체 얻어옴
    Call <Item> get_item(@Path("item_index")int item_index);
    @GET("items/by_desc/{item_amount}}")//최신순으로 아이템 amount 만큼 배열로 받아옴
    Call <Item[]> get_items_by_desc(@Path("item_amount")int item_amount);
    @POST("add/items")//단일 아이템 객체 업로드
    Call <String> post_item(@Body Item Item);
    @GET("reservation_list/{item_index}")
    Call <Reservation[]> get_reservation_list(@Path("item_index")int item_index);
    @GET("reservation_list/{item_index}/{reservation_index}")//get_reservation_list_of_user()의 결과로 아이템 인덱스와 그에 상응하는 예약 리스트
    Call <Reservation> get_reservation_data(@Path("item_index")int item_index, @Path("reservation_index")int reservation_index);




//유저 정보 관련
    //유저 사진 get, post
    @GET("images/profile/{user_index}")//베이스 64인코딩된 사진을 리턴 받음
    Call<String> get_profile_image(@Path("user_index") String user_id);
    @POST("add/images/profile/{user_id}")//encoded_image는 base64 인코딩 되어 전송 됨.
    Call<String> post_profile_image(@Path("user_id") String user_id,@Body String encoded_image);
    //유저 정보 관련 CRUD
    @GET("users/{user_index}")
    Call <User_DTO> get_user_data(@Path("user_index") int user_index);
    @POST("add/users")
    Call<String> post_new_user(@Body User_DTO user_dto);
    @PATCH("edit/users/{user_index}")
    Call<String> edit_user(@Path("user_index") int user_index,@Body User_DTO user_dto);
    @DELETE("delete/users/{user_index}")
    Call<String> delete_user(@Path("user_index") int user_index);
    //유저가 빌린 내역을 가져오는 함수
    @GET("reservation/user/{user_index}")
    Call<Reservation_pointer[]> get_reservation_list_of_user(@Path("user_index")int user_index);

}
