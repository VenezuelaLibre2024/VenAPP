package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class c0 extends com.google.protobuf.x<c0, a> implements s0 {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final c0 DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile z0<c0> PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private g0 body_;
    private b0 primaryActionButton_;
    private z primaryAction_;
    private b0 secondaryActionButton_;
    private z secondaryAction_;
    private g0 title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* loaded from: classes.dex */
    public static final class a extends x.a<c0, a> implements s0 {
        private a() {
            super(c0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        com.google.protobuf.x.W(c0.class, c0Var);
    }

    private c0() {
    }

    public static c0 e0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (y.f23967a[fVar.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t\b\t\t\t", new Object[]{"title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<c0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (c0.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new x.b<>(DEFAULT_INSTANCE);
                            PARSER = z0Var;
                        }
                    }
                }
                return z0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String b0() {
        return this.backgroundHexColor_;
    }

    public g0 d0() {
        g0 g0Var = this.body_;
        return g0Var == null ? g0.b0() : g0Var;
    }

    public String f0() {
        return this.landscapeImageUrl_;
    }

    public String g0() {
        return this.portraitImageUrl_;
    }

    public z h0() {
        z zVar = this.primaryAction_;
        return zVar == null ? z.d0() : zVar;
    }

    public b0 i0() {
        b0 b0Var = this.primaryActionButton_;
        return b0Var == null ? b0.d0() : b0Var;
    }

    public z j0() {
        z zVar = this.secondaryAction_;
        return zVar == null ? z.d0() : zVar;
    }

    public b0 k0() {
        b0 b0Var = this.secondaryActionButton_;
        return b0Var == null ? b0.d0() : b0Var;
    }

    public g0 l0() {
        g0 g0Var = this.title_;
        return g0Var == null ? g0.b0() : g0Var;
    }

    public boolean m0() {
        return this.body_ != null;
    }

    public boolean n0() {
        return this.primaryAction_ != null;
    }

    public boolean o0() {
        return this.primaryActionButton_ != null;
    }

    public boolean p0() {
        return this.secondaryAction_ != null;
    }

    public boolean q0() {
        return this.secondaryActionButton_ != null;
    }

    public boolean r0() {
        return this.title_ != null;
    }
}
