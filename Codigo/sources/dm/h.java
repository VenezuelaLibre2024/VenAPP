package dm;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class h extends y {

    /* renamed from: f, reason: collision with root package name */
    private y f14298f;

    public h(y delegate) {
        kotlin.jvm.internal.n.e(delegate, "delegate");
        this.f14298f = delegate;
    }

    @Override // dm.y
    public y a() {
        return this.f14298f.a();
    }

    @Override // dm.y
    public y b() {
        return this.f14298f.b();
    }

    @Override // dm.y
    public long c() {
        return this.f14298f.c();
    }

    @Override // dm.y
    public y d(long j10) {
        return this.f14298f.d(j10);
    }

    @Override // dm.y
    public boolean e() {
        return this.f14298f.e();
    }

    @Override // dm.y
    public void f() {
        this.f14298f.f();
    }

    @Override // dm.y
    public y g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.n.e(unit, "unit");
        return this.f14298f.g(j10, unit);
    }

    public final y i() {
        return this.f14298f;
    }

    public final h j(y delegate) {
        kotlin.jvm.internal.n.e(delegate, "delegate");
        this.f14298f = delegate;
        return this;
    }
}
