package be;

import android.app.Application;
import zd.u2;

/* loaded from: classes.dex */
public final class i0 implements rd.b<u2> {

    /* renamed from: a, reason: collision with root package name */
    private final h0 f6448a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<Application> f6449b;

    public i0(h0 h0Var, bk.a<Application> aVar) {
        this.f6448a = h0Var;
        this.f6449b = aVar;
    }

    public static i0 a(h0 h0Var, bk.a<Application> aVar) {
        return new i0(h0Var, aVar);
    }

    public static u2 c(h0 h0Var, Application application) {
        return (u2) rd.d.e(h0Var.a(application));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u2 get() {
        return c(this.f6448a, this.f6449b.get());
    }
}
