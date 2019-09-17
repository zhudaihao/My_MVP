package cn.gxy.isolation_processor.http_processor.realSubject;

import java.util.Map;

import cn.gxy.isolation_processor.http_processor.callback.ICallback;
import cn.gxy.isolation_processor.http_processor.subject.IHttpProcessor;

public class RetrofitProcessor implements IHttpProcessor {
    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        //在这里用已经写好的代码来访问网络
    }
}
