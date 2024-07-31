package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.a0 */
/* loaded from: classes.dex */
public final class C10434a0 extends AbstractC6629x<C10434a0, a> implements InterfaceC6617s0 {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final C10434a0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile InterfaceC6634z0<C10434a0> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private C10466z action_;
    private C10446g0 body_;
    private C10446g0 title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* renamed from: qd.a0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10434a0, a> implements InterfaceC6617s0 {
        private a() {
            super(C10434a0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10465y c10465y) {
            this();
        }
    }

    static {
        C10434a0 c10434a0 = new C10434a0();
        DEFAULT_INSTANCE = c10434a0;
        AbstractC6629x.m19291W(C10434a0.class, c10434a0);
    }

    private C10434a0() {
    }

    /* renamed from: f0 */
    public static C10434a0 m31268f0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10465y c10465y = null;
        switch (C10465y.f26009a[fVar.ordinal()]) {
            case 1:
                return new C10434a0();
            case 2:
                return new a(c10465y);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005Ȉ", new Object[]{"title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10434a0> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10434a0.class) {
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
    public C10466z m31269b0() {
        C10466z c10466z = this.action_;
        return c10466z == null ? C10466z.m31388d0() : c10466z;
    }

    /* renamed from: d0 */
    public String m31270d0() {
        return this.backgroundHexColor_;
    }

    /* renamed from: e0 */
    public C10446g0 m31271e0() {
        C10446g0 c10446g0 = this.body_;
        return c10446g0 == null ? C10446g0.m31341b0() : c10446g0;
    }

    /* renamed from: g0 */
    public String m31272g0() {
        return this.imageUrl_;
    }

    /* renamed from: h0 */
    public C10446g0 m31273h0() {
        C10446g0 c10446g0 = this.title_;
        return c10446g0 == null ? C10446g0.m31341b0() : c10446g0;
    }

    /* renamed from: i0 */
    public boolean m31274i0() {
        return this.action_ != null;
    }

    /* renamed from: j0 */
    public boolean m31275j0() {
        return this.body_ != null;
    }

    /* renamed from: k0 */
    public boolean m31276k0() {
        return this.title_ != null;
    }
}
