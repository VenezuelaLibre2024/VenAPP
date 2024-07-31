package be;

/* loaded from: classes.dex */
public final class a0 implements rd.b<vi.w0> {

    /* renamed from: a, reason: collision with root package name */
    private final z f6422a;

    public a0(z zVar) {
        this.f6422a = zVar;
    }

    public static a0 a(z zVar) {
        return new a0(zVar);
    }

    public static vi.w0 c(z zVar) {
        return (vi.w0) rd.d.e(zVar.b());
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public vi.w0 get() {
        return c(this.f6422a);
    }
}
