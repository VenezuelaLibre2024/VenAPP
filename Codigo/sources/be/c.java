package be;

/* loaded from: classes.dex */
public final class c implements rd.b<zd.c> {

    /* renamed from: a, reason: collision with root package name */
    private final a f6428a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<cc.a> f6429b;

    public c(a aVar, bk.a<cc.a> aVar2) {
        this.f6428a = aVar;
        this.f6429b = aVar2;
    }

    public static c a(a aVar, bk.a<cc.a> aVar2) {
        return new c(aVar, aVar2);
    }

    public static zd.c c(a aVar, cc.a aVar2) {
        return (zd.c) rd.d.e(aVar.b(aVar2));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public zd.c get() {
        return c(this.f6428a, this.f6429b.get());
    }
}
