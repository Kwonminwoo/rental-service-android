package com.example.rental_service._Network_retrofit2;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
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
    retrofit2.http.HTTP 메서드 종류에대한 노테이션과 함수 정의 부분은 1대1로 매칭됩니다.

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
    43.200.172.82:8081/comments/2022-02-21로 get 요청을 보낼 것 입니다.*/



}
