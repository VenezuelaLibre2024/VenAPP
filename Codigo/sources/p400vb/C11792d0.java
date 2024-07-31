package p400vb;

import com.google.crypto.tink.shaded.protobuf.AbstractC5949a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5973i;
import com.google.crypto.tink.shaded.protobuf.AbstractC6018y;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6021z0;

/* renamed from: vb.d0 */
/* loaded from: classes2.dex */
public final class C11792d0 extends AbstractC6018y<C11792d0, b> implements InterfaceC6004s0 {
    private static final C11792d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile InterfaceC6021z0<C11792d0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C5950a0.i<c> keyInfo_ = AbstractC6018y.m16232y();
    private int primaryKeyId_;

    /* renamed from: vb.d0$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31178a;

        static {
            int[] iArr = new int[AbstractC6018y.f.values().length];
            f31178a = iArr;
            try {
                iArr[AbstractC6018y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31178a[AbstractC6018y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31178a[AbstractC6018y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31178a[AbstractC6018y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31178a[AbstractC6018y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31178a[AbstractC6018y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31178a[AbstractC6018y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: vb.d0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6018y.a<C11792d0, b> implements InterfaceC6004s0 {
        private b() {
            super(C11792d0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m37382A(c cVar) {
            m16257r();
            ((C11792d0) this.f12777b).m37377Y(cVar);
            return this;
        }

        /* renamed from: B */
        public b m37383B(int i10) {
            m16257r();
            ((C11792d0) this.f12777b).m37380c0(i10);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
        /* renamed from: H0 */
        public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15972H0(AbstractC5973i abstractC5973i, C5994p c5994p) {
            return super.mo15972H0(abstractC5973i, c5994p);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5949a.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
        /* renamed from: Y0 */
        public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15299Y0(InterfaceC6001r0 interfaceC6001r0) {
            return super.mo15299Y0(interfaceC6001r0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
        public /* bridge */ /* synthetic */ InterfaceC6001r0 build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a
        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC6001r0 mo16043e() {
            return super.mo16043e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
        /* renamed from: f */
        public /* bridge */ /* synthetic */ InterfaceC6001r0 mo15973f() {
            return super.mo15973f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.AbstractC5949a.a
        /* renamed from: j */
        protected /* bridge */ /* synthetic */ AbstractC5949a.a mo15300j(AbstractC5949a abstractC5949a) {
            return super.mo15300j((AbstractC6018y) abstractC5949a);
        }
    }

    /* renamed from: vb.d0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC6018y<c, a> implements InterfaceC6004s0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile InterfaceC6021z0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* renamed from: vb.d0$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC6018y.a<c, a> implements InterfaceC6004s0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: A */
            public a m37395A(int i10) {
                m16257r();
                ((c) this.f12777b).m37390c0(i10);
                return this;
            }

            /* renamed from: B */
            public a m37396B(EnumC11802i0 enumC11802i0) {
                m16257r();
                ((c) this.f12777b).m37391d0(enumC11802i0);
                return this;
            }

            /* renamed from: C */
            public a m37397C(EnumC11822z enumC11822z) {
                m16257r();
                ((c) this.f12777b).m37392e0(enumC11822z);
                return this;
            }

            /* renamed from: D */
            public a m37398D(String str) {
                m16257r();
                ((c) this.f12777b).m37393f0(str);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
            /* renamed from: H0 */
            public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15972H0(AbstractC5973i abstractC5973i, C5994p c5994p) {
                return super.mo15972H0(abstractC5973i, c5994p);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5949a.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
            /* renamed from: Y0 */
            public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15299Y0(InterfaceC6001r0 interfaceC6001r0) {
                return super.mo15299Y0(interfaceC6001r0);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
            public /* bridge */ /* synthetic */ InterfaceC6001r0 build() {
                return super.build();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a
            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
            /* renamed from: e */
            public /* bridge */ /* synthetic */ InterfaceC6001r0 mo16043e() {
                return super.mo16043e();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0.a
            /* renamed from: f */
            public /* bridge */ /* synthetic */ InterfaceC6001r0 mo15973f() {
                return super.mo15973f();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y.a, com.google.crypto.tink.shaded.protobuf.AbstractC5949a.a
            /* renamed from: j */
            protected /* bridge */ /* synthetic */ AbstractC5949a.a mo15300j(AbstractC5949a abstractC5949a) {
                return super.mo15300j((AbstractC6018y) abstractC5949a);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC6018y.m16229S(c.class, cVar);
        }

        private c() {
        }

        /* renamed from: b0 */
        public static a m37389b0() {
            return DEFAULT_INSTANCE.m16248u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public void m37390c0(int i10) {
            this.keyId_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public void m37391d0(EnumC11802i0 enumC11802i0) {
            this.outputPrefixType_ = enumC11802i0.mo15312a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public void m37392e0(EnumC11822z enumC11822z) {
            this.status_ = enumC11822z.mo15312a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f0 */
        public void m37393f0(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15967a() {
            return super.mo15967a();
        }

        /* renamed from: a0 */
        public int m37394a0() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15969d() {
            return super.mo15969d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC6001r0 mo16043e() {
            return super.mo16043e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y
        /* renamed from: x */
        protected final Object mo16251x(AbstractC6018y.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f31178a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC6018y.m16222K(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC6021z0<c> interfaceC6021z0 = PARSER;
                    if (interfaceC6021z0 == null) {
                        synchronized (c.class) {
                            interfaceC6021z0 = PARSER;
                            if (interfaceC6021z0 == null) {
                                interfaceC6021z0 = new AbstractC6018y.b<>(DEFAULT_INSTANCE);
                                PARSER = interfaceC6021z0;
                            }
                        }
                    }
                    return interfaceC6021z0;
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
        C11792d0 c11792d0 = new C11792d0();
        DEFAULT_INSTANCE = c11792d0;
        AbstractC6018y.m16229S(C11792d0.class, c11792d0);
    }

    private C11792d0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m37377Y(c cVar) {
        cVar.getClass();
        m37378Z();
        this.keyInfo_.add(cVar);
    }

    /* renamed from: Z */
    private void m37378Z() {
        C5950a0.i<c> iVar = this.keyInfo_;
        if (iVar.mo15317g()) {
            return;
        }
        this.keyInfo_ = AbstractC6018y.m16221I(iVar);
    }

    /* renamed from: b0 */
    public static b m37379b0() {
        return DEFAULT_INSTANCE.m16248u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m37380c0(int i10) {
        this.primaryKeyId_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15967a() {
        return super.mo15967a();
    }

    /* renamed from: a0 */
    public c m37381a0(int i10) {
        return this.keyInfo_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15969d() {
        return super.mo15969d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC6001r0 mo16043e() {
        return super.mo16043e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y
    /* renamed from: x */
    protected final Object mo16251x(AbstractC6018y.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f31178a[fVar.ordinal()]) {
            case 1:
                return new C11792d0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6018y.m16222K(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6021z0<C11792d0> interfaceC6021z0 = PARSER;
                if (interfaceC6021z0 == null) {
                    synchronized (C11792d0.class) {
                        interfaceC6021z0 = PARSER;
                        if (interfaceC6021z0 == null) {
                            interfaceC6021z0 = new AbstractC6018y.b<>(DEFAULT_INSTANCE);
                            PARSER = interfaceC6021z0;
                        }
                    }
                }
                return interfaceC6021z0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
