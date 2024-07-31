package be;

import android.app.Application;

/* loaded from: classes.dex */
public final class p implements rd.b<Application> {

    /* renamed from: a, reason: collision with root package name */
    private final n f6464a;

    public p(n nVar) {
        this.f6464a = nVar;
    }

    public static p a(n nVar) {
        return new p(nVar);
    }

    public static Application c(n nVar) {
        return (Application) rd.d.e(nVar.b());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f6464a);
    }
}
