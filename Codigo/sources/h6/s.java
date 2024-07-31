package h6;

/* loaded from: classes.dex */
final class s<T> implements f6.f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p f16455a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16456b;

    /* renamed from: c, reason: collision with root package name */
    private final f6.b f16457c;

    /* renamed from: d, reason: collision with root package name */
    private final f6.e<T, byte[]> f16458d;

    /* renamed from: e, reason: collision with root package name */
    private final t f16459e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(p pVar, String str, f6.b bVar, f6.e<T, byte[]> eVar, t tVar) {
        this.f16455a = pVar;
        this.f16456b = str;
        this.f16457c = bVar;
        this.f16458d = eVar;
        this.f16459e = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }

    @Override // f6.f
    public void a(f6.c<T> cVar, f6.h hVar) {
        this.f16459e.a(o.a().e(this.f16455a).c(cVar).f(this.f16456b).d(this.f16458d).b(this.f16457c).a(), hVar);
    }

    @Override // f6.f
    public void b(f6.c<T> cVar) {
        a(cVar, new f6.h() { // from class: h6.r
            @Override // f6.h
            public final void a(Exception exc) {
                s.e(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p d() {
        return this.f16455a;
    }
}
