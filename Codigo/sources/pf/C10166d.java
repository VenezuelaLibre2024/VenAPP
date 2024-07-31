package pf;

import com.google.protobuf.AbstractC6562a;
import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import p464yb.C12660b;

/* renamed from: pf.d */
/* loaded from: classes2.dex */
public final class C10166d extends AbstractC6629x<C10166d, b> implements InterfaceC6617s0 {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final C10166d DEFAULT_INSTANCE;
    private static volatile InterfaceC6634z0<C10166d> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private C12660b clientSignals_;
    private C10165c requestingClientApp_;
    private String projectNumber_ = "";
    private C6633z.i<C10163a> alreadySeenCampaigns_ = AbstractC6629x.m19283G();

    /* renamed from: pf.d$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24978a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f24978a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24978a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24978a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24978a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24978a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24978a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24978a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: pf.d$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6629x.a<C10166d, b> implements InterfaceC6617s0 {
        private b() {
            super(C10166d.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m30418I(Iterable<? extends C10163a> iterable) {
            m19314A();
            ((C10166d) this.f14658b).m30411g0(iterable);
            return this;
        }

        /* renamed from: J */
        public b m30419J(C12660b c12660b) {
            m19314A();
            ((C10166d) this.f14658b).m30415k0(c12660b);
            return this;
        }

        /* renamed from: K */
        public b m30420K(String str) {
            m19314A();
            ((C10166d) this.f14658b).m30416l0(str);
            return this;
        }

        /* renamed from: L */
        public b m30421L(C10165c c10165c) {
            m19314A();
            ((C10166d) this.f14658b).m30417m0(c10165c);
            return this;
        }
    }

    static {
        C10166d c10166d = new C10166d();
        DEFAULT_INSTANCE = c10166d;
        AbstractC6629x.m19291W(C10166d.class, c10166d);
    }

    private C10166d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m30411g0(Iterable<? extends C10163a> iterable) {
        m30412h0();
        AbstractC6562a.m18372n(iterable, this.alreadySeenCampaigns_);
    }

    /* renamed from: h0 */
    private void m30412h0() {
        C6633z.i<C10163a> iVar = this.alreadySeenCampaigns_;
        if (iVar.mo18413g()) {
            return;
        }
        this.alreadySeenCampaigns_ = AbstractC6629x.m19288R(iVar);
    }

    /* renamed from: i0 */
    public static C10166d m30413i0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: j0 */
    public static b m30414j0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public void m30415k0(C12660b c12660b) {
        c12660b.getClass();
        this.clientSignals_ = c12660b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m30416l0(String str) {
        str.getClass();
        this.projectNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public void m30417m0(C10165c c10165c) {
        c10165c.getClass();
        this.requestingClientApp_ = c10165c;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f24978a[fVar.ordinal()]) {
            case 1:
                return new C10166d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\t", new Object[]{"projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", C10163a.class, "clientSignals_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10166d> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10166d.class) {
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
