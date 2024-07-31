package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.d */
/* loaded from: classes.dex */
public final class C10439d extends AbstractC6629x<C10439d, a> implements InterfaceC6617s0 {
    public static final int COUNT_FIELD_NUMBER = 5;
    private static final C10439d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile InterfaceC6634z0<C10439d> PARSER = null;
    public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
    public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
    private int count_;
    private long previousTimestampMillis_;
    private long timestampMillis_;
    private C6633z.i<C10445g> triggerParams_ = AbstractC6629x.m19283G();
    private String name_ = "";

    /* renamed from: qd.d$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10439d, a> implements InterfaceC6617s0 {
        private a() {
            super(C10439d.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10437c c10437c) {
            this();
        }
    }

    static {
        C10439d c10439d = new C10439d();
        DEFAULT_INSTANCE = c10439d;
        AbstractC6629x.m19291W(C10439d.class, c10439d);
    }

    private C10439d() {
    }

    /* renamed from: b0 */
    public static C10439d m31308b0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10437c c10437c = null;
        switch (C10437c.f25985a[fVar.ordinal()]) {
            case 1:
                return new C10439d();
            case 2:
                return new a(c10437c);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", C10445g.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10439d> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10439d.class) {
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
    public String m31309d0() {
        return this.name_;
    }
}
