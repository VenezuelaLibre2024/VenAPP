package vb;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class l0 extends com.google.crypto.tink.shaded.protobuf.y<l0, b> implements s0 {
    private static final l0 DEFAULT_INSTANCE;
    private static volatile z0<l0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28759a;

        static {
            int[] iArr = new int[y.f.values().length];
            f28759a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28759a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28759a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28759a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28759a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28759a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28759a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends y.a<l0, b> implements s0 {
        private b() {
            super(l0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.r0.a
        public /* bridge */ /* synthetic */ r0.a H0(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
            return super.H0(iVar, pVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0171a, com.google.crypto.tink.shaded.protobuf.r0.a
        public /* bridge */ /* synthetic */ r0.a Y0(r0 r0Var) {
            return super.Y0(r0Var);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.r0.a
        public /* bridge */ /* synthetic */ r0 build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a
        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.s0
        public /* bridge */ /* synthetic */ r0 e() {
            return super.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.r0.a
        public /* bridge */ /* synthetic */ r0 f() {
            return super.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y.a, com.google.crypto.tink.shaded.protobuf.a.AbstractC0171a
        protected /* bridge */ /* synthetic */ a.AbstractC0171a j(com.google.crypto.tink.shaded.protobuf.a aVar) {
            return super.j((com.google.crypto.tink.shaded.protobuf.y) aVar);
        }
    }

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        com.google.crypto.tink.shaded.protobuf.y.S(l0.class, l0Var);
    }

    private l0() {
    }

    public static l0 W() {
        return DEFAULT_INSTANCE;
    }

    public static l0 X(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (l0) com.google.crypto.tink.shaded.protobuf.y.M(DEFAULT_INSTANCE, hVar, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
    public /* bridge */ /* synthetic */ r0.a a() {
        return super.a();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
    public /* bridge */ /* synthetic */ r0.a d() {
        return super.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.s0
    public /* bridge */ /* synthetic */ r0 e() {
        return super.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y
    protected final Object x(y.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f28759a[fVar.ordinal()]) {
            case 1:
                return new l0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.K(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<l0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (l0.class) {
                        z0Var = PARSER;
                        if (z0Var == null) {
                            z0Var = new y.b<>(DEFAULT_INSTANCE);
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