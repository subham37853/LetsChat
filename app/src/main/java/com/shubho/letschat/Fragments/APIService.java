package com.shubho.letschat.Fragments;


import com.shubho.letschat.Notifications.MyResponse;
import com.shubho.letschat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAArR0yL4g:APA91bG65Pe74V4ntqxI9c5cd7hWKPNzBSiulJej02rJMZ-efGUCZC8W0X3z801HakgW0gc1lfTVllF_eSZx5Yt0_1APPMYG0sjVyaQihqyruHqpmiGXzjnjePy3TOZxVOULD8nTo6ds"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
