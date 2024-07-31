package h6;

/* loaded from: classes.dex */
public final class w implements j6.b<u> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<r6.a> f16465a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<r6.a> f16466b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<n6.e> f16467c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<o6.r> f16468d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<o6.v> f16469e;

    public w(bk.a<r6.a> aVar, bk.a<r6.a> aVar2, bk.a<n6.e> aVar3, bk.a<o6.r> aVar4, bk.a<o6.v> aVar5) {
        this.f16465a = aVar;
        this.f16466b = aVar2;
        this.f16467c = aVar3;
        this.f16468d = aVar4;
        this.f16469e = aVar5;
    }

    public static w a(bk.a<r6.a> aVar, bk.a<r6.a> aVar2, bk.a<n6.e> aVar3, bk.a<o6.r> aVar4, bk.a<o6.v> aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(r6.a aVar, r6.a aVar2, n6.e eVar, o6.r rVar, o6.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f16465a.get(), this.f16466b.get(), this.f16467c.get(), this.f16468d.get(), this.f16469e.get());
    }
}
