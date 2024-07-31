package xd;

/* loaded from: classes.dex */
public final class r implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f31214a;

    public r(q qVar) {
        this.f31214a = qVar;
    }

    public static r a(q qVar) {
        return new r(qVar);
    }

    public static ud.l c(q qVar) {
        return (ud.l) td.d.d(qVar.a());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ud.l get() {
        return c(this.f31214a);
    }
}
