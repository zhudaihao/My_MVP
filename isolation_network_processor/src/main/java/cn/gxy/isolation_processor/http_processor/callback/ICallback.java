package cn.gxy.isolation_processor.http_processor.callback;

/**
 * 顶层回调接口（扩展性 对应子类可以解析不同格式 比如Jason ，xml...）
 */
public interface ICallback {

    void onSuccess(String result);
    void onFailure(String error);


}
