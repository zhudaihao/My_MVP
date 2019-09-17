package cn.gxy.my_mvp.view;

import java.util.List;

import cn.gxy.my_mvp.bean.HomeBean;

/**
 * view层 逻辑抽离层接口，具体实现交给表示层
 */
public interface IHomeView extends IBaseView {

    void getGirlData(List<HomeBean> homeBeans);

}
