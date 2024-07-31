package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.e0 */
/* loaded from: classes.dex */
public final class C10442e0 extends AbstractC6629x<C10442e0, a> implements InterfaceC6617s0 {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final C10442e0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile InterfaceC6634z0<C10442e0> PARSER;
    private C10466z action_;
    private String imageUrl_ = "";

    /* renamed from: qd.e0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10442e0, a> implements InterfaceC6617s0 {
        private a() {
            super(C10442e0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10465y c10465y) {
            this();
        }
    }

    static {
        C10442e0 c10442e0 = new C10442e0();
        DEFAULT_INSTANCE = c10442e0;
        AbstractC6629x.m19291W(C10442e0.class, c10442e0);
    }

    private C10442e0() {
    }

    /* renamed from: d0 */
    public static C10442e0 m31322d0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10465y c10465y = null;
        switch (C10465y.f26009a[fVar.ordinal()]) {
            case 1:
                return new C10442e0();
            case 2:
                return new a(c10465y);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"imageUrl_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10442e0> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10442e0.class) {
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
    public C10466z m31323b0() {
        C10466z c10466z = this.action_;
        return c10466z == null ? C10466z.m31388d0() : c10466z;
    }

    /* renamed from: e0 */
    public String m31324e0() {
        return this.imageUrl_;
    }

    /* renamed from: f0 */
    public boolean m31325f0() {
        return this.action_ != null;
    }
}
