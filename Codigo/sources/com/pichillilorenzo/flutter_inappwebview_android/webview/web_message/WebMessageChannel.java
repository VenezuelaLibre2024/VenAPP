package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.webkit.ValueCallback;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import e2.m;
import e2.n;
import e2.s;
import e2.t;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class WebMessageChannel implements Disposable {
    protected static final String LOG_TAG = "WebMessageChannel";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
    public WebMessageChannelChannelDelegate channelDelegate;
    public final List<n> compatPorts;

    /* renamed from: id */
    public String f13558id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel$1 */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements ValueCallback<String> {
        final /* synthetic */ ValueCallback val$callback;
        final /* synthetic */ WebMessageChannel val$webMessageChannel;

        AnonymousClass1(ValueCallback valueCallback, WebMessageChannel webMessageChannel) {
            r2 = valueCallback;
            r3 = webMessageChannel;
        }

        @Override // android.webkit.ValueCallback
        public void onReceiveValue(String str) {
            r2.onReceiveValue(r3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 extends n.a {
        final /* synthetic */ int val$index;
        final /* synthetic */ WebMessageChannel val$webMessageChannel;

        AnonymousClass2(WebMessageChannel webMessageChannel, int i10) {
            r2 = webMessageChannel;
            r3 = i10;
        }

        @Override // e2.n.a
        public void onMessage(n nVar, m mVar) {
            super.onMessage(nVar, mVar);
            r2.onMessage(r3, mVar != null ? WebMessageCompatExt.fromMapWebMessageCompat(mVar) : null);
        }
    }

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        this.f13558id = str;
        this.channelDelegate = new WebMessageChannelChannelDelegate(this, new MethodChannel(inAppWebViewInterface.getPlugin().messenger, METHOD_CHANNEL_NAME_PREFIX + str));
        if (inAppWebViewInterface instanceof InAppWebView) {
            this.compatPorts = new ArrayList(Arrays.asList(s.d((InAppWebView) inAppWebViewInterface)));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort("port1", this), new WebMessagePort("port2", this));
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    public void closeForInAppWebView(Integer num, MethodChannel.Result result) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !t.a("WEB_MESSAGE_PORT_CLOSE")) {
            result.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).a();
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        if (t.a("WEB_MESSAGE_PORT_CLOSE")) {
            Iterator<n> it = this.compatPorts.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Exception unused) {
                }
            }
        }
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.compatPorts.clear();
        this.webView = null;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface == null) {
            valueCallback.onReceiveValue(this);
            return;
        }
        inAppWebViewInterface.evaluateJavascript("(function() {window.flutter_inappwebview._webMessageChannels['" + this.f13558id + "'] = new MessageChannel();})();", null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.1
            final /* synthetic */ ValueCallback val$callback;
            final /* synthetic */ WebMessageChannel val$webMessageChannel;

            AnonymousClass1(ValueCallback valueCallback2, WebMessageChannel this) {
                r2 = valueCallback2;
                r3 = this;
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                r2.onReceiveValue(r3);
            }
        });
    }

    public void onMessage(int i10, WebMessageCompatExt webMessageCompatExt) {
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.onMessage(i10, webMessageCompatExt);
        }
    }

    public void postMessageForInAppWebView(Integer num, WebMessageCompatExt webMessageCompatExt, MethodChannel.Result result) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !t.a("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            result.success(Boolean.TRUE);
            return;
        }
        n nVar = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<WebMessagePortCompatExt> ports = webMessageCompatExt.getPorts();
        if (ports != null) {
            for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                }
            }
        }
        Object data = webMessageCompatExt.getData();
        try {
            nVar.d((t.a("WEB_MESSAGE_ARRAY_BUFFER") && data != null && webMessageCompatExt.getType() == 1) ? new m((byte[]) data, (n[]) arrayList.toArray(new n[0])) : new m(data != null ? data.toString() : null, (n[]) arrayList.toArray(new n[0])));
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    public void setWebMessageCallbackForInAppWebView(int i10, MethodChannel.Result result) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !t.a("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            result.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(i10).e(new n.a() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.2
                final /* synthetic */ int val$index;
                final /* synthetic */ WebMessageChannel val$webMessageChannel;

                AnonymousClass2(WebMessageChannel this, int i102) {
                    r2 = this;
                    r3 = i102;
                }

                @Override // e2.n.a
                public void onMessage(n nVar, m mVar) {
                    super.onMessage(nVar, mVar);
                    r2.onMessage(r3, mVar != null ? WebMessageCompatExt.fromMapWebMessageCompat(mVar) : null);
                }
            });
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(FacebookMediationAdapter.KEY_ID, this.f13558id);
        return hashMap;
    }
}
