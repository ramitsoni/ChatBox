package com.example.chatbox.Fragments;

import com.example.chatbox.Notifications.MyResponse;
import com.example.chatbox.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAb76g2og:APA91bHJDIcg1Gg4B1LWc2mXEy8JrHfLBBl6ZImZyFKbaBLsR7BnS9D-UNNT0W4iZWEBQHgLsRSkje8aNTBm0MXIg_QjNpNgkvZmfuy96phGzIB69Q9TrYWoevvrWk8x75tNFpK5-3GS"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
