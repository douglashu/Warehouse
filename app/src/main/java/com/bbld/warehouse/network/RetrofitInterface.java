package com.bbld.warehouse.network;

import com.bbld.warehouse.bean.AddOrderLogisticsInfo;
import com.bbld.warehouse.bean.GetLogisticsList;
import com.bbld.warehouse.bean.GetLogisticsTrackInfo;
import com.bbld.warehouse.bean.GetOrderLogisticsInfo;
import com.bbld.warehouse.bean.IndexInfo;
import com.bbld.warehouse.bean.Login;
import com.bbld.warehouse.bean.OrderDetails;
import com.bbld.warehouse.bean.OrderList;
import com.bbld.warehouse.bean.OrderSend;
import com.bbld.warehouse.bean.ScanCode;
import com.bbld.warehouse.bean.VersionAndroid;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Created by young on 2016/11/6.
 */

public interface RetrofitInterface {
    /**
     * 测试
     */
    @GET("GetVersionAndroid.aspx")
    Call<VersionAndroid> getVersionAndroid();
    /**
     * 登录
     */
//    @FormUrlEncoded
//    @POST("Admin/Login")
//    Call<Login> login(@Field("acc") String acc, @Field("pwd") String pwd);
    @GET("Admin/Login")
    Call<Login> login(@Query("acc") String acc, @Query("pwd") String pwd);
    /**
     * 首页接口
     */
//    @FormUrlEncoded
//    @POST("Admin/indexinfo")
//    Call<IndexInfo> indexinfo(@Field("token") String token);
    @GET("Admin/indexinfo")
    Call<IndexInfo> indexinfo(@Query("token") String token);
    /**
     * 订单列表接口
     */
//    @FormUrlEncoded
//    @POST("Order/OrderList")
//    Call<OrderList> orderList(@Field("token") String token, @Field("status") int status);
    @GET("Order/OrderList")
    Call<OrderList> orderList(@Query("token") String token, @Query("status") int status, @Query("page") int page, @Query("pagesize") int pagesize);
    /**
     * 订单详情接口
     */
//    @FormUrlEncoded
//    @POST("Order/OrderList")
//    Call<OrderDetails> orderDetails(@Field("token") String token, @Field("invoiceid") int invoiceid);
    @GET("Order/OrderDetails")
    Call<OrderDetails> orderDetails(@Query("token") String token, @Query("invoiceid") int invoiceid);
    /**
     * 扫码查询接口
     */
//    @FormUrlEncoded
//    @POST("Order/ScanCode")
//    Call<ScanCode> scanCode(@Field("token") String token, @Field("invoiceid") int invoiceid, @Field("productId") int productId, @Field("code") String code);
    @GET("Order/ScanCode")
    Call<ScanCode> scanCode(@Query("token") String token, @Query("invoiceid") int invoiceid, @Query("productId") int productId, @Query("code") String code);
    /**
     * 订单出库接口
     */
    @FormUrlEncoded
    @POST("Order/OrderSend")
    Call<OrderSend> orderSend(@Field("token") String token, @Field("invoiceid") int invoiceid, @Field("codejson") String codejson);
//    @GET("Order/OrderSend")
//    Call<OrderSend> orderSend(@Query("token") String token, @Query("invoiceid") int invoiceid, @Query("codejson") String codejson);
    /**
     * 获取物流公司字典接口
     */
//    @FormUrlEncoded
//    @POST("Order/GetLogisticsList")
//    Call<GetLogisticsList> getLogisticsList();
    @GET("Order/GetLogisticsList")
    Call<GetLogisticsList> getLogisticsList(@Query("token") String token);
    /**
     * 增加物流信息接口
     */
//    @FormUrlEncoded
//    @POST("Order/AddOrderLogisticsInfo")
//    Call<AddOrderLogisticsInfo> addOrderLogisticsInfo(@Field("token") String token, @Field("invoiceid") int invoiceid, @Field("logisticsId") int logisticsId, @Field("number") String number);
    @GET("Order/AddOrderLogisticsInfo")
    Call<AddOrderLogisticsInfo> addOrderLogisticsInfo(@Query("token") String token, @Query("invoiceid") int invoiceid, @Query("logisticsId") int logisticsId, @Query("number") String number);
    /**
     * 物流信息查询接口
     */
//    @FormUrlEncoded
//    @POST("Order/GetOrderLogisticsInfo")
//    Call<GetOrderLogisticsInfo> getOrderLogisticsInfo(@Field("token") String token, @Field("invoiceid") int invoiceid);
    @GET("Order/GetOrderLogisticsInfo")
    Call<GetOrderLogisticsInfo> getOrderLogisticsInfo(@Query("token") String token, @Query("invoiceid") int invoiceid);
    /**
     * 物流跟踪查询接口
     */
//    @FormUrlEncoded
//    @POST("Order/GetLogisticsTrackInfo")
//    Call<GetLogisticsTrackInfo> getLogisticsTrackInfo(@Field("token") String token, @Field("logisticsId") int logisticsId, @Field("number") String number);
    @GET("Order/GetLogisticsTrackInfo")
    Call<GetLogisticsTrackInfo> getLogisticsTrackInfo(@Query("token") String token, @Query("logisticsId") int logisticsId, @Query("number") String number);
}
