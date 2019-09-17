package cn.gxy.text_net;

import android.app.Application;

import cn.gxy.isolation_image_processor.realSubject.PicassoProcessor;
import cn.gxy.isolation_image_processor.subjectProxy.ImageHelper;
import cn.gxy.isolation_processor.http_processor.realSubject.VolleyProcessor;
import cn.gxy.isolation_processor.http_processor.subjectProxy.HttpHelper;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //一行代码切换网络框架
        HttpHelper.init(new VolleyProcessor(this));
//        HttpHelper.init(new OkHttpProcessor());
//        HttpHelper.init(new XUtilsProcessor(this));


        //一行代码切换图片加载框架
//        ImageHelper.init(new GlideProcessor(this));
        ImageHelper.init(new PicassoProcessor(this));

//        ImageHelper.init(new FresoProcessor(this));


    }
}
