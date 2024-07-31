package p138hc;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p063dc.InterfaceC6880b;
import p063dc.InterfaceC6881c;

/* renamed from: hc.m */
/* loaded from: classes.dex */
public class C7706m {

    /* renamed from: a */
    private final C7703j f18334a;

    /* renamed from: b */
    private final Executor f18335b;

    /* renamed from: c */
    private final ScheduledExecutorService f18336c;

    /* renamed from: d */
    private volatile ScheduledFuture<?> f18337d;

    /* renamed from: e */
    private volatile long f18338e = -1;

    public C7706m(C7703j c7703j, @InterfaceC6881c Executor executor, @InterfaceC6880b ScheduledExecutorService scheduledExecutorService) {
        this.f18334a = (C7703j) C5276s.m13324j(c7703j);
        this.f18335b = executor;
        this.f18336c = scheduledExecutorService;
    }

    /* renamed from: d */
    private long m23464d() {
        if (this.f18338e == -1) {
            return 30L;
        }
        if (this.f18338e * 2 < 960) {
            return this.f18338e * 2;
        }
        return 960L;
    }

    /* renamed from: e */
    public /* synthetic */ void m23465e(Exception exc) {
        m23467h();
    }

    /* renamed from: f */
    public void m23466f() {
        this.f18334a.m23459p().addOnFailureListener(this.f18335b, new OnFailureListener() { // from class: hc.l
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C7706m.this.m23465e(exc);
            }
        });
    }

    /* renamed from: h */
    private void m23467h() {
        m23468c();
        this.f18338e = m23464d();
        this.f18337d = this.f18336c.schedule(new RunnableC7704k(this), this.f18338e, TimeUnit.SECONDS);
    }

    /* renamed from: c */
    public void m23468c() {
        if (this.f18337d == null || this.f18337d.isDone()) {
            return;
        }
        this.f18337d.cancel(false);
    }

    /* renamed from: g */
    public void m23469g(long j10) {
        m23468c();
        this.f18338e = -1L;
        this.f18337d = this.f18336c.schedule(new RunnableC7704k(this), Math.max(0L, j10), TimeUnit.MILLISECONDS);
    }
}
