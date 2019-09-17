package cn.gxy.my_mvp.presenter;

import java.util.List;

import cn.gxy.my_mvp.bean.HomeBean;
import cn.gxy.my_mvp.model.HomeModel;
import cn.gxy.my_mvp.model.IHomeModel;
import cn.gxy.my_mvp.view.IBaseView;
import cn.gxy.my_mvp.view.IHomeView;

public class HomePresenter<T extends IBaseView> extends BasePresenter<T> {
    //持有model
    private IHomeModel iHomeModel = new HomeModel();

    @Override
    public void fetch() {

        iHomeModel.loadData(new IHomeModel.IHomeData() {
            @Override
            public void getData(List<HomeBean> list) {

            IHomeView iHomeView= (IHomeView) iBaseView.get();

            iHomeView.getGirlData(list);


            }
        });

    }


}
