package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.z */
/* loaded from: classes.dex */
public final class C10466z extends AbstractC6629x<C10466z, a> implements InterfaceC6617s0 {
    public static final int ACTION_URL_FIELD_NUMBER = 1;
    private static final C10466z DEFAULT_INSTANCE;
    private static volatile InterfaceC6634z0<C10466z> PARSER;
    private String actionUrl_ = "";

    /* renamed from: qd.z$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10466z, a> implements InterfaceC6617s0 {
        private a() {
            super(C10466z.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10465y c10465y) {
            this();
        }
    }

    static {
        C10466z c10466z = new C10466z();
        DEFAULT_INSTANCE = c10466z;
        AbstractC6629x.m19291W(C10466z.class, c10466z);
    }

    private C10466z() {
    }

    /* renamed from: d0 */
    public static C10466z m31388d0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10465y c10465y = null;
        switch (C10465y.f26009a[fVar.ordinal()]) {
            case 1:
                return new C10466z();
            case 2:
                return new a(c10465y);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10466z> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10466z.class) {
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

    /* renamed from: b0 */
    public String m31389b0() {
        return this.actionUrl_;
    }
}
