package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

/* loaded from: classes3.dex */
public class WebViewFlutterApiImpl {
    private GeneratedAndroidWebView.WebViewFlutterApi api;
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public WebViewFlutterApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.api = new GeneratedAndroidWebView.WebViewFlutterApi(binaryMessenger);
    }

    public void create(WebView webView, GeneratedAndroidWebView.WebViewFlutterApi.Reply<Void> reply) {
        if (this.instanceManager.containsInstance(webView)) {
            return;
        }
        this.api.create(Long.valueOf(this.instanceManager.addHostCreatedInstance(webView)), reply);
    }

    public void onScrollChanged(WebView webView, Long l10, Long l11, Long l12, Long l13, GeneratedAndroidWebView.WebViewFlutterApi.Reply<Void> reply) {
        GeneratedAndroidWebView.WebViewFlutterApi webViewFlutterApi = this.api;
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        webViewFlutterApi.onScrollChanged(identifierForStrongReference, l10, l11, l12, l13, reply);
    }

    void setApi(GeneratedAndroidWebView.WebViewFlutterApi webViewFlutterApi) {
        this.api = webViewFlutterApi;
    }
}
