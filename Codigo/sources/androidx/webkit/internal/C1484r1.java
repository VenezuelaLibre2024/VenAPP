package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: androidx.webkit.internal.r1 */
/* loaded from: classes.dex */
public class C1484r1 {

    /* renamed from: a */
    private final WebkitToCompatConverterBoundaryInterface f6479a;

    public C1484r1(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f6479a = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: a */
    public C1474o0 m8418a(CookieManager cookieManager) {
        return new C1474o0((WebViewCookieManagerBoundaryInterface) C7757a.m23674a(WebViewCookieManagerBoundaryInterface.class, this.f6479a.convertCookieManager(cookieManager)));
    }

    /* renamed from: b */
    public SafeBrowsingResponse m8419b(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f6479a.convertSafeBrowsingResponse(invocationHandler);
    }

    /* renamed from: c */
    public InvocationHandler m8420c(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f6479a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    /* renamed from: d */
    public ServiceWorkerWebSettings m8421d(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f6479a.convertServiceWorkerSettings(invocationHandler);
    }

    /* renamed from: e */
    public InvocationHandler m8422e(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f6479a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    /* renamed from: f */
    public C1457i1 m8423f(WebSettings webSettings) {
        return new C1457i1((WebSettingsBoundaryInterface) C7757a.m23674a(WebSettingsBoundaryInterface.class, this.f6479a.convertSettings(webSettings)));
    }

    /* renamed from: g */
    public WebMessagePort m8424g(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f6479a.convertWebMessagePort(invocationHandler);
    }

    /* renamed from: h */
    public InvocationHandler m8425h(WebMessagePort webMessagePort) {
        return this.f6479a.convertWebMessagePort(webMessagePort);
    }

    /* renamed from: i */
    public WebResourceError m8426i(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f6479a.convertWebResourceError(invocationHandler);
    }

    /* renamed from: j */
    public InvocationHandler m8427j(WebResourceError webResourceError) {
        return this.f6479a.convertWebResourceError(webResourceError);
    }

    /* renamed from: k */
    public C1454h1 m8428k(WebResourceRequest webResourceRequest) {
        return new C1454h1((WebResourceRequestBoundaryInterface) C7757a.m23674a(WebResourceRequestBoundaryInterface.class, this.f6479a.convertWebResourceRequest(webResourceRequest)));
    }
}
