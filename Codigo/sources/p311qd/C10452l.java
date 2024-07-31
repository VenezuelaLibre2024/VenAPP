package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.l */
/* loaded from: classes.dex */
public final class C10452l extends AbstractC6629x<C10452l, a> implements InterfaceC6617s0 {
    private static final C10452l DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC6634z0<C10452l> PARSER;
    private String experimentId_ = "";

    /* renamed from: qd.l$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10452l, a> implements InterfaceC6617s0 {
        private a() {
            super(C10452l.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10451k c10451k) {
            this();
        }
    }

    static {
        C10452l c10452l = new C10452l();
        DEFAULT_INSTANCE = c10452l;
        AbstractC6629x.m19291W(C10452l.class, c10452l);
    }

    private C10452l() {
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10451k c10451k = null;
        switch (C10451k.f25989a[fVar.ordinal()]) {
            case 1:
                return new C10452l();
            case 2:
                return new a(c10451k);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10452l> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10452l.class) {
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
