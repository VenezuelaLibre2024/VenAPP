package vb;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class e0 extends com.google.crypto.tink.shaded.protobuf.y<e0, b> implements s0 {
    private static final e0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile z0<e0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private f0 params_;
    private int version_;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28746a;

        static {
            int[] iArr = new int[y.f.values().length];
            f28746a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28746a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28746a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28746a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28746a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28746a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28746a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends y.a<e0, b> implements s0 {
        private b() {
            super(e0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(f0 f0Var) {
            r();
            ((e0) this.f11562b).c0(f0Var);
            return this;
        }

        public b B(int i10) {
            r();
            ((e0) this.f11562b).d0(i10);
            return this;
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
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        com.google.crypto.tink.shaded.protobuf.y.S(e0.class, e0Var);
    }

    private e0() {
    }

    public static b a0() {
        return DEFAULT_INSTANCE.u();
    }

    public static e0 b0(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (e0) com.google.crypto.tink.shaded.protobuf.y.M(DEFAULT_INSTANCE, hVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(f0 f0Var) {
        f0Var.getClass();
        this.params_ = f0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i10) {
        this.version_ = i10;
    }

    public f0 Y() {
        f0 f0Var = this.params_;
        return f0Var == null ? f0.W() : f0Var;
    }

    public int Z() {
        return this.version_;
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
        switch (a.f28746a[fVar.ordinal()]) {
            case 1:
                return new e0();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.K(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<e0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (e0.class) {
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
