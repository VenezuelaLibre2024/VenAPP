package be;

import android.app.Application;
import zd.u2;

/* loaded from: classes.dex */
public final class k0 implements rd.b<u2> {

    /* renamed from: a, reason: collision with root package name */
    private final h0 f6456a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<Application> f6457b;

    public k0(h0 h0Var, bk.a<Application> aVar) {
        this.f6456a = h0Var;
        this.f6457b = aVar;
    }

    public static k0 a(h0 h0Var, bk.a<Application> aVar) {
        return new k0(h0Var, aVar);
    }

    public static u2 c(h0 h0Var, Application application) {
        return (u2) rd.d.e(h0Var.c(application));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u2 get() {
        return c(this.f6456a, this.f6457b.get());
    }
}