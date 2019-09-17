package cn.gxy.isolation_processor.http_processor.subject;

import android.support.annotation.NonNull;

import java.util.Map;

import cn.gxy.isolation_processor.http_processor.callback.ICallback;

/**
 * 代理
 * 房产公司
 */
public interface IHttpProcessor {

    /**
     * 网络操作 get post del update pu ...
     */
    void post(@NonNull String url, @NonNull Map<String, Object> map, @NonNull ICallback iCallBack);

}
