package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import e2.n;
import e2.s;

/* loaded from: classes.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        final /* synthetic */ n.a f5560a;

        a(n.a aVar) {
            this.f5560a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f5560a.onMessage(new f1(webMessagePort), f1.h(webMessage));
        }
    }

    /* loaded from: classes.dex */
    class b extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        final /* synthetic */ n.a f5561a;

        b(n.a aVar) {
            this.f5561a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f5561a.onMessage(new f1(webMessagePort), f1.h(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.c$c */
    /* loaded from: classes.dex */
    class C0091c extends WebView.VisualStateCallback {
        C0091c(s.a aVar) {
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j10) {
            throw null;
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(e2.m mVar) {
        return new WebMessage(mVar.c(), f1.g(mVar.d()));
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static e2.m d(WebMessage webMessage) {
        return new e2.m(webMessage.getData(), f1.k(webMessage.getPorts()));
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j10, s.a aVar) {
        webView.postVisualStateCallback(j10, new C0091c(aVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void l(WebMessagePort webMessagePort, n.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, n.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(aVar), handler);
    }
}
