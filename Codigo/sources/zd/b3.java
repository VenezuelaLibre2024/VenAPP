package zd;

import com.google.protobuf.x;

/* loaded from: classes.dex */
public final class b3 extends com.google.protobuf.x<b3, a> implements com.google.protobuf.s0 {
    private static final b3 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.z0<b3> PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    /* loaded from: classes.dex */
    public static final class a extends x.a<b3, a> implements com.google.protobuf.s0 {
        private a() {
            super(b3.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(a3 a3Var) {
            this();
        }

        public a I() {
            A();
            ((b3) this.f13384b).f0();
            return this;
        }

        public a J(long j10) {
            A();
            ((b3) this.f13384b).l0(j10);
            return this;
        }

        public a K(long j10) {
            A();
            ((b3) this.f13384b).m0(j10);
            return this;
        }
    }

    static {
        b3 b3Var = new b3();
        DEFAULT_INSTANCE = b3Var;
        com.google.protobuf.x.W(b3.class, b3Var);
    }

    private b3() {
    }

    public void f0() {
        this.value_ = 0L;
    }

    public static b3 g0() {
        return DEFAULT_INSTANCE;
    }

    public static a j0() {
        return DEFAULT_INSTANCE.A();
    }

    public static a k0(b3 b3Var) {
        return DEFAULT_INSTANCE.B(b3Var);
    }

    public void l0(long j10) {
        this.startTimeEpoch_ = j10;
    }

    public void m0(long j10) {
        this.value_ = j10;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (a3.f32557a[fVar.ordinal()]) {
            case 1:
                return new b3();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.z0<b3> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (b3.class) {
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

    public long h0() {
        return this.startTimeEpoch_;
    }

    public long i0() {
        return this.value_;
    }
}
