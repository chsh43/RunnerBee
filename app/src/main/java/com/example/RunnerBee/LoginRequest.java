package com.example.RunnerBee;

import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class LoginRequest extends JsonObjectRequest {

    //서버 URL 설정 ( PHP 파일 연동 )
    final static private String URL = "http://cuha.cju.ac.kr/users/login";


    public LoginRequest(JSONObject jsonObject, Response.Listener<JSONObject> listener){
        super(Method.POST, URL, jsonObject, listener, null);

    }
}
