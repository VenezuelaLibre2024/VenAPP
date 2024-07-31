package xd;

/* loaded from: classes.dex */
public final class s implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f31215a;

    public s(q qVar) {
        this.f31215a = qVar;
    }

    public static s a(q qVar) {
        return new s(qVar);
    }

    public static de.i c(q qVar) {
        return (de.i) td.d.d(qVar.b());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public de.i get() {
        return c(this.f31215a);
    }
}
