package androidx.webkit.internal;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class n1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f5606a;

    public n1(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f5606a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.m1
    public String[] a() {
        return this.f5606a.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.m1
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) hm.a.a(WebViewProviderBoundaryInterface.class, this.f5606a.createWebView(webView));
    }

    @Override // androidx.webkit.internal.m1
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) hm.a.a(ProxyControllerBoundaryInterface.class, this.f5606a.getProxyController());
    }

    @Override // androidx.webkit.internal.m1
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) hm.a.a(ServiceWorkerControllerBoundaryInterface.class, this.f5606a.getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.m1
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) hm.a.a(StaticsBoundaryInterface.class, this.f5606a.getStatics());
    }

    @Override // androidx.webkit.internal.m1
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) hm.a.a(TracingControllerBoundaryInterface.class, this.f5606a.getTracingController());
    }

    @Override // androidx.webkit.internal.m1
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) hm.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f5606a.getWebkitToCompatConverter());
    }
}
