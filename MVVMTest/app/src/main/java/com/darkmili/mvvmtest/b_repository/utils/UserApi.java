package com.darkmili.mvvmtest.b_repository.utils;

import com.darkmili.mvvmtest.a_hello_mvvm.Bean.User;
import com.darkmili.mvvmtest.b_repository.bean.MyCallBack;
import com.darkmili.mvvmtest.b_repository.bean.data;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserApi {
//    final String Token="iBPOWAGy7dk0NmN8";
    /**
     * GET 通过用户名查询
     *
     * @param a,b 请求参数
     * @return
     */
    @GET("/v2.5/iBPOWAGy7dk0NmN8/{a},{b}/weather.json")
    Call<data> queryUserByLocation(@Path("a") double a, @Path("b") double b);

    @GET("/v2.5/{token}/121.6544,25.1552/realtime.json")
    Call<MyCallBack> queryUserByCallback(@Path("token") String Token);

    @POST("/v2.5/iBPOWAGy7dk0NmN8/weather.json")
    Call<ResponseBody> queryUserByCallba(@Body User user);
}
