package com.vivi.music.network;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static com.vivi.music.network.RequestMaker.Method.GET;
import static com.vivi.music.network.RequestMaker.Method.POST;
import static com.vivi.music.network.RequestMaker.Mode.API;
import static com.vivi.music.network.RequestMaker.Mode.STRING;

/**
 * Created by vivi on 2016/8/31.
 */
public abstract class RequestMaker {

    public static String BASE_URl = "http://116.196.87.226:8080/";
    protected Context context;
    private String tag;
    private int failedTime = 30000;
    private static RequestQueue queue;
    private HashMap<String,String> map = new HashMap<>();
    private ProgressDialog dialog;

    public RequestMaker(Context context, String url) {
        this.context = context;
        setParams(map);
        requestGet(url);
    }

    public RequestMaker(Context context, Method method, String url) {
        this.context = context;
        setParams(map);
        if (method == GET) requestGet(url);
        else if (method == POST) requestPost(url);
    }

    public RequestMaker(Context context, Method method, String url, String tag) {
        this.context = context;
        this.tag = tag;
        setParams(map);
        if (method == GET) requestGet(url);
        else if (method == POST) requestPost(url);
    }

    public RequestMaker(Context context, Method method, String url, boolean enableDialog) {
        if (enableDialog && dialog == null){
            dialog = new ProgressDialog(context);
            dialog.setTitle("加载中，请稍等");
            dialog.setCancelable(false);
            dialog.show();
        }
        this.context = context;
        setParams(map);
        if (method == GET) requestGet(url);
        else if (method == POST) requestPost(url);
    }

    public RequestMaker(Context context, Method method, String url, boolean enableDialog, String tag) {
        if (enableDialog && dialog == null){
            dialog = new ProgressDialog(context);
            dialog.setTitle("加载中，请稍等");
            dialog.setCancelable(false);
            dialog.show();
        }
        this.context = context;
        this.tag = tag;
        setParams(map);
        if (method == GET) requestGet(url);
        else if (method == POST) requestPost(url);
    }

    public RequestMaker(Context context, String url, Mode mode) {
        this.context = context;
        setParams(map);
        if (mode == API){
            requestGet(url);
        }
        else if (mode == STRING){
            requestStringGet(url);
        }
    }

    public RequestMaker(Context context, Method method, String url, Mode mode) {
        this.context = context;
        setParams(map);
        if (mode == API){
            if (method == GET) requestGet(url);
            else if (method == POST) requestPost(url);
        }
        else if (mode == STRING){
            if (method == GET) requestStringGet(url);
            else if (method == POST) requestStringPost(url);
        }
    }

    public RequestMaker(Context context, Method method, String url, Mode mode,boolean enableDialog) {
        if (enableDialog && dialog == null){
            dialog = new ProgressDialog(context);
            dialog.setTitle("加载中，请稍等");
            dialog.setCancelable(false);
            dialog.show();
        }
        this.context = context;
        setParams(map);
        if (mode == API){
            if (method == GET) requestGet(url);
            else if (method == POST) requestPost(url);
        }
        else if (mode == STRING){
            if (method == GET) requestStringGet(url);
            else if (method == POST) requestStringPost(url);
        }
    }

    public RequestMaker(Context context, Method method, String url, Mode mode,  boolean enableDialog, String tag) {
        if (enableDialog && dialog == null){
            dialog = new ProgressDialog(context);
            dialog.setTitle("加载中，请稍等");
            dialog.setCancelable(false);
            dialog.show();
        }
        this.context = context;
        this.tag = tag;
        setParams(map);
        if (mode == API){
            if (method == GET) requestGet(url);
            else if (method == POST) requestPost(url);
        }
        else if (mode == STRING){
            if (method == GET) requestStringGet(url);
            else if (method == POST) requestStringPost(url);
        }
    }

    public enum Method {
        GET, POST
    }

    public enum Mode {
        API, STRING
    }

    public static void init(Context context){
        queue = Volley.newRequestQueue(context);
    }

    private void requestGet(String url){
        final StringBuilder builderUrl = new StringBuilder();
        builderUrl.append(url);
        if (map.size() != 0){
            builderUrl.append("?");
            for (Object object : map.entrySet()) {
                Map.Entry entry = (Map.Entry) object;
                String key = (String) entry.getKey();
                String val = (String) entry.getValue();
                builderUrl.append("&");
                builderUrl.append(key);
                builderUrl.append("=");
                builderUrl.append(val);
                if (tag != null){
                    Log.e("response", tag + "=>" + "param: " + key + "=" + val);
                }
            }
        }
        queue.add(new StringRequest(Request.Method.GET, BASE_URl + builderUrl.toString(), new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                int state = 0;
                String data = null;
                try {
                    JSONObject response= new JSONObject(s);
                    state = response.getInt("state");
                    if (state == 0){
                        onError(response.getInt("code"),response.getString("msg"));
                    }
                    else if (state == 1){
                        data =  response.getString("data");
                        onSuccess(data);
                    }
                    else {
                        Toast.makeText(context, "网络连接失败", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    onJsonAnalysisError();
                }
                finally {
                    if (tag != null){
                        Log.e("response",tag + "=>"+ "url=" + BASE_URl + builderUrl.toString());
                        Log.e("response",tag + "=>"+ "response=" + s);
                        Log.e("response",tag + "=>"+ "state=" + state);
                        if (data != null){
                            Log.e("response",tag + "=>"+ "data=" + data);
                        }
                        else {
                            Log.e("response",tag + "=>"+ "data=" + "no data in response");
                        }
                    }
                    if (dialog != null){
                        dialog.dismiss();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                if (dialog != null){
                    dialog.dismiss();
                }
                onFail();
            }
        }){
            @Override
            public void setRetryPolicy(RetryPolicy retryPolicy) {
                super.setRetryPolicy(new DefaultRetryPolicy(failedTime,0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            }
        });
    }

    private void requestStringGet(String url){
        final StringBuilder builderUrl = new StringBuilder();
        builderUrl.append(url);
        if (map.size() != 0){
            builderUrl.append("?");
            for (Object object : map.entrySet()) {
                Map.Entry entry = (Map.Entry) object;
                String key = (String) entry.getKey();
                String val = (String) entry.getValue();
                builderUrl.append("&");
                builderUrl.append(key);
                builderUrl.append("=");
                builderUrl.append(val);
                if (tag != null){
                    Log.e("response", tag + "=>" + "param: " + key + "=" + val);
                }
            }
        }
        queue.add(new StringRequest(Request.Method.GET, builderUrl.toString(), new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                try {
                    onSuccess(s);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                finally {
                    if (tag != null){
                        Log.e("response",tag + "=>"+ "url=" +  builderUrl.toString());
                        Log.e("response",tag + "=>"+ "response=" + s);
                    }
                    if (dialog != null){
                        dialog.dismiss();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                if (dialog != null){
                    dialog.dismiss();
                }
                onFail();
            }
        }){
            @Override
            public void setRetryPolicy(RetryPolicy retryPolicy) {
                super.setRetryPolicy(new DefaultRetryPolicy(failedTime,0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            }
        });
    }

    private void requestPost(final String url){
        queue.add(new StringRequest(Request.Method.POST, BASE_URl + url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                int state = 0;
                String data = null;
                try {
                    JSONObject response= new JSONObject(s);
                    state = response.getInt("state");
                    if (state == 0){
                        onError(response.getInt("code"),response.getString("msg"));
                    }
                    else if (state == 1){
                        data =  response.getString("data");
                        onSuccess(data);
                    }
                    else {
                        toast("网络连接失败");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    onJsonAnalysisError();
                }
                finally {
                    if (tag != null){
                        StringBuilder builderUrl = new StringBuilder();
                        builderUrl.append(url);
                        if (map.size() != 0){
                            builderUrl.append("?");
                            for (Object object : map.entrySet()) {
                                Map.Entry entry = (Map.Entry) object;
                                String key = (String) entry.getKey();
                                String val = (String) entry.getValue();
                                builderUrl.append(key);
                                builderUrl.append("=");
                                builderUrl.append(val);
                                builderUrl.append("&");
                                Log.e("response", tag + "=>" + "param: " + key + "=" + val);
                            }
                            builderUrl.deleteCharAt(builderUrl.length()-1);
                        }
                        Log.e("response",tag + "=>"+ "url=" + BASE_URl + builderUrl.toString());
                        Log.e("response",tag + "=>"+ "response=" + s);
                        Log.e("response",tag + "=>"+ "state=" + state);
                        if (data != null){
                            Log.e("response",tag + "=>"+ "data=" + data);
                        }
                        else {
                            Log.e("response",tag + "=>"+ "data=" + "no data in response");
                        }
                    }
                    if (dialog != null){
                        dialog.dismiss();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                if (dialog != null){
                    dialog.dismiss();
                }
                onFail();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return map;
            }

            @Override
            public void setRetryPolicy(RetryPolicy retryPolicy) {
                super.setRetryPolicy(new DefaultRetryPolicy(failedTime,0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            }
        });
    }

    private void requestStringPost(final String url){
        queue.add(new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                try {
                    onSuccess(s);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                finally {
                    if (tag != null){
                        StringBuilder builderUrl = new StringBuilder();
                        builderUrl.append(url);
                        if (map.size() != 0){
                            builderUrl.append("?");
                            for (Object object : map.entrySet()) {
                                Map.Entry entry = (Map.Entry) object;
                                String key = (String) entry.getKey();
                                String val = (String) entry.getValue();
                                builderUrl.append(key);
                                builderUrl.append("=");
                                builderUrl.append(val);
                                builderUrl.append("&");
                                Log.e("response", tag + "=>" + "param: " + key + "=" + val);
                            }
                            builderUrl.deleteCharAt(builderUrl.length()-1);
                        }
                        Log.e("response",tag + "=>"+ "url=" + builderUrl.toString());
                        Log.e("response",tag + "=>"+ "response=" + s);
                    }
                    if (dialog != null){
                        dialog.dismiss();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                if (dialog != null){
                    dialog.dismiss();
                }
                onFail();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return map;
            }

            @Override
            public void setRetryPolicy(RetryPolicy retryPolicy) {
                super.setRetryPolicy(new DefaultRetryPolicy(failedTime,0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            }
        });
    }

    protected abstract void onSuccess(String response) throws JSONException;

    protected void onJsonAnalysisError(){
        if (tag != null){
            toast("解析错误");
            Log.e("response",tag + "=>json解析失败，onSuccuss()中的程序可能没有完全执行，请核对data中的json数据");
        }
    }

    protected void onFail(){
        toast("网络连接失败");
    }

    protected void onError(int code,String message){
        toast(message);
    }

    protected void setParams(HashMap<String,String> map){

    }

    protected void setFailedTime(int failedTime) {
        this.failedTime = failedTime;
    }

    private void toast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    private void toast(int id) {
        Toast.makeText(context, context.getResources().getString(id), Toast.LENGTH_SHORT).show();
    }
}