package xe;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class n extends x<n, b> implements s0 {
    private static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile z0<n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31235a;

        static {
            int[] iArr = new int[x.f.values().length];
            f31235a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31235a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31235a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31235a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31235a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31235a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31235a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x.a<n, b> implements s0 {
        private b() {
            super(n.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum c implements z.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);

        public static final int FL_LEGACY_V1_VALUE = 1;
        public static final int SOURCE_UNKNOWN_VALUE = 0;
        private static final z.d<c> internalValueMap = new a();
        private final int value;

        /* loaded from: classes.dex */
        class a implements z.d<c> {
            a() {
            }

            @Override // com.google.protobuf.z.d
            /* renamed from: b */
            public c a(int i10) {
                return c.b(i10);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements z.e {

            /* renamed from: a */
            static final z.e f31236a = new b();

            private b() {
            }

            @Override // com.google.protobuf.z.e
            public boolean a(int i10) {
                return c.b(i10) != null;
            }
        }

        c(int i10) {
            this.value = i10;
        }

        public static c b(int i10) {
            if (i10 == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        public static z.e h() {
            return b.f31236a;
        }

        @Override // com.google.protobuf.z.c
        public final int a() {
            return this.value;
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        x.W(n.class, nVar);
    }

    private n() {
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (a.f31235a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new b(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.h()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<n> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (n.class) {
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
}
