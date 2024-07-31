package p487zd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: zd.b3 */
/* loaded from: classes.dex */
public final class C12891b3 extends AbstractC6629x<C12891b3, a> implements InterfaceC6617s0 {
    private static final C12891b3 DEFAULT_INSTANCE;
    private static volatile InterfaceC6634z0<C12891b3> PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    /* renamed from: zd.b3$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C12891b3, a> implements InterfaceC6617s0 {
        private a() {
            super(C12891b3.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C12886a3 c12886a3) {
            this();
        }

        /* renamed from: I */
        public a m42683I() {
            m19314A();
            ((C12891b3) this.f14658b).m42675f0();
            return this;
        }

        /* renamed from: J */
        public a m42684J(long j10) {
            m19314A();
            ((C12891b3) this.f14658b).m42679l0(j10);
            return this;
        }

        /* renamed from: K */
        public a m42685K(long j10) {
            m19314A();
            ((C12891b3) this.f14658b).m42680m0(j10);
            return this;
        }
    }

    static {
        C12891b3 c12891b3 = new C12891b3();
        DEFAULT_INSTANCE = c12891b3;
        AbstractC6629x.m19291W(C12891b3.class, c12891b3);
    }

    private C12891b3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m42675f0() {
        this.value_ = 0L;
    }

    /* renamed from: g0 */
    public static C12891b3 m42676g0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: j0 */
    public static a m42677j0() {
        return DEFAULT_INSTANCE.m19293A();
    }

    /* renamed from: k0 */
    public static a m42678k0(C12891b3 c12891b3) {
        return DEFAULT_INSTANCE.m19294B(c12891b3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public void m42679l0(long j10) {
        this.startTimeEpoch_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public void m42680m0(long j10) {
        this.value_ = j10;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C12886a3 c12886a3 = null;
        switch (C12886a3.f35108a[fVar.ordinal()]) {
            case 1:
                return new C12891b3();
            case 2:
                return new a(c12886a3);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C12891b3> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C12891b3.class) {
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
    public long m42681h0() {
        return this.startTimeEpoch_;
    }

    /* renamed from: i0 */
    public long m42682i0() {
        return this.value_;
    }
}
