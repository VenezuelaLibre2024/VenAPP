package androidx.webkit.internal;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.io.File;
import p073e2.AbstractC7104h;

/* renamed from: androidx.webkit.internal.d */
/* loaded from: classes.dex */
public class C1440d {
    /* renamed from: a */
    public static boolean m8293a(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    /* renamed from: b */
    public static boolean m8294b(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    /* renamed from: c */
    public static boolean m8295c(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    /* renamed from: d */
    public static int m8296d(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    /* renamed from: e */
    public static File m8297e(Context context) {
        return context.getDataDir();
    }

    /* renamed from: f */
    public static int m8298f(WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    /* renamed from: g */
    public static ServiceWorkerController m8299g() {
        return ServiceWorkerController.getInstance();
    }

    /* renamed from: h */
    public static ServiceWorkerWebSettings m8300h(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    /* renamed from: i */
    public static C1498y0 m8301i(ServiceWorkerController serviceWorkerController) {
        return new C1498y0(m8300h(serviceWorkerController));
    }

    /* renamed from: j */
    public static boolean m8302j(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    /* renamed from: k */
    public static void m8303k(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setAllowContentAccess(z10);
    }

    /* renamed from: l */
    public static void m8304l(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setAllowFileAccess(z10);
    }

    /* renamed from: m */
    public static void m8305m(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z10);
    }

    /* renamed from: n */
    public static void m8306n(ServiceWorkerWebSettings serviceWorkerWebSettings, int i10) {
        serviceWorkerWebSettings.setCacheMode(i10);
    }

    /* renamed from: o */
    public static void m8307o(WebSettings webSettings, int i10) {
        webSettings.setDisabledActionModeMenuItems(i10);
    }

    /* renamed from: p */
    public static void m8308p(ServiceWorkerController serviceWorkerController, ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    /* renamed from: q */
    public static void m8309q(ServiceWorkerController serviceWorkerController, AbstractC7104h abstractC7104h) {
        serviceWorkerController.setServiceWorkerClient(new C1477p0(abstractC7104h));
    }
}
