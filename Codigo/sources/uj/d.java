package uj;

import dj.r;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class d extends r {

    /* renamed from: c, reason: collision with root package name */
    private static final f f27738c = new f("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b, reason: collision with root package name */
    final ThreadFactory f27739b;

    public d() {
        this(f27738c);
    }

    public d(ThreadFactory threadFactory) {
        this.f27739b = threadFactory;
    }

    @Override // dj.r
    public r.b a() {
        return new e(this.f27739b);
    }
}
