package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class e0 extends com.google.protobuf.x<e0, a> implements s0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final e0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile z0<e0> PARSER;
    private z action_;
    private String imageUrl_ = "";

    /* loaded from: classes.dex */
    public static final class a extends x.a<e0, a> implements s0 {
        private a() {
            super(e0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        com.google.protobuf.x.W(e0.class, e0Var);
    }

    private e0() {
    }

    public static e0 d0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (y.f23967a[fVar.ordinal()]) {
            case 1:
                return new e0();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"imageUrl_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<e0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (e0.class) {
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

    public String e0() {
        return this.imageUrl_;
    }

    public boolean f0() {
        return this.action_ != null;
    }
}
