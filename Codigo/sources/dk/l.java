package dk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public class l extends k {
    public static <T> List<T> c(T[] tArr) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        List<T> a10 = n.a(tArr);
        kotlin.jvm.internal.n.d(a10, "asList(this)");
        return a10;
    }

    public static byte[] d(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.n.e(bArr, "<this>");
        kotlin.jvm.internal.n.e(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static <T> T[] e(T[] tArr, T[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        kotlin.jvm.internal.n.e(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] f(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        byte[] d10;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        d10 = d(bArr, bArr2, i10, i11, i12);
        return d10;
    }

    public static /* synthetic */ Object[] g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        Object[] e10;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        e10 = e(objArr, objArr2, i10, i11, i12);
        return e10;
    }

    public static byte[] h(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.n.e(bArr, "<this>");
        j.b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.n.d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static <T> T[] i(T[] tArr, int i10, int i11) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        j.b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        kotlin.jvm.internal.n.d(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    public static void j(int[] iArr, int i10, int i11, int i12) {
        kotlin.jvm.internal.n.e(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static <T> void k(T[] tArr, T t10, int i10, int i11) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void l(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        k(objArr, obj, i10, i11);
    }

    public static <T> T[] m(T[] tArr, T[] elements) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        kotlin.jvm.internal.n.e(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        kotlin.jvm.internal.n.d(result, "result");
        return result;
    }

    public static <T> void n(T[] tArr) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void o(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        kotlin.jvm.internal.n.e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
