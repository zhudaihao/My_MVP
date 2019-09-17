package cn.gxy.isolation_image_processor.subjectProxy;

import android.widget.ImageView;

import java.util.Map;

import cn.gxy.isolation_image_processor.subject.IImageProcessor;

/**
 * 业务员
 * 代理人
 */
public class ImageHelper implements IImageProcessor {
    /**
     * 单利
     */
    private ImageHelper() {
    }

    private static ImageHelper imageHelper;


    public static ImageHelper obtain() {
        synchronized (ImageHelper.class) {
            if (imageHelper == null) {
                imageHelper = new ImageHelper();
            }
            return imageHelper;
        }
    }


    //持有业主的父类
    private static IImageProcessor mIImageProcessor;

    /**
     * 切换业主方法
     *
     * @param iImageProcessor
     */
    public static void init(IImageProcessor iImageProcessor) {
        mIImageProcessor = iImageProcessor;
    }


    /**
     * 暴露给客户使用的方法
     *
     * @param imageUrl  图片地址
     * @param map       其他属性配置 比如预加载图片 错误图片。。。。
     * @param imageView 加载图片的组件对象
     */
    @Override
    public void load(String imageUrl, Map<String, Object> map, ImageView imageView) {

        //调用业主父类方法，具体业主实现对应方法
        mIImageProcessor.load(imageUrl, map, imageView);
    }


}
