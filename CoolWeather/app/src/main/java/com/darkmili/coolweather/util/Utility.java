package com.darkmili.coolweather.util;

import android.text.TextUtils;

import com.darkmili.coolweather.db.City;
import com.darkmili.coolweather.db.County;
import com.darkmili.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 解析处理JSON格式,分别处理省市区JSON格式的数据
 */
public class Utility {
    public static boolean handleProvinceResponse(String response){
        try {
            JSONArray array=new JSONArray(response);
            for (int i=0;i<array.length();i++){
                JSONObject jsonObject = array.getJSONObject(i);
                Province province = new Province();
                province.setId(jsonObject.getInt("id"));
                province.setCityName(jsonObject.getString("name"));
                province.save();
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean handleCityResponse(String response,int provinceId){
        try {
            JSONArray jsonArray = new JSONArray(response);
            for (int i=0;i<jsonArray.length();i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                City city = new City();
                city.setId(jsonObject.getInt("id"));
                city.setName(jsonObject.getString("name"));
                city.setProvinceId(provinceId);
                city.save();

            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean handleCountyResponse(String response,int cityId){
        try {
            JSONArray jsonArray = new JSONArray(response);
            for (int i=0;i<jsonArray.length();i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                County county = new County();
                county.setName(jsonObject.getString("name"));
                county.setWeatherId(jsonObject.getString("weather_id"));
                county.setCityId(cityId);
                county.save();

            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
}
