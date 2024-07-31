package zk;

import gk.Continuation;

/* loaded from: classes3.dex */
public final class z2<T> extends el.d0<T> {

    /* renamed from: e, reason: collision with root package name */
    private final ThreadLocal<ck.m<gk.f, Object>> f32953e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z2(gk.f r3, gk.Continuation<? super T> r4) {
        /*
            r2 = this;
            zk.a3 r0 = zk.a3.f32842a
            gk.f$b r1 = r3.b(r0)
            if (r1 != 0) goto Ld
            gk.f r0 = r3.U(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f32953e = r0
            gk.f r4 = r4.getContext()
            gk.d$b r0 = gk.d.f16291n
            gk.f$b r4 = r4.b(r0)
            boolean r4 = r4 instanceof zk.h0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = el.l0.c(r3, r4)
            el.l0.a(r3, r4)
            r2.S0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.z2.<init>(gk.f, gk.Continuation):void");
    }

    @Override // el.d0, zk.a
    protected void N0(Object obj) {
        if (this.threadLocalIsSet) {
            ck.m<gk.f, Object> mVar = this.f32953e.get();
            if (mVar != null) {
                el.l0.a(mVar.a(), mVar.b());
            }
            this.f32953e.remove();
        }
        Object a10 = e0.a(obj, this.f14761d);
        Continuation<T> continuation = this.f14761d;
        gk.f context = continuation.getContext();
        Object c10 = el.l0.c(context, null);
        z2<?> g10 = c10 != el.l0.f14782a ? g0.g(continuation, context, c10) : null;
        try {
            this.f14761d.resumeWith(a10);
            ck.v vVar = ck.v.f7137a;
        } finally {
            if (g10 == null || g10.R0()) {
                el.l0.a(context, c10);
            }
        }
    }

    public final boolean R0() {
        boolean z10 = this.threadLocalIsSet && this.f32953e.get() == null;
        this.f32953e.remove();
        return !z10;
    }

    public final void S0(gk.f fVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f32953e.set(ck.r.a(fVar, obj));
    }
}
