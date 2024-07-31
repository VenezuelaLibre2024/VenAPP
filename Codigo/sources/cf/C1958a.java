package cf;

import p181jd.C9039c;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p203kd.InterfaceC9254a;
import p203kd.InterfaceC9255b;

/* renamed from: cf.a */
/* loaded from: classes2.dex */
public final class C1958a implements InterfaceC9254a {

    /* renamed from: a */
    public static final InterfaceC9254a f8031a = new C1958a();

    /* renamed from: cf.a$a */
    /* loaded from: classes2.dex */
    private static final class a implements InterfaceC9040d<AbstractC1961d> {

        /* renamed from: a */
        static final a f8032a = new a();

        /* renamed from: b */
        private static final C9039c f8033b = C9039c.m26548d("rolloutId");

        /* renamed from: c */
        private static final C9039c f8034c = C9039c.m26548d("variantId");

        /* renamed from: d */
        private static final C9039c f8035d = C9039c.m26548d("parameterKey");

        /* renamed from: e */
        private static final C9039c f8036e = C9039c.m26548d("parameterValue");

        /* renamed from: f */
        private static final C9039c f8037f = C9039c.m26548d("templateVersion");

        private a() {
        }

        @Override // p181jd.InterfaceC9040d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC1961d abstractC1961d, InterfaceC9041e interfaceC9041e) {
            interfaceC9041e.add(f8033b, abstractC1961d.mo10202d());
            interfaceC9041e.add(f8034c, abstractC1961d.mo10204f());
            interfaceC9041e.add(f8035d, abstractC1961d.mo10200b());
            interfaceC9041e.add(f8036e, abstractC1961d.mo10201c());
            interfaceC9041e.add(f8037f, abstractC1961d.mo10203e());
        }
    }

    private C1958a() {
    }

    @Override // p203kd.InterfaceC9254a
    public void configure(InterfaceC9255b<?> interfaceC9255b) {
        a aVar = a.f8032a;
        interfaceC9255b.registerEncoder(AbstractC1961d.class, aVar);
        interfaceC9255b.registerEncoder(C1959b.class, aVar);
    }
}
