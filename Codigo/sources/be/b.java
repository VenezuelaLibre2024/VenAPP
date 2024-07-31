package be;

/* loaded from: classes.dex */
public final class b implements rd.b<ij.a<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final a f6423a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<zd.c> f6424b;

    public b(a aVar, bk.a<zd.c> aVar2) {
        this.f6423a = aVar;
        this.f6424b = aVar2;
    }

    public static b a(a aVar, bk.a<zd.c> aVar2) {
        return new b(aVar, aVar2);
    }

    public static ij.a<String> c(a aVar, zd.c cVar) {
        return (ij.a) rd.d.e(aVar.a(cVar));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ij.a<String> get() {
        return c(this.f6423a, this.f6424b.get());
    }
}
