package androidx.webkit.internal;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* renamed from: androidx.webkit.internal.h1 */
/* loaded from: classes.dex */
public class C1454h1 {

    /* renamed from: a */
    private final WebResourceRequestBoundaryInterface f6396a;

    public C1454h1(WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f6396a = webResourceRequestBoundaryInterface;
    }

    /* renamed from: a */
    public boolean m8335a() {
        return this.f6396a.isRedirect();
    }
}
