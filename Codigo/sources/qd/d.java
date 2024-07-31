package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class d extends com.google.protobuf.x<d, a> implements s0 {
    public static final int COUNT_FIELD_NUMBER = 5;
    private static final d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile z0<d> PARSER = null;
    public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
    public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
    private int count_;
    private long previousTimestampMillis_;
    private long timestampMillis_;
    private z.i<g> triggerParams_ = com.google.protobuf.x.G();
    private String name_ = "";

    /* loaded from: classes.dex */
    public static final class a extends x.a<d, a> implements s0 {
        private a() {
            super(d.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(c cVar) {
            this();
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        com.google.protobuf.x.W(d.class, dVar);
    }

    private d() {
    }

    public static d b0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (c.f23943a[fVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", g.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<d> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (d.class) {
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
        return this.name_;
    }
}
