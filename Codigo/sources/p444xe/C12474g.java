package p444xe;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: xe.g */
/* loaded from: classes.dex */
public final class C12474g extends AbstractC6629x<C12474g, b> implements InterfaceC6617s0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final C12474g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile InterfaceC6634z0<C12474g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private C12473f gaugeMetadata_;
    private String sessionId_ = "";
    private C6633z.i<C12472e> cpuMetricReadings_ = AbstractC6629x.m19283G();
    private C6633z.i<C12469b> androidMemoryReadings_ = AbstractC6629x.m19283G();

    /* renamed from: xe.g$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33744a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f33744a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33744a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33744a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33744a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33744a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33744a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33744a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: xe.g$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6629x.a<C12474g, b> implements InterfaceC6617s0 {
        private b() {
            super(C12474g.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m40580I(C12469b c12469b) {
            m19314A();
            ((C12474g) this.f14658b).m40567g0(c12469b);
            return this;
        }

        /* renamed from: J */
        public b m40581J(C12472e c12472e) {
            m19314A();
            ((C12474g) this.f14658b).m40568h0(c12472e);
            return this;
        }

        /* renamed from: K */
        public b m40582K(C12473f c12473f) {
            m19314A();
            ((C12474g) this.f14658b).m40573r0(c12473f);
            return this;
        }

        /* renamed from: L */
        public b m40583L(String str) {
            m19314A();
            ((C12474g) this.f14658b).m40574s0(str);
            return this;
        }
    }

    static {
        C12474g c12474g = new C12474g();
        DEFAULT_INSTANCE = c12474g;
        AbstractC6629x.m19291W(C12474g.class, c12474g);
    }

    private C12474g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m40567g0(C12469b c12469b) {
        c12469b.getClass();
        m40569i0();
        this.androidMemoryReadings_.add(c12469b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m40568h0(C12472e c12472e) {
        c12472e.getClass();
        m40570j0();
        this.cpuMetricReadings_.add(c12472e);
    }

    /* renamed from: i0 */
    private void m40569i0() {
        C6633z.i<C12469b> iVar = this.androidMemoryReadings_;
        if (iVar.mo18413g()) {
            return;
        }
        this.androidMemoryReadings_ = AbstractC6629x.m19288R(iVar);
    }

    /* renamed from: j0 */
    private void m40570j0() {
        C6633z.i<C12472e> iVar = this.cpuMetricReadings_;
        if (iVar.mo18413g()) {
            return;
        }
        this.cpuMetricReadings_ = AbstractC6629x.m19288R(iVar);
    }

    /* renamed from: m0 */
    public static C12474g m40571m0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: q0 */
    public static b m40572q0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public void m40573r0(C12473f c12473f) {
        c12473f.getClass();
        this.gaugeMetadata_ = c12473f;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public void m40574s0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f33744a[fVar.ordinal()]) {
            case 1:
                return new C12474g();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", C12472e.class, "gaugeMetadata_", "androidMemoryReadings_", C12469b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12474g> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12474g.class) {
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

    /* renamed from: k0 */
    public int m40575k0() {
        return this.androidMemoryReadings_.size();
    }

    /* renamed from: l0 */
    public int m40576l0() {
        return this.cpuMetricReadings_.size();
    }

    /* renamed from: n0 */
    public C12473f m40577n0() {
        C12473f c12473f = this.gaugeMetadata_;
        return c12473f == null ? C12473f.m40553f0() : c12473f;
    }

    /* renamed from: o0 */
    public boolean m40578o0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: p0 */
    public boolean m40579p0() {
        return (this.bitField0_ & 1) != 0;
    }
}
