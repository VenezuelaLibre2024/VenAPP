package p444xe;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6593k0;
import com.google.protobuf.C6596l0;
import com.google.protobuf.C6621t1;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;
import java.util.Map;
import p444xe.C12468a;

/* renamed from: xe.c */
/* loaded from: classes.dex */
public final class C12470c extends AbstractC6629x<C12470c, b> implements InterfaceC6617s0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final C12470c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC6634z0<C12470c> PARSER;
    private C12468a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private C6596l0<String, String> customAttributes_ = C6596l0.m18927d();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* renamed from: xe.c$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33739a;

        static {
            int[] iArr = new int[AbstractC6629x.f.values().length];
            f33739a = iArr;
            try {
                iArr[AbstractC6629x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33739a[AbstractC6629x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33739a[AbstractC6629x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33739a[AbstractC6629x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33739a[AbstractC6629x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33739a[AbstractC6629x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33739a[AbstractC6629x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: xe.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6629x.a<C12470c, b> implements InterfaceC6617s0 {
        private b() {
            super(C12470c.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: I */
        public boolean m40529I() {
            return ((C12470c) this.f14658b).m40526l0();
        }

        /* renamed from: J */
        public b m40530J(Map<String, String> map) {
            m19314A();
            ((C12470c) this.f14658b).m40517j0().putAll(map);
            return this;
        }

        /* renamed from: K */
        public b m40531K(C12468a.b bVar) {
            m19314A();
            ((C12470c) this.f14658b).m40520q0(bVar.build());
            return this;
        }

        /* renamed from: L */
        public b m40532L(String str) {
            m19314A();
            ((C12470c) this.f14658b).m40521r0(str);
            return this;
        }

        /* renamed from: M */
        public b m40533M(EnumC12471d enumC12471d) {
            m19314A();
            ((C12470c) this.f14658b).m40522s0(enumC12471d);
            return this;
        }

        /* renamed from: N */
        public b m40534N(String str) {
            m19314A();
            ((C12470c) this.f14658b).m40523t0(str);
            return this;
        }
    }

    /* renamed from: xe.c$c */
    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a */
        static final C6593k0<String, String> f33740a;

        static {
            C6621t1.b bVar = C6621t1.b.STRING;
            f33740a = C6593k0.m18906d(bVar, "", bVar, "");
        }
    }

    static {
        C12470c c12470c = new C12470c();
        DEFAULT_INSTANCE = c12470c;
        AbstractC6629x.m19291W(C12470c.class, c12470c);
    }

    private C12470c() {
    }

    /* renamed from: i0 */
    public static C12470c m40516i0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public Map<String, String> m40517j0() {
        return m40518o0();
    }

    /* renamed from: o0 */
    private C6596l0<String, String> m40518o0() {
        if (!this.customAttributes_.m18931j()) {
            this.customAttributes_ = this.customAttributes_.m18934m();
        }
        return this.customAttributes_;
    }

    /* renamed from: p0 */
    public static b m40519p0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public void m40520q0(C12468a c12468a) {
        c12468a.getClass();
        this.androidAppInfo_ = c12468a;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public void m40521r0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public void m40522s0(EnumC12471d enumC12471d) {
        this.applicationProcessState_ = enumC12471d.mo19357a();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public void m40523t0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f33739a[fVar.ordinal()]) {
            case 1:
                return new C12470c();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", EnumC12471d.m40536h(), "customAttributes_", c.f33740a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12470c> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12470c.class) {
                        interfaceC6634z0 = PARSER;
                        if (interfaceC6634z0 == null) {
                            interfaceC6634z0 = new AbstractC6629x.b<>(DEFAULT_INSTANCE);
                            PARSER = interfaceC6634z0;
                        }
                    }
                }
                return interfaceC6634z0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h0 */
    public C12468a m40524h0() {
        C12468a c12468a = this.androidAppInfo_;
        return c12468a == null ? C12468a.m40492f0() : c12468a;
    }

    /* renamed from: k0 */
    public boolean m40525k0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: l0 */
    public boolean m40526l0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: m0 */
    public boolean m40527m0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: n0 */
    public boolean m40528n0() {
        return (this.bitField0_ & 1) != 0;
    }
}
