package androidx.webkit.internal;

import android.webkit.WebView;
import hm.C7757a;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: androidx.webkit.internal.n1 */
/* loaded from: classes.dex */
public class C1472n1 implements InterfaceC1469m1 {

    /* renamed from: a */
    final WebViewProviderFactoryBoundaryInterface f6457a;

    public C1472n1(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f6457a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.InterfaceC1469m1
    /* renamed from: a */
    public String[] mo8400a() {
        return this.f6457a.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.InterfaceC1469m1
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) C7757a.m23674a(WebViewProviderBoundaryInterface.class, this.f6457a.createWebView(webView));
    }

    @Override // androidx.webkit.internal.InterfaceC1469m1
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) C7757a.m23674a(ProxyControllerBoundaryInterface.class, this.f6457a.getProxyController());
    }

    @Override // androidx.webkit.internal.InterfaceC1469m1
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) C7757a.m23674a(ServiceWorkerControllerBoundaryInterface.class, this.f6457a.getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.InterfaceC1469m1
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C7757a.m23674a(StaticsBoundaryInterface.class, this.f6457a.getStatics());
    }

    @Override // androidx.webkit.internal.InterfaceC1469m1
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) C7757a.m23674a(TracingControllerBoundaryInterface.class, this.f6457a.getTracingController());
    }

    @Override // androidx.webkit.internal.InterfaceC1469m1
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C7757a.m23674a(WebkitToCompatConverterBoundaryInterface.class, this.f6457a.getWebkitToCompatConverter());
    }
}
