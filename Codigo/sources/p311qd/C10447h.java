package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.h */
/* loaded from: classes.dex */
public final class C10447h extends AbstractC6629x<C10447h, a> implements InterfaceC6617s0 {
    private static final C10447h DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile InterfaceC6634z0<C10447h> PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    /* renamed from: qd.h$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10447h, a> implements InterfaceC6617s0 {
        private a() {
            super(C10447h.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10437c c10437c) {
            this();
        }
    }

    static {
        C10447h c10447h = new C10447h();
        DEFAULT_INSTANCE = c10447h;
        AbstractC6629x.m19291W(C10447h.class, c10447h);
    }

    private C10447h() {
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10437c c10437c = null;
        switch (C10437c.f25985a[fVar.ordinal()]) {
            case 1:
                return new C10447h();
            case 2:
                return new a(c10437c);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", C10439d.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10447h> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10447h.class) {
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
    public C10439d m31345b0() {
        return this.conditionCase_ == 2 ? (C10439d) this.condition_ : C10439d.m31308b0();
    }

    /* renamed from: d0 */
    public EnumC10443f m31346d0() {
        if (this.conditionCase_ != 1) {
            return EnumC10443f.UNKNOWN_TRIGGER;
        }
        EnumC10443f m31326b = EnumC10443f.m31326b(((Integer) this.condition_).intValue());
        return m31326b == null ? EnumC10443f.UNRECOGNIZED : m31326b;
    }
}
