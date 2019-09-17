package cn.gxy.my_mvp.model;

import java.util.ArrayList;
import java.util.List;

import cn.gxy.my_mvp.bean.HomeBean;

public class HomeModel implements IHomeModel {
    @Override
    public void loadData(IHomeData iHomeData) {


        //获取数据
        List<HomeBean> list =new ArrayList();

        HomeBean homeBean1=new HomeBean("https://www.baidu.com/");
        HomeBean homeBean2=new HomeBean("https://ai.taobao.com/?pid=mm_26632323_6762370_107181600323&clk1=b2f7aac6f31cd94f179da92a25668a37");
        list.add(homeBean1);
        list.add(homeBean2);


        //实现接口回调方法
        iHomeData.getData(list);





    }


}
