package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import p073e2.AbstractC7104h;

/* renamed from: androidx.webkit.internal.p0 */
/* loaded from: classes.dex */
public class C1477p0 extends ServiceWorkerClient {

    /* renamed from: a */
    private final AbstractC7104h f6470a;

    public C1477p0(AbstractC7104h abstractC7104h) {
        this.f6470a = abstractC7104h;
    }

    @Override // android.webkit.ServiceWorkerClient
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f6470a.shouldInterceptRequest(webResourceRequest);
    }
}
