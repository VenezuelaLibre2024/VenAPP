package zd;

/* loaded from: classes.dex */
public final class u implements rd.b<t> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<w0> f32751a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<ce.a> f32752b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<o3> f32753c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<m3> f32754d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<k> f32755e;

    /* renamed from: f, reason: collision with root package name */
    private final bk.a<de.m> f32756f;

    /* renamed from: g, reason: collision with root package name */
    private final bk.a<q2> f32757g;

    /* renamed from: h, reason: collision with root package name */
    private final bk.a<n> f32758h;

    public u(bk.a<w0> aVar, bk.a<ce.a> aVar2, bk.a<o3> aVar3, bk.a<m3> aVar4, bk.a<k> aVar5, bk.a<de.m> aVar6, bk.a<q2> aVar7, bk.a<n> aVar8) {
        this.f32751a = aVar;
        this.f32752b = aVar2;
        this.f32753c = aVar3;
        this.f32754d = aVar4;
        this.f32755e = aVar5;
        this.f32756f = aVar6;
        this.f32757g = aVar7;
        this.f32758h = aVar8;
    }

    public static u a(bk.a<w0> aVar, bk.a<ce.a> aVar2, bk.a<o3> aVar3, bk.a<m3> aVar4, bk.a<k> aVar5, bk.a<de.m> aVar6, bk.a<q2> aVar7, bk.a<n> aVar8) {
        return new u(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static t c(w0 w0Var, ce.a aVar, o3 o3Var, m3 m3Var, k kVar, de.m mVar, q2 q2Var, n nVar) {
        return new t(w0Var, aVar, o3Var, m3Var, kVar, mVar, q2Var, nVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f32751a.get(), this.f32752b.get(), this.f32753c.get(), this.f32754d.get(), this.f32755e.get(), this.f32756f.get(), this.f32757g.get(), this.f32758h.get());
    }
}
