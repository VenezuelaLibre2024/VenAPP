package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.webkit.internal.AbstractC1431a;
import hm.C7757a;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import p073e2.AbstractC7104h;
import p073e2.AbstractC7105i;
import p073e2.AbstractC7106j;

/* renamed from: androidx.webkit.internal.x0 */
/* loaded from: classes.dex */
public class C1496x0 extends AbstractC7105i {

    /* renamed from: a */
    private ServiceWorkerController f6485a;

    /* renamed from: b */
    private ServiceWorkerControllerBoundaryInterface f6486b;

    /* renamed from: c */
    private final AbstractC7106j f6487c;

    public C1496x0() {
        AbstractC1431a.c cVar = C1460j1.f6436k;
        if (cVar.mo8259c()) {
            this.f6485a = C1440d.m8299g();
            this.f6486b = null;
            this.f6487c = C1440d.m8301i(m8449e());
        } else {
            if (!cVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            this.f6485a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = C1463k1.m8377d().getServiceWorkerController();
            this.f6486b = serviceWorkerController;
            this.f6487c = new C1498y0(serviceWorkerController.getServiceWorkerWebSettings());
        }
    }

    /* renamed from: d */
    private ServiceWorkerControllerBoundaryInterface m8448d() {
        if (this.f6486b == null) {
            this.f6486b = C1463k1.m8377d().getServiceWorkerController();
        }
        return this.f6486b;
    }

    /* renamed from: e */
    private ServiceWorkerController m8449e() {
        if (this.f6485a == null) {
            this.f6485a = C1440d.m8299g();
        }
        return this.f6485a;
    }

    @Override // p073e2.AbstractC7105i
    /* renamed from: b */
    public AbstractC7106j mo8450b() {
        return this.f6487c;
    }

    @Override // p073e2.AbstractC7105i
    /* renamed from: c */
    public void mo8451c(AbstractC7104h abstractC7104h) {
        AbstractC1431a.c cVar = C1460j1.f6436k;
        if (cVar.mo8259c()) {
            if (abstractC7104h == null) {
                C1440d.m8308p(m8449e(), null);
                return;
            } else {
                C1440d.m8309q(m8449e(), abstractC7104h);
                return;
            }
        }
        if (!cVar.mo8260d()) {
            throw C1460j1.m8361a();
        }
        if (abstractC7104h == null) {
            m8448d().setServiceWorkerClient(null);
        } else {
            m8448d().setServiceWorkerClient(C7757a.m23676c(new C1494w0(abstractC7104h)));
        }
    }
}
