package pf;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;
import java.util.List;

/* loaded from: classes2.dex */
public final class b extends x<b, C0381b> implements s0 {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    private static volatile z0<b> PARSER;
    private z.i<pf.a> alreadySeenCampaigns_ = x.G();

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23043a;

        static {
            int[] iArr = new int[x.f.values().length];
            f23043a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23043a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23043a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23043a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23043a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23043a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23043a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: pf.b$b */
    /* loaded from: classes2.dex */
    public static final class C0381b extends x.a<b, C0381b> implements s0 {
        private C0381b() {
            super(b.DEFAULT_INSTANCE);
        }

        /* synthetic */ C0381b(a aVar) {
            this();
        }

        public C0381b I(pf.a aVar) {
            A();
            ((b) this.f13384b).d0(aVar);
            return this;
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        x.W(b.class, bVar);
    }

    private b() {
    }

    public void d0(pf.a aVar) {
        aVar.getClass();
        e0();
        this.alreadySeenCampaigns_.add(aVar);
    }

    private void e0() {
        z.i<pf.a> iVar = this.alreadySeenCampaigns_;
        if (iVar.g()) {
            return;
        }
        this.alreadySeenCampaigns_ = x.R(iVar);
    }

    public static b g0() {
        return DEFAULT_INSTANCE;
    }

    public static C0381b h0() {
        return DEFAULT_INSTANCE.A();
    }

    public static C0381b i0(b bVar) {
        return DEFAULT_INSTANCE.B(bVar);
    }

    public static z0<b> j0() {
        return DEFAULT_INSTANCE.g();
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (a.f23043a[fVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new C0381b(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", pf.a.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<b> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (b.class) {
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

    public List<pf.a> f0() {
        return this.alreadySeenCampaigns_;
    }
}
