package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class r1 {

    /* renamed from: a */
    private final WebkitToCompatConverterBoundaryInterface f5628a;

    public r1(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f5628a = webkitToCompatConverterBoundaryInterface;
    }

    public o0 a(CookieManager cookieManager) {
        return new o0((WebViewCookieManagerBoundaryInterface) hm.a.a(WebViewCookieManagerBoundaryInterface.class, this.f5628a.convertCookieManager(cookieManager)));
    }

    public SafeBrowsingResponse b(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f5628a.convertSafeBrowsingResponse(invocationHandler);
    }

    public InvocationHandler c(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f5628a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public ServiceWorkerWebSettings d(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f5628a.convertServiceWorkerSettings(invocationHandler);
    }

    public InvocationHandler e(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f5628a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    public i1 f(WebSettings webSettings) {
        return new i1((WebSettingsBoundaryInterface) hm.a.a(WebSettingsBoundaryInterface.class, this.f5628a.convertSettings(webSettings)));
    }

    public WebMessagePort g(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f5628a.convertWebMessagePort(invocationHandler);
    }

    public InvocationHandler h(WebMessagePort webMessagePort) {
        return this.f5628a.convertWebMessagePort(webMessagePort);
    }

    public WebResourceError i(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f5628a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler j(WebResourceError webResourceError) {
        return this.f5628a.convertWebResourceError(webResourceError);
    }

    public h1 k(WebResourceRequest webResourceRequest) {
        return new h1((WebResourceRequestBoundaryInterface) hm.a.a(WebResourceRequestBoundaryInterface.class, this.f5628a.convertWebResourceRequest(webResourceRequest)));
    }
}
