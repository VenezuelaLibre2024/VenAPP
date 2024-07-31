package xd;

/* loaded from: classes.dex */
public final class f implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final e f31188a;

    public f(e eVar) {
        this.f31188a = eVar;
    }

    public static f a(e eVar) {
        return new f(eVar);
    }

    public static qd.q c(e eVar) {
        return (qd.q) td.d.d(eVar.a());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public qd.q get() {
        return c(this.f31188a);
    }
}
