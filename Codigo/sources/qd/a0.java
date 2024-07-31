package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class a0 extends com.google.protobuf.x<a0, a> implements s0 {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final a0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile z0<a0> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private z action_;
    private g0 body_;
    private g0 title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* loaded from: classes.dex */
    public static final class a extends x.a<a0, a> implements s0 {
        private a() {
            super(a0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        com.google.protobuf.x.W(a0.class, a0Var);
    }

    private a0() {
    }

    public static a0 f0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (y.f23967a[fVar.ordinal()]) {
            case 1:
                return new a0();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005Ȉ", new Object[]{"title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<a0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (a0.class) {
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

    public String d0() {
        return this.backgroundHexColor_;
    }

    public g0 e0() {
        g0 g0Var = this.body_;
        return g0Var == null ? g0.b0() : g0Var;
    }

    public String g0() {
        return this.imageUrl_;
    }

    public g0 h0() {
        g0 g0Var = this.title_;
        return g0Var == null ? g0.b0() : g0Var;
    }

    public boolean i0() {
        return this.action_ != null;
    }

    public boolean j0() {
        return this.body_ != null;
    }

    public boolean k0() {
        return this.title_ != null;
    }
}
