package p311qd;

import com.google.protobuf.C6633z;

/* renamed from: qd.i */
/* loaded from: classes.dex */
public enum EnumC10449i implements C6633z.c {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);

    public static final int AUTO_VALUE = 1;
    public static final int CLICK_VALUE = 2;
    public static final int SWIPE_VALUE = 3;
    public static final int UNKNOWN_DISMISS_TYPE_VALUE = 0;
    private static final C6633z.d<EnumC10449i> internalValueMap = new C6633z.d<EnumC10449i>() { // from class: qd.i.a
        @Override // com.google.protobuf.C6633z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC10449i mo19358a(int i10) {
            return EnumC10449i.m31350b(i10);
        }
    };
    private final int value;

    /* renamed from: qd.i$b */
    /* loaded from: classes.dex */
    private static final class b implements C6633z.e {

        /* renamed from: a */
        static final C6633z.e f25987a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C6633z.e
        /* renamed from: a */
        public boolean mo19359a(int i10) {
            return EnumC10449i.m31350b(i10) != null;
        }
    }

    EnumC10449i(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC10449i m31350b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_DISMISS_TYPE;
        }
        if (i10 == 1) {
            return AUTO;
        }
        if (i10 == 2) {
            return CLICK;
        }
        if (i10 != 3) {
            return null;
        }
        return SWIPE;
    }

    /* renamed from: h */
    public static C6633z.e m31351h() {
        return b.f25987a;
    }

    @Override // com.google.protobuf.C6633z.c
    /* renamed from: a */
    public final int mo19357a() {
        return this.value;
    }
}
