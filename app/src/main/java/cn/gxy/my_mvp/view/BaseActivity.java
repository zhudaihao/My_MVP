package cn.gxy.my_mvp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cn.gxy.my_mvp.presenter.BasePresenter;

public abstract class BaseActivity<T extends BasePresenter, V extends IBaseView> extends AppCompatActivity {

    /**
     * 表示层
     */
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //选择对应的表示层
        presenter = createPresenter();

        //绑定表示层
        if (presenter != null) {
            presenter.attachView((V) this);
        }


    }

    /**
     * 具体创建哪个表示层由子类选择，创建
     */
    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解绑表示层
        if (presenter != null) {
            presenter.detachView();
        }
    }


}
