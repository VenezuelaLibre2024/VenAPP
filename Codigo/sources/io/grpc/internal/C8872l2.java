package io.grpc.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import p082eb.C7149e;
import p103fb.AbstractC7323a;
import vi.C11926k0;
import vi.C11953w0;

/* renamed from: io.grpc.internal.l2 */
/* loaded from: classes3.dex */
public final class C8872l2 {

    /* renamed from: a */
    private static final Logger f20726a = Logger.getLogger(C8872l2.class.getName());

    /* renamed from: b */
    private static final byte[] f20727b = "-bin".getBytes(C7149e.f16017a);

    private C8872l2() {
    }

    /* renamed from: a */
    private static boolean m25664a(byte[] bArr, byte[] bArr2) {
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

    /* renamed from: b */
    private static boolean m25665b(byte[] bArr) {
        for (byte b10 : bArr) {
            if (b10 < 32 || b10 > 126) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static byte[][] m25666c(byte[][] bArr, int i10) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(bArr[i11]);
        }
        while (i10 < bArr.length) {
            byte[] bArr2 = bArr[i10];
            byte[] bArr3 = bArr[i10 + 1];
            if (m25664a(bArr2, f20727b)) {
                int i12 = 0;
                for (int i13 = 0; i13 <= bArr3.length; i13++) {
                    if (i13 == bArr3.length || bArr3[i13] == 44) {
                        byte[] m21952c = AbstractC7323a.m21950b().m21952c(new String(bArr3, i12, i13 - i12, C7149e.f16017a));
                        arrayList.add(bArr2);
                        arrayList.add(m21952c);
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

    /* renamed from: d */
    public static byte[][] m25667d(C11953w0 c11953w0) {
        byte[][] m38191d = C11926k0.m38191d(c11953w0);
        if (m38191d == null) {
            return new byte[0];
        }
        int i10 = 0;
        for (int i11 = 0; i11 < m38191d.length; i11 += 2) {
            byte[] bArr = m38191d[i11];
            byte[] bArr2 = m38191d[i11 + 1];
            if (m25664a(bArr, f20727b)) {
                m38191d[i10] = bArr;
                m38191d[i10 + 1] = C11926k0.f31579b.m21955f(bArr2).getBytes(C7149e.f16017a);
            } else if (m25665b(bArr2)) {
                m38191d[i10] = bArr;
                m38191d[i10 + 1] = bArr2;
            } else {
                String str = new String(bArr, C7149e.f16017a);
                f20726a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i10 += 2;
        }
        return i10 == m38191d.length ? m38191d : (byte[][]) Arrays.copyOfRange(m38191d, 0, i10);
    }

    /* renamed from: e */
    public static byte[][] m25668e(byte[][] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            byte[] bArr2 = bArr[i10];
            int i11 = i10 + 1;
            byte[] bArr3 = bArr[i11];
            if (m25664a(bArr2, f20727b)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        return m25666c(bArr, i10);
                    }
                }
                bArr[i11] = AbstractC7323a.m21950b().m21952c(new String(bArr3, C7149e.f16017a));
            }
        }
        return bArr;
    }
}
