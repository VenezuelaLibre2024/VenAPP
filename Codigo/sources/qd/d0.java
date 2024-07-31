package qd;

import com.google.protobuf.s0;
import com.google.protobuf.x;
import com.google.protobuf.z0;

/* loaded from: classes.dex */
public final class d0 extends com.google.protobuf.x<d0, a> implements s0 {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final d0 DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile z0<d0> PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    /* loaded from: classes.dex */
    public static final class a extends x.a<d0, a> implements s0 {
        private a() {
            super(d0.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(y yVar) {
            this();
        }
    }

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

        public static b b(int i10) {
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
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        com.google.protobuf.x.W(d0.class, d0Var);
    }

    private d0() {
    }

    public static d0 e0() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.x
    protected final Object E(x.f fVar, Object obj, Object obj2) {
        switch (y.f23967a[fVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new a(null);
            case 3:
                return com.google.protobuf.x.T(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", a0.class, f0.class, e0.class, c0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<d0> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (d0.class) {
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

    public a0 b0() {
        return this.messageDetailsCase_ == 1 ? (a0) this.messageDetails_ : a0.f0();
    }

    public c0 d0() {
        return this.messageDetailsCase_ == 4 ? (c0) this.messageDetails_ : c0.e0();
    }

    public e0 f0() {
        return this.messageDetailsCase_ == 3 ? (e0) this.messageDetails_ : e0.d0();
    }

    public b g0() {
        return b.b(this.messageDetailsCase_);
    }

    public f0 h0() {
        return this.messageDetailsCase_ == 2 ? (f0) this.messageDetails_ : f0.g0();
    }
}
