package qd;

import com.google.protobuf.z;

/* loaded from: classes.dex */
public enum f implements z.c {
    UNKNOWN_TRIGGER(0),
    APP_LAUNCH(1),
    ON_FOREGROUND(2),
    UNRECOGNIZED(-1);

    public static final int APP_LAUNCH_VALUE = 1;
    public static final int ON_FOREGROUND_VALUE = 2;
    public static final int UNKNOWN_TRIGGER_VALUE = 0;
    private static final z.d<f> internalValueMap = new z.d<f>() { // from class: qd.f.a
        @Override // com.google.protobuf.z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(int i10) {
            return f.b(i10);
        }
    };
    private final int value;

    f(int i10) {
        this.value = i10;
    }

    public static f b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_TRIGGER;
        }
        if (i10 == 1) {
            return APP_LAUNCH;
        }
        if (i10 != 2) {
            return null;
        }
        return ON_FOREGROUND;
    }

    @Override // com.google.protobuf.z.c
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
