package cn.gxy.isolation_processor.http_processor.callback;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 回调接口的接送版本的实现类
 * 用于把网络返回的接送字符串转换成对象（Result就是用户接收的数据类型）
 */
public abstract class HttpCallback<Result> implements ICallback {
    @Override
    public void onSuccess(String result) {
        //把result转换成用户需要的对象
        Gson gson = new Gson();

        //需要得到用户输入的对象 对应的字节码是什么样的；
        Class<?> clz = analysisClassInfo(this);
        Result ibjResult = (Result) gson.fromJson(result, clz);

        //把转好对象交给用户;重写这个
        onSuccess(ibjResult);

    }


    public abstract void onSuccess(Result result);

    /**
     * 获取用户输入类型 对应字节码
     *(获取尖括号类型)
     * @return
     * @Object object
     */
    private Class<?> analysisClassInfo(Object object) {

        //反射获取泛型对象
        //通过getGenericSuperClass方法获取原始数据类型，参数化数据类型，数组
        Type type = object.getClass().getGenericSuperclass();
        //获取所有参数数组  -->Type[]---》<T,V>
        Type[] params=((ParameterizedType)type).getActualTypeArguments();

        return (Class<?>) params[0];
    }

    @Override
    public void onFailure(String error) {

    }
}
