package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* loaded from: classes.dex */
public class h1 {

    /* renamed from: a, reason: collision with root package name */
    private final WebResourceRequestBoundaryInterface f5571a;

    public h1(WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f5571a = webResourceRequestBoundaryInterface;
    }

    public boolean a() {
        return this.f5571a.isRedirect();
    }
}
