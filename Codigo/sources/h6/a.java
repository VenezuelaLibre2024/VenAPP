package h6;

import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes.dex */
public final class a implements kd.a {

    /* renamed from: a, reason: collision with root package name */
    public static final kd.a f16382a = new a();

    /* renamed from: h6.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0271a implements jd.d<k6.a> {

        /* renamed from: a, reason: collision with root package name */
        static final C0271a f16383a = new C0271a();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f16384b = jd.c.a("window").b(md.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f16385c = jd.c.a("logSourceMetrics").b(md.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f16386d = jd.c.a("globalMetrics").b(md.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f16387e = jd.c.a("appNamespace").b(md.a.b().c(4).a()).a();

        private C0271a() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(k6.a aVar, jd.e eVar) {
            eVar.add(f16384b, aVar.d());
            eVar.add(f16385c, aVar.c());
            eVar.add(f16386d, aVar.b());
            eVar.add(f16387e, aVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements jd.d<k6.b> {

        /* renamed from: a, reason: collision with root package name */
        static final b f16388a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f16389b = jd.c.a("storageMetrics").b(md.a.b().c(1).a()).a();

        private b() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(k6.b bVar, jd.e eVar) {
            eVar.add(f16389b, bVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements jd.d<k6.c> {

        /* renamed from: a, reason: collision with root package name */
        static final c f16390a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f16391b = jd.c.a("eventsDroppedCount").b(md.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f16392c = jd.c.a(Constants.REASON).b(md.a.b().c(3).a()).a();

        private c() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(k6.c cVar, jd.e eVar) {
            eVar.add(f16391b, cVar.a());
            eVar.add(f16392c, cVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements jd.d<k6.d> {

        /* renamed from: a, reason: collision with root package name */
        static final d f16393a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f16394b = jd.c.a("logSource").b(md.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f16395c = jd.c.a("logEventDropped").b(md.a.b().c(2).a()).a();

        private d() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(k6.d dVar, jd.e eVar) {
            eVar.add(f16394b, dVar.b());
            eVar.add(f16395c, dVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements jd.d<m> {

        /* renamed from: a, reason: collision with root package name */
        static final e f16396a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f16397b = jd.c.d("clientMetrics");

        private e() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(m mVar, jd.e eVar) {
            eVar.add(f16397b, mVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class f implements jd.d<k6.e> {

        /* renamed from: a, reason: collision with root package name */
        static final f f16398a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f16399b = jd.c.a("currentCacheSizeBytes").b(md.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f16400c = jd.c.a("maxCacheSizeBytes").b(md.a.b().c(2).a()).a();

        private f() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(k6.e eVar, jd.e eVar2) {
            eVar2.add(f16399b, eVar.a());
            eVar2.add(f16400c, eVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class g implements jd.d<k6.f> {

        /* renamed from: a, reason: collision with root package name */
        static final g f16401a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f16402b = jd.c.a("startMs").b(md.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f16403c = jd.c.a("endMs").b(md.a.b().c(2).a()).a();

        private g() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(k6.f fVar, jd.e eVar) {
            eVar.add(f16402b, fVar.b());
            eVar.add(f16403c, fVar.a());
        }
    }

    private a() {
    }

    @Override // kd.a
    public void configure(kd.b<?> bVar) {
        bVar.registerEncoder(m.class, e.f16396a);
        bVar.registerEncoder(k6.a.class, C0271a.f16383a);
        bVar.registerEncoder(k6.f.class, g.f16401a);
        bVar.registerEncoder(k6.d.class, d.f16393a);
        bVar.registerEncoder(k6.c.class, c.f16390a);
        bVar.registerEncoder(k6.b.class, b.f16388a);
        bVar.registerEncoder(k6.e.class, f.f16398a);
    }
}
