package com.example.salman.blooddonationpost;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Salman on 12/17/2017.
 */

public interface DonorAPI {
    @POST("api/donors")
    @FormUrlEncoded
    Call<Donor> saveDonor(@Field("first_name")String first_name,
                          @Field("last_name") String last_name,
                          @Field("phone_number") int phone_number,
                          @Field("age") int age,
                          @Field("email") String email,
                          @Field("blood_group_id") int blood_group_id);
    @POST("api/donors")
    Call<Donor> saveDonor(@Body Donor donor);
}
