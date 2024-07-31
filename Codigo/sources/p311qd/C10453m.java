package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.m */
/* loaded from: classes.dex */
public final class C10453m extends AbstractC6629x<C10453m, a> implements InterfaceC6617s0 {
    public static final int ACTIVATE_EVENT_TO_LOG_FIELD_NUMBER = 8;
    public static final int CLEAR_EVENT_TO_LOG_FIELD_NUMBER = 9;
    private static final C10453m DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    public static final int EXPERIMENT_START_TIME_MILLIS_FIELD_NUMBER = 3;
    public static final int ONGOING_EXPERIMENTS_FIELD_NUMBER = 13;
    public static final int OVERFLOW_POLICY_FIELD_NUMBER = 12;
    private static volatile InterfaceC6634z0<C10453m> PARSER = null;
    public static final int SET_EVENT_TO_LOG_FIELD_NUMBER = 7;
    public static final int TIMEOUT_EVENT_TO_LOG_FIELD_NUMBER = 10;
    public static final int TIME_TO_LIVE_MILLIS_FIELD_NUMBER = 6;
    public static final int TRIGGER_EVENT_FIELD_NUMBER = 4;
    public static final int TRIGGER_TIMEOUT_MILLIS_FIELD_NUMBER = 5;
    public static final int TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER = 11;
    public static final int VARIANT_ID_FIELD_NUMBER = 2;
    private long experimentStartTimeMillis_;
    private int overflowPolicy_;
    private long timeToLiveMillis_;
    private long triggerTimeoutMillis_;
    private String experimentId_ = "";
    private String variantId_ = "";
    private String triggerEvent_ = "";
    private String setEventToLog_ = "";
    private String activateEventToLog_ = "";
    private String clearEventToLog_ = "";
    private String timeoutEventToLog_ = "";
    private String ttlExpiryEventToLog_ = "";
    private C6633z.i<C10452l> ongoingExperiments_ = AbstractC6629x.m19283G();

    /* renamed from: qd.m$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10453m, a> implements InterfaceC6617s0 {
        private a() {
            super(C10453m.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10451k c10451k) {
            this();
        }
    }

    static {
        C10453m c10453m = new C10453m();
        DEFAULT_INSTANCE = c10453m;
        AbstractC6629x.m19291W(C10453m.class, c10453m);
    }

    private C10453m() {
    }

    /* renamed from: b0 */
    public static C10453m m31358b0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10451k c10451k = null;
        switch (C10451k.f25989a[fVar.ordinal()]) {
            case 1:
                return new C10453m();
            case 2:
                return new a(c10451k);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", C10452l.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10453m> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10453m.class) {
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

    /* renamed from: d0 */
    public String m31359d0() {
        return this.experimentId_;
    }

    /* renamed from: e0 */
    public long m31360e0() {
        return this.experimentStartTimeMillis_;
    }

    /* renamed from: f0 */
    public long m31361f0() {
        return this.timeToLiveMillis_;
    }

    /* renamed from: g0 */
    public String m31362g0() {
        return this.triggerEvent_;
    }

    /* renamed from: h0 */
    public long m31363h0() {
        return this.triggerTimeoutMillis_;
    }

    /* renamed from: i0 */
    public String m31364i0() {
        return this.variantId_;
    }
}
