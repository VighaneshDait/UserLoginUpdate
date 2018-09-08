package com.example.user.userloginupdate.ApiSource;

import com.example.user.userloginupdate.Models.CallRawDataResponse;
import com.example.user.userloginupdate.Models.DeviceRequestModel;
import com.example.user.userloginupdate.Models.GetAllFollowupResponse;
import com.example.user.userloginupdate.Models.GetEmployeeDetailsResponse;
import com.example.user.userloginupdate.Models.GetFollowupDetailsResponse;
import com.example.user.userloginupdate.Models.GetMyProfileResponse;
import com.example.user.userloginupdate.Models.ResendOTPResponse;
import com.example.user.userloginupdate.Models.UserLoginRequest;
import com.example.user.userloginupdate.Models.UserLoginResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("authentication/ResendOTP")
     Call<List<ResendOTPResponse>> getOtp();

    @GET("authentication/GetMyProfile")
    Call<List<GetMyProfileResponse>> getProfile();

    @GET("ClientCall/CallRawData")
    Call<List<CallRawDataResponse>> getRawData();

    @GET("Employee/GetEmployeeDetails")
    Call<List<GetEmployeeDetailsResponse>> getEmployeeDetails(@Query("UserId") String userid);

    @GET("Followup/GetAllFollowup")
    Call<List<GetAllFollowupResponse>> getAllFollowup();

    @GET("Followup/GetFollowupDetails")
    Call<List<GetFollowupDetailsResponse>> getFollowupDetailsRespose(@Query("UserId") String userid);

    @GET("Followup/GetEmployeeFollowup")
    Call<List<GetEmployeeDetailsResponse>> getEmployeeDetailsResponse(@Query("UserId") String userid);

    @GET("Lead/ReSendLeadOTP")
    Call<List<ResendOTPResponse>> getLeadReSendLeadOTP(@Query("UserId") String userid,
                                                       @Query("FirstName") String firstname,
                                                       @Query("MiddleName") String Middlename,
                                                       @Query("LastName") String lastname,
                                                       @Query("ContactNo1") String contactno,
                                                       @Query("AreaId") String areaid);


    @FormUrlEncoded
    @POST("authentication/UserLogin")
    Call<UserLoginRequest> getUser(@Field("username") String username,
                                   @Field("password") String password);

    @FormUrlEncoded
    @POST("authentication/RegisterDevice")
    Call<DeviceRequestModel> getDeviceRequestModel(@Field("username") String username,
                                     @Field("password") String password,
                                     @Field("androidid") String androidid,
                                     @Field("deviceid") String deviceid,
                                     @Field("manufacturer") String manufacturer,
                                     @Field("model") String model,
                                     @Field("Brand") String brand);





}
