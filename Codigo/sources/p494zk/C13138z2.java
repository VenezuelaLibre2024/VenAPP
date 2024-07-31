package p494zk;

import ck.C2028m;
import ck.C2033r;
import ck.C2037v;
import p089el.C7215d0;
import p089el.C7231l0;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;

/* renamed from: zk.z2 */
/* loaded from: classes3.dex */
public final class C13138z2<T> extends C7215d0<T> {

    /* renamed from: e */
    private final ThreadLocal<C2028m<InterfaceC7587f, Object>> f35504e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C13138z2(p124gk.InterfaceC7587f r3, p124gk.Continuation<? super T> r4) {
        /*
            r2 = this;
            zk.a3 r0 = p494zk.C13036a3.f35393a
            gk.f$b r1 = r3.mo20647b(r0)
            if (r1 != 0) goto Ld
            gk.f r0 = r3.mo20646U(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f35504e = r0
            gk.f r4 = r4.getContext()
            gk.d$b r0 = p124gk.InterfaceC7585d.f17928n
            gk.f$b r4 = r4.mo20647b(r0)
            boolean r4 = r4 instanceof p494zk.AbstractC13064h0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = p089el.C7231l0.m21612c(r3, r4)
            p089el.C7231l0.m21610a(r3, r4)
            r2.m43336S0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p494zk.C13138z2.<init>(gk.f, gk.Continuation):void");
    }

    @Override // p089el.C7215d0, p494zk.AbstractC13032a
    /* renamed from: N0 */
    protected void mo21550N0(Object obj) {
        if (this.threadLocalIsSet) {
            C2028m<InterfaceC7587f, Object> c2028m = this.f35504e.get();
            if (c2028m != null) {
                C7231l0.m21610a(c2028m.m10335a(), c2028m.m10336b());
            }
            this.f35504e.remove();
        }
        Object m43147a = C13052e0.m43147a(obj, this.f16184d);
        Continuation<T> continuation = this.f16184d;
        InterfaceC7587f context = continuation.getContext();
        Object m21612c = C7231l0.m21612c(context, null);
        C13138z2<?> m43169g = m21612c != C7231l0.f16205a ? C13060g0.m43169g(continuation, context, m21612c) : null;
        try {
            this.f16184d.resumeWith(m43147a);
            C2037v c2037v = C2037v.f8089a;
        } finally {
            if (m43169g == null || m43169g.m43335R0()) {
                C7231l0.m21610a(context, m21612c);
            }
        }
    }

    /* renamed from: R0 */
    public final boolean m43335R0() {
        boolean z10 = this.threadLocalIsSet && this.f35504e.get() == null;
        this.f35504e.remove();
        return !z10;
    }

    /* renamed from: S0 */
    public final void m43336S0(InterfaceC7587f interfaceC7587f, Object obj) {
        this.threadLocalIsSet = true;
        this.f35504e.set(C2033r.m10353a(interfaceC7587f, obj));
    }
}
