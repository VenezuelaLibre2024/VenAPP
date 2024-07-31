package com.google.common.collect;

/* loaded from: classes2.dex */
public final class q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i10) {
        return (T[]) s0.b(tArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] e(Object[] objArr, int i10, int i11, T[] tArr) {
        eb.o.t(i10, i10 + i11, objArr.length);
        if (tArr.length < i11) {
            tArr = (T[]) d(tArr, i11);
        } else if (tArr.length > i11) {
            tArr[i11] = null;
        }
        System.arraycopy(objArr, i10, tArr, 0, i11);
        return tArr;
    }
}
