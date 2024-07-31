package p311qd;

import com.google.protobuf.AbstractC6629x;
import com.google.protobuf.InterfaceC6617s0;
import com.google.protobuf.InterfaceC6634z0;

/* renamed from: qd.d0 */
/* loaded from: classes.dex */
public final class C10440d0 extends AbstractC6629x<C10440d0, a> implements InterfaceC6617s0 {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final C10440d0 DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile InterfaceC6634z0<C10440d0> PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    /* renamed from: qd.d0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6629x.a<C10440d0, a> implements InterfaceC6617s0 {
        private a() {
            super(C10440d0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(C10465y c10465y) {
            this();
        }
    }

    /* renamed from: qd.d0$b */
    /* loaded from: classes.dex */
    public enum b {
        BANNER(1),
        MODAL(2),
        IMAGE_ONLY(3),
        CARD(4),
        MESSAGEDETAILS_NOT_SET(0);

        private final int value;

        b(int i10) {
            this.value = i10;
        }

        /* renamed from: b */
        public static b m31317b(int i10) {
            if (i10 == 0) {
                return MESSAGEDETAILS_NOT_SET;
            }
            if (i10 == 1) {
                return BANNER;
            }
            if (i10 == 2) {
                return MODAL;
            }
            if (i10 == 3) {
                return IMAGE_ONLY;
            }
            if (i10 != 4) {
                return null;
            }
            return CARD;
        }
    }

    static {
        C10440d0 c10440d0 = new C10440d0();
        DEFAULT_INSTANCE = c10440d0;
        AbstractC6629x.m19291W(C10440d0.class, c10440d0);
    }

    private C10440d0() {
    }

    /* renamed from: e0 */
    public static C10440d0 m31311e0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC6629x
    /* renamed from: E */
    protected final Object mo19297E(AbstractC6629x.f fVar, Object obj, Object obj2) {
        C10465y c10465y = null;
        switch (C10465y.f26009a[fVar.ordinal()]) {
            case 1:
                return new C10440d0();
            case 2:
                return new a(c10465y);
            case 3:
                return AbstractC6629x.m19289T(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", C10434a0.class, C10444f0.class, C10442e0.class, C10438c0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6634z0<C10440d0> interfaceC6634z0 = PARSER;
                if (interfaceC6634z0 == null) {
                    synchronized (C10440d0.class) {
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
    public C10434a0 m31312b0() {
        return this.messageDetailsCase_ == 1 ? (C10434a0) this.messageDetails_ : C10434a0.m31268f0();
    }

    /* renamed from: d0 */
    public C10438c0 m31313d0() {
        return this.messageDetailsCase_ == 4 ? (C10438c0) this.messageDetails_ : C10438c0.m31291e0();
    }

    /* renamed from: f0 */
    public C10442e0 m31314f0() {
        return this.messageDetailsCase_ == 3 ? (C10442e0) this.messageDetails_ : C10442e0.m31322d0();
    }

    /* renamed from: g0 */
    public b m31315g0() {
        return b.m31317b(this.messageDetailsCase_);
    }

    /* renamed from: h0 */
    public C10444f0 m31316h0() {
        return this.messageDetailsCase_ == 2 ? (C10444f0) this.messageDetails_ : C10444f0.m31329g0();
    }
}
