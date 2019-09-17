package cn.gxy.isolation_image_processor.subject;

import android.widget.ImageView;



import java.util.Map;


/**
 * 中介公司
 * 代理公司
 */
public interface IImageProcessor {

    void load( String imageUrl,  Map<String, Object> map,  ImageView imageView);

}
