package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.e */
/* loaded from: classes.dex */
public final class C10441e extends AbstractC6629x<C10441e, a> implements InterfaceC6617s0 {
    private static final C10441e DEFAULT_INSTANCE;
    private static volatile InterfaceC6634z0<C10441e> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* renamed from: qd.e$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10441e, a> implements InterfaceC6617s0 {
        private a() {
            super(C10441e.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10437c c10437c) {
            this();
        }
    }

    static {
        C10441e c10441e = new C10441e();
        DEFAULT_INSTANCE = c10441e;
        AbstractC6629x.m19291W(C10441e.class, c10441e);
    }

    private C10441e() {
    }

    /* renamed from: b0 */
    public static C10441e m31319b0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10437c c10437c = null;
        switch (C10437c.f25985a[fVar.ordinal()]) {
            case 1:
                return new C10441e();
            case 2:
                return new a(c10437c);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10441e> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10441e.class) {
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

    /* renamed from: d0 */
    public int m31320d0() {
        return this.value_;
    }
}
