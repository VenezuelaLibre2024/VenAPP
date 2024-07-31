package io.flutter.plugins.webviewflutter;

import android.webkit.HttpAuthHandler;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

/* loaded from: classes3.dex */
public class HttpAuthHandlerHostApiImpl implements GeneratedAndroidWebView.HttpAuthHandlerHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;

    public HttpAuthHandlerHostApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
    }

    private HttpAuthHandler getHttpAuthHandlerInstance(Long l10) {
        HttpAuthHandler httpAuthHandler = (HttpAuthHandler) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(httpAuthHandler);
        return httpAuthHandler;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi
    public void cancel(Long l10) {
        getHttpAuthHandlerInstance(l10).cancel();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi
    public void proceed(Long l10, String str, String str2) {
        getHttpAuthHandlerInstance(l10).proceed(str, str2);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi
    public Boolean useHttpAuthUsernamePassword(Long l10) {
        return Boolean.valueOf(getHttpAuthHandlerInstance(l10).useHttpAuthUsernamePassword());
    }
}
