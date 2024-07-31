package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.internal.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* loaded from: classes.dex */
public class u0 extends e2.f {

    /* renamed from: a, reason: collision with root package name */
    private SafeBrowsingResponse f5630a;

    /* renamed from: b, reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f5631b;

    public u0(SafeBrowsingResponse safeBrowsingResponse) {
        this.f5630a = safeBrowsingResponse;
    }

    public u0(InvocationHandler invocationHandler) {
        this.f5631b = (SafeBrowsingResponseBoundaryInterface) hm.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface d() {
        if (this.f5631b == null) {
            this.f5631b = (SafeBrowsingResponseBoundaryInterface) hm.a.a(SafeBrowsingResponseBoundaryInterface.class, k1.c().c(this.f5630a));
        }
        return this.f5631b;
    }

    private SafeBrowsingResponse e() {
        if (this.f5630a == null) {
            this.f5630a = k1.c().b(Proxy.getInvocationHandler(this.f5631b));
        }
        return this.f5630a;
    }

    @Override // e2.f
    public void a(boolean z10) {
        a.f fVar = j1.f5598x;
        if (fVar.c()) {
            q.a(e(), z10);
        } else {
            if (!fVar.d()) {
                throw j1.a();
            }
            d().backToSafety(z10);
        }
    }

    @Override // e2.f
    public void b(boolean z10) {
        a.f fVar = j1.f5599y;
        if (fVar.c()) {
            q.c(e(), z10);
        } else {
            if (!fVar.d()) {
                throw j1.a();
            }
            d().proceed(z10);
        }
    }

    @Override // e2.f
    public void c(boolean z10) {
        a.f fVar = j1.f5600z;
        if (fVar.c()) {
            q.e(e(), z10);
        } else {
            if (!fVar.d()) {
                throw j1.a();
            }
            d().showInterstitial(z10);
        }
    }
}
