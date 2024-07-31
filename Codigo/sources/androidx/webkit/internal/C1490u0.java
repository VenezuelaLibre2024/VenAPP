package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.internal.AbstractC1431a;
import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import p073e2.AbstractC7102f;

/* renamed from: androidx.webkit.internal.u0 */
/* loaded from: classes.dex */
public class C1490u0 extends AbstractC7102f {

    /* renamed from: a */
    private SafeBrowsingResponse f6481a;

    /* renamed from: b */
    private SafeBrowsingResponseBoundaryInterface f6482b;

    public C1490u0(SafeBrowsingResponse safeBrowsingResponse) {
        this.f6481a = safeBrowsingResponse;
    }

    public C1490u0(InvocationHandler invocationHandler) {
        this.f6482b = (SafeBrowsingResponseBoundaryInterface) C7757a.m23674a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: d */
    private SafeBrowsingResponseBoundaryInterface m8438d() {
        if (this.f6482b == null) {
            this.f6482b = (SafeBrowsingResponseBoundaryInterface) C7757a.m23674a(SafeBrowsingResponseBoundaryInterface.class, C1463k1.m8376c().m8420c(this.f6481a));
        }
        return this.f6482b;
    }

    /* renamed from: e */
    private SafeBrowsingResponse m8439e() {
        if (this.f6481a == null) {
            this.f6481a = C1463k1.m8376c().m8419b(Proxy.getInvocationHandler(this.f6482b));
        }
        return this.f6481a;
    }

    @Override // p073e2.AbstractC7102f
    /* renamed from: a */
    public void mo8440a(boolean z10) {
        AbstractC1431a.f fVar = C1460j1.f6449x;
        if (fVar.mo8259c()) {
            C1479q.m8405a(m8439e(), z10);
        } else {
            if (!fVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8438d().backToSafety(z10);
        }
    }

    @Override // p073e2.AbstractC7102f
    /* renamed from: b */
    public void mo8441b(boolean z10) {
        AbstractC1431a.f fVar = C1460j1.f6450y;
        if (fVar.mo8259c()) {
            C1479q.m8407c(m8439e(), z10);
        } else {
            if (!fVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8438d().proceed(z10);
        }
    }

    @Override // p073e2.AbstractC7102f
    /* renamed from: c */
    public void mo8442c(boolean z10) {
        AbstractC1431a.f fVar = C1460j1.f6451z;
        if (fVar.mo8259c()) {
            C1479q.m8409e(m8439e(), z10);
        } else {
            if (!fVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8438d().showInterstitial(z10);
        }
    }
}
