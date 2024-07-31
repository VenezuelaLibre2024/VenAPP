package p420wc;

import p181jd.C9039c;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p203kd.InterfaceC9254a;
import p203kd.InterfaceC9255b;

/* renamed from: wc.a */
/* loaded from: classes.dex */
public final class C12148a implements InterfaceC9254a {

    /* renamed from: a */
    public static final InterfaceC9254a f32291a = new C12148a();

    /* renamed from: wc.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC9040d<AbstractC12156i> {

        /* renamed from: a */
        static final a f32292a = new a();

        /* renamed from: b */
        private static final C9039c f32293b = C9039c.m26548d("rolloutId");

        /* renamed from: c */
        private static final C9039c f32294c = C9039c.m26548d("parameterKey");

        /* renamed from: d */
        private static final C9039c f32295d = C9039c.m26548d("parameterValue");

        /* renamed from: e */
        private static final C9039c f32296e = C9039c.m26548d("variantId");

        /* renamed from: f */
        private static final C9039c f32297f = C9039c.m26548d("templateVersion");

        private a() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC12156i abstractC12156i, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f32293b, abstractC12156i.mo38917e());
            interfaceC9041e.add(f32294c, abstractC12156i.mo38915c());
            interfaceC9041e.add(f32295d, abstractC12156i.mo38916d());
            interfaceC9041e.add(f32296e, abstractC12156i.mo38919g());
            interfaceC9041e.add(f32297f, abstractC12156i.mo38918f());
        }
    }

    private C12148a() {
    }

    @Override // p203kd.InterfaceC9254a
    public void configure(InterfaceC9255b<?> interfaceC9255b) {
        a aVar = a.f32292a;
        interfaceC9255b.registerEncoder(AbstractC12156i.class, aVar);
        interfaceC9255b.registerEncoder(C12149b.class, aVar);
    }
}
