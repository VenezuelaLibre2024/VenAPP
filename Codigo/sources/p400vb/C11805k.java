package p400vb;

import com.google.crypto.tink.shaded.protobuf.AbstractC5949a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5973i;
import com.google.crypto.tink.shaded.protobuf.AbstractC6018y;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6004s0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6021z0;

/* renamed from: vb.k */
/* loaded from: classes2.dex */
public final class C11805k extends AbstractC6018y<C11805k, b> implements InterfaceC6004s0 {
    private static final C11805k DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC6021z0<C11805k> PARSER;
    private int ivSize_;

    /* renamed from: vb.k$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31190a;

        static {
            int[] iArr = new int[AbstractC6018y.f.values().length];
            f31190a = iArr;
            try {
                iArr[AbstractC6018y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31190a[AbstractC6018y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31190a[AbstractC6018y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31190a[AbstractC6018y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31190a[AbstractC6018y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31190a[AbstractC6018y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31190a[AbstractC6018y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: vb.k$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6018y.a<C11805k, b> implements InterfaceC6004s0 {
        private b() {
            super(C11805k.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m37513A(int i10) {
            m16257r();
            ((C11805k) this.f12777b).m37511a0(i10);
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
        C11805k c11805k = new C11805k();
        DEFAULT_INSTANCE = c11805k;
        AbstractC6018y.m16229S(C11805k.class, c11805k);
    }

    private C11805k() {
    }

    /* renamed from: X */
    public static C11805k m37509X() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Z */
    public static b m37510Z() {
        return DEFAULT_INSTANCE.m16248u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public void m37511a0(int i10) {
        this.ivSize_ = i10;
    }

    /* renamed from: Y */
    public int m37512Y() {
        return this.ivSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC6018y, com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC6001r0.a mo15967a() {
        return super.mo15967a();
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
        switch (a.f31190a[fVar.ordinal()]) {
            case 1:
                return new C11805k();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6018y.m16222K(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6021z0<C11805k> interfaceC6021z0 = PARSER;
                if (interfaceC6021z0 == null) {
                    synchronized (C11805k.class) {
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