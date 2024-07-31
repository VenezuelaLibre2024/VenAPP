package be;

/* loaded from: classes.dex */
public final class x implements rd.b<vi.d> {

    /* renamed from: a, reason: collision with root package name */
    private final w f6484a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<String> f6485b;

    public x(w wVar, bk.a<String> aVar) {
        this.f6484a = wVar;
        this.f6485b = aVar;
    }

    public static x a(w wVar, bk.a<String> aVar) {
        return new x(wVar, aVar);
    }

    public static vi.d c(w wVar, String str) {
        return (vi.d) rd.d.e(wVar.a(str));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public vi.d get() {
        return c(this.f6484a, this.f6485b.get());
    }
}
