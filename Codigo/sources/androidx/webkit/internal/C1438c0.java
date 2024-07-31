package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;
import p073e2.C7107k;

/* renamed from: androidx.webkit.internal.c0 */
/* loaded from: classes.dex */
public class C1438c0 {
    /* renamed from: a */
    public static TracingController m8286a() {
        TracingController tracingController;
        tracingController = TracingController.getInstance();
        return tracingController;
    }

    /* renamed from: b */
    public static ClassLoader m8287b() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    /* renamed from: c */
    public static Looper m8288c(WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }

    /* renamed from: d */
    public static boolean m8289d(TracingController tracingController) {
        boolean isTracing;
        isTracing = tracingController.isTracing();
        return isTracing;
    }

    /* renamed from: e */
    public static void m8290e(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    /* renamed from: f */
    public static void m8291f(TracingController tracingController, C7107k c7107k) {
        TracingConfig.Builder addCategories;
        TracingConfig.Builder addCategories2;
        TracingConfig.Builder tracingMode;
        TracingConfig build;
        addCategories = new TracingConfig.Builder().addCategories(c7107k.m20946b());
        addCategories2 = addCategories.addCategories((Collection<String>) c7107k.m20945a());
        tracingMode = addCategories2.setTracingMode(c7107k.m20947c());
        build = tracingMode.build();
        tracingController.start(build);
    }

    /* renamed from: g */
    public static boolean m8292g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        boolean stop;
        stop = tracingController.stop(outputStream, executor);
        return stop;
    }
}
