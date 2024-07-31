package be;

/* loaded from: classes.dex */
public final class y implements rd.b<String> {

    /* renamed from: a, reason: collision with root package name */
    private final w f6486a;

    public y(w wVar) {
        this.f6486a = wVar;
    }

    public static y a(w wVar) {
        return new y(wVar);
    }

    public static String c(w wVar) {
        return (String) rd.d.e(wVar.b());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f6486a);
    }
}
