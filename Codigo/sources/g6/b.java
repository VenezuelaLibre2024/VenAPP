package g6;

/* loaded from: classes.dex */
public final class b implements kd.a {

    /* renamed from: a */
    public static final kd.a f15771a = new b();

    /* loaded from: classes.dex */
    private static final class a implements jd.d<g6.a> {

        /* renamed from: a */
        static final a f15772a = new a();

        /* renamed from: b */
        private static final jd.c f15773b = jd.c.d("sdkVersion");

        /* renamed from: c */
        private static final jd.c f15774c = jd.c.d("model");

        /* renamed from: d */
        private static final jd.c f15775d = jd.c.d("hardware");

        /* renamed from: e */
        private static final jd.c f15776e = jd.c.d("device");

        /* renamed from: f */
        private static final jd.c f15777f = jd.c.d("product");

        /* renamed from: g */
        private static final jd.c f15778g = jd.c.d("osBuild");

        /* renamed from: h */
        private static final jd.c f15779h = jd.c.d("manufacturer");

        /* renamed from: i */
        private static final jd.c f15780i = jd.c.d("fingerprint");

        /* renamed from: j */
        private static final jd.c f15781j = jd.c.d("locale");

        /* renamed from: k */
        private static final jd.c f15782k = jd.c.d("country");

        /* renamed from: l */
        private static final jd.c f15783l = jd.c.d("mccMnc");

        /* renamed from: m */
        private static final jd.c f15784m = jd.c.d("applicationBuild");

        private a() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(g6.a aVar, jd.e eVar) {
            eVar.add(f15773b, aVar.m());
            eVar.add(f15774c, aVar.j());
            eVar.add(f15775d, aVar.f());
            eVar.add(f15776e, aVar.d());
            eVar.add(f15777f, aVar.l());
            eVar.add(f15778g, aVar.k());
            eVar.add(f15779h, aVar.h());
            eVar.add(f15780i, aVar.e());
            eVar.add(f15781j, aVar.g());
            eVar.add(f15782k, aVar.c());
            eVar.add(f15783l, aVar.i());
            eVar.add(f15784m, aVar.b());
        }
    }

    /* renamed from: g6.b$b */
    /* loaded from: classes.dex */
    private static final class C0259b implements jd.d<j> {

        /* renamed from: a */
        static final C0259b f15785a = new C0259b();

        /* renamed from: b */
        private static final jd.c f15786b = jd.c.d("logRequest");

        private C0259b() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(j jVar, jd.e eVar) {
            eVar.add(f15786b, jVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements jd.d<k> {

        /* renamed from: a */
        static final c f15787a = new c();

        /* renamed from: b */
        private static final jd.c f15788b = jd.c.d("clientType");

        /* renamed from: c */
        private static final jd.c f15789c = jd.c.d("androidClientInfo");

        private c() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(k kVar, jd.e eVar) {
            eVar.add(f15788b, kVar.c());
            eVar.add(f15789c, kVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements jd.d<l> {

        /* renamed from: a */
        static final d f15790a = new d();

        /* renamed from: b */
        private static final jd.c f15791b = jd.c.d("eventTimeMs");

        /* renamed from: c */
        private static final jd.c f15792c = jd.c.d("eventCode");

        /* renamed from: d */
        private static final jd.c f15793d = jd.c.d("eventUptimeMs");

        /* renamed from: e */
        private static final jd.c f15794e = jd.c.d("sourceExtension");

        /* renamed from: f */
        private static final jd.c f15795f = jd.c.d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final jd.c f15796g = jd.c.d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final jd.c f15797h = jd.c.d("networkConnectionInfo");

        private d() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(l lVar, jd.e eVar) {
            eVar.add(f15791b, lVar.c());
            eVar.add(f15792c, lVar.b());
            eVar.add(f15793d, lVar.d());
            eVar.add(f15794e, lVar.f());
            eVar.add(f15795f, lVar.g());
            eVar.add(f15796g, lVar.h());
            eVar.add(f15797h, lVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements jd.d<m> {

        /* renamed from: a */
        static final e f15798a = new e();

        /* renamed from: b */
        private static final jd.c f15799b = jd.c.d("requestTimeMs");

        /* renamed from: c */
        private static final jd.c f15800c = jd.c.d("requestUptimeMs");

        /* renamed from: d */
        private static final jd.c f15801d = jd.c.d("clientInfo");

        /* renamed from: e */
        private static final jd.c f15802e = jd.c.d("logSource");

        /* renamed from: f */
        private static final jd.c f15803f = jd.c.d("logSourceName");

        /* renamed from: g */
        private static final jd.c f15804g = jd.c.d("logEvent");

        /* renamed from: h */
        private static final jd.c f15805h = jd.c.d("qosTier");

        private e() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(m mVar, jd.e eVar) {
            eVar.add(f15799b, mVar.g());
            eVar.add(f15800c, mVar.h());
            eVar.add(f15801d, mVar.b());
            eVar.add(f15802e, mVar.d());
            eVar.add(f15803f, mVar.e());
            eVar.add(f15804g, mVar.c());
            eVar.add(f15805h, mVar.f());
        }
    }

    /* loaded from: classes.dex */
    private static final class f implements jd.d<o> {

        /* renamed from: a */
        static final f f15806a = new f();

        /* renamed from: b */
        private static final jd.c f15807b = jd.c.d("networkType");

        /* renamed from: c */
        private static final jd.c f15808c = jd.c.d("mobileSubtype");

        private f() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(o oVar, jd.e eVar) {
            eVar.add(f15807b, oVar.c());
            eVar.add(f15808c, oVar.b());
        }
    }

    private b() {
    }

    @Override // kd.a
    public void configure(kd.b<?> bVar) {
        C0259b c0259b = C0259b.f15785a;
        bVar.registerEncoder(j.class, c0259b);
        bVar.registerEncoder(g6.d.class, c0259b);
        e eVar = e.f15798a;
        bVar.registerEncoder(m.class, eVar);
        bVar.registerEncoder(g.class, eVar);
        c cVar = c.f15787a;
        bVar.registerEncoder(k.class, cVar);
        bVar.registerEncoder(g6.e.class, cVar);
        a aVar = a.f15772a;
        bVar.registerEncoder(g6.a.class, aVar);
        bVar.registerEncoder(g6.c.class, aVar);
        d dVar = d.f15790a;
        bVar.registerEncoder(l.class, dVar);
        bVar.registerEncoder(g6.f.class, dVar);
        f fVar = f.f15806a;
        bVar.registerEncoder(o.class, fVar);
        bVar.registerEncoder(i.class, fVar);
    }
}
