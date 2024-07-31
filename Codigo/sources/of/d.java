package of;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes2.dex */
public final class d extends x<d, a> implements s0 {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final d DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static volatile z0<d> PARSER;
    private long campaignEndTimeMillis_;
    private long campaignStartTimeMillis_;
    private String campaignId_ = "";
    private String experimentalCampaignId_ = "";
    private String campaignName_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends x.a<d, a> implements s0 {
        private a() {
            super(d.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(of.a aVar) {
            this();
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        x.W(d.class, dVar);
    }

    private d() {
    }

    public static d g0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (of.a.f22539a[fVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new a(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentalCampaignId_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<d> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (d.class) {
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

    public long b0() {
        return this.campaignEndTimeMillis_;
    }

    public String d0() {
        return this.campaignId_;
    }

    public String e0() {
        return this.campaignName_;
    }

    public long f0() {
        return this.campaignStartTimeMillis_;
    }
}
