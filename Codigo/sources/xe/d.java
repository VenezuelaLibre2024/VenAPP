package xe;

import com.google.protobuf.z;

/* loaded from: classes.dex */
public enum d implements z.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final z.d<d> internalValueMap = new z.d<d>() { // from class: xe.d.a
        @Override // com.google.protobuf.z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(int i10) {
            return d.b(i10);
        }
    };
    private final int value;

    /* loaded from: classes.dex */
    private static final class b implements z.e {

        /* renamed from: a, reason: collision with root package name */
        static final z.e f31221a = new b();

        private b() {
        }

        @Override // com.google.protobuf.z.e
        public boolean a(int i10) {
            return d.b(i10) != null;
        }
    }

    d(int i10) {
        this.value = i10;
    }

    public static d b(int i10) {
        if (i10 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i10 == 1) {
            return FOREGROUND;
        }
        if (i10 == 2) {
            return BACKGROUND;
        }
        if (i10 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static z.e h() {
        return b.f31221a;
    }

    @Override // com.google.protobuf.z.c
    public final int a() {
        return this.value;
    }
}
