package io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import java.util.Objects;

/* loaded from: classes3.dex */
public class CookieManagerHostApiImpl implements GeneratedAndroidWebView.CookieManagerHostApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;
    private final CookieManagerProxy proxy;
    private final AndroidSdkChecker sdkChecker;

    /* loaded from: classes3.dex */
    interface AndroidSdkChecker {
        boolean sdkIsAtLeast(int i10);
    }

    /* loaded from: classes3.dex */
    static class CookieManagerProxy {
        CookieManagerProxy() {
        }

        public CookieManager getInstance() {
            return CookieManager.getInstance();
        }
    }

    public CookieManagerHostApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
        this(binaryMessenger, instanceManager, new CookieManagerProxy());
    }

    CookieManagerHostApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager, CookieManagerProxy cookieManagerProxy) {
        this(binaryMessenger, instanceManager, cookieManagerProxy, new AndroidSdkChecker() { // from class: io.flutter.plugins.webviewflutter.b
            @Override // io.flutter.plugins.webviewflutter.CookieManagerHostApiImpl.AndroidSdkChecker
            public final boolean sdkIsAtLeast(int i10) {
                boolean lambda$new$0;
                lambda$new$0 = CookieManagerHostApiImpl.lambda$new$0(i10);
                return lambda$new$0;
            }
        });
    }

    CookieManagerHostApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager, CookieManagerProxy cookieManagerProxy, AndroidSdkChecker androidSdkChecker) {
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.proxy = cookieManagerProxy;
        this.sdkChecker = androidSdkChecker;
    }

    private CookieManager getCookieManagerInstance(Long l10) {
        CookieManager cookieManager = (CookieManager) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(cookieManager);
        return cookieManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }

    private boolean removeCookiesPreL(CookieManager cookieManager) {
        boolean hasCookies = cookieManager.hasCookies();
        if (hasCookies) {
            cookieManager.removeAllCookie();
        }
        return hasCookies;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void attachInstance(Long l10) {
        this.instanceManager.addDartCreatedInstance(this.proxy.getInstance(), l10.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void removeAllCookies(Long l10, final GeneratedAndroidWebView.Result<Boolean> result) {
        boolean sdkIsAtLeast = this.sdkChecker.sdkIsAtLeast(21);
        CookieManager cookieManagerInstance = getCookieManagerInstance(l10);
        if (!sdkIsAtLeast) {
            result.success(Boolean.valueOf(removeCookiesPreL(cookieManagerInstance)));
        } else {
            Objects.requireNonNull(result);
            cookieManagerInstance.removeAllCookies(new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.a
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    GeneratedAndroidWebView.Result.this.success((Boolean) obj);
                }
            });
        }
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void setAcceptThirdPartyCookies(Long l10, Long l11, Boolean bool) {
        if (!this.sdkChecker.sdkIsAtLeast(21)) {
            throw new UnsupportedOperationException("`setAcceptThirdPartyCookies` is unsupported on versions below `Build.VERSION_CODES.LOLLIPOP`.");
        }
        CookieManager cookieManagerInstance = getCookieManagerInstance(l10);
        WebView webView = (WebView) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webView);
        cookieManagerInstance.setAcceptThirdPartyCookies(webView, bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi
    public void setCookie(Long l10, String str, String str2) {
        getCookieManagerInstance(l10).setCookie(str, str2);
    }
}
