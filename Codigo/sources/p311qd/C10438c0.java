package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.c0 */
/* loaded from: classes.dex */
public final class C10438c0 extends AbstractC6629x<C10438c0, a> implements InterfaceC6617s0 {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final C10438c0 DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile InterfaceC6634z0<C10438c0> PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private C10446g0 body_;
    private C10436b0 primaryActionButton_;
    private C10466z primaryAction_;
    private C10436b0 secondaryActionButton_;
    private C10466z secondaryAction_;
    private C10446g0 title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* renamed from: qd.c0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10438c0, a> implements InterfaceC6617s0 {
        private a() {
            super(C10438c0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10465y c10465y) {
            this();
        }
    }

    static {
        C10438c0 c10438c0 = new C10438c0();
        DEFAULT_INSTANCE = c10438c0;
        AbstractC6629x.m19291W(C10438c0.class, c10438c0);
    }

    private C10438c0() {
    }

    /* renamed from: e0 */
    public static C10438c0 m31291e0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10465y c10465y = null;
        switch (C10465y.f26009a[fVar.ordinal()]) {
            case 1:
                return new C10438c0();
            case 2:
                return new a(c10465y);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t\b\t\t\t", new Object[]{"title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10438c0> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10438c0.class) {
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
    public String m31292b0() {
        return this.backgroundHexColor_;
    }

    /* renamed from: d0 */
    public C10446g0 m31293d0() {
        C10446g0 c10446g0 = this.body_;
        return c10446g0 == null ? C10446g0.m31341b0() : c10446g0;
    }

    /* renamed from: f0 */
    public String m31294f0() {
        return this.landscapeImageUrl_;
    }

    /* renamed from: g0 */
    public String m31295g0() {
        return this.portraitImageUrl_;
    }

    /* renamed from: h0 */
    public C10466z m31296h0() {
        C10466z c10466z = this.primaryAction_;
        return c10466z == null ? C10466z.m31388d0() : c10466z;
    }

    /* renamed from: i0 */
    public C10436b0 m31297i0() {
        C10436b0 c10436b0 = this.primaryActionButton_;
        return c10436b0 == null ? C10436b0.m31286d0() : c10436b0;
    }

    /* renamed from: j0 */
    public C10466z m31298j0() {
        C10466z c10466z = this.secondaryAction_;
        return c10466z == null ? C10466z.m31388d0() : c10466z;
    }

    /* renamed from: k0 */
    public C10436b0 m31299k0() {
        C10436b0 c10436b0 = this.secondaryActionButton_;
        return c10436b0 == null ? C10436b0.m31286d0() : c10436b0;
    }

    /* renamed from: l0 */
    public C10446g0 m31300l0() {
        C10446g0 c10446g0 = this.title_;
        return c10446g0 == null ? C10446g0.m31341b0() : c10446g0;
    }

    /* renamed from: m0 */
    public boolean m31301m0() {
        return this.body_ != null;
    }

    /* renamed from: n0 */
    public boolean m31302n0() {
        return this.primaryAction_ != null;
    }

    /* renamed from: o0 */
    public boolean m31303o0() {
        return this.primaryActionButton_ != null;
    }

    /* renamed from: p0 */
    public boolean m31304p0() {
        return this.secondaryAction_ != null;
    }

    /* renamed from: q0 */
    public boolean m31305q0() {
        return this.secondaryActionButton_ != null;
    }

    /* renamed from: r0 */
    public boolean m31306r0() {
        return this.title_ != null;
    }
}
