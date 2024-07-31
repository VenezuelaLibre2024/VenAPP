package p494zk;

import p089el.C7223h0;
import p089el.C7233m0;

/* renamed from: zk.s2 */
/* loaded from: classes3.dex */
public final class C13110s2 {

    /* renamed from: a */
    public static final C13110s2 f35479a = new C13110s2();

    /* renamed from: b */
    private static final ThreadLocal<AbstractC13061g1> f35480b = C7233m0.m21617a(new C7223h0("ThreadLocalEventLoop"));

    private C13110s2() {
    }

    /* renamed from: a */
    public final AbstractC13061g1 m43296a() {
        return f35480b.get();
    }

    /* renamed from: b */
    public final AbstractC13061g1 m43297b() {
        ThreadLocal<AbstractC13061g1> threadLocal = f35480b;
        AbstractC13061g1 abstractC13061g1 = threadLocal.get();
        if (abstractC13061g1 != null) {
            return abstractC13061g1;
        }
        AbstractC13061g1 m43222a = C13073j1.m43222a();
        threadLocal.set(m43222a);
        return m43222a;
    }

    /* renamed from: c */
    public final void m43298c() {
        f35480b.set(null);
    }

    /* renamed from: d */
    public final void m43299d(AbstractC13061g1 abstractC13061g1) {
        f35480b.set(abstractC13061g1);
    }
}
