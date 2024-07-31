package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.g0 */
/* loaded from: classes.dex */
public final class C10446g0 extends AbstractC6629x<C10446g0, a> implements InterfaceC6617s0 {
    private static final C10446g0 DEFAULT_INSTANCE;
    public static final int HEX_COLOR_FIELD_NUMBER = 2;
    private static volatile InterfaceC6634z0<C10446g0> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String hexColor_ = "";

    /* renamed from: qd.g0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10446g0, a> implements InterfaceC6617s0 {
        private a() {
            super(C10446g0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10465y c10465y) {
            this();
        }
    }

    static {
        C10446g0 c10446g0 = new C10446g0();
        DEFAULT_INSTANCE = c10446g0;
        AbstractC6629x.m19291W(C10446g0.class, c10446g0);
    }

    private C10446g0() {
    }

    /* renamed from: b0 */
    public static C10446g0 m31341b0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10465y c10465y = null;
        switch (C10465y.f26009a[fVar.ordinal()]) {
            case 1:
                return new C10446g0();
            case 2:
                return new a(c10465y);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "hexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10446g0> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10446g0.class) {
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

    /* renamed from: d0 */
    public String m31342d0() {
        return this.hexColor_;
    }

    /* renamed from: e0 */
    public String m31343e0() {
        return this.text_;
    }
}
