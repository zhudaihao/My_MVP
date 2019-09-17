package cn.gxy.isolation_image_processor.realSubject;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Map;

import cn.gxy.isolation_image_processor.subject.IImageProcessor;

/**
 * 业主
 * 具体主体
 */
public class PicassoProcessor implements IImageProcessor {

    private Context context;

    public PicassoProcessor(Context context) {
        this.context = context;
    }

    @Override
    public void load(String imageUrl, Map<String, Object> map, ImageView imageView) {
        //毕加索
        Picasso.with(context)
                .load(imageUrl)
                .into(imageView);


    }
}
