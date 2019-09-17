package cn.gxy.my_mvp.model;

import java.util.ArrayList;
import java.util.List;

import cn.gxy.my_mvp.R;
import cn.gxy.my_mvp.bean.GirlBean;

/**
 * model实现类
 */
public class GirlModel implements IGirlModel {


    @Override
    public void loadData(IGirlData iGirlData) {
        //获取数据
        List list = new ArrayList();

        GirlBean girlBean1 = new GirlBean(R.mipmap.t1, "丰收");
        GirlBean girlBean2 = new GirlBean(R.mipmap.t2, "大海");
        GirlBean girlBean3 = new GirlBean(R.mipmap.t3, "山");

        list.add(girlBean1);
        list.add(girlBean2);
        list.add(girlBean3);

        //实现接口方法
        iGirlData.getData(list);
    }
}
