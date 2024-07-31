package p464yb;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: yb.b */
/* loaded from: classes2.dex */
public final class C12660b extends AbstractC6629x<C12660b, a> implements InterfaceC6617s0 {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final C12660b DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile InterfaceC6634z0<C12660b> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    /* renamed from: yb.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6629x.a<C12660b, a> implements InterfaceC6617s0 {
        private a() {
            super(C12660b.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C12659a c12659a) {
            this();
        }

        /* renamed from: I */
        public a m41651I(String str) {
            m19314A();
            ((C12660b) this.f14658b).m41647h0(str);
            return this;
        }

        /* renamed from: J */
        public a m41652J(String str) {
            m19314A();
            ((C12660b) this.f14658b).m41648i0(str);
            return this;
        }

        /* renamed from: K */
        public a m41653K(String str) {
            m19314A();
            ((C12660b) this.f14658b).m41649j0(str);
            return this;
        }

        /* renamed from: L */
        public a m41654L(String str) {
            m19314A();
            ((C12660b) this.f14658b).m41650k0(str);
            return this;
        }
    }

    static {
        C12660b c12660b = new C12660b();
        DEFAULT_INSTANCE = c12660b;
        AbstractC6629x.m19291W(C12660b.class, c12660b);
    }

    private C12660b() {
    }

    /* renamed from: g0 */
    public static a m41646g0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m41647h0(String str) {
        str.getClass();
        this.appVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m41648i0(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m41649j0(String str) {
        str.getClass();
        this.platformVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public void m41650k0(String str) {
        str.getClass();
        this.timeZone_ = str;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C12659a c12659a = null;
        switch (C12659a.f34357a[fVar.ordinal()]) {
            case 1:
                return new C12660b();
            case 2:
                return new a(c12659a);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12660b> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12660b.class) {
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
}
