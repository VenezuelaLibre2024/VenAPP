package pf;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import java.util.List;

/* renamed from: pf.b */
/* loaded from: classes2.dex */
public final class C10164b extends AbstractC6629x<C10164b, b> implements InterfaceC6617s0 {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final C10164b DEFAULT_INSTANCE;
    private static volatile InterfaceC6634z0<C10164b> PARSER;
    private C6633z.i<C10163a> alreadySeenCampaigns_ = AbstractC6629x.m19283G();

    /* renamed from: pf.b$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24976a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f24976a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24976a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24976a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24976a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24976a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24976a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24976a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: pf.b$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6629x.a<C10164b, b> implements InterfaceC6617s0 {
        private b() {
            super(C10164b.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m30394I(C10163a c10163a) {
            m19314A();
            ((C10164b) this.f14658b).m30387d0(c10163a);
            return this;
        }
    }

    static {
        C10164b c10164b = new C10164b();
        DEFAULT_INSTANCE = c10164b;
        AbstractC6629x.m19291W(C10164b.class, c10164b);
    }

    private C10164b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m30387d0(C10163a c10163a) {
        c10163a.getClass();
        m30388e0();
        this.alreadySeenCampaigns_.add(c10163a);
    }

    /* renamed from: e0 */
    private void m30388e0() {
        C6633z.i<C10163a> iVar = this.alreadySeenCampaigns_;
        if (iVar.mo18413g()) {
            return;
        }
        this.alreadySeenCampaigns_ = AbstractC6629x.m19288R(iVar);
    }

    /* renamed from: g0 */
    public static C10164b m30389g0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: h0 */
    public static b m30390h0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* renamed from: i0 */
    public static b m30391i0(C10164b c10164b) {
        return DEFAULT_INSTANCE.m19294B(c10164b);
    }

    /* renamed from: j0 */
    public static InterfaceC6634z0<C10164b> m30392j0() {
        return DEFAULT_INSTANCE.mo19035g();
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f24976a[fVar.ordinal()]) {
            case 1:
                return new C10164b();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", C10163a.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10164b> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10164b.class) {
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

    /* renamed from: f0 */
    public List<C10163a> m30393f0() {
        return this.alreadySeenCampaigns_;
    }
}
