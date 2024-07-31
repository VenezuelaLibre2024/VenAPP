package be;

import android.app.Application;
import zd.u2;

/* loaded from: classes.dex */
public final class j0 implements rd.b<u2> {

    /* renamed from: a, reason: collision with root package name */
    private final h0 f6452a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<Application> f6453b;

    public j0(h0 h0Var, bk.a<Application> aVar) {
        this.f6452a = h0Var;
        this.f6453b = aVar;
    }

    public static j0 a(h0 h0Var, bk.a<Application> aVar) {
        return new j0(h0Var, aVar);
    }

    public static u2 c(h0 h0Var, Application application) {
        return (u2) rd.d.e(h0Var.b(application));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u2 get() {
        return c(this.f6452a, this.f6453b.get());
    }
}
