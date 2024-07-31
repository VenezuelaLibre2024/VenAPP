package l2;

import f2.m;

/* loaded from: classes.dex */
public class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.e0 f20865a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.o f20866b = new androidx.work.impl.o();

    public t(androidx.work.impl.e0 e0Var) {
        this.f20865a = e0Var;
    }

    public f2.m a() {
        return this.f20866b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f20865a.r().J().b();
            this.f20866b.a(f2.m.f14891a);
        } catch (Throwable th2) {
            this.f20866b.a(new m.b.a(th2));
        }
    }
}
