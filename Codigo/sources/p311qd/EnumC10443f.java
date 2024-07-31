package p311qd;

import com.google.protobuf.C6633z;

/* renamed from: qd.f */
/* loaded from: classes.dex */
public enum EnumC10443f implements C6633z.c {
    UNKNOWN_TRIGGER(0),
    APP_LAUNCH(1),
    ON_FOREGROUND(2),
    UNRECOGNIZED(-1);

    public static final int APP_LAUNCH_VALUE = 1;
    public static final int ON_FOREGROUND_VALUE = 2;
    public static final int UNKNOWN_TRIGGER_VALUE = 0;
    private static final C6633z.d<EnumC10443f> internalValueMap = new C6633z.d<EnumC10443f>() { // from class: qd.f.a
        @Override // com.google.protobuf.C6633z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC10443f mo19358a(int i10) {
            return EnumC10443f.m31326b(i10);
        }
    };
    private final int value;

    EnumC10443f(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC10443f m31326b(int i10) {
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

    @Override // com.google.protobuf.C6633z.c
    /* renamed from: a */
    public final int mo19357a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
