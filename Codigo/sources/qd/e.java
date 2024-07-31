package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class e extends com.google.protobuf.x<e, a> implements s0 {
    private static final e DEFAULT_INSTANCE;
    private static volatile z0<e> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* loaded from: classes.dex */
    public static final class a extends x.a<e, a> implements s0 {
        private a() {
            super(e.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(c cVar) {
            this();
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        com.google.protobuf.x.W(e.class, eVar);
    }

    private e() {
    }

    public static e b0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        c cVar = null;
        switch (c.f23943a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a(cVar);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<e> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (e.class) {
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

    public int d0() {
        return this.value_;
    }
}
