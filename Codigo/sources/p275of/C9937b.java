package p275of;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import p311qd.C10453m;

/* renamed from: of.b */
/* loaded from: classes2.dex */
public final class C9937b extends AbstractC6629x<C9937b, a> implements InterfaceC6617s0 {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final C9937b DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
    private static volatile InterfaceC6634z0<C9937b> PARSER;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private C10453m experimentPayload_;

    /* renamed from: of.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC6629x.a<C9937b, a> implements InterfaceC6617s0 {
        private a() {
            super(C9937b.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C9936a c9936a) {
            this();
        }
    }

    static {
        C9937b c9937b = new C9937b();
        DEFAULT_INSTANCE = c9937b;
        AbstractC6629x.m19291W(C9937b.class, c9937b);
    }

    private C9937b() {
    }

    /* renamed from: g0 */
    public static C9937b m29672g0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C9936a c9936a = null;
        switch (C9936a.f24472a[fVar.ordinal()]) {
            case 1:
                return new C9937b();
            case 2:
                return new a(c9936a);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C9937b> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C9937b.class) {
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
    public long m29673b0() {
        return this.campaignEndTimeMillis_;
    }

    /* renamed from: d0 */
    public String m29674d0() {
        return this.campaignId_;
    }

    /* renamed from: e0 */
    public String m29675e0() {
        return this.campaignName_;
    }

    /* renamed from: f0 */
    public long m29676f0() {
        return this.campaignStartTimeMillis_;
    }

    /* renamed from: h0 */
    public C10453m m29677h0() {
        C10453m c10453m = this.experimentPayload_;
        return c10453m == null ? C10453m.m31358b0() : c10453m;
    }
}
