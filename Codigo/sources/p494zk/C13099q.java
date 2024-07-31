package p494zk;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: zk.q */
/* loaded from: classes3.dex */
public final class C13099q extends C13033a0 {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f35473c = AtomicIntegerFieldUpdater.newUpdater(C13099q.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C13099q(p124gk.Continuation<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p494zk.C13099q.<init>(gk.Continuation, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean m43286c() {
        return f35473c.compareAndSet(this, 0, 1);
    }
}
