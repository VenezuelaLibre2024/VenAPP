package cf;

/* loaded from: classes2.dex */
public final class a implements kd.a {

    /* renamed from: a */
    public static final kd.a f7079a = new a();

    /* renamed from: cf.a$a */
    /* loaded from: classes2.dex */
    private static final class C0121a implements jd.d<d> {

        /* renamed from: a */
        static final C0121a f7080a = new C0121a();

        /* renamed from: b */
        private static final jd.c f7081b = jd.c.d("rolloutId");

        /* renamed from: c */
        private static final jd.c f7082c = jd.c.d("variantId");

        /* renamed from: d */
        private static final jd.c f7083d = jd.c.d("parameterKey");

        /* renamed from: e */
        private static final jd.c f7084e = jd.c.d("parameterValue");

        /* renamed from: f */
        private static final jd.c f7085f = jd.c.d("templateVersion");

        private C0121a() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(d dVar, jd.e eVar) {
            eVar.add(f7081b, dVar.d());
            eVar.add(f7082c, dVar.f());
            eVar.add(f7083d, dVar.b());
            eVar.add(f7084e, dVar.c());
            eVar.add(f7085f, dVar.e());
        }
    }

    private a() {
    }

    @Override // kd.a
    public void configure(kd.b<?> bVar) {
        C0121a c0121a = C0121a.f7080a;
        bVar.registerEncoder(d.class, c0121a);
        bVar.registerEncoder(b.class, c0121a);
    }
}
