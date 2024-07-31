package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import e2.d;
import e2.e;
import e2.t;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class ProxyManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ProxyManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
    public static e proxyController;
    public InAppWebViewFlutterPlugin plugin;

    public ProxyManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    private void clearProxyOverride(final MethodChannel.Result result) {
        e eVar = proxyController;
        if (eVar != null) {
            eVar.a(new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.3
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.4
                @Override // java.lang.Runnable
                public void run() {
                    result.success(Boolean.TRUE);
                }
            });
        }
    }

    public static void init() {
        if (proxyController == null && t.a("PROXY_OVERRIDE")) {
            proxyController = e.b();
        }
    }

    private void setProxyOverride(ProxySettings proxySettings, final MethodChannel.Result result) {
        if (proxyController != null) {
            d.a aVar = new d.a();
            Iterator<String> it = proxySettings.bypassRules.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
            Iterator<String> it2 = proxySettings.directs.iterator();
            while (it2.hasNext()) {
                aVar.b(it2.next());
            }
            for (ProxyRuleExt proxyRuleExt : proxySettings.proxyRules) {
                if (proxyRuleExt.getSchemeFilter() != null) {
                    aVar.d(proxyRuleExt.getUrl(), proxyRuleExt.getSchemeFilter());
                } else {
                    aVar.c(proxyRuleExt.getUrl());
                }
            }
            Boolean bool = proxySettings.bypassSimpleHostnames;
            if (bool != null && bool.booleanValue()) {
                aVar.g();
            }
            Boolean bool2 = proxySettings.removeImplicitRules;
            if (bool2 != null && bool2.booleanValue()) {
                aVar.i();
            }
            if (proxySettings.reverseBypassEnabled != null && t.a("PROXY_OVERRIDE_REVERSE_BYPASS")) {
                aVar.k(proxySettings.reverseBypassEnabled.booleanValue());
            }
            proxyController.c(aVar.e(), new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.1
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.2
                @Override // java.lang.Runnable
                public void run() {
                    result.success(Boolean.TRUE);
                }
            });
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        init();
        String str = methodCall.method;
        str.hashCode();
        if (str.equals("clearProxyOverride")) {
            if (proxyController != null) {
                clearProxyOverride(result);
                return;
            }
        } else if (!str.equals("setProxyOverride")) {
            result.notImplemented();
            return;
        } else if (proxyController != null) {
            HashMap hashMap = (HashMap) methodCall.argument("settings");
            ProxySettings proxySettings = new ProxySettings();
            if (hashMap != null) {
                proxySettings.parse2((Map<String, Object>) hashMap);
            }
            setProxyOverride(proxySettings, result);
            return;
        }
        result.success(Boolean.FALSE);
    }
}
