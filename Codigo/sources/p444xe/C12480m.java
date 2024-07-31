package p444xe;

import com.google.protobuf.AbstractC6562a;
import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6593k0;
import com.google.protobuf.C6596l0;
import com.google.protobuf.C6621t1;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: xe.m */
/* loaded from: classes.dex */
public final class C12480m extends AbstractC6629x<C12480m, b> implements InterfaceC6617s0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final C12480m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC6634z0<C12480m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private C6596l0<String, Long> counters_ = C6596l0.m18927d();
    private C6596l0<String, String> customAttributes_ = C6596l0.m18927d();
    private String name_ = "";
    private C6633z.i<C12480m> subtraces_ = AbstractC6629x.m19283G();
    private C6633z.i<C12478k> perfSessions_ = AbstractC6629x.m19283G();

    /* renamed from: xe.m$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33752a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f33752a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33752a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33752a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33752a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33752a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33752a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33752a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: xe.m$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6629x.a<C12480m, b> implements InterfaceC6617s0 {
        private b() {
            super(C12480m.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m40734I(Iterable<? extends C12478k> iterable) {
            m19314A();
            ((C12480m) this.f14658b).m40716l0(iterable);
            return this;
        }

        /* renamed from: J */
        public b m40735J(Iterable<? extends C12480m> iterable) {
            m19314A();
            ((C12480m) this.f14658b).m40717m0(iterable);
            return this;
        }

        /* renamed from: K */
        public b m40736K(C12478k c12478k) {
            m19314A();
            ((C12480m) this.f14658b).m40718n0(c12478k);
            return this;
        }

        /* renamed from: L */
        public b m40737L(C12480m c12480m) {
            m19314A();
            ((C12480m) this.f14658b).m40719o0(c12480m);
            return this;
        }

        /* renamed from: M */
        public b m40738M(Map<String, Long> map) {
            m19314A();
            ((C12480m) this.f14658b).m40723x0().putAll(map);
            return this;
        }

        /* renamed from: N */
        public b m40739N(Map<String, String> map) {
            m19314A();
            ((C12480m) this.f14658b).m40724y0().putAll(map);
            return this;
        }

        /* renamed from: O */
        public b m40740O(String str, long j10) {
            str.getClass();
            m19314A();
            ((C12480m) this.f14658b).m40723x0().put(str, Long.valueOf(j10));
            return this;
        }

        /* renamed from: P */
        public b m40741P(String str, String str2) {
            str.getClass();
            str2.getClass();
            m19314A();
            ((C12480m) this.f14658b).m40724y0().put(str, str2);
            return this;
        }

        /* renamed from: R */
        public b m40742R(long j10) {
            m19314A();
            ((C12480m) this.f14658b).m40703I0(j10);
            return this;
        }

        /* renamed from: S */
        public b m40743S(long j10) {
            m19314A();
            ((C12480m) this.f14658b).m40704J0(j10);
            return this;
        }

        /* renamed from: T */
        public b m40744T(String str) {
            m19314A();
            ((C12480m) this.f14658b).m40705K0(str);
            return this;
        }
    }

    /* renamed from: xe.m$c */
    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a */
        static final C6593k0<String, Long> f33753a = C6593k0.m18906d(C6621t1.b.STRING, "", C6621t1.b.INT64, 0L);
    }

    /* renamed from: xe.m$d */
    /* loaded from: classes.dex */
    private static final class d {

        /* renamed from: a */
        static final C6593k0<String, String> f33754a;

        static {
            C6621t1.b bVar = C6621t1.b.STRING;
            f33754a = C6593k0.m18906d(bVar, "", bVar, "");
        }
    }

    static {
        C12480m c12480m = new C12480m();
        DEFAULT_INSTANCE = c12480m;
        AbstractC6629x.m19291W(C12480m.class, c12480m);
    }

    private C12480m() {
    }

    /* renamed from: D0 */
    private C6596l0<String, Long> m40698D0() {
        return this.counters_;
    }

    /* renamed from: E0 */
    private C6596l0<String, String> m40699E0() {
        return this.customAttributes_;
    }

    /* renamed from: F0 */
    private C6596l0<String, Long> m40700F0() {
        if (!this.counters_.m18931j()) {
            this.counters_ = this.counters_.m18934m();
        }
        return this.counters_;
    }

    /* renamed from: G0 */
    private C6596l0<String, String> m40701G0() {
        if (!this.customAttributes_.m18931j()) {
            this.customAttributes_ = this.customAttributes_.m18934m();
        }
        return this.customAttributes_;
    }

    /* renamed from: H0 */
    public static b m40702H0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public void m40703I0(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public void m40704J0(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public void m40705K0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m40716l0(Iterable<? extends C12478k> iterable) {
        m40720q0();
        AbstractC6562a.m18372n(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public void m40717m0(Iterable<? extends C12480m> iterable) {
        m40721r0();
        AbstractC6562a.m18372n(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public void m40718n0(C12478k c12478k) {
        c12478k.getClass();
        m40720q0();
        this.perfSessions_.add(c12478k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public void m40719o0(C12480m c12480m) {
        c12480m.getClass();
        m40721r0();
        this.subtraces_.add(c12480m);
    }

    /* renamed from: q0 */
    private void m40720q0() {
        C6633z.i<C12478k> iVar = this.perfSessions_;
        if (iVar.mo18413g()) {
            return;
        }
        this.perfSessions_ = AbstractC6629x.m19288R(iVar);
    }

    /* renamed from: r0 */
    private void m40721r0() {
        C6633z.i<C12480m> iVar = this.subtraces_;
        if (iVar.mo18413g()) {
            return;
        }
        this.subtraces_ = AbstractC6629x.m19288R(iVar);
    }

    /* renamed from: v0 */
    public static C12480m m40722v0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public Map<String, Long> m40723x0() {
        return m40700F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public Map<String, String> m40724y0() {
        return m40701G0();
    }

    /* renamed from: A0 */
    public List<C12478k> m40725A0() {
        return this.perfSessions_;
    }

    /* renamed from: B0 */
    public List<C12480m> m40726B0() {
        return this.subtraces_;
    }

    /* renamed from: C0 */
    public boolean m40727C0() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f33752a[fVar.ordinal()]) {
            case 1:
                return new C12480m();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f33753a, "subtraces_", C12480m.class, "customAttributes_", d.f33754a, "perfSessions_", C12478k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12480m> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12480m.class) {
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

    /* renamed from: p0 */
    public boolean m40728p0(String str) {
        str.getClass();
        return m40699E0().containsKey(str);
    }

    /* renamed from: s0 */
    public int m40729s0() {
        return m40698D0().size();
    }

    /* renamed from: t0 */
    public Map<String, Long> m40730t0() {
        return Collections.unmodifiableMap(m40698D0());
    }

    /* renamed from: u0 */
    public Map<String, String> m40731u0() {
        return Collections.unmodifiableMap(m40699E0());
    }

    /* renamed from: w0 */
    public long m40732w0() {
        return this.durationUs_;
    }

    /* renamed from: z0 */
    public String m40733z0() {
        return this.name_;
    }
}
