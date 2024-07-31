package p400vb;

import com.google.crypto.tink.shaded.protobuf.C5950a0;

/* renamed from: vb.i0 */
/* loaded from: classes2.dex */
public enum EnumC11802i0 implements C5950a0.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    private static final C5950a0.d<EnumC11802i0> internalValueMap = new C5950a0.d<EnumC11802i0>() { // from class: vb.i0.a
        @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC11802i0 mo15313a(int i10) {
            return EnumC11802i0.m37492b(i10);
        }
    };
    private final int value;

    EnumC11802i0(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC11802i0 m37492b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 != 4) {
            return null;
        }
        return CRUNCHY;
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
