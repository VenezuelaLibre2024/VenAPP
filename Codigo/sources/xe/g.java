package xe;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class g extends x<g, b> implements s0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile z0<g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private f gaugeMetadata_;
    private String sessionId_ = "";
    private z.i<e> cpuMetricReadings_ = x.G();
    private z.i<xe.b> androidMemoryReadings_ = x.G();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31224a;

        static {
            int[] iArr = new int[x.f.values().length];
            f31224a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31224a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31224a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31224a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31224a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31224a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31224a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x.a<g, b> implements s0 {
        private b() {
            super(g.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(xe.b bVar) {
            A();
            ((g) this.f13384b).g0(bVar);
            return this;
        }

        public b J(e eVar) {
            A();
            ((g) this.f13384b).h0(eVar);
            return this;
        }

        public b K(f fVar) {
            A();
            ((g) this.f13384b).r0(fVar);
            return this;
        }

        public b L(String str) {
            A();
            ((g) this.f13384b).s0(str);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        x.W(g.class, gVar);
    }

    private g() {
    }

    public void g0(xe.b bVar) {
        bVar.getClass();
        i0();
        this.androidMemoryReadings_.add(bVar);
    }

    public void h0(e eVar) {
        eVar.getClass();
        j0();
        this.cpuMetricReadings_.add(eVar);
    }

    private void i0() {
        z.i<xe.b> iVar = this.androidMemoryReadings_;
        if (iVar.g()) {
            return;
        }
        this.androidMemoryReadings_ = x.R(iVar);
    }

    private void j0() {
        z.i<e> iVar = this.cpuMetricReadings_;
        if (iVar.g()) {
            return;
        }
        this.cpuMetricReadings_ = x.R(iVar);
    }

    public static g m0() {
        return DEFAULT_INSTANCE;
    }

    public static b q0() {
        return DEFAULT_INSTANCE.A();
    }

    public void r0(f fVar) {
        fVar.getClass();
        this.gaugeMetadata_ = fVar;
        this.bitField0_ |= 2;
    }

    public void s0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (a.f31224a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", xe.b.class});
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

    public int k0() {
        return this.androidMemoryReadings_.size();
    }

    public int l0() {
        return this.cpuMetricReadings_.size();
    }

    public f n0() {
        f fVar = this.gaugeMetadata_;
        return fVar == null ? f.f0() : fVar;
    }

    public boolean o0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean p0() {
        return (this.bitField0_ & 1) != 0;
    }
}
