package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes.dex */
public class p0 extends ServiceWorkerClient {

    /* renamed from: a, reason: collision with root package name */
    private final e2.h f5619a;

    public p0(e2.h hVar) {
        this.f5619a = hVar;
    }

    @Override // android.webkit.ServiceWorkerClient
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f5619a.shouldInterceptRequest(webResourceRequest);
    }
}
