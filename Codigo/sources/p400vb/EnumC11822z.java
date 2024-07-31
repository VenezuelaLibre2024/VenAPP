package p400vb;

import com.google.crypto.tink.shaded.protobuf.C5950a0;

/* renamed from: vb.z */
/* loaded from: classes2.dex */
public enum EnumC11822z implements C5950a0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final C5950a0.d<EnumC11822z> internalValueMap = new C5950a0.d<EnumC11822z>() { // from class: vb.z.a
        @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC11822z mo15313a(int i10) {
            return EnumC11822z.m37664b(i10);
        }
    };
    private final int value;

    EnumC11822z(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC11822z m37664b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.c
    /* renamed from: a */
    public final int mo15312a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
