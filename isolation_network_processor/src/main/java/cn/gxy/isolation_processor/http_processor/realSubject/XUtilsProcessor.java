package cn.gxy.isolation_processor.http_processor.realSubject;


import android.app.Application;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.Map;

import cn.gxy.isolation_processor.http_processor.callback.ICallback;
import cn.gxy.isolation_processor.http_processor.subject.IHttpProcessor;

public class XUtilsProcessor implements IHttpProcessor {
    public XUtilsProcessor(Application app){
        x.Ext.init(app);
    }
    @Override
    public void post(String url, Map<String, Object> params,final ICallback callback) {
        RequestParams requestParams=new RequestParams(url);
        x.http().post(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                callback.onSuccess(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}










