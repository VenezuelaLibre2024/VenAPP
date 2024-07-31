package p275of;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: of.d */
/* loaded from: classes2.dex */
public final class C9939d extends AbstractC6629x<C9939d, a> implements InterfaceC6617s0 {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final C9939d DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static volatile InterfaceC6634z0<C9939d> PARSER;
    private long campaignEndTimeMillis_;
    private long campaignStartTimeMillis_;
    private String campaignId_ = "";
    private String experimentalCampaignId_ = "";
    private String campaignName_ = "";

    /* renamed from: of.d$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6629x.a<C9939d, a> implements InterfaceC6617s0 {
        private a() {
            super(C9939d.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C9936a c9936a) {
            this();
        }
    }

    static {
        C9939d c9939d = new C9939d();
        DEFAULT_INSTANCE = c9939d;
        AbstractC6629x.m19291W(C9939d.class, c9939d);
    }

    private C9939d() {
    }

    /* renamed from: g0 */
    public static C9939d m29690g0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C9936a c9936a = null;
        switch (C9936a.f24472a[fVar.ordinal()]) {
            case 1:
                return new C9939d();
            case 2:
                return new a(c9936a);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentalCampaignId_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C9939d> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C9939d.class) {
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

    /* renamed from: b0 */
    public long m29691b0() {
        return this.campaignEndTimeMillis_;
    }

    /* renamed from: d0 */
    public String m29692d0() {
        return this.campaignId_;
    }

    /* renamed from: e0 */
    public String m29693e0() {
        return this.campaignName_;
    }

    /* renamed from: f0 */
    public long m29694f0() {
        return this.campaignStartTimeMillis_;
    }
}
