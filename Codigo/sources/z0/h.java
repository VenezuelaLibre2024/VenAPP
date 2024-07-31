package z0;

import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z0;
import z0.g;

/* loaded from: classes.dex */
public final class h extends y<h, a> implements s0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile z0<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* loaded from: classes.dex */
    public static final class a extends y.a<h, a> implements s0 {
        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a A(float f10) {
            s();
            ((h) this.f4319b).d0(f10);
            return this;
        }

        public a B(int i10) {
            s();
            ((h) this.f4319b).e0(i10);
            return this;
        }

        public a C(long j10) {
            s();
            ((h) this.f4319b).f0(j10);
            return this;
        }

        public a D(String str) {
            s();
            ((h) this.f4319b).g0(str);
            return this;
        }

        public a E(g.a aVar) {
            s();
            ((h) this.f4319b).h0(aVar);
            return this;
        }

        public a x(boolean z10) {
            s();
            ((h) this.f4319b).b0(z10);
            return this;
        }

        public a z(double d10) {
            s();
            ((h) this.f4319b).c0(d10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);

        private final int value;

        b(int i10) {
            this.value = i10;
        }

        public static b b(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        y.H(h.class, hVar);
    }

    private h() {
    }

    public static h S() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.r();
    }

    public void b0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    public void c0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    public void d0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    public void e0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    public void f0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    public void g0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public void h0(g.a aVar) {
        this.value_ = aVar.build();
        this.valueCase_ = 6;
    }

    public boolean R() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double T() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float U() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int V() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long W() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String X() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g Y() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.N();
    }

    public b Z() {
        return b.b(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.y
    protected final Object u(y.f fVar, Object obj, Object obj2) {
        switch (e.f32248a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(null);
            case 3:
                return y.E(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<h> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (h.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new y.b<>(DEFAULT_INSTANCE);
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
