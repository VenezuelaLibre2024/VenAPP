package zk;

/* loaded from: classes3.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final s2 f32928a = new s2();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<g1> f32929b = el.m0.a(new el.h0("ThreadLocalEventLoop"));

    private s2() {
    }

    public final g1 a() {
        return f32929b.get();
    }

    public final g1 b() {
        ThreadLocal<g1> threadLocal = f32929b;
        g1 g1Var = threadLocal.get();
        if (g1Var != null) {
            return g1Var;
        }
        g1 a10 = j1.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void c() {
        f32929b.set(null);
    }

    public final void d(g1 g1Var) {
        f32929b.set(g1Var);
    }
}
