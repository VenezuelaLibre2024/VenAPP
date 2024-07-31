package p444xe;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6634z0;
import p444xe.C12470c;

/* renamed from: xe.i */
/* loaded from: classes.dex */
public final class C12476i extends AbstractC6629x<C12476i, b> implements InterfaceC12477j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final C12476i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile InterfaceC6634z0<C12476i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C12470c applicationInfo_;
    private int bitField0_;
    private C12474g gaugeMetric_;
    private C12475h networkRequestMetric_;
    private C12480m traceMetric_;
    private C12481n transportInfo_;

    /* renamed from: xe.i$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33749a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f33749a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33749a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33749a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33749a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33749a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33749a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33749a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: xe.i$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6629x.a<C12476i, b> implements InterfaceC12477j {
        private b() {
            super(C12476i.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m40680I(C12470c.b bVar) {
            m19314A();
            ((C12476i) this.f14658b).m40668j0(bVar.build());
            return this;
        }

        /* renamed from: J */
        public b m40681J(C12474g c12474g) {
            m19314A();
            ((C12476i) this.f14658b).m40669k0(c12474g);
            return this;
        }

        /* renamed from: K */
        public b m40682K(C12475h c12475h) {
            m19314A();
            ((C12476i) this.f14658b).m40670l0(c12475h);
            return this;
        }

        /* renamed from: L */
        public b m40683L(C12480m c12480m) {
            m19314A();
            ((C12476i) this.f14658b).m40671m0(c12480m);
            return this;
        }

        @Override // p444xe.InterfaceC12477j
        /* renamed from: i */
        public boolean mo40674i() {
            return ((C12476i) this.f14658b).mo40674i();
        }

        @Override // p444xe.InterfaceC12477j
        /* renamed from: j */
        public boolean mo40675j() {
            return ((C12476i) this.f14658b).mo40675j();
        }

        @Override // p444xe.InterfaceC12477j
        /* renamed from: k */
        public C12475h mo40676k() {
            return ((C12476i) this.f14658b).mo40676k();
        }

        @Override // p444xe.InterfaceC12477j
        /* renamed from: m */
        public boolean mo40677m() {
            return ((C12476i) this.f14658b).mo40677m();
        }

        @Override // p444xe.InterfaceC12477j
        /* renamed from: p */
        public C12480m mo40678p() {
            return ((C12476i) this.f14658b).mo40678p();
        }

        @Override // p444xe.InterfaceC12477j
        /* renamed from: q */
        public C12474g mo40679q() {
            return ((C12476i) this.f14658b).mo40679q();
        }
    }

    static {
        C12476i c12476i = new C12476i();
        DEFAULT_INSTANCE = c12476i;
        AbstractC6629x.m19291W(C12476i.class, c12476i);
    }

    private C12476i() {
    }

    /* renamed from: i0 */
    public static b m40667i0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m40668j0(C12470c c12470c) {
        c12470c.getClass();
        this.applicationInfo_ = c12470c;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public void m40669k0(C12474g c12474g) {
        c12474g.getClass();
        this.gaugeMetric_ = c12474g;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m40670l0(C12475h c12475h) {
        c12475h.getClass();
        this.networkRequestMetric_ = c12475h;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public void m40671m0(C12480m c12480m) {
        c12480m.getClass();
        this.traceMetric_ = c12480m;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f33749a[fVar.ordinal()]) {
            case 1:
                return new C12476i();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12476i> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12476i.class) {
                        interfaceC6634z0 = PARSER;
                        if (interfaceC6634z0 == null) {
                            interfaceC6634z0 = new AbstractC6629x.b<>(DEFAULT_INSTANCE);
                            PARSER = interfaceC6634z0;
                        }
                    }
                }
                return interfaceC6634z0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g0 */
    public C12470c m40672g0() {
        C12470c c12470c = this.applicationInfo_;
        return c12470c == null ? C12470c.m40516i0() : c12470c;
    }

    /* renamed from: h0 */
    public boolean m40673h0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p444xe.InterfaceC12477j
    /* renamed from: i */
    public boolean mo40674i() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p444xe.InterfaceC12477j
    /* renamed from: j */
    public boolean mo40675j() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p444xe.InterfaceC12477j
    /* renamed from: k */
    public C12475h mo40676k() {
        C12475h c12475h = this.networkRequestMetric_;
        return c12475h == null ? C12475h.m40615u0() : c12475h;
    }

    @Override // p444xe.InterfaceC12477j
    /* renamed from: m */
    public boolean mo40677m() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p444xe.InterfaceC12477j
    /* renamed from: p */
    public C12480m mo40678p() {
        C12480m c12480m = this.traceMetric_;
        return c12480m == null ? C12480m.m40722v0() : c12480m;
    }

    @Override // p444xe.InterfaceC12477j
    /* renamed from: q */
    public C12474g mo40679q() {
        C12474g c12474g = this.gaugeMetric_;
        return c12474g == null ? C12474g.m40571m0() : c12474g;
    }
}
