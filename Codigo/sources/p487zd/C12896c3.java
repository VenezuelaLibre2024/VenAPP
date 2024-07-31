package p487zd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6593k0;
import com.google.protobuf.C6596l0;
import com.google.protobuf.C6621t1;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import java.util.Map;

/* renamed from: zd.c3 */
/* loaded from: classes.dex */
public final class C12896c3 extends AbstractC6629x<C12896c3, a> implements InterfaceC6617s0 {
    private static final C12896c3 DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile InterfaceC6634z0<C12896c3> PARSER;
    private C6596l0<String, C12891b3> limits_ = C6596l0.m18927d();

    /* renamed from: zd.c3$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C12896c3, a> implements InterfaceC6617s0 {
        private a() {
            super(C12896c3.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C12886a3 c12886a3) {
            this();
        }

        /* renamed from: I */
        public a m42700I(String str, C12891b3 c12891b3) {
            str.getClass();
            c12891b3.getClass();
            m19314A();
            ((C12896c3) this.f14658b).m42694f0().put(str, c12891b3);
            return this;
        }
    }

    /* renamed from: zd.c3$b */
    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a */
        static final C6593k0<String, C12891b3> f35120a = C6593k0.m18906d(C6621t1.b.STRING, "", C6621t1.b.MESSAGE, C12891b3.m42676g0());
    }

    static {
        C12896c3 c12896c3 = new C12896c3();
        DEFAULT_INSTANCE = c12896c3;
        AbstractC6629x.m19291W(C12896c3.class, c12896c3);
    }

    private C12896c3() {
    }

    /* renamed from: d0 */
    public static C12896c3 m42693d0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public Map<String, C12891b3> m42694f0() {
        return m42696h0();
    }

    /* renamed from: g0 */
    private C6596l0<String, C12891b3> m42695g0() {
        return this.limits_;
    }

    /* renamed from: h0 */
    private C6596l0<String, C12891b3> m42696h0() {
        if (!this.limits_.m18931j()) {
            this.limits_ = this.limits_.m18934m();
        }
        return this.limits_;
    }

    /* renamed from: i0 */
    public static a m42697i0(C12896c3 c12896c3) {
        return DEFAULT_INSTANCE.m19294B(c12896c3);
    }

    /* renamed from: j0 */
    public static InterfaceC6634z0<C12896c3> m42698j0() {
        return DEFAULT_INSTANCE.mo19035g();
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C12886a3 c12886a3 = null;
        switch (C12886a3.f35108a[fVar.ordinal()]) {
            case 1:
                return new C12896c3();
            case 2:
                return new a(c12886a3);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", b.f35120a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12896c3> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12896c3.class) {
                        interfaceC6634z0 = PARSER;
                        if (interfaceC6634z0 == null) {
                            interfaceC6634z0 = new AbstractC6629x.b<>(DEFAULT_INSTANCE);
                            PARSER = interfaceC6634z0;
                        }
                    }
                }
                return interfaceC6634z0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e0 */
    public C12891b3 m42699e0(String str, C12891b3 c12891b3) {
        str.getClass();
        C6596l0<String, C12891b3> m42695g0 = m42695g0();
        return m42695g0.containsKey(str) ? m42695g0.get(str) : c12891b3;
    }
}
