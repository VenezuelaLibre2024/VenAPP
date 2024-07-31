package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.g */
/* loaded from: classes.dex */
public final class C10445g extends AbstractC6629x<C10445g, a> implements InterfaceC6617s0 {
    private static final C10445g DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC6634z0<C10445g> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 2;
    private double doubleValue_;
    private float floatValue_;
    private long intValue_;
    private String name_ = "";
    private String stringValue_ = "";

    /* renamed from: qd.g$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10445g, a> implements InterfaceC6617s0 {
        private a() {
            super(C10445g.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10437c c10437c) {
            this();
        }
    }

    static {
        C10445g c10445g = new C10445g();
        DEFAULT_INSTANCE = c10445g;
        AbstractC6629x.m19291W(C10445g.class, c10445g);
    }

    private C10445g() {
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10437c c10437c = null;
        switch (C10437c.f25985a[fVar.ordinal()]) {
            case 1:
                return new C10445g();
            case 2:
                return new a(c10437c);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0000", new Object[]{"name_", "stringValue_", "intValue_", "floatValue_", "doubleValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10445g> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10445g.class) {
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
}
