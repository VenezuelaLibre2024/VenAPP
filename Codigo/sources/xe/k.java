package xe;

import com.google.protobuf.a0;
import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class k extends x<k, c> implements s0 {
    private static final k DEFAULT_INSTANCE;
    private static volatile z0<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final a0<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private z.g sessionVerbosity_ = x.F();

    /* loaded from: classes.dex */
    class a implements a0<Integer, l> {
        a() {
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f31230a;

        static {
            int[] iArr = new int[x.f.values().length];
            f31230a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31230a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31230a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31230a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31230a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31230a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31230a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends x.a<k, c> implements s0 {
        private c() {
            super(k.DEFAULT_INSTANCE);
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public c I(l lVar) {
            A();
            ((k) this.f13384b).e0(lVar);
            return this;
        }

        public c J(String str) {
            A();
            ((k) this.f13384b).j0(str);
            return this;
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        x.W(k.class, kVar);
    }

    private k() {
    }

    public void e0(l lVar) {
        lVar.getClass();
        f0();
        this.sessionVerbosity_.F0(lVar.a());
    }

    private void f0() {
        z.g gVar = this.sessionVerbosity_;
        if (gVar.g()) {
            return;
        }
        this.sessionVerbosity_ = x.Q(gVar);
    }

    public static c i0() {
        return DEFAULT_INSTANCE.A();
    }

    public void j0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (b.f31230a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.h()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<k> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (k.class) {
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

    public l g0(int i10) {
        l b10 = l.b(this.sessionVerbosity_.getInt(i10));
        return b10 == null ? l.SESSION_VERBOSITY_NONE : b10;
    }

    public int h0() {
        return this.sessionVerbosity_.size();
    }
}
