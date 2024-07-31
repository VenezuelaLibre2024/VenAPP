package p6;

/* loaded from: classes.dex */
public final class n0 implements j6.b<m0> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<r6.a> f22823a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<r6.a> f22824b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<e> f22825c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<t0> f22826d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<String> f22827e;

    public n0(bk.a<r6.a> aVar, bk.a<r6.a> aVar2, bk.a<e> aVar3, bk.a<t0> aVar4, bk.a<String> aVar5) {
        this.f22823a = aVar;
        this.f22824b = aVar2;
        this.f22825c = aVar3;
        this.f22826d = aVar4;
        this.f22827e = aVar5;
    }

    public static n0 a(bk.a<r6.a> aVar, bk.a<r6.a> aVar2, bk.a<e> aVar3, bk.a<t0> aVar4, bk.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(r6.a aVar, r6.a aVar2, Object obj, Object obj2, bk.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f22823a.get(), this.f22824b.get(), this.f22825c.get(), this.f22826d.get(), this.f22827e);
    }
}
