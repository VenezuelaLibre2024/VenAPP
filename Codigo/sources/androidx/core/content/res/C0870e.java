package androidx.core.content.res;

import java.lang.reflect.Array;

/* renamed from: androidx.core.content.res.e */
/* loaded from: classes.dex */
final class C0870e {
    /* renamed from: a */
    public static int[] m4447a(int[] iArr, int i10, int i11) {
        if (i10 + 1 > iArr.length) {
            int[] iArr2 = new int[m4449c(i10)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            iArr = iArr2;
        }
        iArr[i10] = i11;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: b */
    public static <T> T[] m4448b(T[] tArr, int i10, T t10) {
        if (i10 + 1 > tArr.length) {
            ?? r02 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m4449c(i10));
            System.arraycopy(tArr, 0, r02, 0, i10);
            tArr = r02;
        }
        tArr[i10] = t10;
        return tArr;
    }

    /* renamed from: c */
    public static int m4449c(int i10) {
        if (i10 <= 4) {
            return 8;
        }
        return i10 * 2;
    }
}