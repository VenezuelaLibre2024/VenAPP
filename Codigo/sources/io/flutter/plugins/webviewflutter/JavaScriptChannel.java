package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* loaded from: classes3.dex */
public class JavaScriptChannel {
    private final JavaScriptChannelFlutterApiImpl flutterApi;
    final String javaScriptChannelName;
    private final Handler platformThreadHandler;

    public JavaScriptChannel(JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, String str, Handler handler) {
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.javaScriptChannelName = str;
        this.platformThreadHandler = handler;
    }

    public static /* synthetic */ void lambda$postMessage$0(Void r02) {
    }

    public /* synthetic */ void lambda$postMessage$1(String str) {
        this.flutterApi.postMessage(this, str, new GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.z2
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply
            public final void reply(Object obj) {
                JavaScriptChannel.lambda$postMessage$0((Void) obj);
            }
        });
    }

    @JavascriptInterface
    public void postMessage(String str) {
        a3 a3Var = new Runnable() { // from class: io.flutter.plugins.webviewflutter.a3

            /* renamed from: b */
            public final /* synthetic */ String f18397b;

            public /* synthetic */ a3(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JavaScriptChannel.this.lambda$postMessage$1(r2);
            }
        };
        if (this.platformThreadHandler.getLooper() == Looper.myLooper()) {
            a3Var.run();
        } else {
            this.platformThreadHandler.post(a3Var);
        }
    }
}
