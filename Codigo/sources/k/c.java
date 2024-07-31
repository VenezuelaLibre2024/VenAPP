package k;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends f {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f20061c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f20062d = new Executor() { // from class: k.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.i(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f20063e = new Executor() { // from class: k.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.j(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private f f20064a;

    /* renamed from: b, reason: collision with root package name */
    private final f f20065b;

    private c() {
        d dVar = new d();
        this.f20065b = dVar;
        this.f20064a = dVar;
    }

    public static Executor g() {
        return f20063e;
    }

    public static c h() {
        if (f20061c != null) {
            return f20061c;
        }
        synchronized (c.class) {
            if (f20061c == null) {
                f20061c = new c();
            }
        }
        return f20061c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        h().d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Runnable runnable) {
        h().a(runnable);
    }

    @Override // k.f
    public void a(Runnable runnable) {
        this.f20064a.a(runnable);
    }

    @Override // k.f
    public boolean c() {
        return this.f20064a.c();
    }

    @Override // k.f
    public void d(Runnable runnable) {
        this.f20064a.d(runnable);
    }
}
