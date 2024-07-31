package dm;

import dm.e;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f14278a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f14279b;

    static {
        e.a aVar = e.f14291d;
        f14278a = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").n();
        f14279b = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").n();
    }

    public static final String a(byte[] bArr, byte[] map) {
        kotlin.jvm.internal.n.e(bArr, "<this>");
        kotlin.jvm.internal.n.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr2[i11] = map[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr2[i15] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr2[i16] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr2[i17] = map[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i18 = i11 + 1;
            bArr2[i11] = map[(b13 & 255) >> 2];
            int i19 = i18 + 1;
            bArr2[i18] = map[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr2[i19] = b14;
            bArr2[i19 + 1] = b14;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b15 = bArr[i10];
            byte b16 = bArr[i20];
            int i21 = i11 + 1;
            bArr2[i11] = map[(b15 & 255) >> 2];
            int i22 = i21 + 1;
            bArr2[i21] = map[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr2[i22] = map[(b16 & 15) << 2];
            bArr2[i22 + 1] = (byte) 61;
        }
        return b0.b(bArr2);
    }

    public static /* synthetic */ String b(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f14278a;
        }
        return a(bArr, bArr2);
    }
}
