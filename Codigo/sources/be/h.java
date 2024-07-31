package be;

/* loaded from: classes.dex */
public final class h implements rd.b<fe.f> {

    /* renamed from: a, reason: collision with root package name */
    private final d f6446a;

    public h(d dVar) {
        this.f6446a = dVar;
    }

    public static h a(d dVar) {
        return new h(dVar);
    }

    public static fe.f c(d dVar) {
        return (fe.f) rd.d.e(dVar.d());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public fe.f get() {
        return c(this.f6446a);
    }
}
