package qd;

import com.google.protobuf.z;

/* loaded from: classes.dex */
public enum i implements z.c {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);

    public static final int AUTO_VALUE = 1;
    public static final int CLICK_VALUE = 2;
    public static final int SWIPE_VALUE = 3;
    public static final int UNKNOWN_DISMISS_TYPE_VALUE = 0;
    private static final z.d<i> internalValueMap = new z.d<i>() { // from class: qd.i.a
        @Override // com.google.protobuf.z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(int i10) {
            return i.b(i10);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    private static final class b implements z.e {

        /* renamed from: a, reason: collision with root package name */
        static final z.e f23945a = new b();

        private b() {
        }

        @Override // com.google.protobuf.z.e
        public boolean a(int i10) {
            return i.b(i10) != null;
        }
    }

    i(int i10) {
        this.value = i10;
    }

    public static i b(int i10) {
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

    public static z.e h() {
        return b.f23945a;
    }

    @Override // com.google.protobuf.z.c
    public final int a() {
        return this.value;
    }
}
