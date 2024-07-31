package be;

import zd.q3;

/* loaded from: classes.dex */
public final class i implements rd.b<q3> {

    /* renamed from: a, reason: collision with root package name */
    private final d f6447a;

    public i(d dVar) {
        this.f6447a = dVar;
    }

    public static i a(d dVar) {
        return new i(dVar);
    }

    public static q3 c(d dVar) {
        return (q3) rd.d.e(dVar.e());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q3 get() {
        return c(this.f6447a);
    }
}
