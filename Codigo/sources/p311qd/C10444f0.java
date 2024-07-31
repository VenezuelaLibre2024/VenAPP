package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.f0 */
/* loaded from: classes.dex */
public final class C10444f0 extends AbstractC6629x<C10444f0, a> implements InterfaceC6617s0 {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final C10444f0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile InterfaceC6634z0<C10444f0> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private C10436b0 actionButton_;
    private C10466z action_;
    private C10446g0 body_;
    private C10446g0 title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* renamed from: qd.f0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10444f0, a> implements InterfaceC6617s0 {
        private a() {
            super(C10444f0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10465y c10465y) {
            this();
        }
    }

    static {
        C10444f0 c10444f0 = new C10444f0();
        DEFAULT_INSTANCE = c10444f0;
        AbstractC6629x.m19291W(C10444f0.class, c10444f0);
    }

    private C10444f0() {
    }

    /* renamed from: g0 */
    public static C10444f0 m31329g0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10465y c10465y = null;
        switch (C10465y.f26009a[fVar.ordinal()]) {
            case 1:
                return new C10444f0();
            case 2:
                return new a(c10465y);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005\t\u0006Ȉ", new Object[]{"title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10444f0> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10444f0.class) {
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
    public C10466z m31330b0() {
        C10466z c10466z = this.action_;
        return c10466z == null ? C10466z.m31388d0() : c10466z;
    }

    /* renamed from: d0 */
    public C10436b0 m31331d0() {
        C10436b0 c10436b0 = this.actionButton_;
        return c10436b0 == null ? C10436b0.m31286d0() : c10436b0;
    }

    /* renamed from: e0 */
    public String m31332e0() {
        return this.backgroundHexColor_;
    }

    /* renamed from: f0 */
    public C10446g0 m31333f0() {
        C10446g0 c10446g0 = this.body_;
        return c10446g0 == null ? C10446g0.m31341b0() : c10446g0;
    }

    /* renamed from: h0 */
    public String m31334h0() {
        return this.imageUrl_;
    }

    /* renamed from: i0 */
    public C10446g0 m31335i0() {
        C10446g0 c10446g0 = this.title_;
        return c10446g0 == null ? C10446g0.m31341b0() : c10446g0;
    }

    /* renamed from: j0 */
    public boolean m31336j0() {
        return this.action_ != null;
    }

    /* renamed from: k0 */
    public boolean m31337k0() {
        return this.body_ != null;
    }

    /* renamed from: l0 */
    public boolean m31338l0() {
        return this.title_ != null;
    }
}
