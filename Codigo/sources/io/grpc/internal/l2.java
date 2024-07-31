package io.grpc.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f18979a = Logger.getLogger(l2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f18980b = "-bin".getBytes(eb.e.f14594a);

    private l2() {
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i10 = length; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10 - length]) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(byte[] bArr) {
        for (byte b10 : bArr) {
            if (b10 < 32 || b10 > 126) {
                return false;
            }
        }
        return true;
    }

    private static byte[][] c(byte[][] bArr, int i10) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(bArr[i11]);
        }
        while (i10 < bArr.length) {
            byte[] bArr2 = bArr[i10];
            byte[] bArr3 = bArr[i10 + 1];
            if (a(bArr2, f18980b)) {
                int i12 = 0;
                for (int i13 = 0; i13 <= bArr3.length; i13++) {
                    if (i13 == bArr3.length || bArr3[i13] == 44) {
                        byte[] c10 = fb.a.b().c(new String(bArr3, i12, i13 - i12, eb.e.f14594a));
                        arrayList.add(bArr2);
                        arrayList.add(c10);
                        i12 = i13 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i10 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0]);
    }

    public static byte[][] d(vi.w0 w0Var) {
        byte[][] d10 = vi.k0.d(w0Var);
        if (d10 == null) {
            return new byte[0];
        }
        int i10 = 0;
        for (int i11 = 0; i11 < d10.length; i11 += 2) {
            byte[] bArr = d10[i11];
            byte[] bArr2 = d10[i11 + 1];
            if (a(bArr, f18980b)) {
                d10[i10] = bArr;
                d10[i10 + 1] = vi.k0.f29144b.f(bArr2).getBytes(eb.e.f14594a);
            } else if (b(bArr2)) {
                d10[i10] = bArr;
                d10[i10 + 1] = bArr2;
            } else {
                String str = new String(bArr, eb.e.f14594a);
                f18979a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i10 += 2;
        }
        return i10 == d10.length ? d10 : (byte[][]) Arrays.copyOfRange(d10, 0, i10);
    }

    public static byte[][] e(byte[][] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            byte[] bArr2 = bArr[i10];
            int i11 = i10 + 1;
            byte[] bArr3 = bArr[i11];
            if (a(bArr2, f18980b)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        return c(bArr, i10);
                    }
                }
                bArr[i11] = fb.a.b().c(new String(bArr3, eb.e.f14594a));
            }
        }
        return bArr;
    }
}
