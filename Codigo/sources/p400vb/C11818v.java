package p400vb;

import com.google.crypto.tink.shaded.protobuf.AbstractC5949a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import com.google.crypto.tink.shaded.protobuf.AbstractC5973i;
import com.google.crypto.tink.shaded.protobuf.AbstractC6018y;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6021z0;

/* renamed from: vb.v */
/* loaded from: classes2.dex */
public final class C11818v extends AbstractC6018y<C11818v, b> implements InterfaceC6004s0 {
    private static final C11818v DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC6021z0<C11818v> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC5970h keyValue_ = AbstractC5970h.f12591b;
    private C11820x params_;
    private int version_;

    /* renamed from: vb.v$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31202a;

        static {
            int[] iArr = new int[AbstractC6018y.f.values().length];
            f31202a = iArr;
            try {
                iArr[AbstractC6018y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31202a[AbstractC6018y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31202a[AbstractC6018y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31202a[AbstractC6018y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31202a[AbstractC6018y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31202a[AbstractC6018y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31202a[AbstractC6018y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: vb.v$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6018y.a<C11818v, b> implements InterfaceC6004s0 {
        private b() {
            super(C11818v.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m37621A(AbstractC5970h abstractC5970h) {
            m16257r();
            ((C11818v) this.f12777b).m37615f0(abstractC5970h);
            return this;
        }

        /* renamed from: B */
        public b m37622B(C11820x c11820x) {
            m16257r();
            ((C11818v) this.f12777b).m37616g0(c11820x);
            return this;
        }

        /* renamed from: C */
        public b m37623C(int i10) {
            m16257r();
            ((C11818v) this.f12777b).m37617h0(i10);
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
        C11818v c11818v = new C11818v();
        DEFAULT_INSTANCE = c11818v;
        AbstractC6018y.m16229S(C11818v.class, c11818v);
    }

    private C11818v() {
    }

    /* renamed from: Z */
    public static C11818v m37612Z() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: d0 */
    public static b m37613d0() {
        return DEFAULT_INSTANCE.m16248u();
    }

    /* renamed from: e0 */
    public static C11818v m37614e0(AbstractC5970h abstractC5970h, C5994p c5994p) {
        return (C11818v) AbstractC6018y.m16223M(DEFAULT_INSTANCE, abstractC5970h, c5994p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m37615f0(AbstractC5970h abstractC5970h) {
        abstractC5970h.getClass();
        this.keyValue_ = abstractC5970h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m37616g0(C11820x c11820x) {
        c11820x.getClass();
        this.params_ = c11820x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m37617h0(int i10) {
        this.version_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15967a() {
        return super.mo15967a();
    }

    /* renamed from: a0 */
    public AbstractC5970h m37618a0() {
        return this.keyValue_;
    }

    /* renamed from: b0 */
    public C11820x m37619b0() {
        C11820x c11820x = this.params_;
        return c11820x == null ? C11820x.m37639Y() : c11820x;
    }

    /* renamed from: c0 */
    public int m37620c0() {
        return this.version_;
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
        switch (a.f31202a[fVar.ordinal()]) {
            case 1:
                return new C11818v();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6018y.m16222K(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6021z0<C11818v> interfaceC6021z0 = PARSER;
                if (interfaceC6021z0 == null) {
                    synchronized (C11818v.class) {
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
