package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class g0 extends com.google.protobuf.x<g0, a> implements s0 {
    private static final g0 DEFAULT_INSTANCE;
    public static final int HEX_COLOR_FIELD_NUMBER = 2;
    private static volatile z0<g0> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String hexColor_ = "";

    /* loaded from: classes.dex */
    public static final class a extends x.a<g0, a> implements s0 {
        private a() {
            super(g0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        com.google.protobuf.x.W(g0.class, g0Var);
    }

    private g0() {
    }

    public static g0 b0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (y.f23967a[fVar.ordinal()]) {
            case 1:
                return new g0();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "hexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<g0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (g0.class) {
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

    public String d0() {
        return this.hexColor_;
    }

    public String e0() {
        return this.text_;
    }
}
