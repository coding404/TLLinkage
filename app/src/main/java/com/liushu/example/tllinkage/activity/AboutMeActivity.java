package com.liushu.example.tllinkage.activity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.liushu.example.tllinkage.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AboutMeActivity extends Activity {

    @Bind(R.id.iv_back)
    ImageView mIvBack;
    @Bind(R.id.tv_title)
    TextView mTvTitle;
    @Bind(R.id.web_view)
    WebView mWebView;
    private WebSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        ButterKnife.bind(this);
        initView();

    }

    private void initView() {
        mTvTitle.setText("版本号：" + getVersionName(this));
        settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true); //如果访问的页面中有Javascript，则mWebView必须设置支持Javascript
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportZoom(true); //支持缩放
        settings.setBuiltInZoomControls(true); //支持手势缩放
        settings.setDisplayZoomControls(false); //是否显示缩放按钮

        // >= 19(SDK4.4)启动硬件加速，否则启动软件加速
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mWebView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
            settings.setLoadsImagesAutomatically(true); //支持自动加载图片
        } else {
            mWebView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
            settings.setLoadsImagesAutomatically(false);
        }

        settings.setUseWideViewPort(true); //将图片调整到适合mWebView的大小
        settings.setLoadWithOverviewMode(true); //自适应屏幕
        settings.setDomStorageEnabled(true);
        settings.setSaveFormData(true);
        settings.setSupportMultipleWindows(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT); //优先使用缓存

        mWebView.setHorizontalScrollbarOverlay(true);
        mWebView.setHorizontalScrollBarEnabled(false);
        mWebView.setOverScrollMode(View.OVER_SCROLL_NEVER); // 取消mWebView中滚动或拖动到顶部、底部时的阴影
        mWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY); // 取消滚动条白边效果
        mWebView.requestFocus();

        mWebView.loadUrl("file:///android_asset/about.html");
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                mIvBack.setVisibility(View.VISIBLE);
                return true;
            }
        });
    }

    // 获取当前应用的版本号
    public static String getVersionName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            String version = packInfo.versionName;
            if (!TextUtils.isEmpty(version)) {
                return version;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @OnClick(R.id.iv_back)
    public void onClick() {
        if (mWebView.canGoBack()) {
            mWebView.goBack();//返回上一页面
            if (!mWebView.canGoBack()) {
                mIvBack.setVisibility(View.INVISIBLE);
            }
        }
    }
}
