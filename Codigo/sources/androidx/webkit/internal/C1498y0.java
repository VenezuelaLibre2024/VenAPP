package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.internal.AbstractC1431a;
import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import p073e2.AbstractC7106j;

/* renamed from: androidx.webkit.internal.y0 */
/* loaded from: classes.dex */
public class C1498y0 extends AbstractC7106j {

    /* renamed from: a */
    private ServiceWorkerWebSettings f6488a;

    /* renamed from: b */
    private ServiceWorkerWebSettingsBoundaryInterface f6489b;

    public C1498y0(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f6488a = serviceWorkerWebSettings;
    }

    public C1498y0(InvocationHandler invocationHandler) {
        this.f6489b = (ServiceWorkerWebSettingsBoundaryInterface) C7757a.m23674a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: i */
    private ServiceWorkerWebSettingsBoundaryInterface m8453i() {
        if (this.f6489b == null) {
            this.f6489b = (ServiceWorkerWebSettingsBoundaryInterface) C7757a.m23674a(ServiceWorkerWebSettingsBoundaryInterface.class, C1463k1.m8376c().m8422e(this.f6488a));
        }
        return this.f6489b;
    }

    /* renamed from: j */
    private ServiceWorkerWebSettings m8454j() {
        if (this.f6488a == null) {
            this.f6488a = C1463k1.m8376c().m8421d(Proxy.getInvocationHandler(this.f6489b));
        }
        return this.f6488a;
    }

    @Override // p073e2.AbstractC7106j
    /* renamed from: a */
    public boolean mo8455a() {
        AbstractC1431a.c cVar = C1460j1.f6438m;
        if (cVar.mo8259c()) {
            return C1440d.m8293a(m8454j());
        }
        if (cVar.mo8260d()) {
            return m8453i().getAllowContentAccess();
        }
        throw C1460j1.m8361a();
    }

    @Override // p073e2.AbstractC7106j
    /* renamed from: b */
    public boolean mo8456b() {
        AbstractC1431a.c cVar = C1460j1.f6439n;
        if (cVar.mo8259c()) {
            return C1440d.m8294b(m8454j());
        }
        if (cVar.mo8260d()) {
            return m8453i().getAllowFileAccess();
        }
        throw C1460j1.m8361a();
    }

    @Override // p073e2.AbstractC7106j
    /* renamed from: c */
    public boolean mo8457c() {
        AbstractC1431a.c cVar = C1460j1.f6440o;
        if (cVar.mo8259c()) {
            return C1440d.m8295c(m8454j());
        }
        if (cVar.mo8260d()) {
            return m8453i().getBlockNetworkLoads();
        }
        throw C1460j1.m8361a();
    }

    @Override // p073e2.AbstractC7106j
    /* renamed from: d */
    public int mo8458d() {
        AbstractC1431a.c cVar = C1460j1.f6437l;
        if (cVar.mo8259c()) {
            return C1440d.m8296d(m8454j());
        }
        if (cVar.mo8260d()) {
            return m8453i().getCacheMode();
        }
        throw C1460j1.m8361a();
    }

    @Override // p073e2.AbstractC7106j
    /* renamed from: e */
    public void mo8459e(boolean z10) {
        AbstractC1431a.c cVar = C1460j1.f6438m;
        if (cVar.mo8259c()) {
            C1440d.m8303k(m8454j(), z10);
        } else {
            if (!cVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8453i().setAllowContentAccess(z10);
        }
    }

    @Override // p073e2.AbstractC7106j
    /* renamed from: f */
    public void mo8460f(boolean z10) {
        AbstractC1431a.c cVar = C1460j1.f6439n;
        if (cVar.mo8259c()) {
            C1440d.m8304l(m8454j(), z10);
        } else {
            if (!cVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8453i().setAllowFileAccess(z10);
        }
    }

    @Override // p073e2.AbstractC7106j
    /* renamed from: g */
    public void mo8461g(boolean z10) {
        AbstractC1431a.c cVar = C1460j1.f6440o;
        if (cVar.mo8259c()) {
            C1440d.m8305m(m8454j(), z10);
        } else {
            if (!cVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8453i().setBlockNetworkLoads(z10);
        }
    }

    @Override // p073e2.AbstractC7106j
    /* renamed from: h */
    public void mo8462h(int i10) {
        AbstractC1431a.c cVar = C1460j1.f6437l;
        if (cVar.mo8259c()) {
            C1440d.m8306n(m8454j(), i10);
        } else {
            if (!cVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8453i().setCacheMode(i10);
        }
    }
}
