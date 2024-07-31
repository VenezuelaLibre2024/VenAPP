package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class z extends com.google.protobuf.x<z, a> implements s0 {
    public static final int ACTION_URL_FIELD_NUMBER = 1;
    private static final z DEFAULT_INSTANCE;
    private static volatile z0<z> PARSER;
    private String actionUrl_ = "";

    /* loaded from: classes.dex */
    public static final class a extends x.a<z, a> implements s0 {
        private a() {
            super(z.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        com.google.protobuf.x.W(z.class, zVar);
    }

    private z() {
    }

    public static z d0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (y.f23967a[fVar.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<z> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (z.class) {
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
        return this.actionUrl_;
    }
}
