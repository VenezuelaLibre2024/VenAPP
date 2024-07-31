package yb;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes2.dex */
public final class b extends x<b, a> implements s0 {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile z0<b> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends x.a<b, a> implements s0 {
        private a() {
            super(b.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(yb.a aVar) {
            this();
        }

        public a I(String str) {
            A();
            ((b) this.f13384b).h0(str);
            return this;
        }

        public a J(String str) {
            A();
            ((b) this.f13384b).i0(str);
            return this;
        }

        public a K(String str) {
            A();
            ((b) this.f13384b).j0(str);
            return this;
        }

        public a L(String str) {
            A();
            ((b) this.f13384b).k0(str);
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

    public static a g0() {
        return DEFAULT_INSTANCE.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.appVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.platformVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(String str) {
        str.getClass();
        this.timeZone_ = str;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        yb.a aVar = null;
        switch (yb.a.f31821a[fVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return new a(aVar);
            case 3:
                return x.T(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
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
}
