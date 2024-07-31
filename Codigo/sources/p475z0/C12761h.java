package p475z0;

import androidx.datastore.preferences.protobuf.AbstractC1215y;
import androidx.datastore.preferences.protobuf.InterfaceC1201s0;
import androidx.datastore.preferences.protobuf.InterfaceC1218z0;
import p475z0.C12760g;

/* renamed from: z0.h */
/* loaded from: classes.dex */
public final class C12761h extends AbstractC1215y<C12761h, a> implements InterfaceC1201s0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final C12761h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC1218z0<C12761h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* renamed from: z0.h$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1215y.a<C12761h, a> implements InterfaceC1201s0 {
        private a() {
            super(C12761h.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C12758e c12758e) {
            this();
        }

        /* renamed from: A */
        public a m42346A(float f10) {
            m6565s();
            ((C12761h) this.f5030b).m42333d0(f10);
            return this;
        }

        /* renamed from: B */
        public a m42347B(int i10) {
            m6565s();
            ((C12761h) this.f5030b).m42334e0(i10);
            return this;
        }

        /* renamed from: C */
        public a m42348C(long j10) {
            m6565s();
            ((C12761h) this.f5030b).m42335f0(j10);
            return this;
        }

        /* renamed from: D */
        public a m42349D(String str) {
            m6565s();
            ((C12761h) this.f5030b).m42336g0(str);
            return this;
        }

        /* renamed from: E */
        public a m42350E(C12760g.a aVar) {
            m6565s();
            ((C12761h) this.f5030b).m42337h0(aVar);
            return this;
        }

        /* renamed from: x */
        public a m42351x(boolean z10) {
            m6565s();
            ((C12761h) this.f5030b).m42331b0(z10);
            return this;
        }

        /* renamed from: z */
        public a m42352z(double d10) {
            m6565s();
            ((C12761h) this.f5030b).m42332c0(d10);
            return this;
        }
    }

    /* renamed from: z0.h$b */
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

        /* renamed from: b */
        public static b m42353b(int i10) {
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
        C12761h c12761h = new C12761h();
        DEFAULT_INSTANCE = c12761h;
        AbstractC1215y.m6547H(C12761h.class, c12761h);
    }

    private C12761h() {
    }

    /* renamed from: S */
    public static C12761h m42329S() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: a0 */
    public static a m42330a0() {
        return DEFAULT_INSTANCE.m6556r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m42331b0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m42332c0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m42333d0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m42334e0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m42335f0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m42336g0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m42337h0(C12760g.a aVar) {
        this.value_ = aVar.build();
        this.valueCase_ = 6;
    }

    /* renamed from: R */
    public boolean m42338R() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: T */
    public double m42339T() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: U */
    public float m42340U() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: V */
    public int m42341V() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: W */
    public long m42342W() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* renamed from: X */
    public String m42343X() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* renamed from: Y */
    public C12760g m42344Y() {
        return this.valueCase_ == 6 ? (C12760g) this.value_ : C12760g.m42317N();
    }

    /* renamed from: Z */
    public b m42345Z() {
        return b.m42353b(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1215y
    /* renamed from: u */
    protected final Object mo6559u(AbstractC1215y.f fVar, Object obj, Object obj2) {
        C12758e c12758e = null;
        switch (C12758e.f34799a[fVar.ordinal()]) {
            case 1:
                return new C12761h();
            case 2:
                return new a(c12758e);
            case 3:
                return AbstractC1215y.m6544E(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C12760g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1218z0<C12761h> interfaceC1218z0 = PARSER;
                if (interfaceC1218z0 == null) {
                    synchronized (C12761h.class) {
                        interfaceC1218z0 = PARSER;
                        if (interfaceC1218z0 == null) {
                            interfaceC1218z0 = new AbstractC1215y.b<>(DEFAULT_INSTANCE);
                            PARSER = interfaceC1218z0;
                        }
                    }
                }
                return interfaceC1218z0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
