package p132h6;

import io.flutter.plugins.firebase.crashlytics.Constants;
import md.C9566a;
import p181jd.C9039c;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p196k6.C9169a;
import p196k6.C9170b;
import p196k6.C9171c;
import p196k6.C9172d;
import p196k6.C9173e;
import p196k6.C9174f;
import p203kd.InterfaceC9254a;
import p203kd.InterfaceC9255b;

/* renamed from: h6.a */
/* loaded from: classes.dex */
public final class C7631a implements InterfaceC9254a {

    /* renamed from: a */
    public static final InterfaceC9254a f18019a = new C7631a();

    /* renamed from: h6.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC9040d<C9169a> {

        /* renamed from: a */
        static final a f18020a = new a();

        /* renamed from: b */
        private static final C9039c f18021b = C9039c.m26547a("window").m26552b(C9566a.m28451b().m28453c(1).m28452a()).m26551a();

        /* renamed from: c */
        private static final C9039c f18022c = C9039c.m26547a("logSourceMetrics").m26552b(C9566a.m28451b().m28453c(2).m28452a()).m26551a();

        /* renamed from: d */
        private static final C9039c f18023d = C9039c.m26547a("globalMetrics").m26552b(C9566a.m28451b().m28453c(3).m28452a()).m26551a();

        /* renamed from: e */
        private static final C9039c f18024e = C9039c.m26547a("appNamespace").m26552b(C9566a.m28451b().m28453c(4).m28452a()).m26551a();

        private a() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C9169a c9169a, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f18021b, c9169a.m27088d());
            interfaceC9041e.add(f18022c, c9169a.m27087c());
            interfaceC9041e.add(f18023d, c9169a.m27086b());
            interfaceC9041e.add(f18024e, c9169a.m27085a());
        }
    }

    /* renamed from: h6.a$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC9040d<C9170b> {

        /* renamed from: a */
        static final b f18025a = new b();

        /* renamed from: b */
        private static final C9039c f18026b = C9039c.m26547a("storageMetrics").m26552b(C9566a.m28451b().m28453c(1).m28452a()).m26551a();

        private b() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C9170b c9170b, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f18026b, c9170b.m27096a());
        }
    }

    /* renamed from: h6.a$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC9040d<C9171c> {

        /* renamed from: a */
        static final c f18027a = new c();

        /* renamed from: b */
        private static final C9039c f18028b = C9039c.m26547a("eventsDroppedCount").m26552b(C9566a.m28451b().m28453c(1).m28452a()).m26551a();

        /* renamed from: c */
        private static final C9039c f18029c = C9039c.m26547a(Constants.REASON).m26552b(C9566a.m28451b().m28453c(3).m28452a()).m26551a();

        private c() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C9171c c9171c, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f18028b, c9171c.m27100a());
            interfaceC9041e.add(f18029c, c9171c.m27101b());
        }
    }

    /* renamed from: h6.a$d */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC9040d<C9172d> {

        /* renamed from: a */
        static final d f18030a = new d();

        /* renamed from: b */
        private static final C9039c f18031b = C9039c.m26547a("logSource").m26552b(C9566a.m28451b().m28453c(1).m28452a()).m26551a();

        /* renamed from: c */
        private static final C9039c f18032c = C9039c.m26547a("logEventDropped").m26552b(C9566a.m28451b().m28453c(2).m28452a()).m26551a();

        private d() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C9172d c9172d, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f18031b, c9172d.m27108b());
            interfaceC9041e.add(f18032c, c9172d.m27107a());
        }
    }

    /* renamed from: h6.a$e */
    /* loaded from: classes.dex */
    private static final class e implements InterfaceC9040d<AbstractC7643m> {

        /* renamed from: a */
        static final e f18033a = new e();

        /* renamed from: b */
        private static final C9039c f18034b = C9039c.m26548d("clientMetrics");

        private e() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC7643m abstractC7643m, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f18034b, abstractC7643m.m23222b());
        }
    }

    /* renamed from: h6.a$f */
    /* loaded from: classes.dex */
    private static final class f implements InterfaceC9040d<C9173e> {

        /* renamed from: a */
        static final f f18035a = new f();

        /* renamed from: b */
        private static final C9039c f18036b = C9039c.m26547a("currentCacheSizeBytes").m26552b(C9566a.m28451b().m28453c(1).m28452a()).m26551a();

        /* renamed from: c */
        private static final C9039c f18037c = C9039c.m26547a("maxCacheSizeBytes").m26552b(C9566a.m28451b().m28453c(2).m28452a()).m26551a();

        private f() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C9173e c9173e, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f18036b, c9173e.m27113a());
            interfaceC9041e.add(f18037c, c9173e.m27114b());
        }
    }

    /* renamed from: h6.a$g */
    /* loaded from: classes.dex */
    private static final class g implements InterfaceC9040d<C9174f> {

        /* renamed from: a */
        static final g f18038a = new g();

        /* renamed from: b */
        private static final C9039c f18039b = C9039c.m26547a("startMs").m26552b(C9566a.m28451b().m28453c(1).m28452a()).m26551a();

        /* renamed from: c */
        private static final C9039c f18040c = C9039c.m26547a("endMs").m26552b(C9566a.m28451b().m28453c(2).m28452a()).m26551a();

        private g() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C9174f c9174f, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f18039b, c9174f.m27120b());
            interfaceC9041e.add(f18040c, c9174f.m27119a());
        }
    }

    private C7631a() {
    }

    @Override // p203kd.InterfaceC9254a
    public void configure(InterfaceC9255b<?> interfaceC9255b) {
        interfaceC9255b.registerEncoder(AbstractC7643m.class, e.f18033a);
        interfaceC9255b.registerEncoder(C9169a.class, a.f18020a);
        interfaceC9255b.registerEncoder(C9174f.class, g.f18038a);
        interfaceC9255b.registerEncoder(C9172d.class, d.f18030a);
        interfaceC9255b.registerEncoder(C9171c.class, c.f18027a);
        interfaceC9255b.registerEncoder(C9170b.class, b.f18025a);
        interfaceC9255b.registerEncoder(C9173e.class, f.f18035a);
    }
}
