package p400vb;

import com.google.crypto.tink.shaded.protobuf.AbstractC5949a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5973i;
import com.google.crypto.tink.shaded.protobuf.AbstractC6018y;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6021z0;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: vb.c0 */
/* loaded from: classes2.dex */
public final class C11790c0 extends AbstractC6018y<C11790c0, b> implements InterfaceC6004s0 {
    private static final C11790c0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile InterfaceC6021z0<C11790c0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C5950a0.i<c> key_ = AbstractC6018y.m16232y();
    private int primaryKeyId_;

    /* renamed from: vb.c0$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31176a;

        static {
            int[] iArr = new int[AbstractC6018y.f.values().length];
            f31176a = iArr;
            try {
                iArr[AbstractC6018y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31176a[AbstractC6018y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31176a[AbstractC6018y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31176a[AbstractC6018y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31176a[AbstractC6018y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31176a[AbstractC6018y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31176a[AbstractC6018y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: vb.c0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6018y.a<C11790c0, b> implements InterfaceC6004s0 {
        private b() {
            super(C11790c0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m37335A(c cVar) {
            m16257r();
            ((C11790c0) this.f12777b).m37325Y(cVar);
            return this;
        }

        /* renamed from: B */
        public c m37336B(int i10) {
            return ((C11790c0) this.f12777b).m37331a0(i10);
        }

        /* renamed from: C */
        public int m37337C() {
            return ((C11790c0) this.f12777b).m37332b0();
        }

        /* renamed from: D */
        public List<c> m37338D() {
            return Collections.unmodifiableList(((C11790c0) this.f12777b).m37333c0());
        }

        /* renamed from: E */
        public b m37339E(int i10) {
            m16257r();
            ((C11790c0) this.f12777b).m37330h0(i10);
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

    /* renamed from: vb.c0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC6018y<c, a> implements InterfaceC6004s0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile InterfaceC6021z0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private C11821y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: vb.c0$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC6018y.a<c, a> implements InterfaceC6004s0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            /* renamed from: A */
            public a m37355A(C11821y c11821y) {
                m16257r();
                ((c) this.f12777b).m37346g0(c11821y);
                return this;
            }

            /* renamed from: B */
            public a m37356B(int i10) {
                m16257r();
                ((c) this.f12777b).m37347h0(i10);
                return this;
            }

            /* renamed from: C */
            public a m37357C(EnumC11802i0 enumC11802i0) {
                m16257r();
                ((c) this.f12777b).m37348i0(enumC11802i0);
                return this;
            }

            /* renamed from: D */
            public a m37358D(EnumC11822z enumC11822z) {
                m16257r();
                ((c) this.f12777b).m37349j0(enumC11822z);
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

        /* renamed from: f0 */
        public static a m37345f0() {
            return DEFAULT_INSTANCE.m16248u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public void m37346g0(C11821y c11821y) {
            c11821y.getClass();
            this.keyData_ = c11821y;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h0 */
        public void m37347h0(int i10) {
            this.keyId_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i0 */
        public void m37348i0(EnumC11802i0 enumC11802i0) {
            this.outputPrefixType_ = enumC11802i0.mo15312a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j0 */
        public void m37349j0(EnumC11822z enumC11822z) {
            this.status_ = enumC11822z.mo15312a();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15967a() {
            return super.mo15967a();
        }

        /* renamed from: a0 */
        public C11821y m37350a0() {
            C11821y c11821y = this.keyData_;
            return c11821y == null ? C11821y.m37651Z() : c11821y;
        }

        /* renamed from: b0 */
        public int m37351b0() {
            return this.keyId_;
        }

        /* renamed from: c0 */
        public EnumC11802i0 m37352c0() {
            EnumC11802i0 m37492b = EnumC11802i0.m37492b(this.outputPrefixType_);
            return m37492b == null ? EnumC11802i0.UNRECOGNIZED : m37492b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15969d() {
            return super.mo15969d();
        }

        /* renamed from: d0 */
        public EnumC11822z m37353d0() {
            EnumC11822z m37664b = EnumC11822z.m37664b(this.status_);
            return m37664b == null ? EnumC11822z.UNRECOGNIZED : m37664b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ InterfaceC6001r0 mo16043e() {
            return super.mo16043e();
        }

        /* renamed from: e0 */
        public boolean m37354e0() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y
        /* renamed from: x */
        protected final Object mo16251x(AbstractC6018y.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f31176a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC6018y.m16222K(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        C11790c0 c11790c0 = new C11790c0();
        DEFAULT_INSTANCE = c11790c0;
        AbstractC6018y.m16229S(C11790c0.class, c11790c0);
    }

    private C11790c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m37325Y(c cVar) {
        cVar.getClass();
        m37326Z();
        this.key_.add(cVar);
    }

    /* renamed from: Z */
    private void m37326Z() {
        C5950a0.i<c> iVar = this.key_;
        if (iVar.mo15317g()) {
            return;
        }
        this.key_ = AbstractC6018y.m16221I(iVar);
    }

    /* renamed from: e0 */
    public static b m37327e0() {
        return DEFAULT_INSTANCE.m16248u();
    }

    /* renamed from: f0 */
    public static C11790c0 m37328f0(InputStream inputStream, C5994p c5994p) {
        return (C11790c0) AbstractC6018y.m16224N(DEFAULT_INSTANCE, inputStream, c5994p);
    }

    /* renamed from: g0 */
    public static C11790c0 m37329g0(byte[] bArr, C5994p c5994p) {
        return (C11790c0) AbstractC6018y.m16225O(DEFAULT_INSTANCE, bArr, c5994p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m37330h0(int i10) {
        this.primaryKeyId_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15967a() {
        return super.mo15967a();
    }

    /* renamed from: a0 */
    public c m37331a0(int i10) {
        return this.key_.get(i10);
    }

    /* renamed from: b0 */
    public int m37332b0() {
        return this.key_.size();
    }

    /* renamed from: c0 */
    public List<c> m37333c0() {
        return this.key_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15969d() {
        return super.mo15969d();
    }

    /* renamed from: d0 */
    public int m37334d0() {
        return this.primaryKeyId_;
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
        switch (a.f31176a[fVar.ordinal()]) {
            case 1:
                return new C11790c0();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6018y.m16222K(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6021z0<C11790c0> interfaceC6021z0 = PARSER;
                if (interfaceC6021z0 == null) {
                    synchronized (C11790c0.class) {
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
