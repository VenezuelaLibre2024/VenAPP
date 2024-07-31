package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

/* loaded from: classes3.dex */
public class CustomViewCallbackHostApiImpl implements GeneratedAndroidWebView.CustomViewCallbackHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public CustomViewCallbackHostApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    private WebChromeClient.CustomViewCallback getCustomViewCallbackInstance(Long l10) {
        WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(customViewCallback);
        return customViewCallback;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackHostApi
    public void onCustomViewHidden(Long l10) {
        getCustomViewCallbackInstance(l10).onCustomViewHidden();
    }
}
