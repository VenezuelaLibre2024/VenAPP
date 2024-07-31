package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.b0 */
/* loaded from: classes.dex */
public final class C10436b0 extends AbstractC6629x<C10436b0, a> implements InterfaceC6617s0 {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    private static final C10436b0 DEFAULT_INSTANCE;
    private static volatile InterfaceC6634z0<C10436b0> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String buttonHexColor_ = "";
    private C10446g0 text_;

    /* renamed from: qd.b0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10436b0, a> implements InterfaceC6617s0 {
        private a() {
            super(C10436b0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10465y c10465y) {
            this();
        }
    }

    static {
        C10436b0 c10436b0 = new C10436b0();
        DEFAULT_INSTANCE = c10436b0;
        AbstractC6629x.m19291W(C10436b0.class, c10436b0);
    }

    private C10436b0() {
    }

    /* renamed from: d0 */
    public static C10436b0 m31286d0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10465y c10465y = null;
        switch (C10465y.f26009a[fVar.ordinal()]) {
            case 1:
                return new C10436b0();
            case 2:
                return new a(c10465y);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"text_", "buttonHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10436b0> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10436b0.class) {
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

    /* renamed from: b0 */
    public String m31287b0() {
        return this.buttonHexColor_;
    }

    /* renamed from: e0 */
    public C10446g0 m31288e0() {
        C10446g0 c10446g0 = this.text_;
        return c10446g0 == null ? C10446g0.m31341b0() : c10446g0;
    }

    /* renamed from: f0 */
    public boolean m31289f0() {
        return this.text_ != null;
    }
}
