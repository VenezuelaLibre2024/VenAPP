package p189k;

import java.util.concurrent.Executor;

/* renamed from: k.c */
/* loaded from: classes.dex */
public class C9095c extends AbstractC9098f {

    /* renamed from: c */
    private static volatile C9095c f21840c;

    /* renamed from: d */
    private static final Executor f21841d = new Executor() { // from class: k.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C9095c.m26718i(runnable);
        }
    };

    /* renamed from: e */
    private static final Executor f21842e = new Executor() { // from class: k.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C9095c.m26719j(runnable);
        }
    };

    /* renamed from: a */
    private AbstractC9098f f21843a;

    /* renamed from: b */
    private final AbstractC9098f f21844b;

    private C9095c() {
        C9096d c9096d = new C9096d();
        this.f21844b = c9096d;
        this.f21843a = c9096d;
    }

    /* renamed from: g */
    public static Executor m26716g() {
        return f21842e;
    }

    /* renamed from: h */
    public static C9095c m26717h() {
        if (f21840c != null) {
            return f21840c;
        }
        synchronized (C9095c.class) {
            if (f21840c == null) {
                f21840c = new C9095c();
            }
        }
        return f21840c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m26718i(Runnable runnable) {
        m26717h().mo26722d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m26719j(Runnable runnable) {
        m26717h().mo26720a(runnable);
    }

    @Override // p189k.AbstractC9098f
    /* renamed from: a */
    public void mo26720a(Runnable runnable) {
        this.f21843a.mo26720a(runnable);
    }

    @Override // p189k.AbstractC9098f
    /* renamed from: c */
    public boolean mo26721c() {
        return this.f21843a.mo26721c();
    }

    @Override // p189k.AbstractC9098f
    /* renamed from: d */
    public void mo26722d(Runnable runnable) {
        this.f21843a.mo26722d(runnable);
    }
}
