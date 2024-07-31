package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class m extends com.google.protobuf.x<m, a> implements s0 {
    public static final int ACTIVATE_EVENT_TO_LOG_FIELD_NUMBER = 8;
    public static final int CLEAR_EVENT_TO_LOG_FIELD_NUMBER = 9;
    private static final m DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    public static final int EXPERIMENT_START_TIME_MILLIS_FIELD_NUMBER = 3;
    public static final int ONGOING_EXPERIMENTS_FIELD_NUMBER = 13;
    public static final int OVERFLOW_POLICY_FIELD_NUMBER = 12;
    private static volatile z0<m> PARSER = null;
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
    private z.i<l> ongoingExperiments_ = com.google.protobuf.x.G();

    /* loaded from: classes.dex */
    public static final class a extends x.a<m, a> implements s0 {
        private a() {
            super(m.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(k kVar) {
            this();
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        com.google.protobuf.x.W(m.class, mVar);
    }

    private m() {
    }

    public static m b0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        k kVar = null;
        switch (k.f23947a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new a(kVar);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", l.class});
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

    public String d0() {
        return this.experimentId_;
    }

    public long e0() {
        return this.experimentStartTimeMillis_;
    }

    public long f0() {
        return this.timeToLiveMillis_;
    }

    public String g0() {
        return this.triggerEvent_;
    }

    public long h0() {
        return this.triggerTimeoutMillis_;
    }

    public String i0() {
        return this.variantId_;
    }
}
