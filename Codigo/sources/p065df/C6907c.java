package p065df;

import p181jd.C9039c;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p203kd.InterfaceC9254a;
import p203kd.InterfaceC9255b;

/* renamed from: df.c */
/* loaded from: classes2.dex */
public final class C6907c implements InterfaceC9254a {

    /* renamed from: a */
    public static final InterfaceC9254a f15327a = new C6907c();

    /* renamed from: df.c$a */
    /* loaded from: classes2.dex */
    private static final class a implements InterfaceC9040d<C6903a> {

        /* renamed from: a */
        static final a f15328a = new a();

        /* renamed from: b */
        private static final C9039c f15329b = C9039c.m26548d("packageName");

        /* renamed from: c */
        private static final C9039c f15330c = C9039c.m26548d("versionName");

        /* renamed from: d */
        private static final C9039c f15331d = C9039c.m26548d("appBuildVersion");

        /* renamed from: e */
        private static final C9039c f15332e = C9039c.m26548d("deviceManufacturer");

        /* renamed from: f */
        private static final C9039c f15333f = C9039c.m26548d("currentProcessDetails");

        /* renamed from: g */
        private static final C9039c f15334g = C9039c.m26548d("appProcessDetails");

        private a() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C6903a c6903a, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f15329b, c6903a.m19967e());
            interfaceC9041e.add(f15330c, c6903a.m19968f());
            interfaceC9041e.add(f15331d, c6903a.m19963a());
            interfaceC9041e.add(f15332e, c6903a.m19966d());
            interfaceC9041e.add(f15333f, c6903a.m19965c());
            interfaceC9041e.add(f15334g, c6903a.m19964b());
        }
    }

    /* renamed from: df.c$b */
    /* loaded from: classes2.dex */
    private static final class b implements InterfaceC9040d<C6905b> {

        /* renamed from: a */
        static final b f15335a = new b();

        /* renamed from: b */
        private static final C9039c f15336b = C9039c.m26548d("appId");

        /* renamed from: c */
        private static final C9039c f15337c = C9039c.m26548d("deviceModel");

        /* renamed from: d */
        private static final C9039c f15338d = C9039c.m26548d("sessionSdkVersion");

        /* renamed from: e */
        private static final C9039c f15339e = C9039c.m26548d("osVersion");

        /* renamed from: f */
        private static final C9039c f15340f = C9039c.m26548d("logEnvironment");

        /* renamed from: g */
        private static final C9039c f15341g = C9039c.m26548d("androidAppInfo");

        private b() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C6905b c6905b, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f15336b, c6905b.m19974b());
            interfaceC9041e.add(f15337c, c6905b.m19975c());
            interfaceC9041e.add(f15338d, c6905b.m19978f());
            interfaceC9041e.add(f15339e, c6905b.m19977e());
            interfaceC9041e.add(f15340f, c6905b.m19976d());
            interfaceC9041e.add(f15341g, c6905b.m19973a());
        }
    }

    /* renamed from: df.c$c */
    /* loaded from: classes2.dex */
    private static final class c implements InterfaceC9040d<C6911e> {

        /* renamed from: a */
        static final c f15342a = new c();

        /* renamed from: b */
        private static final C9039c f15343b = C9039c.m26548d("performance");

        /* renamed from: c */
        private static final C9039c f15344c = C9039c.m26548d("crashlytics");

        /* renamed from: d */
        private static final C9039c f15345d = C9039c.m26548d("sessionSamplingRate");

        private c() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C6911e c6911e, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f15343b, c6911e.m20004b());
            interfaceC9041e.add(f15344c, c6911e.m20003a());
            interfaceC9041e.add(f15345d, c6911e.m20005c());
        }
    }

    /* renamed from: df.c$d */
    /* loaded from: classes2.dex */
    private static final class d implements InterfaceC9040d<C6933t> {

        /* renamed from: a */
        static final d f15346a = new d();

        /* renamed from: b */
        private static final C9039c f15347b = C9039c.m26548d("processName");

        /* renamed from: c */
        private static final C9039c f15348c = C9039c.m26548d("pid");

        /* renamed from: d */
        private static final C9039c f15349d = C9039c.m26548d("importance");

        /* renamed from: e */
        private static final C9039c f15350e = C9039c.m26548d("defaultProcess");

        private d() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C6933t c6933t, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f15347b, c6933t.m20046c());
            interfaceC9041e.add(f15348c, c6933t.m20045b());
            interfaceC9041e.add(f15349d, c6933t.m20044a());
            interfaceC9041e.add(f15350e, c6933t.m20047d());
        }
    }

    /* renamed from: df.c$e */
    /* loaded from: classes2.dex */
    private static final class e implements InterfaceC9040d<C6939z> {

        /* renamed from: a */
        static final e f15351a = new e();

        /* renamed from: b */
        private static final C9039c f15352b = C9039c.m26548d("eventType");

        /* renamed from: c */
        private static final C9039c f15353c = C9039c.m26548d("sessionData");

        /* renamed from: d */
        private static final C9039c f15354d = C9039c.m26548d("applicationInfo");

        private e() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C6939z c6939z, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f15352b, c6939z.m20076b());
            interfaceC9041e.add(f15353c, c6939z.m20077c());
            interfaceC9041e.add(f15354d, c6939z.m20075a());
        }
    }

    /* renamed from: df.c$f */
    /* loaded from: classes2.dex */
    private static final class f implements InterfaceC9040d<C6912e0> {

        /* renamed from: a */
        static final f f15355a = new f();

        /* renamed from: b */
        private static final C9039c f15356b = C9039c.m26548d("sessionId");

        /* renamed from: c */
        private static final C9039c f15357c = C9039c.m26548d("firstSessionId");

        /* renamed from: d */
        private static final C9039c f15358d = C9039c.m26548d("sessionIndex");

        /* renamed from: e */
        private static final C9039c f15359e = C9039c.m26548d("eventTimestampUs");

        /* renamed from: f */
        private static final C9039c f15360f = C9039c.m26548d("dataCollectionStatus");

        /* renamed from: g */
        private static final C9039c f15361g = C9039c.m26548d("firebaseInstallationId");

        private f() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C6912e0 c6912e0, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f15356b, c6912e0.m20010e());
            interfaceC9041e.add(f15357c, c6912e0.m20009d());
            interfaceC9041e.add(f15358d, c6912e0.m20011f());
            interfaceC9041e.add(f15359e, c6912e0.m20007b());
            interfaceC9041e.add(f15360f, c6912e0.m20006a());
            interfaceC9041e.add(f15361g, c6912e0.m20008c());
        }
    }

    private C6907c() {
    }

    @Override // p203kd.InterfaceC9254a
    public void configure(InterfaceC9255b<?> interfaceC9255b) {
        interfaceC9255b.registerEncoder(C6939z.class, e.f15351a);
        interfaceC9255b.registerEncoder(C6912e0.class, f.f15355a);
        interfaceC9255b.registerEncoder(C6911e.class, c.f15342a);
        interfaceC9255b.registerEncoder(C6905b.class, b.f15335a);
        interfaceC9255b.registerEncoder(C6903a.class, a.f15328a);
        interfaceC9255b.registerEncoder(C6933t.class, d.f15346a);
    }
}
