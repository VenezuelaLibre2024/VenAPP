package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.webkit.internal.a;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* loaded from: classes.dex */
public class x0 extends e2.i {

    /* renamed from: a, reason: collision with root package name */
    private ServiceWorkerController f5634a;

    /* renamed from: b, reason: collision with root package name */
    private ServiceWorkerControllerBoundaryInterface f5635b;

    /* renamed from: c, reason: collision with root package name */
    private final e2.j f5636c;

    public x0() {
        a.c cVar = j1.f5585k;
        if (cVar.c()) {
            this.f5634a = d.g();
            this.f5635b = null;
            this.f5636c = d.i(e());
        } else {
            if (!cVar.d()) {
                throw j1.a();
            }
            this.f5634a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = k1.d().getServiceWorkerController();
            this.f5635b = serviceWorkerController;
            this.f5636c = new y0(serviceWorkerController.getServiceWorkerWebSettings());
        }
    }

    private ServiceWorkerControllerBoundaryInterface d() {
        if (this.f5635b == null) {
            this.f5635b = k1.d().getServiceWorkerController();
        }
        return this.f5635b;
    }

    private ServiceWorkerController e() {
        if (this.f5634a == null) {
            this.f5634a = d.g();
        }
        return this.f5634a;
    }

    @Override // e2.i
    public e2.j b() {
        return this.f5636c;
    }

    @Override // e2.i
    public void c(e2.h hVar) {
        a.c cVar = j1.f5585k;
        if (cVar.c()) {
            if (hVar == null) {
                d.p(e(), null);
                return;
            } else {
                d.q(e(), hVar);
                return;
            }
        }
        if (!cVar.d()) {
            throw j1.a();
        }
        if (hVar == null) {
            d().setServiceWorkerClient(null);
        } else {
            d().setServiceWorkerClient(hm.a.c(new w0(hVar)));
        }
    }
}
