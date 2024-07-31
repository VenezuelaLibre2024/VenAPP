package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class b0 extends com.google.protobuf.x<b0, a> implements s0 {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    private static final b0 DEFAULT_INSTANCE;
    private static volatile z0<b0> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String buttonHexColor_ = "";
    private g0 text_;

    /* loaded from: classes.dex */
    public static final class a extends x.a<b0, a> implements s0 {
        private a() {
            super(b0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        com.google.protobuf.x.W(b0.class, b0Var);
    }

    private b0() {
    }

    public static b0 d0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (y.f23967a[fVar.ordinal()]) {
            case 1:
                return new b0();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"text_", "buttonHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<b0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (b0.class) {
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
        return this.buttonHexColor_;
    }

    public g0 e0() {
        g0 g0Var = this.text_;
        return g0Var == null ? g0.b0() : g0Var;
    }

    public boolean f0() {
        return this.text_ != null;
    }
}
