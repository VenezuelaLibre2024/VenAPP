package zd;

import com.google.protobuf.t1;
import com.google.protobuf.x;
import java.util.Map;

/* loaded from: classes.dex */
public final class c3 extends com.google.protobuf.x<c3, a> implements com.google.protobuf.s0 {
    private static final c3 DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.z0<c3> PARSER;
    private com.google.protobuf.l0<String, b3> limits_ = com.google.protobuf.l0.d();

    /* loaded from: classes.dex */
    public static final class a extends x.a<c3, a> implements com.google.protobuf.s0 {
        private a() {
            super(c3.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(a3 a3Var) {
            this();
        }

        public a I(String str, b3 b3Var) {
            str.getClass();
            b3Var.getClass();
            A();
            ((c3) this.f13384b).f0().put(str, b3Var);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a */
        static final com.google.protobuf.k0<String, b3> f32569a = com.google.protobuf.k0.d(t1.b.STRING, "", t1.b.MESSAGE, b3.g0());
    }

    static {
        c3 c3Var = new c3();
        DEFAULT_INSTANCE = c3Var;
        com.google.protobuf.x.W(c3.class, c3Var);
    }

    private c3() {
    }

    public static c3 d0() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, b3> f0() {
        return h0();
    }

    private com.google.protobuf.l0<String, b3> g0() {
        return this.limits_;
    }

    private com.google.protobuf.l0<String, b3> h0() {
        if (!this.limits_.j()) {
            this.limits_ = this.limits_.m();
        }
        return this.limits_;
    }

    public static a i0(c3 c3Var) {
        return DEFAULT_INSTANCE.B(c3Var);
    }

    public static com.google.protobuf.z0<c3> j0() {
        return DEFAULT_INSTANCE.g();
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (a3.f32557a[fVar.ordinal()]) {
            case 1:
                return new c3();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", b.f32569a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.z0<c3> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (c3.class) {
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

    public b3 e0(String str, b3 b3Var) {
        str.getClass();
        com.google.protobuf.l0<String, b3> g02 = g0();
        return g02.containsKey(str) ? g02.get(str) : b3Var;
    }
}
