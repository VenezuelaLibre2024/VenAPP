package vb;

import com.google.crypto.tink.shaded.protobuf.a0;

/* loaded from: classes2.dex */
public enum u implements a0.c {
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
    private static final a0.d<u> internalValueMap = new a0.d<u>() { // from class: vb.u.a
        @Override // com.google.crypto.tink.shaded.protobuf.a0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(int i10) {
            return u.b(i10);
        }
    };
    private final int value;

    u(int i10) {
        this.value = i10;
    }

    public static u b(int i10) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.a0.c
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
