package pf;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: pf.a */
/* loaded from: classes2.dex */
public final class C10163a extends AbstractC6629x<C10163a, b> implements InterfaceC6617s0 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final C10163a DEFAULT_INSTANCE;
    public static final int IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    private static volatile InterfaceC6634z0<C10163a> PARSER;
    private String campaignId_ = "";
    private long impressionTimestampMillis_;

    /* renamed from: pf.a$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24975a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f24975a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24975a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24975a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24975a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24975a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24975a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24975a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: pf.a$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6629x.a<C10163a, b> implements InterfaceC6617s0 {
        private b() {
            super(C10163a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m30383I(String str) {
            m19314A();
            ((C10163a) this.f14658b).m30380g0(str);
            return this;
        }

        /* renamed from: J */
        public b m30384J(long j10) {
            m19314A();
            ((C10163a) this.f14658b).m30381h0(j10);
            return this;
        }
    }

    static {
        C10163a c10163a = new C10163a();
        DEFAULT_INSTANCE = c10163a;
        AbstractC6629x.m19291W(C10163a.class, c10163a);
    }

    private C10163a() {
    }

    /* renamed from: f0 */
    public static b m30379f0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m30380g0(String str) {
        str.getClass();
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m30381h0(long j10) {
        this.impressionTimestampMillis_ = j10;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f24975a[fVar.ordinal()]) {
            case 1:
                return new C10163a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"campaignId_", "impressionTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10163a> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10163a.class) {
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

    /* renamed from: e0 */
    public String m30382e0() {
        return this.campaignId_;
    }
}
