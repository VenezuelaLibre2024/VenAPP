package qd;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;
import qd.b;

/* loaded from: classes.dex */
public final class a extends com.google.protobuf.x<a, b> implements s0 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final a DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile z0<a> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private qd.b clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    /* renamed from: qd.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0393a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23941a;

        static {
            int[] iArr = new int[x.f.values().length];
            f23941a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23941a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23941a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23941a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23941a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23941a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23941a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x.a<a, b> implements s0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0393a c0393a) {
            this();
        }

        public b I(String str) {
            A();
            ((a) this.f13384b).l0(str);
            return this;
        }

        public b J(b.C0394b c0394b) {
            A();
            ((a) this.f13384b).m0(c0394b.build());
            return this;
        }

        public b K(long j10) {
            A();
            ((a) this.f13384b).n0(j10);
            return this;
        }

        public b L(i iVar) {
            A();
            ((a) this.f13384b).o0(iVar);
            return this;
        }

        public b M(j jVar) {
            A();
            ((a) this.f13384b).p0(jVar);
            return this;
        }

        public b N(String str) {
            A();
            ((a) this.f13384b).q0(str);
            return this;
        }

        public b O(String str) {
            A();
            ((a) this.f13384b).r0(str);
            return this;
        }

        public b P(h0 h0Var) {
            A();
            ((a) this.f13384b).s0(h0Var);
            return this;
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        com.google.protobuf.x.W(a.class, aVar);
    }

    private a() {
    }

    public static b k0() {
        return DEFAULT_INSTANCE.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(qd.b bVar) {
        bVar.getClass();
        this.clientApp_ = bVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(long j10) {
        this.bitField0_ |= 8;
        this.clientTimestampMillis_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(i iVar) {
        this.event_ = Integer.valueOf(iVar.a());
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(j jVar) {
        this.event_ = Integer.valueOf(jVar.a());
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(String str) {
        str.getClass();
        this.bitField0_ |= RecognitionOptions.QR_CODE;
        this.fiamSdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.projectNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(h0 h0Var) {
        this.event_ = Integer.valueOf(h0Var.a());
        this.eventCase_ = 7;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        C0393a c0393a = null;
        switch (C0393a.f23941a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0393a);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဿ\u0000\u0006ဿ\u0000\u0007ဿ\u0000\bဿ\u0000\tဈ\b\nင\t", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", j.h(), i.h(), h0.h(), n.h(), "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<a> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (a.class) {
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
}
