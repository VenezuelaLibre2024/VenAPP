package vb;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;

/* loaded from: classes2.dex */
public final class d0 extends com.google.crypto.tink.shaded.protobuf.y<d0, b> implements s0 {
    private static final d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile z0<d0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private a0.i<c> keyInfo_ = com.google.crypto.tink.shaded.protobuf.y.y();
    private int primaryKeyId_;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28744a;

        static {
            int[] iArr = new int[y.f.values().length];
            f28744a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28744a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28744a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28744a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28744a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28744a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28744a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends y.a<d0, b> implements s0 {
        private b() {
            super(d0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b A(c cVar) {
            r();
            ((d0) this.f11562b).Y(cVar);
            return this;
        }

        public b B(int i10) {
            r();
            ((d0) this.f11562b).c0(i10);
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

    /* loaded from: classes2.dex */
    public static final class c extends com.google.crypto.tink.shaded.protobuf.y<c, a> implements s0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile z0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* loaded from: classes2.dex */
        public static final class a extends y.a<c, a> implements s0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a A(int i10) {
                r();
                ((c) this.f11562b).c0(i10);
                return this;
            }

            public a B(i0 i0Var) {
                r();
                ((c) this.f11562b).d0(i0Var);
                return this;
            }

            public a C(z zVar) {
                r();
                ((c) this.f11562b).e0(zVar);
                return this;
            }

            public a D(String str) {
                r();
                ((c) this.f11562b).f0(str);
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
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.crypto.tink.shaded.protobuf.y.S(c.class, cVar);
        }

        private c() {
        }

        public static a b0() {
            return DEFAULT_INSTANCE.u();
        }

        public void c0(int i10) {
            this.keyId_ = i10;
        }

        public void d0(i0 i0Var) {
            this.outputPrefixType_ = i0Var.a();
        }

        public void e0(z zVar) {
            this.status_ = zVar.a();
        }

        public void f0(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
        public /* bridge */ /* synthetic */ r0.a a() {
            return super.a();
        }

        public int a0() {
            return this.keyId_;
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
            switch (a.f28744a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.y.K(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    z0<c> z0Var = PARSER;
                    if (z0Var == null) {
                        synchronized (c.class) {
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

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        com.google.crypto.tink.shaded.protobuf.y.S(d0.class, d0Var);
    }

    private d0() {
    }

    public void Y(c cVar) {
        cVar.getClass();
        Z();
        this.keyInfo_.add(cVar);
    }

    private void Z() {
        a0.i<c> iVar = this.keyInfo_;
        if (iVar.g()) {
            return;
        }
        this.keyInfo_ = com.google.crypto.tink.shaded.protobuf.y.I(iVar);
    }

    public static b b0() {
        return DEFAULT_INSTANCE.u();
    }

    public void c0(int i10) {
        this.primaryKeyId_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y, com.google.crypto.tink.shaded.protobuf.r0
    public /* bridge */ /* synthetic */ r0.a a() {
        return super.a();
    }

    public c a0(int i10) {
        return this.keyInfo_.get(i10);
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
        switch (a.f28744a[fVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.y.K(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<d0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (d0.class) {
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