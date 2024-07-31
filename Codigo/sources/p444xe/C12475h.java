package p444xe;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.AbstractC6562a;
import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6593k0;
import com.google.protobuf.C6596l0;
import com.google.protobuf.C6621t1;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import java.util.List;
import java.util.Map;

/* renamed from: xe.h */
/* loaded from: classes.dex */
public final class C12475h extends AbstractC6629x<C12475h, b> implements InterfaceC6617s0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final C12475h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile InterfaceC6634z0<C12475h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private C6596l0<String, String> customAttributes_ = C6596l0.m18927d();
    private String url_ = "";
    private String responseContentType_ = "";
    private C6633z.i<C12478k> perfSessions_ = AbstractC6629x.m19283G();

    /* renamed from: xe.h$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33745a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f33745a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33745a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33745a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33745a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33745a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33745a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33745a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: xe.h$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6629x.a<C12475h, b> implements InterfaceC6617s0 {
        private b() {
            super(C12475h.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m40636I(Iterable<? extends C12478k> iterable) {
            m19314A();
            ((C12475h) this.f14658b).m40612q0(iterable);
            return this;
        }

        /* renamed from: J */
        public b m40637J() {
            m19314A();
            ((C12475h) this.f14658b).m40616x0().clear();
            return this;
        }

        /* renamed from: K */
        public b m40638K() {
            m19314A();
            ((C12475h) this.f14658b).m40613r0();
            return this;
        }

        /* renamed from: L */
        public long m40639L() {
            return ((C12475h) this.f14658b).m40621E0();
        }

        /* renamed from: M */
        public String m40640M() {
            return ((C12475h) this.f14658b).m40622F0();
        }

        /* renamed from: N */
        public boolean m40641N() {
            return ((C12475h) this.f14658b).m40623G0();
        }

        /* renamed from: O */
        public boolean m40642O() {
            return ((C12475h) this.f14658b).m40625I0();
        }

        /* renamed from: P */
        public boolean m40643P() {
            return ((C12475h) this.f14658b).m40629M0();
        }

        /* renamed from: R */
        public b m40644R(Map<String, String> map) {
            m19314A();
            ((C12475h) this.f14658b).m40616x0().putAll(map);
            return this;
        }

        /* renamed from: S */
        public b m40645S(long j10) {
            m19314A();
            ((C12475h) this.f14658b).m40586Q0(j10);
            return this;
        }

        /* renamed from: T */
        public b m40646T(d dVar) {
            m19314A();
            ((C12475h) this.f14658b).m40587R0(dVar);
            return this;
        }

        /* renamed from: U */
        public b m40647U(int i10) {
            m19314A();
            ((C12475h) this.f14658b).m40588S0(i10);
            return this;
        }

        /* renamed from: V */
        public b m40648V(e eVar) {
            m19314A();
            ((C12475h) this.f14658b).m40589T0(eVar);
            return this;
        }

        /* renamed from: W */
        public b m40649W(long j10) {
            m19314A();
            ((C12475h) this.f14658b).m40590U0(j10);
            return this;
        }

        /* renamed from: X */
        public b m40650X(String str) {
            m19314A();
            ((C12475h) this.f14658b).m40591V0(str);
            return this;
        }

        /* renamed from: Y */
        public b m40651Y(long j10) {
            m19314A();
            ((C12475h) this.f14658b).m40592W0(j10);
            return this;
        }

        /* renamed from: Z */
        public b m40652Z(long j10) {
            m19314A();
            ((C12475h) this.f14658b).m40593X0(j10);
            return this;
        }

        /* renamed from: b0 */
        public b m40653b0(long j10) {
            m19314A();
            ((C12475h) this.f14658b).m40594Y0(j10);
            return this;
        }

        /* renamed from: d0 */
        public b m40654d0(long j10) {
            m19314A();
            ((C12475h) this.f14658b).m40596Z0(j10);
            return this;
        }

        /* renamed from: e0 */
        public b m40655e0(String str) {
            m19314A();
            ((C12475h) this.f14658b).m40597a1(str);
            return this;
        }
    }

    /* renamed from: xe.h$c */
    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a */
        static final C6593k0<String, String> f33746a;

        static {
            C6621t1.b bVar = C6621t1.b.STRING;
            f33746a = C6593k0.m18906d(bVar, "", bVar, "");
        }
    }

    /* renamed from: xe.h$d */
    /* loaded from: classes.dex */
    public enum d implements C6633z.c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final C6633z.d<d> internalValueMap = new a();
        private final int value;

        /* renamed from: xe.h$d$a */
        /* loaded from: classes.dex */
        class a implements C6633z.d<d> {
            a() {
            }

            @Override // com.google.protobuf.C6633z.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d mo19358a(int i10) {
                return d.m40656b(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: xe.h$d$b */
        /* loaded from: classes.dex */
        public static final class b implements C6633z.e {

            /* renamed from: a */
            static final C6633z.e f33747a = new b();

            private b() {
            }

            @Override // com.google.protobuf.C6633z.e
            /* renamed from: a */
            public boolean mo19359a(int i10) {
                return d.m40656b(i10) != null;
            }
        }

        d(int i10) {
            this.value = i10;
        }

        /* renamed from: b */
        public static d m40656b(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        /* renamed from: h */
        public static C6633z.e m40657h() {
            return b.f33747a;
        }

        @Override // com.google.protobuf.C6633z.c
        /* renamed from: a */
        public final int mo19357a() {
            return this.value;
        }
    }

    /* renamed from: xe.h$e */
    /* loaded from: classes.dex */
    public enum e implements C6633z.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final C6633z.d<e> internalValueMap = new a();
        private final int value;

        /* renamed from: xe.h$e$a */
        /* loaded from: classes.dex */
        class a implements C6633z.d<e> {
            a() {
            }

            @Override // com.google.protobuf.C6633z.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e mo19358a(int i10) {
                return e.m40659b(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: xe.h$e$b */
        /* loaded from: classes.dex */
        public static final class b implements C6633z.e {

            /* renamed from: a */
            static final C6633z.e f33748a = new b();

            private b() {
            }

            @Override // com.google.protobuf.C6633z.e
            /* renamed from: a */
            public boolean mo19359a(int i10) {
                return e.m40659b(i10) != null;
            }
        }

        e(int i10) {
            this.value = i10;
        }

        /* renamed from: b */
        public static e m40659b(int i10) {
            if (i10 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        /* renamed from: h */
        public static C6633z.e m40660h() {
            return b.f33748a;
        }

        @Override // com.google.protobuf.C6633z.c
        /* renamed from: a */
        public final int mo19357a() {
            return this.value;
        }
    }

    static {
        C12475h c12475h = new C12475h();
        DEFAULT_INSTANCE = c12475h;
        AbstractC6629x.m19291W(C12475h.class, c12475h);
    }

    private C12475h() {
    }

    /* renamed from: O0 */
    private C6596l0<String, String> m40584O0() {
        if (!this.customAttributes_.m18931j()) {
            this.customAttributes_ = this.customAttributes_.m18934m();
        }
        return this.customAttributes_;
    }

    /* renamed from: P0 */
    public static b m40585P0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m40586Q0(long j10) {
        this.bitField0_ |= RecognitionOptions.ITF;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public void m40587R0(d dVar) {
        this.httpMethod_ = dVar.mo19357a();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public void m40588S0(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public void m40589T0(e eVar) {
        this.networkClientErrorReason_ = eVar.mo19357a();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public void m40590U0(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public void m40591V0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public void m40592W0(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public void m40593X0(long j10) {
        this.bitField0_ |= RecognitionOptions.QR_CODE;
        this.timeToRequestCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public void m40594Y0(long j10) {
        this.bitField0_ |= RecognitionOptions.UPC_E;
        this.timeToResponseCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public void m40596Z0(long j10) {
        this.bitField0_ |= RecognitionOptions.UPC_A;
        this.timeToResponseInitiatedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public void m40597a1(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public void m40612q0(Iterable<? extends C12478k> iterable) {
        m40614s0();
        AbstractC6562a.m18372n(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public void m40613r0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = m40615u0().m40617A0();
    }

    /* renamed from: s0 */
    private void m40614s0() {
        C6633z.i<C12478k> iVar = this.perfSessions_;
        if (iVar.mo18413g()) {
            return;
        }
        this.perfSessions_ = AbstractC6629x.m19288R(iVar);
    }

    /* renamed from: u0 */
    public static C12475h m40615u0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public Map<String, String> m40616x0() {
        return m40584O0();
    }

    /* renamed from: A0 */
    public String m40617A0() {
        return this.responseContentType_;
    }

    /* renamed from: B0 */
    public long m40618B0() {
        return this.responsePayloadBytes_;
    }

    /* renamed from: C0 */
    public long m40619C0() {
        return this.timeToRequestCompletedUs_;
    }

    /* renamed from: D0 */
    public long m40620D0() {
        return this.timeToResponseCompletedUs_;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f33745a[fVar.ordinal()]) {
            case 1:
                return new C12475h();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.m40657h(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.m40660h(), "customAttributes_", c.f33746a, "perfSessions_", C12478k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12475h> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12475h.class) {
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

    /* renamed from: E0 */
    public long m40621E0() {
        return this.timeToResponseInitiatedUs_;
    }

    /* renamed from: F0 */
    public String m40622F0() {
        return this.url_;
    }

    /* renamed from: G0 */
    public boolean m40623G0() {
        return (this.bitField0_ & RecognitionOptions.ITF) != 0;
    }

    /* renamed from: H0 */
    public boolean m40624H0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: I0 */
    public boolean m40625I0() {
        return (this.bitField0_ & 32) != 0;
    }

    /* renamed from: J0 */
    public boolean m40626J0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: K0 */
    public boolean m40627K0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: L0 */
    public boolean m40628L0() {
        return (this.bitField0_ & RecognitionOptions.QR_CODE) != 0;
    }

    /* renamed from: M0 */
    public boolean m40629M0() {
        return (this.bitField0_ & RecognitionOptions.UPC_E) != 0;
    }

    /* renamed from: N0 */
    public boolean m40630N0() {
        return (this.bitField0_ & RecognitionOptions.UPC_A) != 0;
    }

    /* renamed from: t0 */
    public long m40631t0() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: v0 */
    public d m40632v0() {
        d m40656b = d.m40656b(this.httpMethod_);
        return m40656b == null ? d.HTTP_METHOD_UNKNOWN : m40656b;
    }

    /* renamed from: w0 */
    public int m40633w0() {
        return this.httpResponseCode_;
    }

    /* renamed from: y0 */
    public List<C12478k> m40634y0() {
        return this.perfSessions_;
    }

    /* renamed from: z0 */
    public long m40635z0() {
        return this.requestPayloadBytes_;
    }
}
