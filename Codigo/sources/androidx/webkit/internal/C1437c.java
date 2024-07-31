package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import p073e2.AbstractC7110n;
import p073e2.C7109m;
import p073e2.C7115s;

/* renamed from: androidx.webkit.internal.c */
/* loaded from: classes.dex */
public class C1437c {

    /* renamed from: androidx.webkit.internal.c$a */
    /* loaded from: classes.dex */
    class a extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC7110n.a f6385a;

        a(AbstractC7110n.a aVar) {
            this.f6385a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f6385a.onMessage(new C1448f1(webMessagePort), C1448f1.m8318h(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.c$b */
    /* loaded from: classes.dex */
    class b extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        final /* synthetic */ AbstractC7110n.a f6386a;

        b(AbstractC7110n.a aVar) {
            this.f6386a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f6386a.onMessage(new C1448f1(webMessagePort), C1448f1.m8318h(webMessage));
        }
    }

    /* renamed from: androidx.webkit.internal.c$c */
    /* loaded from: classes.dex */
    class c extends WebView.VisualStateCallback {
        c(C7115s.a aVar) {
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j10) {
            throw null;
        }
    }

    /* renamed from: a */
    public static void m8273a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    /* renamed from: b */
    public static WebMessage m8274b(C7109m c7109m) {
        return new WebMessage(c7109m.m20956c(), C1448f1.m8317g(c7109m.m20957d()));
    }

    /* renamed from: c */
    public static WebMessagePort[] m8275c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    /* renamed from: d */
    public static C7109m m8276d(WebMessage webMessage) {
        return new C7109m(webMessage.getData(), C1448f1.m8321k(webMessage.getPorts()));
    }

    /* renamed from: e */
    public static CharSequence m8277e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    /* renamed from: f */
    public static int m8278f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    /* renamed from: g */
    public static boolean m8279g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    /* renamed from: h */
    public static void m8280h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    /* renamed from: i */
    public static void m8281i(WebView webView, long j10, C7115s.a aVar) {
        webView.postVisualStateCallback(j10, new c(aVar));
    }

    /* renamed from: j */
    public static void m8282j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    /* renamed from: k */
    public static void m8283k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    /* renamed from: l */
    public static void m8284l(WebMessagePort webMessagePort, AbstractC7110n.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    /* renamed from: m */
    public static void m8285m(WebMessagePort webMessagePort, AbstractC7110n.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(aVar), handler);
    }
}
