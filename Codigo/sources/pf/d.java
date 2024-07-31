package pf;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;

/* loaded from: classes2.dex */
public final class d extends x<d, b> implements s0 {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final d DEFAULT_INSTANCE;
    private static volatile z0<d> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private yb.b clientSignals_;
    private c requestingClientApp_;
    private String projectNumber_ = "";
    private z.i<pf.a> alreadySeenCampaigns_ = x.G();

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23045a;

        static {
            int[] iArr = new int[x.f.values().length];
            f23045a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23045a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23045a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23045a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23045a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23045a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23045a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends x.a<d, b> implements s0 {
        private b() {
            super(d.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b I(Iterable<? extends pf.a> iterable) {
            A();
            ((d) this.f13384b).g0(iterable);
            return this;
        }

        public b J(yb.b bVar) {
            A();
            ((d) this.f13384b).k0(bVar);
            return this;
        }

        public b K(String str) {
            A();
            ((d) this.f13384b).l0(str);
            return this;
        }

        public b L(c cVar) {
            A();
            ((d) this.f13384b).m0(cVar);
            return this;
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        x.W(d.class, dVar);
    }

    private d() {
    }

    public void g0(Iterable<? extends pf.a> iterable) {
        h0();
        com.google.protobuf.a.n(iterable, this.alreadySeenCampaigns_);
    }

    private void h0() {
        z.i<pf.a> iVar = this.alreadySeenCampaigns_;
        if (iVar.g()) {
            return;
        }
        this.alreadySeenCampaigns_ = x.R(iVar);
    }

    public static d i0() {
        return DEFAULT_INSTANCE;
    }

    public static b j0() {
        return DEFAULT_INSTANCE.A();
    }

    public void k0(yb.b bVar) {
        bVar.getClass();
        this.clientSignals_ = bVar;
    }

    public void l0(String str) {
        str.getClass();
        this.projectNumber_ = str;
    }

    public void m0(c cVar) {
        cVar.getClass();
        this.requestingClientApp_ = cVar;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (a.f23045a[fVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new b(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\t", new Object[]{"projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", pf.a.class, "clientSignals_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<d> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (d.class) {
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
