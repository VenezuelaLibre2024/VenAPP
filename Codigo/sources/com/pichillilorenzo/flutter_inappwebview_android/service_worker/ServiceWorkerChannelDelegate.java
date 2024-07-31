package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import e2.i;
import e2.j;
import e2.t;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* loaded from: classes3.dex */
public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
    private ServiceWorkerManager serviceWorkerManager;

    /* loaded from: classes3.dex */
    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    /* loaded from: classes3.dex */
    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager, MethodChannel methodChannel) {
        super(methodChannel);
        this.serviceWorkerManager = serviceWorkerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x008c. Please report as an issue. */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        boolean a10;
        Object valueOf;
        ServiceWorkerManager.init();
        i iVar = ServiceWorkerManager.serviceWorkerController;
        j b10 = iVar != null ? iVar.b() : null;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1332730774:
                if (str.equals("getAllowContentAccess")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1165005700:
                if (str.equals("setServiceWorkerClient")) {
                    c10 = 1;
                    break;
                }
                break;
            case -563397233:
                if (str.equals("getCacheMode")) {
                    c10 = 2;
                    break;
                }
                break;
            case 674894835:
                if (str.equals("getAllowFileAccess")) {
                    c10 = 3;
                    break;
                }
                break;
            case 985595395:
                if (str.equals("setCacheMode")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1083898794:
                if (str.equals("setBlockNetworkLoads")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1203480182:
                if (str.equals("setAllowContentAccess")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1594928487:
                if (str.equals("setAllowFileAccess")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1694822198:
                if (str.equals("getBlockNetworkLoads")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (b10 != null && t.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    a10 = b10.a();
                    valueOf = Boolean.valueOf(a10);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 1:
                if (this.serviceWorkerManager != null) {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean) methodCall.argument("isNull"));
                    valueOf = Boolean.TRUE;
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 2:
                if (b10 == null || !t.a("SERVICE_WORKER_CACHE_MODE")) {
                    result.success(null);
                    return;
                } else {
                    valueOf = Integer.valueOf(b10.d());
                    result.success(valueOf);
                    return;
                }
            case 3:
                if (b10 != null && t.a("SERVICE_WORKER_FILE_ACCESS")) {
                    a10 = b10.b();
                    valueOf = Boolean.valueOf(a10);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 4:
                if (b10 != null && t.a("SERVICE_WORKER_CACHE_MODE")) {
                    b10.h(((Integer) methodCall.argument("mode")).intValue());
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case 5:
                if (b10 != null && t.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    b10.g(((Boolean) methodCall.argument("flag")).booleanValue());
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case 6:
                if (b10 != null && t.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    b10.e(((Boolean) methodCall.argument("allow")).booleanValue());
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case 7:
                if (b10 != null && t.a("SERVICE_WORKER_FILE_ACCESS")) {
                    b10.f(((Boolean) methodCall.argument("allow")).booleanValue());
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case '\b':
                if (b10 != null && t.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    a10 = b10.c();
                    valueOf = Boolean.valueOf(a10);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
    }
}
