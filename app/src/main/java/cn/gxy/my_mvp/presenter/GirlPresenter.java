package cn.gxy.my_mvp.presenter;

import java.util.List;

import cn.gxy.my_mvp.bean.GirlBean;
import cn.gxy.my_mvp.model.GirlModel;
import cn.gxy.my_mvp.model.IGirlModel;
import cn.gxy.my_mvp.view.IGirlView;

/**
 * 表示层
 */
public class GirlPresenter<T extends IGirlView> extends BasePresenter<T> {

    //持有model对象
    private IGirlModel iGirlModel = new GirlModel();

    /**
     * 实现IGirlView 的逻辑
     */

    public void fetch() {

        if (iBaseView.get() != null && iGirlModel != null) {

            //通过IModel的回调获取数据
            iGirlModel.loadData(new IGirlModel.IGirlData() {
                @Override
                public void getData(List<GirlBean> list) {

                    //实现view对应的接口，把数据返回给view层的实现类
                    iBaseView.get().getGirlData(list);


                }
            });
        }
    }


}
