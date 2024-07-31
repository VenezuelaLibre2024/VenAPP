package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.embedding.android.FlutterView;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;
import io.flutter.plugins.webviewflutter.WebChromeClientHostApiImpl;
import io.flutter.plugins.webviewflutter.WebViewHostApiImpl;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class WebViewHostApiImpl implements GeneratedAndroidWebView.WebViewHostApi {
    private final BinaryMessenger binaryMessenger;
    private Context context;
    private final InstanceManager instanceManager;
    private final WebViewProxy webViewProxy;

    /* loaded from: classes3.dex */
    public static class WebViewPlatformView extends WebView implements PlatformView {
        private WebViewFlutterApiImpl api;
        private WebChromeClientHostApiImpl.SecureWebChromeClient currentWebChromeClient;
        private WebViewClient currentWebViewClient;
        private final AndroidSdkChecker sdkChecker;

        /* loaded from: classes3.dex */
        interface AndroidSdkChecker {
            boolean sdkIsAtLeast(int i10);
        }

        public WebViewPlatformView(Context context, BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
            this(context, binaryMessenger, instanceManager, new AndroidSdkChecker() { // from class: io.flutter.plugins.webviewflutter.x4
                @Override // io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewPlatformView.AndroidSdkChecker
                public final boolean sdkIsAtLeast(int i10) {
                    boolean lambda$new$0;
                    lambda$new$0 = WebViewHostApiImpl.WebViewPlatformView.lambda$new$0(i10);
                    return lambda$new$0;
                }
            });
        }

        WebViewPlatformView(Context context, BinaryMessenger binaryMessenger, InstanceManager instanceManager, AndroidSdkChecker androidSdkChecker) {
            super(context);
            this.currentWebViewClient = new WebViewClient();
            this.currentWebChromeClient = new WebChromeClientHostApiImpl.SecureWebChromeClient();
            this.api = new WebViewFlutterApiImpl(binaryMessenger, instanceManager);
            this.sdkChecker = androidSdkChecker;
            setWebViewClient(this.currentWebViewClient);
            setWebChromeClient(this.currentWebChromeClient);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$new$0(int i10) {
            return Build.VERSION.SDK_INT >= i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onScrollChanged$1(Void r02) {
        }

        private FlutterView tryFindFlutterView() {
            ViewParent viewParent = this;
            while (viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
                if (viewParent instanceof FlutterView) {
                    return (FlutterView) viewParent;
                }
            }
            return null;
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public void dispose() {
        }

        @Override // io.flutter.plugin.platform.PlatformView
        public View getView() {
            return this;
        }

        @Override // android.webkit.WebView
        public WebChromeClient getWebChromeClient() {
            return this.currentWebChromeClient;
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            FlutterView tryFindFlutterView;
            super.onAttachedToWindow();
            if (!this.sdkChecker.sdkIsAtLeast(26) || (tryFindFlutterView = tryFindFlutterView()) == null) {
                return;
            }
            tryFindFlutterView.setImportantForAutofill(1);
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onScrollChanged(int i10, int i11, int i12, int i13) {
            super.onScrollChanged(i10, i11, i12, i13);
            this.api.onScrollChanged(this, Long.valueOf(i10), Long.valueOf(i11), Long.valueOf(i12), Long.valueOf(i13), new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.w4
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
                public final void reply(Object obj) {
                    WebViewHostApiImpl.WebViewPlatformView.lambda$onScrollChanged$1((Void) obj);
                }
            });
        }

        void setApi(WebViewFlutterApiImpl webViewFlutterApiImpl) {
            this.api = webViewFlutterApiImpl;
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (!(webChromeClient instanceof WebChromeClientHostApiImpl.SecureWebChromeClient)) {
                throw new AssertionError("Client must be a SecureWebChromeClient.");
            }
            WebChromeClientHostApiImpl.SecureWebChromeClient secureWebChromeClient = (WebChromeClientHostApiImpl.SecureWebChromeClient) webChromeClient;
            this.currentWebChromeClient = secureWebChromeClient;
            secureWebChromeClient.setWebViewClient(this.currentWebViewClient);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.currentWebViewClient = webViewClient;
            this.currentWebChromeClient.setWebViewClient(webViewClient);
        }
    }

    /* loaded from: classes3.dex */
    public static class WebViewProxy {
        public WebViewPlatformView createWebView(Context context, BinaryMessenger binaryMessenger, InstanceManager instanceManager) {
            return new WebViewPlatformView(context, binaryMessenger, instanceManager);
        }

        public void setWebContentsDebuggingEnabled(boolean z10) {
            WebView.setWebContentsDebuggingEnabled(z10);
        }
    }

    public WebViewHostApiImpl(InstanceManager instanceManager, BinaryMessenger binaryMessenger, WebViewProxy webViewProxy, Context context) {
        this.instanceManager = instanceManager;
        this.binaryMessenger = binaryMessenger;
        this.webViewProxy = webViewProxy;
        this.context = context;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void addJavaScriptChannel(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        JavaScriptChannel javaScriptChannel = (JavaScriptChannel) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(javaScriptChannel);
        webView.addJavascriptInterface(javaScriptChannel, javaScriptChannel.javaScriptChannelName);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public Boolean canGoBack(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        return Boolean.valueOf(webView.canGoBack());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public Boolean canGoForward(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        return Boolean.valueOf(webView.canGoForward());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void clearCache(Long l10, Boolean bool) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.clearCache(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void create(Long l10) {
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) this.context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        WebViewPlatformView createWebView = this.webViewProxy.createWebView(this.context, this.binaryMessenger, this.instanceManager);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.instanceManager.addDartCreatedInstance(createWebView, l10.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void evaluateJavascript(Long l10, String str, final GeneratedAndroidWebView.Result<String> result) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        Objects.requireNonNull(result);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.v4
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                GeneratedAndroidWebView.Result.this.success((String) obj);
            }
        });
    }

    public InstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public GeneratedAndroidWebView.WebViewPoint getScrollPosition(Long l10) {
        Objects.requireNonNull((WebView) this.instanceManager.getInstance(l10.longValue()));
        return new GeneratedAndroidWebView.WebViewPoint.Builder().setX(Long.valueOf(r4.getScrollX())).setY(Long.valueOf(r4.getScrollY())).build();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public Long getScrollX(Long l10) {
        Objects.requireNonNull((WebView) this.instanceManager.getInstance(l10.longValue()));
        return Long.valueOf(r4.getScrollX());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public Long getScrollY(Long l10) {
        Objects.requireNonNull((WebView) this.instanceManager.getInstance(l10.longValue()));
        return Long.valueOf(r4.getScrollY());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public String getTitle(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        return webView.getTitle();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public String getUrl(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        return webView.getUrl();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void goBack(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.goBack();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void goForward(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.goForward();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void loadData(Long l10, String str, String str2, String str3) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.loadData(str, str2, str3);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void loadDataWithBaseUrl(Long l10, String str, String str2, String str3, String str4, String str5) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void loadUrl(Long l10, String str, Map<String, String> map) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.loadUrl(str, map);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void postUrl(Long l10, String str, byte[] bArr) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.postUrl(str, bArr);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void reload(Long l10) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.reload();
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void removeJavaScriptChannel(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        JavaScriptChannel javaScriptChannel = (JavaScriptChannel) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(javaScriptChannel);
        webView.removeJavascriptInterface(javaScriptChannel.javaScriptChannelName);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void scrollBy(Long l10, Long l11, Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.scrollBy(l11.intValue(), l12.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void scrollTo(Long l10, Long l11, Long l12) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.scrollTo(l11.intValue(), l12.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setBackgroundColor(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.setBackgroundColor(l11.intValue());
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setDownloadListener(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        InstanceManager instanceManager = this.instanceManager;
        Objects.requireNonNull(l11);
        webView.setDownloadListener((DownloadListener) instanceManager.getInstance(l11.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setWebChromeClient(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        InstanceManager instanceManager = this.instanceManager;
        Objects.requireNonNull(l11);
        webView.setWebChromeClient((WebChromeClient) instanceManager.getInstance(l11.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setWebContentsDebuggingEnabled(Boolean bool) {
        this.webViewProxy.setWebContentsDebuggingEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi
    public void setWebViewClient(Long l10, Long l11) {
        WebView webView = (WebView) this.instanceManager.getInstance(l10.longValue());
        Objects.requireNonNull(webView);
        webView.setWebViewClient((WebViewClient) this.instanceManager.getInstance(l11.longValue()));
    }
}
