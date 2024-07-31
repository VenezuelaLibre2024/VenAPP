package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class l extends com.google.protobuf.x<l, a> implements s0 {
    private static final l DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile z0<l> PARSER;
    private String experimentId_ = "";

    /* loaded from: classes.dex */
    public static final class a extends x.a<l, a> implements s0 {
        private a() {
            super(l.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(k kVar) {
            this();
        }
    }

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        com.google.protobuf.x.W(l.class, lVar);
    }

    private l() {
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f23947a[fVar.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new a(kVar);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<l> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (l.class) {
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
}
