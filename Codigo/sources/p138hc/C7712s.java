package p138hc;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c;
import com.google.android.gms.common.internal.C5276s;
import ec.AbstractC7173c;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p063dc.InterfaceC6880b;
import p063dc.InterfaceC6881c;
import p160ic.InterfaceC7957a;

/* renamed from: hc.s */
/* loaded from: classes.dex */
public final class C7712s {

    /* renamed from: a */
    private final C7706m f18355a;

    /* renamed from: b */
    private final InterfaceC7957a f18356b;

    /* renamed from: c */
    private volatile boolean f18357c;

    /* renamed from: d */
    private volatile int f18358d;

    /* renamed from: e */
    private volatile long f18359e;

    /* renamed from: f */
    private volatile boolean f18360f;

    /* renamed from: hc.s$a */
    /* loaded from: classes.dex */
    class a implements ComponentCallbacks2C5119c.a {

        /* renamed from: a */
        final /* synthetic */ C7706m f18361a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC7957a f18362b;

        a(C7706m c7706m, InterfaceC7957a interfaceC7957a) {
            this.f18361a = c7706m;
            this.f18362b = interfaceC7957a;
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C5119c.a
        /* renamed from: a */
        public void mo13016a(boolean z10) {
            C7712s.this.f18357c = z10;
            if (z10) {
                this.f18361a.m23468c();
            } else if (C7712s.this.m23493g()) {
                this.f18361a.m23469g(C7712s.this.f18359e - this.f18362b.mo24442a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7712s(Context context, C7703j c7703j, @InterfaceC6881c Executor executor, @InterfaceC6880b ScheduledExecutorService scheduledExecutorService) {
        this((Context) C5276s.m13324j(context), new C7706m((C7703j) C5276s.m13324j(c7703j), executor, scheduledExecutorService), new InterfaceC7957a.a());
    }

    C7712s(Context context, C7706m c7706m, InterfaceC7957a interfaceC7957a) {
        this.f18355a = c7706m;
        this.f18356b = interfaceC7957a;
        this.f18359e = -1L;
        ComponentCallbacks2C5119c.m13011c((Application) context.getApplicationContext());
        ComponentCallbacks2C5119c.m13010b().m13013a(new a(c7706m, interfaceC7957a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m23493g() {
        return this.f18360f && !this.f18357c && this.f18358d > 0 && this.f18359e != -1;
    }

    /* renamed from: d */
    public void m23494d(AbstractC7173c abstractC7173c) {
        C7695b m23433d = abstractC7173c instanceof C7695b ? (C7695b) abstractC7173c : C7695b.m23433d(abstractC7173c.mo21368b());
        this.f18359e = m23433d.m23437h() + ((long) (m23433d.m23436f() * 0.5d)) + 300000;
        if (this.f18359e > m23433d.mo21367a()) {
            this.f18359e = m23433d.mo21367a() - 60000;
        }
        if (m23493g()) {
            this.f18355a.m23469g(this.f18359e - this.f18356b.mo24442a());
        }
    }

    /* renamed from: e */
    public void m23495e(int i10) {
        if (this.f18358d == 0 && i10 > 0) {
            this.f18358d = i10;
            if (m23493g()) {
                this.f18355a.m23469g(this.f18359e - this.f18356b.mo24442a());
            }
        } else if (this.f18358d > 0 && i10 == 0) {
            this.f18355a.m23468c();
        }
        this.f18358d = i10;
    }

    /* renamed from: f */
    public void m23496f(boolean z10) {
        this.f18360f = z10;
    }
}
