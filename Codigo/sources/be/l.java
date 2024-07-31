package be;

/* loaded from: classes.dex */
public final class l implements rd.b<cc.a> {

    /* renamed from: a, reason: collision with root package name */
    private final k f6458a;

    public l(k kVar) {
        this.f6458a = kVar;
    }

    public static l a(k kVar) {
        return new l(kVar);
    }

    public static cc.a c(k kVar) {
        return (cc.a) rd.d.e(kVar.a());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public cc.a get() {
        return c(this.f6458a);
    }
}
