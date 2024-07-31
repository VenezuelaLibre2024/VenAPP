package dm;

import dm.C7061e;
import kotlin.jvm.internal.C9322n;

/* renamed from: dm.a0 */
/* loaded from: classes3.dex */
public final class C7055a0 {

    /* renamed from: a */
    private static final byte[] f15636a;

    /* renamed from: b */
    private static final byte[] f15637b;

    static {
        C7061e.a aVar = C7061e.f15649d;
        f15636a = aVar.m20781c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m20766n();
        f15637b = aVar.m20781c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m20766n();
    }

    /* renamed from: a */
    public static final String m20687a(byte[] bArr, byte[] map) {
        C9322n.m27781e(bArr, "<this>");
        C9322n.m27781e(map, "map");
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
        return C7057b0.m20743b(bArr2);
    }

    /* renamed from: b */
    public static /* synthetic */ String m20688b(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f15636a;
        }
        return m20687a(bArr, bArr2);
    }
}
