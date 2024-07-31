package p363t8;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: t8.e */
/* loaded from: classes.dex */
public final class C11145e {

    /* renamed from: a */
    private static final byte[] f28945a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f28946b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m34644a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: b */
    public static List<byte[]> m34645b(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m34646c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = f28946b[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(z10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(C11172r0.m34860C("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static byte[] m34647d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f28945a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    /* renamed from: e */
    private static int m34648e(byte[] bArr, int i10) {
        int length = bArr.length - f28945a.length;
        while (i10 <= length) {
            if (m34649f(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: f */
    private static boolean m34649f(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f28945a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f28945a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m34650g(byte[] bArr) {
        C11146e0 c11146e0 = new C11146e0(bArr);
        c11146e0.m34677U(9);
        int m34664H = c11146e0.m34664H();
        c11146e0.m34677U(20);
        return Pair.create(Integer.valueOf(c11146e0.m34668L()), Integer.valueOf(m34664H));
    }

    /* renamed from: h */
    public static boolean m34651h(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    /* renamed from: i */
    public static byte[][] m34652i(byte[] bArr) {
        if (!m34649f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            arrayList.add(Integer.valueOf(i10));
            i10 = m34648e(bArr, i10 + f28945a.length);
        } while (i10 != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            int intValue2 = (i11 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i11] = bArr3;
            i11++;
        }
        return bArr2;
    }
}
