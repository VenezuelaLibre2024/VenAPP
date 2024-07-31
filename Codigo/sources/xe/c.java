package xe;

import com.google.protobuf.k0;
import com.google.protobuf.l0;
import com.google.protobuf.s0;
import com.google.protobuf.t1;
import com.google.protobuf.x;
import com.google.protobuf.z0;
import java.util.Map;
import xe.a;

/* loaded from: classes.dex */
public final class c extends x<c, b> implements s0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile z0<c> PARSER;
    private xe.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private l0<String, String> customAttributes_ = l0.d();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31219a;

        static {
            int[] iArr = new int[x.f.values().length];
            f31219a = iArr;
            try {
                iArr[x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31219a[x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31219a[x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31219a[x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31219a[x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31219a[x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31219a[x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x.a<c, b> implements s0 {
        private b() {
            super(c.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean I() {
            return ((c) this.f13384b).l0();
        }

        public b J(Map<String, String> map) {
            A();
            ((c) this.f13384b).j0().putAll(map);
            return this;
        }

        public b K(a.b bVar) {
            A();
            ((c) this.f13384b).q0(bVar.build());
            return this;
        }

        public b L(String str) {
            A();
            ((c) this.f13384b).r0(str);
            return this;
        }

        public b M(d dVar) {
            A();
            ((c) this.f13384b).s0(dVar);
            return this;
        }

        public b N(String str) {
            A();
            ((c) this.f13384b).t0(str);
            return this;
        }
    }

    /* renamed from: xe.c$c */
    /* loaded from: classes.dex */
    private static final class C0523c {

        /* renamed from: a */
        static final k0<String, String> f31220a;

        static {
            t1.b bVar = t1.b.STRING;
            f31220a = k0.d(bVar, "", bVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        x.W(c.class, cVar);
    }

    private c() {
    }

    public static c i0() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, String> j0() {
        return o0();
    }

    private l0<String, String> o0() {
        if (!this.customAttributes_.j()) {
            this.customAttributes_ = this.customAttributes_.m();
        }
        return this.customAttributes_;
    }

    public static b p0() {
        return DEFAULT_INSTANCE.A();
    }

    public void q0(xe.a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    public void r0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    public void s0(d dVar) {
        this.applicationProcessState_ = dVar.a();
        this.bitField0_ |= 8;
    }

    public void t0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (a.f31219a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(null);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.h(), "customAttributes_", C0523c.f31220a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<c> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (c.class) {
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

    public xe.a h0() {
        xe.a aVar = this.androidAppInfo_;
        return aVar == null ? xe.a.f0() : aVar;
    }

    public boolean k0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean l0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean m0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean n0() {
        return (this.bitField0_ & 1) != 0;
    }
}
