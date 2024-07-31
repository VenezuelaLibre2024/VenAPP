package p444xe;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: xe.n */
/* loaded from: classes.dex */
public final class C12481n extends AbstractC6629x<C12481n, b> implements InterfaceC6617s0 {
    private static final C12481n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile InterfaceC6634z0<C12481n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* renamed from: xe.n$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33755a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f33755a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33755a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33755a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33755a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33755a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33755a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33755a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: xe.n$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6629x.a<C12481n, b> implements InterfaceC6617s0 {
        private b() {
            super(C12481n.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* renamed from: xe.n$c */
    /* loaded from: classes.dex */
    public enum c implements C6633z.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);

        public static final int FL_LEGACY_V1_VALUE = 1;
        public static final int SOURCE_UNKNOWN_VALUE = 0;
        private static final C6633z.d<c> internalValueMap = new a();
        private final int value;

        /* renamed from: xe.n$c$a */
        /* loaded from: classes.dex */
        class a implements C6633z.d<c> {
            a() {
            }

            @Override // com.google.protobuf.C6633z.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c mo19358a(int i10) {
                return c.m40746b(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: xe.n$c$b */
        /* loaded from: classes.dex */
        public static final class b implements C6633z.e {

            /* renamed from: a */
            static final C6633z.e f33756a = new b();

            private b() {
            }

            @Override // com.google.protobuf.C6633z.e
            /* renamed from: a */
            public boolean mo19359a(int i10) {
                return c.m40746b(i10) != null;
            }
        }

        c(int i10) {
            this.value = i10;
        }

        /* renamed from: b */
        public static c m40746b(int i10) {
            if (i10 == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        /* renamed from: h */
        public static C6633z.e m40747h() {
            return b.f33756a;
        }

        @Override // com.google.protobuf.C6633z.c
        /* renamed from: a */
        public final int mo19357a() {
            return this.value;
        }
    }

    static {
        C12481n c12481n = new C12481n();
        DEFAULT_INSTANCE = c12481n;
        AbstractC6629x.m19291W(C12481n.class, c12481n);
    }

    private C12481n() {
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f33755a[fVar.ordinal()]) {
            case 1:
                return new C12481n();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.m40747h()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12481n> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12481n.class) {
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
