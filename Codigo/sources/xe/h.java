package xe;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.s0;
import com.google.protobuf.t1;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends x<h, b> implements s0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile z0<h> PARSER = null;
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
    private l0<String, String> customAttributes_ = l0.d();
    private String url_ = "";
    private String responseContentType_ = "";
    private z.i<k> perfSessions_ = x.G();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31225a;

        static {
            int[] iArr = new int[x.f.values().length];
            f31225a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31225a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31225a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31225a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31225a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31225a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31225a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x.a<h, b> implements s0 {
        private b() {
            super(h.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(Iterable<? extends k> iterable) {
            A();
            ((h) this.f13384b).q0(iterable);
            return this;
        }

        public b J() {
            A();
            ((h) this.f13384b).x0().clear();
            return this;
        }

        public b K() {
            A();
            ((h) this.f13384b).r0();
            return this;
        }

        public long L() {
            return ((h) this.f13384b).E0();
        }

        public String M() {
            return ((h) this.f13384b).F0();
        }

        public boolean N() {
            return ((h) this.f13384b).G0();
        }

        public boolean O() {
            return ((h) this.f13384b).I0();
        }

        public boolean P() {
            return ((h) this.f13384b).M0();
        }

        public b R(Map<String, String> map) {
            A();
            ((h) this.f13384b).x0().putAll(map);
            return this;
        }

        public b S(long j10) {
            A();
            ((h) this.f13384b).Q0(j10);
            return this;
        }

        public b T(d dVar) {
            A();
            ((h) this.f13384b).R0(dVar);
            return this;
        }

        public b U(int i10) {
            A();
            ((h) this.f13384b).S0(i10);
            return this;
        }

        public b V(e eVar) {
            A();
            ((h) this.f13384b).T0(eVar);
            return this;
        }

        public b W(long j10) {
            A();
            ((h) this.f13384b).U0(j10);
            return this;
        }

        public b X(String str) {
            A();
            ((h) this.f13384b).V0(str);
            return this;
        }

        public b Y(long j10) {
            A();
            ((h) this.f13384b).W0(j10);
            return this;
        }

        public b Z(long j10) {
            A();
            ((h) this.f13384b).X0(j10);
            return this;
        }

        public b b0(long j10) {
            A();
            ((h) this.f13384b).Y0(j10);
            return this;
        }

        public b d0(long j10) {
            A();
            ((h) this.f13384b).Z0(j10);
            return this;
        }

        public b e0(String str) {
            A();
            ((h) this.f13384b).a1(str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a */
        static final k0<String, String> f31226a;

        static {
            t1.b bVar = t1.b.STRING;
            f31226a = k0.d(bVar, "", bVar, "");
        }
    }

    /* loaded from: classes.dex */
    public enum d implements z.c {
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
        private static final z.d<d> internalValueMap = new a();
        private final int value;

        /* loaded from: classes.dex */
        class a implements z.d<d> {
            a() {
            }

            @Override // com.google.protobuf.z.d
            /* renamed from: b */
            public d a(int i10) {
                return d.b(i10);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements z.e {

            /* renamed from: a */
            static final z.e f31227a = new b();

            private b() {
            }

            @Override // com.google.protobuf.z.e
            public boolean a(int i10) {
                return d.b(i10) != null;
            }
        }

        d(int i10) {
            this.value = i10;
        }

        public static d b(int i10) {
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

        public static z.e h() {
            return b.f31227a;
        }

        @Override // com.google.protobuf.z.c
        public final int a() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public enum e implements z.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final z.d<e> internalValueMap = new a();
        private final int value;

        /* loaded from: classes.dex */
        class a implements z.d<e> {
            a() {
            }

            @Override // com.google.protobuf.z.d
            /* renamed from: b */
            public e a(int i10) {
                return e.b(i10);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements z.e {

            /* renamed from: a */
            static final z.e f31228a = new b();

            private b() {
            }

            @Override // com.google.protobuf.z.e
            public boolean a(int i10) {
                return e.b(i10) != null;
            }
        }

        e(int i10) {
            this.value = i10;
        }

        public static e b(int i10) {
            if (i10 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static z.e h() {
            return b.f31228a;
        }

        @Override // com.google.protobuf.z.c
        public final int a() {
            return this.value;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        x.W(h.class, hVar);
    }

    private h() {
    }

    private l0<String, String> O0() {
        if (!this.customAttributes_.j()) {
            this.customAttributes_ = this.customAttributes_.m();
        }
        return this.customAttributes_;
    }

    public static b P0() {
        return DEFAULT_INSTANCE.A();
    }

    public void Q0(long j10) {
        this.bitField0_ |= RecognitionOptions.ITF;
        this.clientStartTimeUs_ = j10;
    }

    public void R0(d dVar) {
        this.httpMethod_ = dVar.a();
        this.bitField0_ |= 2;
    }

    public void S0(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    public void T0(e eVar) {
        this.networkClientErrorReason_ = eVar.a();
        this.bitField0_ |= 16;
    }

    public void U0(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    public void V0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    public void W0(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    public void X0(long j10) {
        this.bitField0_ |= RecognitionOptions.QR_CODE;
        this.timeToRequestCompletedUs_ = j10;
    }

    public void Y0(long j10) {
        this.bitField0_ |= RecognitionOptions.UPC_E;
        this.timeToResponseCompletedUs_ = j10;
    }

    public void Z0(long j10) {
        this.bitField0_ |= RecognitionOptions.UPC_A;
        this.timeToResponseInitiatedUs_ = j10;
    }

    public void a1(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    public void q0(Iterable<? extends k> iterable) {
        s0();
        com.google.protobuf.a.n(iterable, this.perfSessions_);
    }

    public void r0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = u0().A0();
    }

    private void s0() {
        z.i<k> iVar = this.perfSessions_;
        if (iVar.g()) {
            return;
        }
        this.perfSessions_ = x.R(iVar);
    }

    public static h u0() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, String> x0() {
        return O0();
    }

    public String A0() {
        return this.responseContentType_;
    }

    public long B0() {
        return this.responsePayloadBytes_;
    }

    public long C0() {
        return this.timeToRequestCompletedUs_;
    }

    public long D0() {
        return this.timeToResponseCompletedUs_;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (a.f31225a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.h(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.h(), "customAttributes_", c.f31226a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<h> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (h.class) {
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

    public long E0() {
        return this.timeToResponseInitiatedUs_;
    }

    public String F0() {
        return this.url_;
    }

    public boolean G0() {
        return (this.bitField0_ & RecognitionOptions.ITF) != 0;
    }

    public boolean H0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean I0() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean J0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean K0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean L0() {
        return (this.bitField0_ & RecognitionOptions.QR_CODE) != 0;
    }

    public boolean M0() {
        return (this.bitField0_ & RecognitionOptions.UPC_E) != 0;
    }

    public boolean N0() {
        return (this.bitField0_ & RecognitionOptions.UPC_A) != 0;
    }

    public long t0() {
        return this.clientStartTimeUs_;
    }

    public d v0() {
        d b10 = d.b(this.httpMethod_);
        return b10 == null ? d.HTTP_METHOD_UNKNOWN : b10;
    }

    public int w0() {
        return this.httpResponseCode_;
    }

    public List<k> y0() {
        return this.perfSessions_;
    }

    public long z0() {
        return this.requestPayloadBytes_;
    }
}
