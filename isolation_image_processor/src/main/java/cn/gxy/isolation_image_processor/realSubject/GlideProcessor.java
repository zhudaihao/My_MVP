package cn.gxy.isolation_image_processor.realSubject;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Map;

import cn.gxy.isolation_image_processor.subject.IImageProcessor;

/**
 * 业主
 *
 * 具体主体
 */
public class GlideProcessor implements IImageProcessor {


    private Context context;
    public GlideProcessor(Context context) {
        this.context = context;
    }


    @Override
    public void load(String imageUrl, Map<String, Object> map, ImageView imageView) {
        //滑翔
        Glide.with(context)
                .load(imageUrl)
                .centerCrop()
                .into(imageView);
    }
}
