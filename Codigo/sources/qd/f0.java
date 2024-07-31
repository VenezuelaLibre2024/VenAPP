package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class f0 extends com.google.protobuf.x<f0, a> implements s0 {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final f0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile z0<f0> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private b0 actionButton_;
    private z action_;
    private g0 body_;
    private g0 title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* loaded from: classes.dex */
    public static final class a extends x.a<f0, a> implements s0 {
        private a() {
            super(f0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        com.google.protobuf.x.W(f0.class, f0Var);
    }

    private f0() {
    }

    public static f0 g0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (y.f23967a[fVar.ordinal()]) {
            case 1:
                return new f0();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005\t\u0006Ȉ", new Object[]{"title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<f0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (f0.class) {
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

    public z b0() {
        z zVar = this.action_;
        return zVar == null ? z.d0() : zVar;
    }

    public b0 d0() {
        b0 b0Var = this.actionButton_;
        return b0Var == null ? b0.d0() : b0Var;
    }

    public String e0() {
        return this.backgroundHexColor_;
    }

    public g0 f0() {
        g0 g0Var = this.body_;
        return g0Var == null ? g0.b0() : g0Var;
    }

    public String h0() {
        return this.imageUrl_;
    }

    public g0 i0() {
        g0 g0Var = this.title_;
        return g0Var == null ? g0.b0() : g0Var;
    }

    public boolean j0() {
        return this.action_ != null;
    }

    public boolean k0() {
        return this.body_ != null;
    }

    public boolean l0() {
        return this.title_ != null;
    }
}
