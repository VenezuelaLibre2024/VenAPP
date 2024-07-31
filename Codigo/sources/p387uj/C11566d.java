package p387uj;

import dj.AbstractC6993r;
import java.util.concurrent.ThreadFactory;

/* renamed from: uj.d */
/* loaded from: classes3.dex */
public final class C11566d extends AbstractC6993r {

    /* renamed from: c */
    private static final ThreadFactoryC11568f f30061c = new ThreadFactoryC11568f("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f30062b;

    public C11566d() {
        this(f30061c);
    }

    public C11566d(ThreadFactory threadFactory) {
        this.f30062b = threadFactory;
    }

    @Override // dj.AbstractC6993r
    /* renamed from: a */
    public AbstractC6993r.b mo20298a() {
        return new C11567e(this.f30062b);
    }
}
