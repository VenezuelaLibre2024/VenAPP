package p444xe;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6563a0;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: xe.k */
/* loaded from: classes.dex */
public final class C12478k extends AbstractC6629x<C12478k, c> implements InterfaceC6617s0 {
    private static final C12478k DEFAULT_INSTANCE;
    private static volatile InterfaceC6634z0<C12478k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC6563a0<Integer, EnumC12479l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private C6633z.g sessionVerbosity_ = AbstractC6629x.m19282F();

    /* renamed from: xe.k$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC6563a0<Integer, EnumC12479l> {
        a() {
        }
    }

    /* renamed from: xe.k$b */
    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f33750a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f33750a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33750a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33750a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33750a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33750a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33750a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33750a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: xe.k$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC6629x.a<C12478k, c> implements InterfaceC6617s0 {
        private c() {
            super(C12478k.DEFAULT_INSTANCE);
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        /* renamed from: I */
        public c m40693I(EnumC12479l enumC12479l) {
            m19314A();
            ((C12478k) this.f14658b).m40687e0(enumC12479l);
            return this;
        }

        /* renamed from: J */
        public c m40694J(String str) {
            m19314A();
            ((C12478k) this.f14658b).m40690j0(str);
            return this;
        }
    }

    static {
        C12478k c12478k = new C12478k();
        DEFAULT_INSTANCE = c12478k;
        AbstractC6629x.m19291W(C12478k.class, c12478k);
    }

    private C12478k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m40687e0(EnumC12479l enumC12479l) {
        enumC12479l.getClass();
        m40688f0();
        this.sessionVerbosity_.mo19337F0(enumC12479l.mo19357a());
    }

    /* renamed from: f0 */
    private void m40688f0() {
        C6633z.g gVar = this.sessionVerbosity_;
        if (gVar.mo18413g()) {
            return;
        }
        this.sessionVerbosity_ = AbstractC6629x.m19287Q(gVar);
    }

    /* renamed from: i0 */
    public static c m40689i0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m40690j0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (b.f33750a[fVar.ordinal()]) {
            case 1:
                return new C12478k();
            case 2:
                return new c(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", EnumC12479l.m40696h()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12478k> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12478k.class) {
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

    /* renamed from: g0 */
    public EnumC12479l m40691g0(int i10) {
        EnumC12479l m40695b = EnumC12479l.m40695b(this.sessionVerbosity_.getInt(i10));
        return m40695b == null ? EnumC12479l.SESSION_VERBOSITY_NONE : m40695b;
    }

    /* renamed from: h0 */
    public int m40692h0() {
        return this.sessionVerbosity_.size();
    }
}
