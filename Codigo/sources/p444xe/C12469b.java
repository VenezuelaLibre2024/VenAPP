package p444xe;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: xe.b */
/* loaded from: classes.dex */
public final class C12469b extends AbstractC6629x<C12469b, b> implements InterfaceC6617s0 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C12469b DEFAULT_INSTANCE;
    private static volatile InterfaceC6634z0<C12469b> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* renamed from: xe.b$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33738a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f33738a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33738a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33738a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33738a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33738a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33738a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33738a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: xe.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6629x.a<C12469b, b> implements InterfaceC6617s0 {
        private b() {
            super(C12469b.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public b m40508I(long j10) {
            m19314A();
            ((C12469b) this.f14658b).m40506f0(j10);
            return this;
        }

        /* renamed from: J */
        public b m40509J(int i10) {
            m19314A();
            ((C12469b) this.f14658b).m40507g0(i10);
            return this;
        }
    }

    static {
        C12469b c12469b = new C12469b();
        DEFAULT_INSTANCE = c12469b;
        AbstractC6629x.m19291W(C12469b.class, c12469b);
    }

    private C12469b() {
    }

    /* renamed from: e0 */
    public static b m40505e0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m40506f0(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m40507g0(int i10) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i10;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f33738a[fVar.ordinal()]) {
            case 1:
                return new C12469b();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12469b> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12469b.class) {
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
