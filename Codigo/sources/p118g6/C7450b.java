package p118g6;

import p181jd.C9039c;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p203kd.InterfaceC9254a;
import p203kd.InterfaceC9255b;

/* renamed from: g6.b */
/* loaded from: classes.dex */
public final class C7450b implements InterfaceC9254a {

    /* renamed from: a */
    public static final InterfaceC9254a f17353a = new C7450b();

    /* renamed from: g6.b$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC9040d<AbstractC7449a> {

        /* renamed from: a */
        static final a f17354a = new a();

        /* renamed from: b */
        private static final C9039c f17355b = C9039c.m26548d("sdkVersion");

        /* renamed from: c */
        private static final C9039c f17356c = C9039c.m26548d("model");

        /* renamed from: d */
        private static final C9039c f17357d = C9039c.m26548d("hardware");

        /* renamed from: e */
        private static final C9039c f17358e = C9039c.m26548d("device");

        /* renamed from: f */
        private static final C9039c f17359f = C9039c.m26548d("product");

        /* renamed from: g */
        private static final C9039c f17360g = C9039c.m26548d("osBuild");

        /* renamed from: h */
        private static final C9039c f17361h = C9039c.m26548d("manufacturer");

        /* renamed from: i */
        private static final C9039c f17362i = C9039c.m26548d("fingerprint");

        /* renamed from: j */
        private static final C9039c f17363j = C9039c.m26548d("locale");

        /* renamed from: k */
        private static final C9039c f17364k = C9039c.m26548d("country");

        /* renamed from: l */
        private static final C9039c f17365l = C9039c.m26548d("mccMnc");

        /* renamed from: m */
        private static final C9039c f17366m = C9039c.m26548d("applicationBuild");

        private a() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC7449a abstractC7449a, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f17355b, abstractC7449a.mo22512m());
            interfaceC9041e.add(f17356c, abstractC7449a.mo22509j());
            interfaceC9041e.add(f17357d, abstractC7449a.mo22505f());
            interfaceC9041e.add(f17358e, abstractC7449a.mo22503d());
            interfaceC9041e.add(f17359f, abstractC7449a.mo22511l());
            interfaceC9041e.add(f17360g, abstractC7449a.mo22510k());
            interfaceC9041e.add(f17361h, abstractC7449a.mo22507h());
            interfaceC9041e.add(f17362i, abstractC7449a.mo22504e());
            interfaceC9041e.add(f17363j, abstractC7449a.mo22506g());
            interfaceC9041e.add(f17364k, abstractC7449a.mo22502c());
            interfaceC9041e.add(f17365l, abstractC7449a.mo22508i());
            interfaceC9041e.add(f17366m, abstractC7449a.mo22501b());
        }
    }

    /* renamed from: g6.b$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC9040d<AbstractC7458j> {

        /* renamed from: a */
        static final b f17367a = new b();

        /* renamed from: b */
        private static final C9039c f17368b = C9039c.m26548d("logRequest");

        private b() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC7458j abstractC7458j, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f17368b, abstractC7458j.mo22532c());
        }
    }

    /* renamed from: g6.b$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC9040d<AbstractC7459k> {

        /* renamed from: a */
        static final c f17369a = new c();

        /* renamed from: b */
        private static final C9039c f17370b = C9039c.m26548d("clientType");

        /* renamed from: c */
        private static final C9039c f17371c = C9039c.m26548d("androidClientInfo");

        private c() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC7459k abstractC7459k, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f17370b, abstractC7459k.mo22534c());
            interfaceC9041e.add(f17371c, abstractC7459k.mo22533b());
        }
    }

    /* renamed from: g6.b$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC9040d<AbstractC7460l> {

        /* renamed from: a */
        static final d f17372a = new d();

        /* renamed from: b */
        private static final C9039c f17373b = C9039c.m26548d("eventTimeMs");

        /* renamed from: c */
        private static final C9039c f17374c = C9039c.m26548d("eventCode");

        /* renamed from: d */
        private static final C9039c f17375d = C9039c.m26548d("eventUptimeMs");

        /* renamed from: e */
        private static final C9039c f17376e = C9039c.m26548d("sourceExtension");

        /* renamed from: f */
        private static final C9039c f17377f = C9039c.m26548d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final C9039c f17378g = C9039c.m26548d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final C9039c f17379h = C9039c.m26548d("networkConnectionInfo");

        private d() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC7460l abstractC7460l, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f17373b, abstractC7460l.mo22539c());
            interfaceC9041e.add(f17374c, abstractC7460l.mo22538b());
            interfaceC9041e.add(f17375d, abstractC7460l.mo22540d());
            interfaceC9041e.add(f17376e, abstractC7460l.mo22542f());
            interfaceC9041e.add(f17377f, abstractC7460l.mo22543g());
            interfaceC9041e.add(f17378g, abstractC7460l.mo22544h());
            interfaceC9041e.add(f17379h, abstractC7460l.mo22541e());
        }
    }

    /* renamed from: g6.b$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC9040d<AbstractC7461m> {

        /* renamed from: a */
        static final e f17380a = new e();

        /* renamed from: b */
        private static final C9039c f17381b = C9039c.m26548d("requestTimeMs");

        /* renamed from: c */
        private static final C9039c f17382c = C9039c.m26548d("requestUptimeMs");

        /* renamed from: d */
        private static final C9039c f17383d = C9039c.m26548d("clientInfo");

        /* renamed from: e */
        private static final C9039c f17384e = C9039c.m26548d("logSource");

        /* renamed from: f */
        private static final C9039c f17385f = C9039c.m26548d("logSourceName");

        /* renamed from: g */
        private static final C9039c f17386g = C9039c.m26548d("logEvent");

        /* renamed from: h */
        private static final C9039c f17387h = C9039c.m26548d("qosTier");

        private e() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC7461m abstractC7461m, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f17381b, abstractC7461m.mo22558g());
            interfaceC9041e.add(f17382c, abstractC7461m.mo22559h());
            interfaceC9041e.add(f17383d, abstractC7461m.mo22553b());
            interfaceC9041e.add(f17384e, abstractC7461m.mo22555d());
            interfaceC9041e.add(f17385f, abstractC7461m.mo22556e());
            interfaceC9041e.add(f17386g, abstractC7461m.mo22554c());
            interfaceC9041e.add(f17387h, abstractC7461m.mo22557f());
        }
    }

    /* renamed from: g6.b$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC9040d<AbstractC7463o> {

        /* renamed from: a */
        static final f f17388a = new f();

        /* renamed from: b */
        private static final C9039c f17389b = C9039c.m26548d("networkType");

        /* renamed from: c */
        private static final C9039c f17390c = C9039c.m26548d("mobileSubtype");

        private f() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC7463o abstractC7463o, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f17389b, abstractC7463o.mo22570c());
            interfaceC9041e.add(f17390c, abstractC7463o.mo22569b());
        }
    }

    private C7450b() {
    }

    @Override // p203kd.InterfaceC9254a
    public void configure(InterfaceC9255b<?> interfaceC9255b) {
        b bVar = b.f17367a;
        interfaceC9255b.registerEncoder(AbstractC7458j.class, bVar);
        interfaceC9255b.registerEncoder(C7452d.class, bVar);
        e eVar = e.f17380a;
        interfaceC9255b.registerEncoder(AbstractC7461m.class, eVar);
        interfaceC9255b.registerEncoder(C7455g.class, eVar);
        c cVar = c.f17369a;
        interfaceC9255b.registerEncoder(AbstractC7459k.class, cVar);
        interfaceC9255b.registerEncoder(C7453e.class, cVar);
        a aVar = a.f17354a;
        interfaceC9255b.registerEncoder(AbstractC7449a.class, aVar);
        interfaceC9255b.registerEncoder(C7451c.class, aVar);
        d dVar = d.f17372a;
        interfaceC9255b.registerEncoder(AbstractC7460l.class, dVar);
        interfaceC9255b.registerEncoder(C7454f.class, dVar);
        f fVar = f.f17388a;
        interfaceC9255b.registerEncoder(AbstractC7463o.class, fVar);
        interfaceC9255b.registerEncoder(C7457i.class, fVar);
    }
}
