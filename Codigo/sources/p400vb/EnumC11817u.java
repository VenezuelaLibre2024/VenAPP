package p400vb;

import com.google.crypto.tink.shaded.protobuf.C5950a0;

/* renamed from: vb.u */
/* loaded from: classes2.dex */
public enum EnumC11817u implements C5950a0.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final C5950a0.d<EnumC11817u> internalValueMap = new C5950a0.d<EnumC11817u>() { // from class: vb.u.a
        @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC11817u mo15313a(int i10) {
            return EnumC11817u.m37606b(i10);
        }
    };
    private final int value;

    EnumC11817u(int i10) {
        this.value = i10;
    }

    /* renamed from: b */
    public static EnumC11817u m37606b(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
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
