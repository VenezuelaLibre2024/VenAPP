package xd;

import android.app.Application;

/* loaded from: classes.dex */
public final class b implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f31183a;

    public b(a aVar) {
        this.f31183a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static Application c(a aVar) {
        return (Application) td.d.d(aVar.a());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f31183a);
    }
}
