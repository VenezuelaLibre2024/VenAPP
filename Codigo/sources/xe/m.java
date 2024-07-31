package xe;

import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.s0;
import com.google.protobuf.t1;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m extends x<m, b> implements s0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile z0<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private l0<String, Long> counters_ = l0.d();
    private l0<String, String> customAttributes_ = l0.d();
    private String name_ = "";
    private z.i<m> subtraces_ = x.G();
    private z.i<k> perfSessions_ = x.G();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31232a;

        static {
            int[] iArr = new int[x.f.values().length];
            f31232a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31232a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31232a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31232a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31232a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31232a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31232a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x.a<m, b> implements s0 {
        private b() {
            super(m.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(Iterable<? extends k> iterable) {
            A();
            ((m) this.f13384b).l0(iterable);
            return this;
        }

        public b J(Iterable<? extends m> iterable) {
            A();
            ((m) this.f13384b).m0(iterable);
            return this;
        }

        public b K(k kVar) {
            A();
            ((m) this.f13384b).n0(kVar);
            return this;
        }

        public b L(m mVar) {
            A();
            ((m) this.f13384b).o0(mVar);
            return this;
        }

        public b M(Map<String, Long> map) {
            A();
            ((m) this.f13384b).x0().putAll(map);
            return this;
        }

        public b N(Map<String, String> map) {
            A();
            ((m) this.f13384b).y0().putAll(map);
            return this;
        }

        public b O(String str, long j10) {
            str.getClass();
            A();
            ((m) this.f13384b).x0().put(str, Long.valueOf(j10));
            return this;
        }

        public b P(String str, String str2) {
            str.getClass();
            str2.getClass();
            A();
            ((m) this.f13384b).y0().put(str, str2);
            return this;
        }

        public b R(long j10) {
            A();
            ((m) this.f13384b).I0(j10);
            return this;
        }

        public b S(long j10) {
            A();
            ((m) this.f13384b).J0(j10);
            return this;
        }

        public b T(String str) {
            A();
            ((m) this.f13384b).K0(str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a */
        static final k0<String, Long> f31233a = k0.d(t1.b.STRING, "", t1.b.INT64, 0L);
    }

    /* loaded from: classes.dex */
    private static final class d {

        /* renamed from: a */
        static final k0<String, String> f31234a;

        static {
            t1.b bVar = t1.b.STRING;
            f31234a = k0.d(bVar, "", bVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        x.W(m.class, mVar);
    }

    private m() {
    }

    private l0<String, Long> D0() {
        return this.counters_;
    }

    private l0<String, String> E0() {
        return this.customAttributes_;
    }

    private l0<String, Long> F0() {
        if (!this.counters_.j()) {
            this.counters_ = this.counters_.m();
        }
        return this.counters_;
    }

    private l0<String, String> G0() {
        if (!this.customAttributes_.j()) {
            this.customAttributes_ = this.customAttributes_.m();
        }
        return this.customAttributes_;
    }

    public static b H0() {
        return DEFAULT_INSTANCE.A();
    }

    public void I0(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    public void J0(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    public void K0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    public void l0(Iterable<? extends k> iterable) {
        q0();
        com.google.protobuf.a.n(iterable, this.perfSessions_);
    }

    public void m0(Iterable<? extends m> iterable) {
        r0();
        com.google.protobuf.a.n(iterable, this.subtraces_);
    }

    public void n0(k kVar) {
        kVar.getClass();
        q0();
        this.perfSessions_.add(kVar);
    }

    public void o0(m mVar) {
        mVar.getClass();
        r0();
        this.subtraces_.add(mVar);
    }

    private void q0() {
        z.i<k> iVar = this.perfSessions_;
        if (iVar.g()) {
            return;
        }
        this.perfSessions_ = x.R(iVar);
    }

    private void r0() {
        z.i<m> iVar = this.subtraces_;
        if (iVar.g()) {
            return;
        }
        this.subtraces_ = x.R(iVar);
    }

    public static m v0() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, Long> x0() {
        return F0();
    }

    public Map<String, String> y0() {
        return G0();
    }

    public List<k> A0() {
        return this.perfSessions_;
    }

    public List<m> B0() {
        return this.subtraces_;
    }

    public boolean C0() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (a.f31232a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f31233a, "subtraces_", m.class, "customAttributes_", d.f31234a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<m> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (m.class) {
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

    public boolean p0(String str) {
        str.getClass();
        return E0().containsKey(str);
    }

    public int s0() {
        return D0().size();
    }

    public Map<String, Long> t0() {
        return Collections.unmodifiableMap(D0());
    }

    public Map<String, String> u0() {
        return Collections.unmodifiableMap(E0());
    }

    public long w0() {
        return this.durationUs_;
    }

    public String z0() {
        return this.name_;
    }
}
