package p442xc;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p181jd.C9039c;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p203kd.InterfaceC9254a;
import p203kd.InterfaceC9255b;
import p442xc.AbstractC12426f0;

/* renamed from: xc.a */
/* loaded from: classes.dex */
public final class C12415a implements InterfaceC9254a {

    /* renamed from: a */
    public static final InterfaceC9254a f33297a = new C12415a();

    /* renamed from: xc.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC9040d<AbstractC12426f0.a.AbstractC13271a> {

        /* renamed from: a */
        static final a f33298a = new a();

        /* renamed from: b */
        private static final C9039c f33299b = C9039c.m26548d("arch");

        /* renamed from: c */
        private static final C9039c f33300c = C9039c.m26548d("libraryName");

        /* renamed from: d */
        private static final C9039c f33301d = C9039c.m26548d(Constants.BUILD_ID);

        private a() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.a.AbstractC13271a abstractC13271a, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33299b, abstractC13271a.mo40153b());
            interfaceC9041e.add(f33300c, abstractC13271a.mo40155d());
            interfaceC9041e.add(f33301d, abstractC13271a.mo40154c());
        }
    }

    /* renamed from: xc.a$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC9040d<AbstractC12426f0.a> {

        /* renamed from: a */
        static final b f33302a = new b();

        /* renamed from: b */
        private static final C9039c f33303b = C9039c.m26548d("pid");

        /* renamed from: c */
        private static final C9039c f33304c = C9039c.m26548d("processName");

        /* renamed from: d */
        private static final C9039c f33305d = C9039c.m26548d("reasonCode");

        /* renamed from: e */
        private static final C9039c f33306e = C9039c.m26548d("importance");

        /* renamed from: f */
        private static final C9039c f33307f = C9039c.m26548d("pss");

        /* renamed from: g */
        private static final C9039c f33308g = C9039c.m26548d("rss");

        /* renamed from: h */
        private static final C9039c f33309h = C9039c.m26548d(Constants.TIMESTAMP);

        /* renamed from: i */
        private static final C9039c f33310i = C9039c.m26548d("traceFile");

        /* renamed from: j */
        private static final C9039c f33311j = C9039c.m26548d("buildIdMappingForArch");

        private b() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.a aVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33303b, aVar.mo40130d());
            interfaceC9041e.add(f33304c, aVar.mo40131e());
            interfaceC9041e.add(f33305d, aVar.mo40133g());
            interfaceC9041e.add(f33306e, aVar.mo40129c());
            interfaceC9041e.add(f33307f, aVar.mo40132f());
            interfaceC9041e.add(f33308g, aVar.mo40134h());
            interfaceC9041e.add(f33309h, aVar.mo40135i());
            interfaceC9041e.add(f33310i, aVar.mo40136j());
            interfaceC9041e.add(f33311j, aVar.mo40128b());
        }
    }

    /* renamed from: xc.a$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC9040d<AbstractC12426f0.c> {

        /* renamed from: a */
        static final c f33312a = new c();

        /* renamed from: b */
        private static final C9039c f33313b = C9039c.m26548d(Constants.KEY);

        /* renamed from: c */
        private static final C9039c f33314c = C9039c.m26548d("value");

        private c() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.c cVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33313b, cVar.mo40169b());
            interfaceC9041e.add(f33314c, cVar.mo40170c());
        }
    }

    /* renamed from: xc.a$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC9040d<AbstractC12426f0> {

        /* renamed from: a */
        static final d f33315a = new d();

        /* renamed from: b */
        private static final C9039c f33316b = C9039c.m26548d("sdkVersion");

        /* renamed from: c */
        private static final C9039c f33317c = C9039c.m26548d("gmpAppId");

        /* renamed from: d */
        private static final C9039c f33318d = C9039c.m26548d("platform");

        /* renamed from: e */
        private static final C9039c f33319e = C9039c.m26548d("installationUuid");

        /* renamed from: f */
        private static final C9039c f33320f = C9039c.m26548d("firebaseInstallationId");

        /* renamed from: g */
        private static final C9039c f33321g = C9039c.m26548d("appQualitySessionId");

        /* renamed from: h */
        private static final C9039c f33322h = C9039c.m26548d("buildVersion");

        /* renamed from: i */
        private static final C9039c f33323i = C9039c.m26548d("displayVersion");

        /* renamed from: j */
        private static final C9039c f33324j = C9039c.m26548d("session");

        /* renamed from: k */
        private static final C9039c f33325k = C9039c.m26548d("ndkPayload");

        /* renamed from: l */
        private static final C9039c f33326l = C9039c.m26548d("appExitInfo");

        private d() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0 abstractC12426f0, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33316b, abstractC12426f0.mo40110l());
            interfaceC9041e.add(f33317c, abstractC12426f0.mo40106h());
            interfaceC9041e.add(f33318d, abstractC12426f0.mo40109k());
            interfaceC9041e.add(f33319e, abstractC12426f0.mo40107i());
            interfaceC9041e.add(f33320f, abstractC12426f0.mo40105g());
            interfaceC9041e.add(f33321g, abstractC12426f0.mo40102d());
            interfaceC9041e.add(f33322h, abstractC12426f0.mo40103e());
            interfaceC9041e.add(f33323i, abstractC12426f0.mo40104f());
            interfaceC9041e.add(f33324j, abstractC12426f0.mo40111m());
            interfaceC9041e.add(f33325k, abstractC12426f0.mo40108j());
            interfaceC9041e.add(f33326l, abstractC12426f0.mo40101c());
        }
    }

    /* renamed from: xc.a$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC9040d<AbstractC12426f0.d> {

        /* renamed from: a */
        static final e f33327a = new e();

        /* renamed from: b */
        private static final C9039c f33328b = C9039c.m26548d("files");

        /* renamed from: c */
        private static final C9039c f33329c = C9039c.m26548d("orgId");

        private e() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.d dVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33328b, dVar.mo40177b());
            interfaceC9041e.add(f33329c, dVar.mo40178c());
        }
    }

    /* renamed from: xc.a$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC9040d<AbstractC12426f0.d.b> {

        /* renamed from: a */
        static final f f33330a = new f();

        /* renamed from: b */
        private static final C9039c f33331b = C9039c.m26548d("filename");

        /* renamed from: c */
        private static final C9039c f33332c = C9039c.m26548d("contents");

        private f() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.d.b bVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33331b, bVar.mo40196c());
            interfaceC9041e.add(f33332c, bVar.mo40195b());
        }
    }

    /* renamed from: xc.a$g */
    /* loaded from: classes.dex */
    private static final class g implements InterfaceC9040d<AbstractC12426f0.e.a> {

        /* renamed from: a */
        static final g f33333a = new g();

        /* renamed from: b */
        private static final C9039c f33334b = C9039c.m26548d(Constants.IDENTIFIER);

        /* renamed from: c */
        private static final C9039c f33335c = C9039c.m26548d("version");

        /* renamed from: d */
        private static final C9039c f33336d = C9039c.m26548d("displayVersion");

        /* renamed from: e */
        private static final C9039c f33337e = C9039c.m26548d("organization");

        /* renamed from: f */
        private static final C9039c f33338f = C9039c.m26548d("installationUuid");

        /* renamed from: g */
        private static final C9039c f33339g = C9039c.m26548d("developmentPlatform");

        /* renamed from: h */
        private static final C9039c f33340h = C9039c.m26548d("developmentPlatformVersion");

        private g() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.a aVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33334b, aVar.mo40222e());
            interfaceC9041e.add(f33335c, aVar.mo40225h());
            interfaceC9041e.add(f33336d, aVar.mo40221d());
            interfaceC9041e.add(f33337e, aVar.mo40224g());
            interfaceC9041e.add(f33338f, aVar.mo40223f());
            interfaceC9041e.add(f33339g, aVar.mo40219b());
            interfaceC9041e.add(f33340h, aVar.mo40220c());
        }
    }

    /* renamed from: xc.a$h */
    /* loaded from: classes.dex */
    private static final class h implements InterfaceC9040d<AbstractC12426f0.e.a.b> {

        /* renamed from: a */
        static final h f33341a = new h();

        /* renamed from: b */
        private static final C9039c f33342b = C9039c.m26548d("clsId");

        private h() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.a.b bVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33342b, bVar.mo40233a());
        }
    }

    /* renamed from: xc.a$i */
    /* loaded from: classes.dex */
    private static final class i implements InterfaceC9040d<AbstractC12426f0.e.c> {

        /* renamed from: a */
        static final i f33343a = new i();

        /* renamed from: b */
        private static final C9039c f33344b = C9039c.m26548d("arch");

        /* renamed from: c */
        private static final C9039c f33345c = C9039c.m26548d("model");

        /* renamed from: d */
        private static final C9039c f33346d = C9039c.m26548d("cores");

        /* renamed from: e */
        private static final C9039c f33347e = C9039c.m26548d("ram");

        /* renamed from: f */
        private static final C9039c f33348f = C9039c.m26548d("diskSpace");

        /* renamed from: g */
        private static final C9039c f33349g = C9039c.m26548d("simulator");

        /* renamed from: h */
        private static final C9039c f33350h = C9039c.m26548d("state");

        /* renamed from: i */
        private static final C9039c f33351i = C9039c.m26548d("manufacturer");

        /* renamed from: j */
        private static final C9039c f33352j = C9039c.m26548d("modelClass");

        private i() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.c cVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33344b, cVar.mo40249b());
            interfaceC9041e.add(f33345c, cVar.mo40253f());
            interfaceC9041e.add(f33346d, cVar.mo40250c());
            interfaceC9041e.add(f33347e, cVar.mo40255h());
            interfaceC9041e.add(f33348f, cVar.mo40251d());
            interfaceC9041e.add(f33349g, cVar.mo40257j());
            interfaceC9041e.add(f33350h, cVar.mo40256i());
            interfaceC9041e.add(f33351i, cVar.mo40252e());
            interfaceC9041e.add(f33352j, cVar.mo40254g());
        }
    }

    /* renamed from: xc.a$j */
    /* loaded from: classes.dex */
    private static final class j implements InterfaceC9040d<AbstractC12426f0.e> {

        /* renamed from: a */
        static final j f33353a = new j();

        /* renamed from: b */
        private static final C9039c f33354b = C9039c.m26548d("generator");

        /* renamed from: c */
        private static final C9039c f33355c = C9039c.m26548d(Constants.IDENTIFIER);

        /* renamed from: d */
        private static final C9039c f33356d = C9039c.m26548d("appQualitySessionId");

        /* renamed from: e */
        private static final C9039c f33357e = C9039c.m26548d("startedAt");

        /* renamed from: f */
        private static final C9039c f33358f = C9039c.m26548d("endedAt");

        /* renamed from: g */
        private static final C9039c f33359g = C9039c.m26548d("crashed");

        /* renamed from: h */
        private static final C9039c f33360h = C9039c.m26548d("app");

        /* renamed from: i */
        private static final C9039c f33361i = C9039c.m26548d(io.flutter.plugins.firebase.auth.Constants.USER);

        /* renamed from: j */
        private static final C9039c f33362j = C9039c.m26548d("os");

        /* renamed from: k */
        private static final C9039c f33363k = C9039c.m26548d("device");

        /* renamed from: l */
        private static final C9039c f33364l = C9039c.m26548d("events");

        /* renamed from: m */
        private static final C9039c f33365m = C9039c.m26548d("generatorType");

        private j() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e eVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33354b, eVar.mo40206g());
            interfaceC9041e.add(f33355c, eVar.m40209j());
            interfaceC9041e.add(f33356d, eVar.mo40202c());
            interfaceC9041e.add(f33357e, eVar.mo40211l());
            interfaceC9041e.add(f33358f, eVar.mo40204e());
            interfaceC9041e.add(f33359g, eVar.mo40213n());
            interfaceC9041e.add(f33360h, eVar.mo40201b());
            interfaceC9041e.add(f33361i, eVar.mo40212m());
            interfaceC9041e.add(f33362j, eVar.mo40210k());
            interfaceC9041e.add(f33363k, eVar.mo40203d());
            interfaceC9041e.add(f33364l, eVar.mo40205f());
            interfaceC9041e.add(f33365m, eVar.mo40207h());
        }
    }

    /* renamed from: xc.a$k */
    /* loaded from: classes.dex */
    private static final class k implements InterfaceC9040d<AbstractC12426f0.e.d.a> {

        /* renamed from: a */
        static final k f33366a = new k();

        /* renamed from: b */
        private static final C9039c f33367b = C9039c.m26548d("execution");

        /* renamed from: c */
        private static final C9039c f33368c = C9039c.m26548d("customAttributes");

        /* renamed from: d */
        private static final C9039c f33369d = C9039c.m26548d("internalKeys");

        /* renamed from: e */
        private static final C9039c f33370e = C9039c.m26548d("background");

        /* renamed from: f */
        private static final C9039c f33371f = C9039c.m26548d("currentProcessDetails");

        /* renamed from: g */
        private static final C9039c f33372g = C9039c.m26548d("appProcessDetails");

        /* renamed from: h */
        private static final C9039c f33373h = C9039c.m26548d("uiOrientation");

        private k() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.a aVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33367b, aVar.mo40281f());
            interfaceC9041e.add(f33368c, aVar.mo40280e());
            interfaceC9041e.add(f33369d, aVar.mo40282g());
            interfaceC9041e.add(f33370e, aVar.mo40278c());
            interfaceC9041e.add(f33371f, aVar.mo40279d());
            interfaceC9041e.add(f33372g, aVar.mo40277b());
            interfaceC9041e.add(f33373h, aVar.mo40283h());
        }
    }

    /* renamed from: xc.a$l */
    /* loaded from: classes.dex */
    private static final class l implements InterfaceC9040d<AbstractC12426f0.e.d.a.b.AbstractC13275a> {

        /* renamed from: a */
        static final l f33374a = new l();

        /* renamed from: b */
        private static final C9039c f33375b = C9039c.m26548d("baseAddress");

        /* renamed from: c */
        private static final C9039c f33376c = C9039c.m26548d("size");

        /* renamed from: d */
        private static final C9039c f33377d = C9039c.m26548d("name");

        /* renamed from: e */
        private static final C9039c f33378e = C9039c.m26548d("uuid");

        private l() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.a.b.AbstractC13275a abstractC13275a, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33375b, abstractC13275a.mo40300b());
            interfaceC9041e.add(f33376c, abstractC13275a.mo40302d());
            interfaceC9041e.add(f33377d, abstractC13275a.mo40301c());
            interfaceC9041e.add(f33378e, abstractC13275a.m40304f());
        }
    }

    /* renamed from: xc.a$m */
    /* loaded from: classes.dex */
    private static final class m implements InterfaceC9040d<AbstractC12426f0.e.d.a.b> {

        /* renamed from: a */
        static final m f33379a = new m();

        /* renamed from: b */
        private static final C9039c f33380b = C9039c.m26548d("threads");

        /* renamed from: c */
        private static final C9039c f33381c = C9039c.m26548d(Constants.EXCEPTION);

        /* renamed from: d */
        private static final C9039c f33382d = C9039c.m26548d("appExitInfo");

        /* renamed from: e */
        private static final C9039c f33383e = C9039c.m26548d("signal");

        /* renamed from: f */
        private static final C9039c f33384f = C9039c.m26548d("binaries");

        private m() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.a.b bVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33380b, bVar.mo40298f());
            interfaceC9041e.add(f33381c, bVar.mo40296d());
            interfaceC9041e.add(f33382d, bVar.mo40294b());
            interfaceC9041e.add(f33383e, bVar.mo40297e());
            interfaceC9041e.add(f33384f, bVar.mo40295c());
        }
    }

    /* renamed from: xc.a$n */
    /* loaded from: classes.dex */
    private static final class n implements InterfaceC9040d<AbstractC12426f0.e.d.a.b.c> {

        /* renamed from: a */
        static final n f33385a = new n();

        /* renamed from: b */
        private static final C9039c f33386b = C9039c.m26548d("type");

        /* renamed from: c */
        private static final C9039c f33387c = C9039c.m26548d(Constants.REASON);

        /* renamed from: d */
        private static final C9039c f33388d = C9039c.m26548d("frames");

        /* renamed from: e */
        private static final C9039c f33389e = C9039c.m26548d("causedBy");

        /* renamed from: f */
        private static final C9039c f33390f = C9039c.m26548d("overflowCount");

        private n() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.a.b.c cVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33386b, cVar.mo40322f());
            interfaceC9041e.add(f33387c, cVar.mo40321e());
            interfaceC9041e.add(f33388d, cVar.mo40319c());
            interfaceC9041e.add(f33389e, cVar.mo40318b());
            interfaceC9041e.add(f33390f, cVar.mo40320d());
        }
    }

    /* renamed from: xc.a$o */
    /* loaded from: classes.dex */
    private static final class o implements InterfaceC9040d<AbstractC12426f0.e.d.a.b.AbstractC13279d> {

        /* renamed from: a */
        static final o f33391a = new o();

        /* renamed from: b */
        private static final C9039c f33392b = C9039c.m26548d("name");

        /* renamed from: c */
        private static final C9039c f33393c = C9039c.m26548d("code");

        /* renamed from: d */
        private static final C9039c f33394d = C9039c.m26548d("address");

        private o() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.a.b.AbstractC13279d abstractC13279d, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33392b, abstractC13279d.mo40332d());
            interfaceC9041e.add(f33393c, abstractC13279d.mo40331c());
            interfaceC9041e.add(f33394d, abstractC13279d.mo40330b());
        }
    }

    /* renamed from: xc.a$p */
    /* loaded from: classes.dex */
    private static final class p implements InterfaceC9040d<AbstractC12426f0.e.d.a.b.AbstractC13281e> {

        /* renamed from: a */
        static final p f33395a = new p();

        /* renamed from: b */
        private static final C9039c f33396b = C9039c.m26548d("name");

        /* renamed from: c */
        private static final C9039c f33397c = C9039c.m26548d("importance");

        /* renamed from: d */
        private static final C9039c f33398d = C9039c.m26548d("frames");

        private p() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.a.b.AbstractC13281e abstractC13281e, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33396b, abstractC13281e.mo40340d());
            interfaceC9041e.add(f33397c, abstractC13281e.mo40339c());
            interfaceC9041e.add(f33398d, abstractC13281e.mo40338b());
        }
    }

    /* renamed from: xc.a$q */
    /* loaded from: classes.dex */
    private static final class q implements InterfaceC9040d<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> {

        /* renamed from: a */
        static final q f33399a = new q();

        /* renamed from: b */
        private static final C9039c f33400b = C9039c.m26548d("pc");

        /* renamed from: c */
        private static final C9039c f33401c = C9039c.m26548d("symbol");

        /* renamed from: d */
        private static final C9039c f33402d = C9039c.m26548d(Constants.FILE);

        /* renamed from: e */
        private static final C9039c f33403e = C9039c.m26548d("offset");

        /* renamed from: f */
        private static final C9039c f33404f = C9039c.m26548d("importance");

        private q() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b abstractC13283b, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33400b, abstractC13283b.mo40349e());
            interfaceC9041e.add(f33401c, abstractC13283b.mo40350f());
            interfaceC9041e.add(f33402d, abstractC13283b.mo40346b());
            interfaceC9041e.add(f33403e, abstractC13283b.mo40348d());
            interfaceC9041e.add(f33404f, abstractC13283b.mo40347c());
        }
    }

    /* renamed from: xc.a$r */
    /* loaded from: classes.dex */
    private static final class r implements InterfaceC9040d<AbstractC12426f0.e.d.a.c> {

        /* renamed from: a */
        static final r f33405a = new r();

        /* renamed from: b */
        private static final C9039c f33406b = C9039c.m26548d("processName");

        /* renamed from: c */
        private static final C9039c f33407c = C9039c.m26548d("pid");

        /* renamed from: d */
        private static final C9039c f33408d = C9039c.m26548d("importance");

        /* renamed from: e */
        private static final C9039c f33409e = C9039c.m26548d("defaultProcess");

        private r() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.a.c cVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33406b, cVar.mo40360d());
            interfaceC9041e.add(f33407c, cVar.mo40359c());
            interfaceC9041e.add(f33408d, cVar.mo40358b());
            interfaceC9041e.add(f33409e, cVar.mo40361e());
        }
    }

    /* renamed from: xc.a$s */
    /* loaded from: classes.dex */
    private static final class s implements InterfaceC9040d<AbstractC12426f0.e.d.c> {

        /* renamed from: a */
        static final s f33410a = new s();

        /* renamed from: b */
        private static final C9039c f33411b = C9039c.m26548d("batteryLevel");

        /* renamed from: c */
        private static final C9039c f33412c = C9039c.m26548d("batteryVelocity");

        /* renamed from: d */
        private static final C9039c f33413d = C9039c.m26548d("proximityOn");

        /* renamed from: e */
        private static final C9039c f33414e = C9039c.m26548d("orientation");

        /* renamed from: f */
        private static final C9039c f33415f = C9039c.m26548d("ramUsed");

        /* renamed from: g */
        private static final C9039c f33416g = C9039c.m26548d("diskUsed");

        private s() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.c cVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33411b, cVar.mo40375b());
            interfaceC9041e.add(f33412c, cVar.mo40376c());
            interfaceC9041e.add(f33413d, cVar.mo40380g());
            interfaceC9041e.add(f33414e, cVar.mo40378e());
            interfaceC9041e.add(f33415f, cVar.mo40379f());
            interfaceC9041e.add(f33416g, cVar.mo40377d());
        }
    }

    /* renamed from: xc.a$t */
    /* loaded from: classes.dex */
    private static final class t implements InterfaceC9040d<AbstractC12426f0.e.d> {

        /* renamed from: a */
        static final t f33417a = new t();

        /* renamed from: b */
        private static final C9039c f33418b = C9039c.m26548d(Constants.TIMESTAMP);

        /* renamed from: c */
        private static final C9039c f33419c = C9039c.m26548d("type");

        /* renamed from: d */
        private static final C9039c f33420d = C9039c.m26548d("app");

        /* renamed from: e */
        private static final C9039c f33421e = C9039c.m26548d("device");

        /* renamed from: f */
        private static final C9039c f33422f = C9039c.m26548d("log");

        /* renamed from: g */
        private static final C9039c f33423g = C9039c.m26548d("rollouts");

        private t() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d dVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33418b, dVar.mo40273f());
            interfaceC9041e.add(f33419c, dVar.mo40274g());
            interfaceC9041e.add(f33420d, dVar.mo40269b());
            interfaceC9041e.add(f33421e, dVar.mo40270c());
            interfaceC9041e.add(f33422f, dVar.mo40271d());
            interfaceC9041e.add(f33423g, dVar.mo40272e());
        }
    }

    /* renamed from: xc.a$u */
    /* loaded from: classes.dex */
    private static final class u implements InterfaceC9040d<AbstractC12426f0.e.d.AbstractC13286d> {

        /* renamed from: a */
        static final u f33424a = new u();

        /* renamed from: b */
        private static final C9039c f33425b = C9039c.m26548d("content");

        private u() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.AbstractC13286d abstractC13286d, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33425b, abstractC13286d.mo40389b());
        }
    }

    /* renamed from: xc.a$v */
    /* loaded from: classes.dex */
    private static final class v implements InterfaceC9040d<AbstractC12426f0.e.d.AbstractC13287e> {

        /* renamed from: a */
        static final v f33426a = new v();

        /* renamed from: b */
        private static final C9039c f33427b = C9039c.m26548d("rolloutVariant");

        /* renamed from: c */
        private static final C9039c f33428c = C9039c.m26548d("parameterKey");

        /* renamed from: d */
        private static final C9039c f33429d = C9039c.m26548d("parameterValue");

        /* renamed from: e */
        private static final C9039c f33430e = C9039c.m26548d("templateVersion");

        private v() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.AbstractC13287e abstractC13287e, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33427b, abstractC13287e.mo40395d());
            interfaceC9041e.add(f33428c, abstractC13287e.mo40393b());
            interfaceC9041e.add(f33429d, abstractC13287e.mo40394c());
            interfaceC9041e.add(f33430e, abstractC13287e.mo40396e());
        }
    }

    /* renamed from: xc.a$w */
    /* loaded from: classes.dex */
    private static final class w implements InterfaceC9040d<AbstractC12426f0.e.d.AbstractC13287e.b> {

        /* renamed from: a */
        static final w f33431a = new w();

        /* renamed from: b */
        private static final C9039c f33432b = C9039c.m26548d("rolloutId");

        /* renamed from: c */
        private static final C9039c f33433c = C9039c.m26548d("variantId");

        private w() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.AbstractC13287e.b bVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33432b, bVar.mo40403b());
            interfaceC9041e.add(f33433c, bVar.mo40404c());
        }
    }

    /* renamed from: xc.a$x */
    /* loaded from: classes.dex */
    private static final class x implements InterfaceC9040d<AbstractC12426f0.e.d.f> {

        /* renamed from: a */
        static final x f33434a = new x();

        /* renamed from: b */
        private static final C9039c f33435b = C9039c.m26548d("assignments");

        private x() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.d.f fVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33435b, fVar.mo40409b());
        }
    }

    /* renamed from: xc.a$y */
    /* loaded from: classes.dex */
    private static final class y implements InterfaceC9040d<AbstractC12426f0.e.AbstractC13288e> {

        /* renamed from: a */
        static final y f33436a = new y();

        /* renamed from: b */
        private static final C9039c f33437b = C9039c.m26548d("platform");

        /* renamed from: c */
        private static final C9039c f33438c = C9039c.m26548d("version");

        /* renamed from: d */
        private static final C9039c f33439d = C9039c.m26548d("buildVersion");

        /* renamed from: e */
        private static final C9039c f33440e = C9039c.m26548d("jailbroken");

        private y() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.AbstractC13288e abstractC13288e, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33437b, abstractC13288e.mo40414c());
            interfaceC9041e.add(f33438c, abstractC13288e.mo40415d());
            interfaceC9041e.add(f33439d, abstractC13288e.mo40413b());
            interfaceC9041e.add(f33440e, abstractC13288e.mo40416e());
        }
    }

    /* renamed from: xc.a$z */
    /* loaded from: classes.dex */
    private static final class z implements InterfaceC9040d<AbstractC12426f0.e.f> {

        /* renamed from: a */
        static final z f33441a = new z();

        /* renamed from: b */
        private static final C9039c f33442b = C9039c.m26548d(Constants.IDENTIFIER);

        private z() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12426f0.e.f fVar, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f33442b, fVar.mo40098b());
        }
    }

    private C12415a() {
    }

    @Override // p203kd.InterfaceC9254a
    public void configure(InterfaceC9255b<?> interfaceC9255b) {
        d dVar = d.f33315a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.class, dVar);
        interfaceC9255b.registerEncoder(C12417b.class, dVar);
        j jVar = j.f33353a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.class, jVar);
        interfaceC9255b.registerEncoder(C12429h.class, jVar);
        g gVar = g.f33333a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.a.class, gVar);
        interfaceC9255b.registerEncoder(C12430i.class, gVar);
        h hVar = h.f33341a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.a.b.class, hVar);
        interfaceC9255b.registerEncoder(C12431j.class, hVar);
        z zVar = z.f33441a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.f.class, zVar);
        interfaceC9255b.registerEncoder(C12416a0.class, zVar);
        y yVar = y.f33436a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.AbstractC13288e.class, yVar);
        interfaceC9255b.registerEncoder(C12447z.class, yVar);
        i iVar = i.f33343a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.c.class, iVar);
        interfaceC9255b.registerEncoder(C12432k.class, iVar);
        t tVar = t.f33417a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.class, tVar);
        interfaceC9255b.registerEncoder(C12433l.class, tVar);
        k kVar = k.f33366a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.a.class, kVar);
        interfaceC9255b.registerEncoder(C12434m.class, kVar);
        m mVar = m.f33379a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.a.b.class, mVar);
        interfaceC9255b.registerEncoder(C12435n.class, mVar);
        p pVar = p.f33395a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.a.b.AbstractC13281e.class, pVar);
        interfaceC9255b.registerEncoder(C12439r.class, pVar);
        q qVar = q.f33399a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b.class, qVar);
        interfaceC9255b.registerEncoder(C12440s.class, qVar);
        n nVar = n.f33385a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.a.b.c.class, nVar);
        interfaceC9255b.registerEncoder(C12437p.class, nVar);
        b bVar = b.f33302a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.a.class, bVar);
        interfaceC9255b.registerEncoder(C12419c.class, bVar);
        a aVar = a.f33298a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.a.AbstractC13271a.class, aVar);
        interfaceC9255b.registerEncoder(C12421d.class, aVar);
        o oVar = o.f33391a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.a.b.AbstractC13279d.class, oVar);
        interfaceC9255b.registerEncoder(C12438q.class, oVar);
        l lVar = l.f33374a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.a.b.AbstractC13275a.class, lVar);
        interfaceC9255b.registerEncoder(C12436o.class, lVar);
        c cVar = c.f33312a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.c.class, cVar);
        interfaceC9255b.registerEncoder(C12423e.class, cVar);
        r rVar = r.f33405a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.a.c.class, rVar);
        interfaceC9255b.registerEncoder(C12441t.class, rVar);
        s sVar = s.f33410a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.c.class, sVar);
        interfaceC9255b.registerEncoder(C12442u.class, sVar);
        u uVar = u.f33424a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.AbstractC13286d.class, uVar);
        interfaceC9255b.registerEncoder(C12443v.class, uVar);
        x xVar = x.f33434a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.f.class, xVar);
        interfaceC9255b.registerEncoder(C12446y.class, xVar);
        v vVar = v.f33426a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.AbstractC13287e.class, vVar);
        interfaceC9255b.registerEncoder(C12444w.class, vVar);
        w wVar = w.f33431a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.e.d.AbstractC13287e.b.class, wVar);
        interfaceC9255b.registerEncoder(C12445x.class, wVar);
        e eVar = e.f33327a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.d.class, eVar);
        interfaceC9255b.registerEncoder(C12425f.class, eVar);
        f fVar = f.f33330a;
        interfaceC9255b.registerEncoder(AbstractC12426f0.d.b.class, fVar);
        interfaceC9255b.registerEncoder(C12427g.class, fVar);
    }
}
