package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class g extends com.google.protobuf.x<g, a> implements s0 {
    private static final g DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile z0<g> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 2;
    private double doubleValue_;
    private float floatValue_;
    private long intValue_;
    private String name_ = "";
    private String stringValue_ = "";

    /* loaded from: classes.dex */
    public static final class a extends x.a<g, a> implements s0 {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(c cVar) {
            this();
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        com.google.protobuf.x.W(g.class, gVar);
    }

    private g() {
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        c cVar = null;
        switch (c.f23943a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(cVar);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0000", new Object[]{"name_", "stringValue_", "intValue_", "floatValue_", "doubleValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<g> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (g.class) {
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
