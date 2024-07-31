package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import e2.s;
import e2.t;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class InAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews;
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId;
    public final Map<Integer, Message> windowWebViewMessages;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager$1 */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ MethodChannel.Result val$result;

        AnonymousClass1(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            r2.success(Boolean.TRUE);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager$2 */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements ValueCallback<Boolean> {
        final /* synthetic */ MethodChannel.Result val$result;

        AnonymousClass2(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
            r2.success(bool);
        }
    }

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager$3 */
    /* loaded from: classes3.dex */
    class AnonymousClass3 implements ValueCallback<Boolean> {
        final /* synthetic */ MethodChannel.Result val$result;

        AnonymousClass3(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(Boolean bool) {
            r2.success(bool);
        }
    }

    public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.keepAliveWebViews = new HashMap();
        this.windowWebViewMessages = new HashMap();
        this.windowAutoincrementId = 0;
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void clearAllCache(Context context, boolean z10) {
        WebView webView = new WebView(context);
        webView.clearCache(z10);
        webView.destroy();
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        Iterator<FlutterWebView> it = this.keepAliveWebViews.values().iterator();
        while (it.hasNext()) {
            String str = it.next().keepAliveId;
            if (str != null) {
                disposeKeepAlive(str);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }

    public void disposeKeepAlive(String str) {
        ViewGroup viewGroup;
        FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            View view = flutterWebView.getView();
            if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                viewGroup.removeView(view);
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey(str)) {
            this.keepAliveWebViews.put(str, null);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0091. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object l10;
        Context context;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1496477679:
                if (str.equals("disableWebView")) {
                    c10 = 0;
                    break;
                }
                break;
            case -910403233:
                if (str.equals("setWebContentsDebuggingEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -633518365:
                if (str.equals("getVariationsHeader")) {
                    c10 = 2;
                    break;
                }
                break;
            case -436220260:
                if (str.equals("clearClientCertPreferences")) {
                    c10 = 3;
                    break;
                }
                break;
            case 258673215:
                if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
                    c10 = 4;
                    break;
                }
                break;
            case 426229521:
                if (str.equals("setSafeBrowsingAllowlist")) {
                    c10 = 5;
                    break;
                }
                break;
            case 643643439:
                if (str.equals("getDefaultUserAgent")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1033609166:
                if (str.equals("clearAllCache")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1586319888:
                if (str.equals("getCurrentWebViewPackage")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1667434977:
                if (str.equals("isMultiProcessEnabled")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1867011305:
                if (str.equals("disposeKeepAlive")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        Map<String, Object> map = null;
        switch (c10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 28) {
                    WebView.disableWebView();
                }
                l10 = Boolean.TRUE;
                result.success(l10);
                return;
            case 1:
                WebView.setWebContentsDebuggingEnabled(((Boolean) methodCall.argument("debuggingEnabled")).booleanValue());
                l10 = Boolean.TRUE;
                result.success(l10);
                return;
            case 2:
                if (t.a("GET_VARIATIONS_HEADER")) {
                    l10 = s.l();
                    result.success(l10);
                    return;
                }
                result.success(map);
                return;
            case 3:
                WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.1
                    final /* synthetic */ MethodChannel.Result val$result;

                    AnonymousClass1(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        r2.success(Boolean.TRUE);
                    }
                });
                return;
            case 4:
                if (t.a("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    l10 = s.k().toString();
                    result2.success(l10);
                    return;
                }
                result2.success(map);
                return;
            case 5:
                if (t.a("SAFE_BROWSING_ALLOWLIST")) {
                    s.o(new HashSet((List) methodCall.argument("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.2
                        final /* synthetic */ MethodChannel.Result val$result;

                        AnonymousClass2(MethodChannel.Result result2) {
                            r2 = result2;
                        }

                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            r2.success(bool);
                        }
                    });
                    return;
                }
                if (t.a("SAFE_BROWSING_WHITELIST")) {
                    s.p((List) methodCall.argument("hosts"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.3
                        final /* synthetic */ MethodChannel.Result val$result;

                        AnonymousClass3(MethodChannel.Result result2) {
                            r2 = result2;
                        }

                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            r2.success(bool);
                        }
                    });
                    return;
                }
                l10 = Boolean.FALSE;
                result2.success(l10);
                return;
            case 6:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null) {
                    l10 = WebSettings.getDefaultUserAgent(inAppWebViewFlutterPlugin.applicationContext);
                    result2.success(l10);
                    return;
                }
                result2.success(map);
                return;
            case 7:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null) {
                    Context context2 = inAppWebViewFlutterPlugin2.activity;
                    if (context2 == null) {
                        context2 = inAppWebViewFlutterPlugin2.applicationContext;
                    }
                    if (context2 != null) {
                        clearAllCache(context2, ((Boolean) methodCall.argument("includeDiskFiles")).booleanValue());
                    }
                }
                l10 = Boolean.TRUE;
                result2.success(l10);
                return;
            case '\b':
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null) {
                    context = inAppWebViewFlutterPlugin3.activity;
                    if (context == null) {
                        context = inAppWebViewFlutterPlugin3.applicationContext;
                    }
                } else {
                    context = null;
                }
                PackageInfo f10 = context != null ? s.f(context) : null;
                if (f10 != null) {
                    map = convertWebViewPackageToMap(f10);
                }
                result2.success(map);
                return;
            case '\t':
                if (t.a("MULTI_PROCESS")) {
                    l10 = Boolean.valueOf(s.m());
                    result2.success(l10);
                    return;
                }
                l10 = Boolean.FALSE;
                result2.success(l10);
                return;
            case '\n':
                String str2 = (String) methodCall.argument("keepAliveId");
                if (str2 != null) {
                    disposeKeepAlive(str2);
                }
                l10 = Boolean.TRUE;
                result2.success(l10);
                return;
            default:
                result2.notImplemented();
                return;
        }
    }
}
