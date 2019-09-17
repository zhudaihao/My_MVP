package cn.gxy.my_mvp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import cn.gxy.my_mvp.adapter.GirlAdapter;
import cn.gxy.my_mvp.bean.GirlBean;
import cn.gxy.my_mvp.presenter.GirlPresenter;
import cn.gxy.my_mvp.view.BaseActivity;
import cn.gxy.my_mvp.view.IGirlView;

/**
 * mvp
 */
public class MainActivity extends BaseActivity<GirlPresenter<IGirlView>, IGirlView> implements IGirlView {

    private ListView listView;
    private GirlAdapter girlAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lv);

        //表示层 实现对应逻辑
        presenter.fetch();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
            }
        });

    }

    /**
     * 创建对应表示层
     */
    @Override
    protected GirlPresenter<IGirlView> createPresenter() {
        return new GirlPresenter();
    }


    /**
     * activity需要获取哪个结果，就实现对应接口
     *
     * @param girlBeans
     */
    @Override
    public void getGirlData(List<GirlBean> girlBeans) {
        girlAdapter = new GirlAdapter(girlBeans, this);
        listView.setAdapter(girlAdapter);

    }


}
