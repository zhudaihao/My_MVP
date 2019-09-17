package cn.gxy.text_net;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import cn.gxy.isolation_image_processor.subjectProxy.ImageHelper;

public class MainActivity extends AppCompatActivity {

    private String tag = "zdh";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.iv);

        setNet();

        setImage();

    }

    /**
     * 图片
     */
    private void setImage() {
        String imagePath = "http://img1.imgtn.bdimg.com/it/u=2030204117,2134902278&fm=26&gp=0.jpg";
        ImageHelper.obtain().load(imagePath, null, imageView);
    }

    /**
     * 网络
     */
    private void setNet() {
        //测试隔离层代码
//        String url = "https://v.juhe.cn/historyWeather/citys";
//        HashMap<String, Object> params = new HashMap<>();
//        params.put("province_id", "2");
//        params.put("key", "bb52107206585ab074f5e59a8c73875b");
//        HttpHelper.obtain().post(url, params, new HttpCallback<ResponceData>() {
//            @Override
//            public void onSuccess(ResponceData responceData) {
//
//                Log.e(tag, "--------" + responceData.toString());
//
//            }
//
//
//        });
    }
}
