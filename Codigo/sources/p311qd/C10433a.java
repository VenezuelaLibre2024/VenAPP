package p311qd;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import p311qd.C10435b;

/* renamed from: qd.a */
/* loaded from: classes.dex */
public final class C10433a extends AbstractC6629x<C10433a, b> implements InterfaceC6617s0 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final C10433a DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile InterfaceC6634z0<C10433a> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private C10435b clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    /* renamed from: qd.a$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25983a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f25983a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25983a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25983a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25983a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25983a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25983a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25983a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: qd.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6629x.a<C10433a, b> implements InterfaceC6617s0 {
        private b() {
            super(C10433a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m31259I(String str) {
            m19314A();
            ((C10433a) this.f14658b).m31251l0(str);
            return this;
        }

        /* renamed from: J */
        public b m31260J(C10435b.b bVar) {
            m19314A();
            ((C10433a) this.f14658b).m31252m0(bVar.build());
            return this;
        }

        /* renamed from: K */
        public b m31261K(long j10) {
            m19314A();
            ((C10433a) this.f14658b).m31253n0(j10);
            return this;
        }

        /* renamed from: L */
        public b m31262L(EnumC10449i enumC10449i) {
            m19314A();
            ((C10433a) this.f14658b).m31254o0(enumC10449i);
            return this;
        }

        /* renamed from: M */
        public b m31263M(EnumC10450j enumC10450j) {
            m19314A();
            ((C10433a) this.f14658b).m31255p0(enumC10450j);
            return this;
        }

        /* renamed from: N */
        public b m31264N(String str) {
            m19314A();
            ((C10433a) this.f14658b).m31256q0(str);
            return this;
        }

        /* renamed from: O */
        public b m31265O(String str) {
            m19314A();
            ((C10433a) this.f14658b).m31257r0(str);
            return this;
        }

        /* renamed from: P */
        public b m31266P(EnumC10448h0 enumC10448h0) {
            m19314A();
            ((C10433a) this.f14658b).m31258s0(enumC10448h0);
            return this;
        }
    }

    static {
        C10433a c10433a = new C10433a();
        DEFAULT_INSTANCE = c10433a;
        AbstractC6629x.m19291W(C10433a.class, c10433a);
    }

    private C10433a() {
    }

    /* renamed from: k0 */
    public static b m31250k0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m31251l0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public void m31252m0(C10435b c10435b) {
        c10435b.getClass();
        this.clientApp_ = c10435b;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public void m31253n0(long j10) {
        this.bitField0_ |= 8;
        this.clientTimestampMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public void m31254o0(EnumC10449i enumC10449i) {
        this.event_ = Integer.valueOf(enumC10449i.mo19357a());
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public void m31255p0(EnumC10450j enumC10450j) {
        this.event_ = Integer.valueOf(enumC10450j.mo19357a());
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public void m31256q0(String str) {
        str.getClass();
        this.bitField0_ |= RecognitionOptions.QR_CODE;
        this.fiamSdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public void m31257r0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.projectNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public void m31258s0(EnumC10448h0 enumC10448h0) {
        this.event_ = Integer.valueOf(enumC10448h0.mo19357a());
        this.eventCase_ = 7;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f25983a[fVar.ordinal()]) {
            case 1:
                return new C10433a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဿ\u0000\u0006ဿ\u0000\u0007ဿ\u0000\bဿ\u0000\tဈ\b\nင\t", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", EnumC10450j.m31354h(), EnumC10449i.m31351h(), EnumC10448h0.m31348h(), EnumC10454n.m31366h(), "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10433a> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10433a.class) {
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
}
