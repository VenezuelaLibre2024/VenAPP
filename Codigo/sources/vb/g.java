package vb;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class g extends com.google.crypto.tink.shaded.protobuf.y<g, b> implements s0 {
    private static final g DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile z0<g> PARSER;
    private int keySize_;
    private h params_;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28749a;

        static {
            int[] iArr = new int[y.f.values().length];
            f28749a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28749a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28749a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28749a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28749a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28749a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28749a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends y.a<g, b> implements s0 {
        private b() {
            super(g.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(int i10) {
            r();
            ((g) this.f11562b).d0(i10);
            return this;
        }

        public b B(h hVar) {
            r();
            ((g) this.f11562b).e0(hVar);
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
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        com.google.crypto.tink.shaded.protobuf.y.S(g.class, gVar);
    }

    private g() {
    }

    public static g Y() {
        return DEFAULT_INSTANCE;
    }

    public static b b0() {
        return DEFAULT_INSTANCE.u();
    }

    public static g c0(com.google.crypto.tink.shaded.protobuf.h hVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (g) com.google.crypto.tink.shaded.protobuf.y.M(DEFAULT_INSTANCE, hVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i10) {
        this.keySize_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(h hVar) {
        hVar.getClass();
        this.params_ = hVar;
    }

    public int Z() {
        return this.keySize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
    public /* bridge */ /* synthetic */ r0.a a() {
        return super.a();
    }

    public h a0() {
        h hVar = this.params_;
        return hVar == null ? h.X() : hVar;
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
        switch (a.f28749a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.K(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<g> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (g.class) {
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
