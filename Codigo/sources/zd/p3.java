package zd;

/* loaded from: classes.dex */
public final class p3 implements rd.b<o3> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<dj.r> f32704a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<dj.r> f32705b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<dj.r> f32706c;

    public p3(bk.a<dj.r> aVar, bk.a<dj.r> aVar2, bk.a<dj.r> aVar3) {
        this.f32704a = aVar;
        this.f32705b = aVar2;
        this.f32706c = aVar3;
    }

    public static p3 a(bk.a<dj.r> aVar, bk.a<dj.r> aVar2, bk.a<dj.r> aVar3) {
        return new p3(aVar, aVar2, aVar3);
    }

    public static o3 c(dj.r rVar, dj.r rVar2, dj.r rVar3) {
        return new o3(rVar, rVar2, rVar3);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o3 get() {
        return c(this.f32704a.get(), this.f32705b.get(), this.f32706c.get());
    }
}
