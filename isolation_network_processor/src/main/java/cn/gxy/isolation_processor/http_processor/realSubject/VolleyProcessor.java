package cn.gxy.isolation_processor.http_processor.realSubject;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;

import cn.gxy.isolation_processor.http_processor.callback.ICallback;
import cn.gxy.isolation_processor.http_processor.subject.IHttpProcessor;

public class VolleyProcessor implements IHttpProcessor {

    private static RequestQueue mQueue=null;

    public VolleyProcessor(Context context){
        mQueue= Volley.newRequestQueue(context);
    }

    @Override
    public void post(String url, Map<String, Object> params,final ICallback callback) {
        StringRequest stringRequest=new StringRequest(
                Request.Method.POST,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callback.onSuccess(response);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
        mQueue.add(stringRequest);
    }
}










