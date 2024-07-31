package xe;

import com.google.protobuf.x;
import com.google.protobuf.z0;
import xe.c;

/* loaded from: classes.dex */
public final class i extends x<i, b> implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile z0<i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31229a;

        static {
            int[] iArr = new int[x.f.values().length];
            f31229a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31229a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31229a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31229a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31229a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31229a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31229a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x.a<i, b> implements j {
        private b() {
            super(i.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(c.b bVar) {
            A();
            ((i) this.f13384b).j0(bVar.build());
            return this;
        }

        public b J(g gVar) {
            A();
            ((i) this.f13384b).k0(gVar);
            return this;
        }

        public b K(h hVar) {
            A();
            ((i) this.f13384b).l0(hVar);
            return this;
        }

        public b L(m mVar) {
            A();
            ((i) this.f13384b).m0(mVar);
            return this;
        }

        @Override // xe.j
        public boolean i() {
            return ((i) this.f13384b).i();
        }

        @Override // xe.j
        public boolean j() {
            return ((i) this.f13384b).j();
        }

        @Override // xe.j
        public h k() {
            return ((i) this.f13384b).k();
        }

        @Override // xe.j
        public boolean m() {
            return ((i) this.f13384b).m();
        }

        @Override // xe.j
        public m p() {
            return ((i) this.f13384b).p();
        }

        @Override // xe.j
        public g q() {
            return ((i) this.f13384b).q();
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        x.W(i.class, iVar);
    }

    private i() {
    }

    public static b i0() {
        return DEFAULT_INSTANCE.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f31229a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<i> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (i.class) {
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

    public c g0() {
        c cVar = this.applicationInfo_;
        return cVar == null ? c.i0() : cVar;
    }

    public boolean h0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // xe.j
    public boolean i() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // xe.j
    public boolean j() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // xe.j
    public h k() {
        h hVar = this.networkRequestMetric_;
        return hVar == null ? h.u0() : hVar;
    }

    @Override // xe.j
    public boolean m() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // xe.j
    public m p() {
        m mVar = this.traceMetric_;
        return mVar == null ? m.v0() : mVar;
    }

    @Override // xe.j
    public g q() {
        g gVar = this.gaugeMetric_;
        return gVar == null ? g.m0() : gVar;
    }
}
