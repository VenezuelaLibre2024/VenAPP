package androidx.webkit.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;
import p073e2.AbstractC7104h;

/* renamed from: androidx.webkit.internal.w0 */
/* loaded from: classes.dex */
public class C1494w0 implements ServiceWorkerClientBoundaryInterface {

    /* renamed from: a */
    private final AbstractC7104h f6484a;

    public C1494w0(AbstractC7104h abstractC7104h) {
        this.f6484a = abstractC7104h;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f6484a.shouldInterceptRequest(webResourceRequest);
    }
}
