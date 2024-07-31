package ud;

/* loaded from: classes.dex */
public final class f implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<com.bumptech.glide.k> f27602a;

    public f(bk.a<com.bumptech.glide.k> aVar) {
        this.f27602a = aVar;
    }

    public static f a(bk.a<com.bumptech.glide.k> aVar) {
        return new f(aVar);
    }

    public static e c(com.bumptech.glide.k kVar) {
        return new e(kVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f27602a.get());
    }
}
