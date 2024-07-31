package hc;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    private final j f16684a;

    /* renamed from: b */
    private final Executor f16685b;

    /* renamed from: c */
    private final ScheduledExecutorService f16686c;

    /* renamed from: d */
    private volatile ScheduledFuture<?> f16687d;

    /* renamed from: e */
    private volatile long f16688e = -1;

    public m(j jVar, @dc.c Executor executor, @dc.b ScheduledExecutorService scheduledExecutorService) {
        this.f16684a = (j) com.google.android.gms.common.internal.s.j(jVar);
        this.f16685b = executor;
        this.f16686c = scheduledExecutorService;
    }

    private long d() {
        if (this.f16688e == -1) {
            return 30L;
        }
        if (this.f16688e * 2 < 960) {
            return this.f16688e * 2;
        }
        return 960L;
    }

    public /* synthetic */ void e(Exception exc) {
        h();
    }

    public void f() {
        this.f16684a.p().addOnFailureListener(this.f16685b, new OnFailureListener() { // from class: hc.l
            public /* synthetic */ l() {
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                m.this.e(exc);
            }
        });
    }

    private void h() {
        c();
        this.f16688e = d();
        this.f16687d = this.f16686c.schedule(new k(this), this.f16688e, TimeUnit.SECONDS);
    }

    public void c() {
        if (this.f16687d == null || this.f16687d.isDone()) {
            return;
        }
        this.f16687d.cancel(false);
    }

    public void g(long j10) {
        c();
        this.f16688e = -1L;
        this.f16687d = this.f16686c.schedule(new k(this), Math.max(0L, j10), TimeUnit.MILLISECONDS);
    }
}
