package zk;

import gk.Continuation;

/* loaded from: classes3.dex */
public final class x2 {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final zk.v2 a(long r2, zk.t0 r4, zk.w1 r5) {
        /*
            boolean r0 = r4 instanceof zk.v0
            if (r0 == 0) goto L7
            zk.v0 r4 = (zk.v0) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            yk.a$a r0 = yk.a.f32011b
            yk.d r0 = yk.d.MILLISECONDS
            long r0 = yk.c.i(r2, r0)
            java.lang.String r4 = r4.H(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            zk.v2 r2 = new zk.v2
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.x2.a(long, zk.t0, zk.w1):zk.v2");
    }

    private static final <U, T extends U> Object b(w2<U, ? super T> w2Var, ok.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar) {
        a2.g(w2Var, u0.a(w2Var.f14761d.getContext()).o(w2Var.f32942e, w2Var, w2Var.getContext()));
        return fl.b.c(w2Var, w2Var, pVar);
    }

    public static final <T> Object c(long j10, ok.p<? super k0, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        Object c10;
        if (j10 <= 0) {
            throw new v2("Timed out immediately");
        }
        Object b10 = b(new w2(j10, continuation), pVar);
        c10 = hk.d.c();
        if (b10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return b10;
    }
}
