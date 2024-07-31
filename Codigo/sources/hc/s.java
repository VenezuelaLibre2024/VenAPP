package hc;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.c;
import ic.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    private final m f16705a;

    /* renamed from: b */
    private final ic.a f16706b;

    /* renamed from: c */
    private volatile boolean f16707c;

    /* renamed from: d */
    private volatile int f16708d;

    /* renamed from: e */
    private volatile long f16709e;

    /* renamed from: f */
    private volatile boolean f16710f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.a {

        /* renamed from: a */
        final /* synthetic */ m f16711a;

        /* renamed from: b */
        final /* synthetic */ ic.a f16712b;

        a(m mVar, ic.a aVar) {
            this.f16711a = mVar;
            this.f16712b = aVar;
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public void a(boolean z10) {
            s.this.f16707c = z10;
            if (z10) {
                this.f16711a.c();
            } else if (s.this.g()) {
                this.f16711a.g(s.this.f16709e - this.f16712b.a());
            }
        }
    }

    public s(Context context, j jVar, @dc.c Executor executor, @dc.b ScheduledExecutorService scheduledExecutorService) {
        this((Context) com.google.android.gms.common.internal.s.j(context), new m((j) com.google.android.gms.common.internal.s.j(jVar), executor, scheduledExecutorService), new a.C0286a());
    }

    s(Context context, m mVar, ic.a aVar) {
        this.f16705a = mVar;
        this.f16706b = aVar;
        this.f16709e = -1L;
        com.google.android.gms.common.api.internal.c.c((Application) context.getApplicationContext());
        com.google.android.gms.common.api.internal.c.b().a(new a(mVar, aVar));
    }

    public boolean g() {
        return this.f16710f && !this.f16707c && this.f16708d > 0 && this.f16709e != -1;
    }

    public void d(ec.c cVar) {
        b d10 = cVar instanceof b ? (b) cVar : b.d(cVar.b());
        this.f16709e = d10.h() + ((long) (d10.f() * 0.5d)) + 300000;
        if (this.f16709e > d10.a()) {
            this.f16709e = d10.a() - 60000;
        }
        if (g()) {
            this.f16705a.g(this.f16709e - this.f16706b.a());
        }
    }

    public void e(int i10) {
        if (this.f16708d == 0 && i10 > 0) {
            this.f16708d = i10;
            if (g()) {
                this.f16705a.g(this.f16709e - this.f16706b.a());
            }
        } else if (this.f16708d > 0 && i10 == 0) {
            this.f16705a.c();
        }
        this.f16708d = i10;
    }

    public void f(boolean z10) {
        this.f16710f = z10;
    }
}
