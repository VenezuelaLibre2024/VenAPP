package com.google.firebase.messaging;

import md.C9566a;
import me.C9575a;
import me.C9576b;
import p181jd.C9039c;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p203kd.InterfaceC9254a;
import p203kd.InterfaceC9255b;

/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes.dex */
public final class C6208a implements InterfaceC9254a {

    /* renamed from: a */
    public static final InterfaceC9254a f13239a = new C6208a();

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC9040d<C9575a> {

        /* renamed from: a */
        static final a f13240a = new a();

        /* renamed from: b */
        private static final C9039c f13241b = C9039c.m26547a("projectNumber").m26552b(C9566a.m28451b().m28453c(1).m28452a()).m26551a();

        /* renamed from: c */
        private static final C9039c f13242c = C9039c.m26547a("messageId").m26552b(C9566a.m28451b().m28453c(2).m28452a()).m26551a();

        /* renamed from: d */
        private static final C9039c f13243d = C9039c.m26547a("instanceId").m26552b(C9566a.m28451b().m28453c(3).m28452a()).m26551a();

        /* renamed from: e */
        private static final C9039c f13244e = C9039c.m26547a("messageType").m26552b(C9566a.m28451b().m28453c(4).m28452a()).m26551a();

        /* renamed from: f */
        private static final C9039c f13245f = C9039c.m26547a("sdkPlatform").m26552b(C9566a.m28451b().m28453c(5).m28452a()).m26551a();

        /* renamed from: g */
        private static final C9039c f13246g = C9039c.m26547a("packageName").m26552b(C9566a.m28451b().m28453c(6).m28452a()).m26551a();

        /* renamed from: h */
        private static final C9039c f13247h = C9039c.m26547a("collapseKey").m26552b(C9566a.m28451b().m28453c(7).m28452a()).m26551a();

        /* renamed from: i */
        private static final C9039c f13248i = C9039c.m26547a("priority").m26552b(C9566a.m28451b().m28453c(8).m28452a()).m26551a();

        /* renamed from: j */
        private static final C9039c f13249j = C9039c.m26547a("ttl").m26552b(C9566a.m28451b().m28453c(9).m28452a()).m26551a();

        /* renamed from: k */
        private static final C9039c f13250k = C9039c.m26547a("topic").m26552b(C9566a.m28451b().m28453c(10).m28452a()).m26551a();

        /* renamed from: l */
        private static final C9039c f13251l = C9039c.m26547a("bulkId").m26552b(C9566a.m28451b().m28453c(11).m28452a()).m26551a();

        /* renamed from: m */
        private static final C9039c f13252m = C9039c.m26547a("event").m26552b(C9566a.m28451b().m28453c(12).m28452a()).m26551a();

        /* renamed from: n */
        private static final C9039c f13253n = C9039c.m26547a("analyticsLabel").m26552b(C9566a.m28451b().m28453c(13).m28452a()).m26551a();

        /* renamed from: o */
        private static final C9039c f13254o = C9039c.m26547a("campaignId").m26552b(C9566a.m28451b().m28453c(14).m28452a()).m26551a();

        /* renamed from: p */
        private static final C9039c f13255p = C9039c.m26547a("composerLabel").m26552b(C9566a.m28451b().m28453c(15).m28452a()).m26551a();

        private a() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C9575a c9575a, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f13241b, c9575a.m28497l());
            interfaceC9041e.add(f13242c, c9575a.m28493h());
            interfaceC9041e.add(f13243d, c9575a.m28492g());
            interfaceC9041e.add(f13244e, c9575a.m28494i());
            interfaceC9041e.add(f13245f, c9575a.m28498m());
            interfaceC9041e.add(f13246g, c9575a.m28495j());
            interfaceC9041e.add(f13247h, c9575a.m28489d());
            interfaceC9041e.add(f13248i, c9575a.m28496k());
            interfaceC9041e.add(f13249j, c9575a.m28500o());
            interfaceC9041e.add(f13250k, c9575a.m28499n());
            interfaceC9041e.add(f13251l, c9575a.m28487b());
            interfaceC9041e.add(f13252m, c9575a.m28491f());
            interfaceC9041e.add(f13253n, c9575a.m28486a());
            interfaceC9041e.add(f13254o, c9575a.m28488c());
            interfaceC9041e.add(f13255p, c9575a.m28490e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC9040d<C9576b> {

        /* renamed from: a */
        static final b f13256a = new b();

        /* renamed from: b */
        private static final C9039c f13257b = C9039c.m26547a("messagingClientEvent").m26552b(C9566a.m28451b().m28453c(1).m28452a()).m26551a();

        private b() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C9576b c9576b, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f13257b, c9576b.m28515a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: classes.dex */
    private static final class c implements InterfaceC9040d<AbstractC6242l0> {

        /* renamed from: a */
        static final c f13258a = new c();

        /* renamed from: b */
        private static final C9039c f13259b = C9039c.m26548d("messagingClientEventExtension");

        private c() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC6242l0 abstractC6242l0, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f13259b, abstractC6242l0.m17107b());
        }
    }

    private C6208a() {
    }

    @Override // p203kd.InterfaceC9254a
    public void configure(InterfaceC9255b<?> interfaceC9255b) {
        interfaceC9255b.registerEncoder(AbstractC6242l0.class, c.f13258a);
        interfaceC9255b.registerEncoder(C9576b.class, b.f13256a);
        interfaceC9255b.registerEncoder(C9575a.class, a.f13240a);
    }
}
