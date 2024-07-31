package com.google.firebase.messaging;

/* loaded from: classes.dex */
public final class a implements kd.a {

    /* renamed from: a */
    public static final kd.a f12024a = new a();

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes.dex */
    private static final class C0177a implements jd.d<me.a> {

        /* renamed from: a */
        static final C0177a f12025a = new C0177a();

        /* renamed from: b */
        private static final jd.c f12026b = jd.c.a("projectNumber").b(md.a.b().c(1).a()).a();

        /* renamed from: c */
        private static final jd.c f12027c = jd.c.a("messageId").b(md.a.b().c(2).a()).a();

        /* renamed from: d */
        private static final jd.c f12028d = jd.c.a("instanceId").b(md.a.b().c(3).a()).a();

        /* renamed from: e */
        private static final jd.c f12029e = jd.c.a("messageType").b(md.a.b().c(4).a()).a();

        /* renamed from: f */
        private static final jd.c f12030f = jd.c.a("sdkPlatform").b(md.a.b().c(5).a()).a();

        /* renamed from: g */
        private static final jd.c f12031g = jd.c.a("packageName").b(md.a.b().c(6).a()).a();

        /* renamed from: h */
        private static final jd.c f12032h = jd.c.a("collapseKey").b(md.a.b().c(7).a()).a();

        /* renamed from: i */
        private static final jd.c f12033i = jd.c.a("priority").b(md.a.b().c(8).a()).a();

        /* renamed from: j */
        private static final jd.c f12034j = jd.c.a("ttl").b(md.a.b().c(9).a()).a();

        /* renamed from: k */
        private static final jd.c f12035k = jd.c.a("topic").b(md.a.b().c(10).a()).a();

        /* renamed from: l */
        private static final jd.c f12036l = jd.c.a("bulkId").b(md.a.b().c(11).a()).a();

        /* renamed from: m */
        private static final jd.c f12037m = jd.c.a("event").b(md.a.b().c(12).a()).a();

        /* renamed from: n */
        private static final jd.c f12038n = jd.c.a("analyticsLabel").b(md.a.b().c(13).a()).a();

        /* renamed from: o */
        private static final jd.c f12039o = jd.c.a("campaignId").b(md.a.b().c(14).a()).a();

        /* renamed from: p */
        private static final jd.c f12040p = jd.c.a("composerLabel").b(md.a.b().c(15).a()).a();

        private C0177a() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(me.a aVar, jd.e eVar) {
            eVar.add(f12026b, aVar.l());
            eVar.add(f12027c, aVar.h());
            eVar.add(f12028d, aVar.g());
            eVar.add(f12029e, aVar.i());
            eVar.add(f12030f, aVar.m());
            eVar.add(f12031g, aVar.j());
            eVar.add(f12032h, aVar.d());
            eVar.add(f12033i, aVar.k());
            eVar.add(f12034j, aVar.o());
            eVar.add(f12035k, aVar.n());
            eVar.add(f12036l, aVar.b());
            eVar.add(f12037m, aVar.f());
            eVar.add(f12038n, aVar.a());
            eVar.add(f12039o, aVar.c());
            eVar.add(f12040p, aVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements jd.d<me.b> {

        /* renamed from: a */
        static final b f12041a = new b();

        /* renamed from: b */
        private static final jd.c f12042b = jd.c.a("messagingClientEvent").b(md.a.b().c(1).a()).a();

        private b() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(me.b bVar, jd.e eVar) {
            eVar.add(f12042b, bVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements jd.d<l0> {

        /* renamed from: a */
        static final c f12043a = new c();

        /* renamed from: b */
        private static final jd.c f12044b = jd.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // jd.d
        /* renamed from: a */
        public void encode(l0 l0Var, jd.e eVar) {
            eVar.add(f12044b, l0Var.b());
        }
    }

    private a() {
    }

    @Override // kd.a
    public void configure(kd.b<?> bVar) {
        bVar.registerEncoder(l0.class, c.f12043a);
        bVar.registerEncoder(me.b.class, b.f12041a);
        bVar.registerEncoder(me.a.class, C0177a.f12025a);
    }
}
