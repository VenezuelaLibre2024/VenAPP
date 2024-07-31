package xc;

import io.flutter.plugins.firebase.crashlytics.Constants;
import xc.f0;

/* loaded from: classes.dex */
public final class a implements kd.a {

    /* renamed from: a, reason: collision with root package name */
    public static final kd.a f30777a = new a();

    /* renamed from: xc.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0501a implements jd.d<f0.a.AbstractC0503a> {

        /* renamed from: a, reason: collision with root package name */
        static final C0501a f30778a = new C0501a();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30779b = jd.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30780c = jd.c.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30781d = jd.c.d(Constants.BUILD_ID);

        private C0501a() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.a.AbstractC0503a abstractC0503a, jd.e eVar) {
            eVar.add(f30779b, abstractC0503a.b());
            eVar.add(f30780c, abstractC0503a.d());
            eVar.add(f30781d, abstractC0503a.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements jd.d<f0.a> {

        /* renamed from: a, reason: collision with root package name */
        static final b f30782a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30783b = jd.c.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30784c = jd.c.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30785d = jd.c.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30786e = jd.c.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30787f = jd.c.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final jd.c f30788g = jd.c.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final jd.c f30789h = jd.c.d(Constants.TIMESTAMP);

        /* renamed from: i, reason: collision with root package name */
        private static final jd.c f30790i = jd.c.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final jd.c f30791j = jd.c.d("buildIdMappingForArch");

        private b() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.a aVar, jd.e eVar) {
            eVar.add(f30783b, aVar.d());
            eVar.add(f30784c, aVar.e());
            eVar.add(f30785d, aVar.g());
            eVar.add(f30786e, aVar.c());
            eVar.add(f30787f, aVar.f());
            eVar.add(f30788g, aVar.h());
            eVar.add(f30789h, aVar.i());
            eVar.add(f30790i, aVar.j());
            eVar.add(f30791j, aVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements jd.d<f0.c> {

        /* renamed from: a, reason: collision with root package name */
        static final c f30792a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30793b = jd.c.d(Constants.KEY);

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30794c = jd.c.d("value");

        private c() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.c cVar, jd.e eVar) {
            eVar.add(f30793b, cVar.b());
            eVar.add(f30794c, cVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements jd.d<f0> {

        /* renamed from: a, reason: collision with root package name */
        static final d f30795a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30796b = jd.c.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30797c = jd.c.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30798d = jd.c.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30799e = jd.c.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30800f = jd.c.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final jd.c f30801g = jd.c.d("appQualitySessionId");

        /* renamed from: h, reason: collision with root package name */
        private static final jd.c f30802h = jd.c.d("buildVersion");

        /* renamed from: i, reason: collision with root package name */
        private static final jd.c f30803i = jd.c.d("displayVersion");

        /* renamed from: j, reason: collision with root package name */
        private static final jd.c f30804j = jd.c.d("session");

        /* renamed from: k, reason: collision with root package name */
        private static final jd.c f30805k = jd.c.d("ndkPayload");

        /* renamed from: l, reason: collision with root package name */
        private static final jd.c f30806l = jd.c.d("appExitInfo");

        private d() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0 f0Var, jd.e eVar) {
            eVar.add(f30796b, f0Var.l());
            eVar.add(f30797c, f0Var.h());
            eVar.add(f30798d, f0Var.k());
            eVar.add(f30799e, f0Var.i());
            eVar.add(f30800f, f0Var.g());
            eVar.add(f30801g, f0Var.d());
            eVar.add(f30802h, f0Var.e());
            eVar.add(f30803i, f0Var.f());
            eVar.add(f30804j, f0Var.m());
            eVar.add(f30805k, f0Var.j());
            eVar.add(f30806l, f0Var.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements jd.d<f0.d> {

        /* renamed from: a, reason: collision with root package name */
        static final e f30807a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30808b = jd.c.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30809c = jd.c.d("orgId");

        private e() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.d dVar, jd.e eVar) {
            eVar.add(f30808b, dVar.b());
            eVar.add(f30809c, dVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class f implements jd.d<f0.d.b> {

        /* renamed from: a, reason: collision with root package name */
        static final f f30810a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30811b = jd.c.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30812c = jd.c.d("contents");

        private f() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.d.b bVar, jd.e eVar) {
            eVar.add(f30811b, bVar.c());
            eVar.add(f30812c, bVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class g implements jd.d<f0.e.a> {

        /* renamed from: a, reason: collision with root package name */
        static final g f30813a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30814b = jd.c.d(Constants.IDENTIFIER);

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30815c = jd.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30816d = jd.c.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30817e = jd.c.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30818f = jd.c.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final jd.c f30819g = jd.c.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final jd.c f30820h = jd.c.d("developmentPlatformVersion");

        private g() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.a aVar, jd.e eVar) {
            eVar.add(f30814b, aVar.e());
            eVar.add(f30815c, aVar.h());
            eVar.add(f30816d, aVar.d());
            eVar.add(f30817e, aVar.g());
            eVar.add(f30818f, aVar.f());
            eVar.add(f30819g, aVar.b());
            eVar.add(f30820h, aVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class h implements jd.d<f0.e.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final h f30821a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30822b = jd.c.d("clsId");

        private h() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.a.b bVar, jd.e eVar) {
            eVar.add(f30822b, bVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class i implements jd.d<f0.e.c> {

        /* renamed from: a, reason: collision with root package name */
        static final i f30823a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30824b = jd.c.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30825c = jd.c.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30826d = jd.c.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30827e = jd.c.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30828f = jd.c.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final jd.c f30829g = jd.c.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final jd.c f30830h = jd.c.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final jd.c f30831i = jd.c.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final jd.c f30832j = jd.c.d("modelClass");

        private i() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.c cVar, jd.e eVar) {
            eVar.add(f30824b, cVar.b());
            eVar.add(f30825c, cVar.f());
            eVar.add(f30826d, cVar.c());
            eVar.add(f30827e, cVar.h());
            eVar.add(f30828f, cVar.d());
            eVar.add(f30829g, cVar.j());
            eVar.add(f30830h, cVar.i());
            eVar.add(f30831i, cVar.e());
            eVar.add(f30832j, cVar.g());
        }
    }

    /* loaded from: classes.dex */
    private static final class j implements jd.d<f0.e> {

        /* renamed from: a, reason: collision with root package name */
        static final j f30833a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30834b = jd.c.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30835c = jd.c.d(Constants.IDENTIFIER);

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30836d = jd.c.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30837e = jd.c.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30838f = jd.c.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final jd.c f30839g = jd.c.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final jd.c f30840h = jd.c.d("app");

        /* renamed from: i, reason: collision with root package name */
        private static final jd.c f30841i = jd.c.d(io.flutter.plugins.firebase.auth.Constants.USER);

        /* renamed from: j, reason: collision with root package name */
        private static final jd.c f30842j = jd.c.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final jd.c f30843k = jd.c.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final jd.c f30844l = jd.c.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final jd.c f30845m = jd.c.d("generatorType");

        private j() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e eVar, jd.e eVar2) {
            eVar2.add(f30834b, eVar.g());
            eVar2.add(f30835c, eVar.j());
            eVar2.add(f30836d, eVar.c());
            eVar2.add(f30837e, eVar.l());
            eVar2.add(f30838f, eVar.e());
            eVar2.add(f30839g, eVar.n());
            eVar2.add(f30840h, eVar.b());
            eVar2.add(f30841i, eVar.m());
            eVar2.add(f30842j, eVar.k());
            eVar2.add(f30843k, eVar.d());
            eVar2.add(f30844l, eVar.f());
            eVar2.add(f30845m, eVar.h());
        }
    }

    /* loaded from: classes.dex */
    private static final class k implements jd.d<f0.e.d.a> {

        /* renamed from: a, reason: collision with root package name */
        static final k f30846a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30847b = jd.c.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30848c = jd.c.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30849d = jd.c.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30850e = jd.c.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30851f = jd.c.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final jd.c f30852g = jd.c.d("appProcessDetails");

        /* renamed from: h, reason: collision with root package name */
        private static final jd.c f30853h = jd.c.d("uiOrientation");

        private k() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a aVar, jd.e eVar) {
            eVar.add(f30847b, aVar.f());
            eVar.add(f30848c, aVar.e());
            eVar.add(f30849d, aVar.g());
            eVar.add(f30850e, aVar.c());
            eVar.add(f30851f, aVar.d());
            eVar.add(f30852g, aVar.b());
            eVar.add(f30853h, aVar.h());
        }
    }

    /* loaded from: classes.dex */
    private static final class l implements jd.d<f0.e.d.a.b.AbstractC0507a> {

        /* renamed from: a, reason: collision with root package name */
        static final l f30854a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30855b = jd.c.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30856c = jd.c.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30857d = jd.c.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30858e = jd.c.d("uuid");

        private l() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.AbstractC0507a abstractC0507a, jd.e eVar) {
            eVar.add(f30855b, abstractC0507a.b());
            eVar.add(f30856c, abstractC0507a.d());
            eVar.add(f30857d, abstractC0507a.c());
            eVar.add(f30858e, abstractC0507a.f());
        }
    }

    /* loaded from: classes.dex */
    private static final class m implements jd.d<f0.e.d.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final m f30859a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30860b = jd.c.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30861c = jd.c.d(Constants.EXCEPTION);

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30862d = jd.c.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30863e = jd.c.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30864f = jd.c.d("binaries");

        private m() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b bVar, jd.e eVar) {
            eVar.add(f30860b, bVar.f());
            eVar.add(f30861c, bVar.d());
            eVar.add(f30862d, bVar.b());
            eVar.add(f30863e, bVar.e());
            eVar.add(f30864f, bVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class n implements jd.d<f0.e.d.a.b.c> {

        /* renamed from: a, reason: collision with root package name */
        static final n f30865a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30866b = jd.c.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30867c = jd.c.d(Constants.REASON);

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30868d = jd.c.d("frames");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30869e = jd.c.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30870f = jd.c.d("overflowCount");

        private n() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.c cVar, jd.e eVar) {
            eVar.add(f30866b, cVar.f());
            eVar.add(f30867c, cVar.e());
            eVar.add(f30868d, cVar.c());
            eVar.add(f30869e, cVar.b());
            eVar.add(f30870f, cVar.d());
        }
    }

    /* loaded from: classes.dex */
    private static final class o implements jd.d<f0.e.d.a.b.AbstractC0511d> {

        /* renamed from: a, reason: collision with root package name */
        static final o f30871a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30872b = jd.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30873c = jd.c.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30874d = jd.c.d("address");

        private o() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.AbstractC0511d abstractC0511d, jd.e eVar) {
            eVar.add(f30872b, abstractC0511d.d());
            eVar.add(f30873c, abstractC0511d.c());
            eVar.add(f30874d, abstractC0511d.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class p implements jd.d<f0.e.d.a.b.AbstractC0513e> {

        /* renamed from: a, reason: collision with root package name */
        static final p f30875a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30876b = jd.c.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30877c = jd.c.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30878d = jd.c.d("frames");

        private p() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.AbstractC0513e abstractC0513e, jd.e eVar) {
            eVar.add(f30876b, abstractC0513e.d());
            eVar.add(f30877c, abstractC0513e.c());
            eVar.add(f30878d, abstractC0513e.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class q implements jd.d<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> {

        /* renamed from: a, reason: collision with root package name */
        static final q f30879a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30880b = jd.c.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30881c = jd.c.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30882d = jd.c.d(Constants.FILE);

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30883e = jd.c.d("offset");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30884f = jd.c.d("importance");

        private q() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.AbstractC0513e.AbstractC0515b abstractC0515b, jd.e eVar) {
            eVar.add(f30880b, abstractC0515b.e());
            eVar.add(f30881c, abstractC0515b.f());
            eVar.add(f30882d, abstractC0515b.b());
            eVar.add(f30883e, abstractC0515b.d());
            eVar.add(f30884f, abstractC0515b.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class r implements jd.d<f0.e.d.a.c> {

        /* renamed from: a, reason: collision with root package name */
        static final r f30885a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30886b = jd.c.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30887c = jd.c.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30888d = jd.c.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30889e = jd.c.d("defaultProcess");

        private r() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.c cVar, jd.e eVar) {
            eVar.add(f30886b, cVar.d());
            eVar.add(f30887c, cVar.c());
            eVar.add(f30888d, cVar.b());
            eVar.add(f30889e, cVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class s implements jd.d<f0.e.d.c> {

        /* renamed from: a, reason: collision with root package name */
        static final s f30890a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30891b = jd.c.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30892c = jd.c.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30893d = jd.c.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30894e = jd.c.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30895f = jd.c.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final jd.c f30896g = jd.c.d("diskUsed");

        private s() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.c cVar, jd.e eVar) {
            eVar.add(f30891b, cVar.b());
            eVar.add(f30892c, cVar.c());
            eVar.add(f30893d, cVar.g());
            eVar.add(f30894e, cVar.e());
            eVar.add(f30895f, cVar.f());
            eVar.add(f30896g, cVar.d());
        }
    }

    /* loaded from: classes.dex */
    private static final class t implements jd.d<f0.e.d> {

        /* renamed from: a, reason: collision with root package name */
        static final t f30897a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30898b = jd.c.d(Constants.TIMESTAMP);

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30899c = jd.c.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30900d = jd.c.d("app");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30901e = jd.c.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final jd.c f30902f = jd.c.d("log");

        /* renamed from: g, reason: collision with root package name */
        private static final jd.c f30903g = jd.c.d("rollouts");

        private t() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d dVar, jd.e eVar) {
            eVar.add(f30898b, dVar.f());
            eVar.add(f30899c, dVar.g());
            eVar.add(f30900d, dVar.b());
            eVar.add(f30901e, dVar.c());
            eVar.add(f30902f, dVar.d());
            eVar.add(f30903g, dVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class u implements jd.d<f0.e.d.AbstractC0518d> {

        /* renamed from: a, reason: collision with root package name */
        static final u f30904a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30905b = jd.c.d("content");

        private u() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.AbstractC0518d abstractC0518d, jd.e eVar) {
            eVar.add(f30905b, abstractC0518d.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class v implements jd.d<f0.e.d.AbstractC0519e> {

        /* renamed from: a, reason: collision with root package name */
        static final v f30906a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30907b = jd.c.d("rolloutVariant");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30908c = jd.c.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30909d = jd.c.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30910e = jd.c.d("templateVersion");

        private v() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.AbstractC0519e abstractC0519e, jd.e eVar) {
            eVar.add(f30907b, abstractC0519e.d());
            eVar.add(f30908c, abstractC0519e.b());
            eVar.add(f30909d, abstractC0519e.c());
            eVar.add(f30910e, abstractC0519e.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class w implements jd.d<f0.e.d.AbstractC0519e.b> {

        /* renamed from: a, reason: collision with root package name */
        static final w f30911a = new w();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30912b = jd.c.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30913c = jd.c.d("variantId");

        private w() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.AbstractC0519e.b bVar, jd.e eVar) {
            eVar.add(f30912b, bVar.b());
            eVar.add(f30913c, bVar.c());
        }
    }

    /* loaded from: classes.dex */
    private static final class x implements jd.d<f0.e.d.f> {

        /* renamed from: a, reason: collision with root package name */
        static final x f30914a = new x();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30915b = jd.c.d("assignments");

        private x() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.f fVar, jd.e eVar) {
            eVar.add(f30915b, fVar.b());
        }
    }

    /* loaded from: classes.dex */
    private static final class y implements jd.d<f0.e.AbstractC0520e> {

        /* renamed from: a, reason: collision with root package name */
        static final y f30916a = new y();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30917b = jd.c.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final jd.c f30918c = jd.c.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final jd.c f30919d = jd.c.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final jd.c f30920e = jd.c.d("jailbroken");

        private y() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.AbstractC0520e abstractC0520e, jd.e eVar) {
            eVar.add(f30917b, abstractC0520e.c());
            eVar.add(f30918c, abstractC0520e.d());
            eVar.add(f30919d, abstractC0520e.b());
            eVar.add(f30920e, abstractC0520e.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class z implements jd.d<f0.e.f> {

        /* renamed from: a, reason: collision with root package name */
        static final z f30921a = new z();

        /* renamed from: b, reason: collision with root package name */
        private static final jd.c f30922b = jd.c.d(Constants.IDENTIFIER);

        private z() {
        }

        @Override // jd.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.f fVar, jd.e eVar) {
            eVar.add(f30922b, fVar.b());
        }
    }

    private a() {
    }

    @Override // kd.a
    public void configure(kd.b<?> bVar) {
        d dVar = d.f30795a;
        bVar.registerEncoder(f0.class, dVar);
        bVar.registerEncoder(xc.b.class, dVar);
        j jVar = j.f30833a;
        bVar.registerEncoder(f0.e.class, jVar);
        bVar.registerEncoder(xc.h.class, jVar);
        g gVar = g.f30813a;
        bVar.registerEncoder(f0.e.a.class, gVar);
        bVar.registerEncoder(xc.i.class, gVar);
        h hVar = h.f30821a;
        bVar.registerEncoder(f0.e.a.b.class, hVar);
        bVar.registerEncoder(xc.j.class, hVar);
        z zVar = z.f30921a;
        bVar.registerEncoder(f0.e.f.class, zVar);
        bVar.registerEncoder(a0.class, zVar);
        y yVar = y.f30916a;
        bVar.registerEncoder(f0.e.AbstractC0520e.class, yVar);
        bVar.registerEncoder(xc.z.class, yVar);
        i iVar = i.f30823a;
        bVar.registerEncoder(f0.e.c.class, iVar);
        bVar.registerEncoder(xc.k.class, iVar);
        t tVar = t.f30897a;
        bVar.registerEncoder(f0.e.d.class, tVar);
        bVar.registerEncoder(xc.l.class, tVar);
        k kVar = k.f30846a;
        bVar.registerEncoder(f0.e.d.a.class, kVar);
        bVar.registerEncoder(xc.m.class, kVar);
        m mVar = m.f30859a;
        bVar.registerEncoder(f0.e.d.a.b.class, mVar);
        bVar.registerEncoder(xc.n.class, mVar);
        p pVar = p.f30875a;
        bVar.registerEncoder(f0.e.d.a.b.AbstractC0513e.class, pVar);
        bVar.registerEncoder(xc.r.class, pVar);
        q qVar = q.f30879a;
        bVar.registerEncoder(f0.e.d.a.b.AbstractC0513e.AbstractC0515b.class, qVar);
        bVar.registerEncoder(xc.s.class, qVar);
        n nVar = n.f30865a;
        bVar.registerEncoder(f0.e.d.a.b.c.class, nVar);
        bVar.registerEncoder(xc.p.class, nVar);
        b bVar2 = b.f30782a;
        bVar.registerEncoder(f0.a.class, bVar2);
        bVar.registerEncoder(xc.c.class, bVar2);
        C0501a c0501a = C0501a.f30778a;
        bVar.registerEncoder(f0.a.AbstractC0503a.class, c0501a);
        bVar.registerEncoder(xc.d.class, c0501a);
        o oVar = o.f30871a;
        bVar.registerEncoder(f0.e.d.a.b.AbstractC0511d.class, oVar);
        bVar.registerEncoder(xc.q.class, oVar);
        l lVar = l.f30854a;
        bVar.registerEncoder(f0.e.d.a.b.AbstractC0507a.class, lVar);
        bVar.registerEncoder(xc.o.class, lVar);
        c cVar = c.f30792a;
        bVar.registerEncoder(f0.c.class, cVar);
        bVar.registerEncoder(xc.e.class, cVar);
        r rVar = r.f30885a;
        bVar.registerEncoder(f0.e.d.a.c.class, rVar);
        bVar.registerEncoder(xc.t.class, rVar);
        s sVar = s.f30890a;
        bVar.registerEncoder(f0.e.d.c.class, sVar);
        bVar.registerEncoder(xc.u.class, sVar);
        u uVar = u.f30904a;
        bVar.registerEncoder(f0.e.d.AbstractC0518d.class, uVar);
        bVar.registerEncoder(xc.v.class, uVar);
        x xVar = x.f30914a;
        bVar.registerEncoder(f0.e.d.f.class, xVar);
        bVar.registerEncoder(xc.y.class, xVar);
        v vVar = v.f30906a;
        bVar.registerEncoder(f0.e.d.AbstractC0519e.class, vVar);
        bVar.registerEncoder(xc.w.class, vVar);
        w wVar = w.f30911a;
        bVar.registerEncoder(f0.e.d.AbstractC0519e.b.class, wVar);
        bVar.registerEncoder(xc.x.class, wVar);
        e eVar = e.f30807a;
        bVar.registerEncoder(f0.d.class, eVar);
        bVar.registerEncoder(xc.f.class, eVar);
        f fVar = f.f30810a;
        bVar.registerEncoder(f0.d.b.class, fVar);
        bVar.registerEncoder(xc.g.class, fVar);
    }
}
