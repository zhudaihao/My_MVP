package cn.gxy.my_mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.util.List;

import cn.gxy.my_mvp.bean.HomeBean;
import cn.gxy.my_mvp.presenter.HomePresenter;
import cn.gxy.my_mvp.view.BaseActivity;
import cn.gxy.my_mvp.view.IHomeView;

public class HomeActivity extends BaseActivity<HomePresenter<IHomeView>, IHomeView> implements IHomeView {

    private WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();


        //表示层 实现对应逻辑
        presenter.fetch();

    }

    private void initView() {
        webView = findViewById(R.id.webView);
        /* 设置支持Js,必须设置的,基本大多数网页都涉及js */
        webView.getSettings().setJavaScriptEnabled(true);
        /* 设置为true时表示支持使用js打开新的窗口 */
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        /* 当网页需要保存数时据,设置下面属性 */
        webView.getSettings().setDomStorageEnabled(true);
        /* 设置为使用webview推荐的窗口，主要是为了配合下一个属性 */
        webView.getSettings().setUseWideViewPort(true);
        /* 设置网页自适应屏幕大小，该属性必须和上一属性配合使用 */
        webView.getSettings().setLoadWithOverviewMode(true);
        /* 启用还H5的地理定位服务 */
        webView.getSettings().setGeolocationEnabled(true);
        /* 设置是否允许webview使用缩放的功能 */
        webView.getSettings().setBuiltInZoomControls(false);
        /* 提高网页渲染的优先级 */
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        /* 设置是否显示水平滚动条 */
        webView.setHorizontalScrollBarEnabled(false);
        /* 设置垂直滚动条是否有叠加样式 */
        webView.setVerticalScrollbarOverlay(true);
        /* 设置滚动条的样式 */
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
    }

    @Override
    protected HomePresenter<IHomeView> createPresenter() {
        return new HomePresenter<>();
    }


    @Override
    public void getGirlData(List<HomeBean> homeBeans) {

        if (homeBeans != null)
            webView.loadUrl(homeBeans.get(0).getUri());
    }


}
