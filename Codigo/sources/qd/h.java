package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class h extends com.google.protobuf.x<h, a> implements s0 {
    private static final h DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile z0<h> PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    /* loaded from: classes.dex */
    public static final class a extends x.a<h, a> implements s0 {
        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(c cVar) {
            this();
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.google.protobuf.x.W(h.class, hVar);
    }

    private h() {
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (c.f23943a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", d.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<h> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (h.class) {
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

    public d b0() {
        return this.conditionCase_ == 2 ? (d) this.condition_ : d.b0();
    }

    public f d0() {
        if (this.conditionCase_ != 1) {
            return f.UNKNOWN_TRIGGER;
        }
        f b10 = f.b(((Integer) this.condition_).intValue());
        return b10 == null ? f.UNRECOGNIZED : b10;
    }
}
