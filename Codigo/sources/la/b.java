package la;

/* loaded from: classes.dex */
public final class b {
    public static boolean a(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean b(T[] tArr, T t10) {
        int length = tArr != null ? tArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!com.google.android.gms.common.internal.q.b(tArr[i10], t10)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void c(StringBuilder sb2, double[] dArr) {
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Double.toString(dArr[i10]));
        }
    }

    public static void d(StringBuilder sb2, float[] fArr) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Float.toString(fArr[i10]));
        }
    }

    public static void e(StringBuilder sb2, int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Integer.toString(iArr[i10]));
        }
    }

    public static void f(StringBuilder sb2, long[] jArr) {
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Long.toString(jArr[i10]));
        }
    }

    public static <T> void g(StringBuilder sb2, T[] tArr) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(tArr[i10]);
        }
    }

    public static void h(StringBuilder sb2, boolean[] zArr) {
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Boolean.toString(zArr[i10]));
        }
    }

    public static void i(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append("\"");
            sb2.append(strArr[i10]);
            sb2.append("\"");
        }
    }
}
