package p494zk;

import hk.C7752d;
import kotlin.coroutines.jvm.internal.C9302h;
import p110fl.C7374b;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;

/* renamed from: zk.x2 */
/* loaded from: classes3.dex */
public final class C13130x2 {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4 == null) goto L9;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p494zk.C13122v2 m43322a(long r2, p494zk.InterfaceC13112t0 r4, p494zk.InterfaceC13125w1 r5) {
        /*
            boolean r0 = r4 instanceof p494zk.InterfaceC13120v0
            if (r0 == 0) goto L7
            zk.v0 r4 = (p494zk.InterfaceC13120v0) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            yk.a$a r0 = p472yk.C12728a.f34547b
            yk.d r0 = p472yk.EnumC12731d.MILLISECONDS
            long r0 = p472yk.C12730c.m42042i(r2, r0)
            java.lang.String r4 = r4.m43308H(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: p494zk.C13130x2.m43322a(long, zk.t0, zk.w1):zk.v2");
    }

    /* renamed from: b */
    private static final <U, T extends U> Object m43323b(RunnableC13126w2<U, ? super T> runnableC13126w2, InterfaceC10002p<? super InterfaceC13076k0, ? super Continuation<? super T>, ? extends Object> interfaceC10002p) {
        C13035a2.m43048g(runnableC13126w2, C13116u0.m43301a(runnableC13126w2.f16184d.getContext()).mo629o(runnableC13126w2.f35493e, runnableC13126w2, runnableC13126w2.getContext()));
        return C7374b.m22246c(runnableC13126w2, runnableC13126w2, interfaceC10002p);
    }

    /* renamed from: c */
    public static final <T> Object m43324c(long j10, InterfaceC10002p<? super InterfaceC13076k0, ? super Continuation<? super T>, ? extends Object> interfaceC10002p, Continuation<? super T> continuation) {
        Object m23655c;
        if (j10 <= 0) {
            throw new C13122v2("Timed out immediately");
        }
        Object m43323b = m43323b(new RunnableC13126w2(j10, continuation), interfaceC10002p);
        m23655c = C7752d.m23655c();
        if (m43323b == m23655c) {
            C9302h.m27753c(continuation);
        }
        return m43323b;
    }
}
