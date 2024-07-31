package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

/* loaded from: classes3.dex */
public class WebSettingsHostApiImpl implements GeneratedAndroidWebView.WebSettingsHostApi {
    private final InstanceManager instanceManager;
    private final WebSettingsCreator webSettingsCreator;

    /* loaded from: classes3.dex */
    public static class WebSettingsCreator {
        public WebSettings createWebSettings(WebView webView) {
            return webView.getSettings();
        }
    }

    public WebSettingsHostApiImpl(InstanceManager instanceManager, WebSettingsCreator webSettingsCreator) {
        this.instanceManager = instanceManager;
        this.webSettingsCreator = webSettingsCreator;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void create(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        this.instanceManager.addDartCreatedInstance(this.webSettingsCreator.createWebSettings(webView), l10.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public String getUserAgentString(Long l10) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        return webSettings.getUserAgentString();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setAllowFileAccess(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setAllowFileAccess(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setBuiltInZoomControls(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setBuiltInZoomControls(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setDisplayZoomControls(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setDisplayZoomControls(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setDomStorageEnabled(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setDomStorageEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setJavaScriptCanOpenWindowsAutomatically(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setJavaScriptEnabled(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setJavaScriptEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setLoadWithOverviewMode(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setLoadWithOverviewMode(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setMediaPlaybackRequiresUserGesture(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setSupportMultipleWindows(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setSupportMultipleWindows(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setSupportZoom(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setSupportZoom(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setTextZoom(Long l10, Long l11) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setTextZoom(l11.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setUseWideViewPort(Long l10, Boolean bool) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setUseWideViewPort(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi
    public void setUserAgentString(Long l10, String str) {
        WebSettings webSettings = (WebSettings) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webSettings);
        webSettings.setUserAgentString(str);
    }
}
