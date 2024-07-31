package wc;

/* loaded from: classes.dex */
public final class a implements kd.a {

    /* renamed from: a */
    public static final kd.a f29826a = new a();

    /* renamed from: wc.a$a */
    /* loaded from: classes.dex */
    private static final class C0482a implements jd.d<i> {

        /* renamed from: a */
        static final C0482a f29827a = new C0482a();

        /* renamed from: b */
        private static final jd.c f29828b = jd.c.d("rolloutId");

        /* renamed from: c */
        private static final jd.c f29829c = jd.c.d("parameterKey");

        /* renamed from: d */
        private static final jd.c f29830d = jd.c.d("parameterValue");

        /* renamed from: e */
        private static final jd.c f29831e = jd.c.d("variantId");

        /* renamed from: f */
        private static final jd.c f29832f = jd.c.d("templateVersion");

        private C0482a() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(i iVar, jd.e eVar) {
            eVar.add(f29828b, iVar.e());
            eVar.add(f29829c, iVar.c());
            eVar.add(f29830d, iVar.d());
            eVar.add(f29831e, iVar.g());
            eVar.add(f29832f, iVar.f());
        }
    }

    private a() {
    }

    @Override // kd.a
    public void configure(kd.b<?> bVar) {
        C0482a c0482a = C0482a.f29827a;
        bVar.registerEncoder(i.class, c0482a);
        bVar.registerEncoder(b.class, c0482a);
    }
}
