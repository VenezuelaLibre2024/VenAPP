package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.internal.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class y0 extends e2.j {

    /* renamed from: a */
    private ServiceWorkerWebSettings f5637a;

    /* renamed from: b */
    private ServiceWorkerWebSettingsBoundaryInterface f5638b;

    public y0(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f5637a = serviceWorkerWebSettings;
    }

    public y0(InvocationHandler invocationHandler) {
        this.f5638b = (ServiceWorkerWebSettingsBoundaryInterface) hm.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    private ServiceWorkerWebSettingsBoundaryInterface i() {
        if (this.f5638b == null) {
            this.f5638b = (ServiceWorkerWebSettingsBoundaryInterface) hm.a.a(ServiceWorkerWebSettingsBoundaryInterface.class, k1.c().e(this.f5637a));
        }
        return this.f5638b;
    }

    private ServiceWorkerWebSettings j() {
        if (this.f5637a == null) {
            this.f5637a = k1.c().d(Proxy.getInvocationHandler(this.f5638b));
        }
        return this.f5637a;
    }

    @Override // e2.j
    public boolean a() {
        a.c cVar = j1.f5587m;
        if (cVar.c()) {
            return d.a(j());
        }
        if (cVar.d()) {
            return i().getAllowContentAccess();
        }
        throw j1.a();
    }

    @Override // e2.j
    public boolean b() {
        a.c cVar = j1.f5588n;
        if (cVar.c()) {
            return d.b(j());
        }
        if (cVar.d()) {
            return i().getAllowFileAccess();
        }
        throw j1.a();
    }

    @Override // e2.j
    public boolean c() {
        a.c cVar = j1.f5589o;
        if (cVar.c()) {
            return d.c(j());
        }
        if (cVar.d()) {
            return i().getBlockNetworkLoads();
        }
        throw j1.a();
    }

    @Override // e2.j
    public int d() {
        a.c cVar = j1.f5586l;
        if (cVar.c()) {
            return d.d(j());
        }
        if (cVar.d()) {
            return i().getCacheMode();
        }
        throw j1.a();
    }

    @Override // e2.j
    public void e(boolean z10) {
        a.c cVar = j1.f5587m;
        if (cVar.c()) {
            d.k(j(), z10);
        } else {
            if (!cVar.d()) {
                throw j1.a();
            }
            i().setAllowContentAccess(z10);
        }
    }

    @Override // e2.j
    public void f(boolean z10) {
        a.c cVar = j1.f5588n;
        if (cVar.c()) {
            d.l(j(), z10);
        } else {
            if (!cVar.d()) {
                throw j1.a();
            }
            i().setAllowFileAccess(z10);
        }
    }

    @Override // e2.j
    public void g(boolean z10) {
        a.c cVar = j1.f5589o;
        if (cVar.c()) {
            d.m(j(), z10);
        } else {
            if (!cVar.d()) {
                throw j1.a();
            }
            i().setBlockNetworkLoads(z10);
        }
    }

    @Override // e2.j
    public void h(int i10) {
        a.c cVar = j1.f5586l;
        if (cVar.c()) {
            d.n(j(), i10);
        } else {
            if (!cVar.d()) {
                throw j1.a();
            }
            i().setCacheMode(i10);
        }
    }
}
