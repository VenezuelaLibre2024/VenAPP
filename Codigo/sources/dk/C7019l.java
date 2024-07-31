package dk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: dk.l */
/* loaded from: classes3.dex */
public class C7019l extends C7017k {
    /* renamed from: c */
    public static <T> List<T> m20435c(T[] tArr) {
        C9322n.m27781e(tArr, "<this>");
        List<T> m20499a = C7023n.m20499a(tArr);
        C9322n.m27780d(m20499a, "asList(this)");
        return m20499a;
    }

    /* renamed from: d */
    public static byte[] m20436d(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        C9322n.m27781e(bArr, "<this>");
        C9322n.m27781e(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: e */
    public static <T> T[] m20437e(T[] tArr, T[] destination, int i10, int i11, int i12) {
        C9322n.m27781e(tArr, "<this>");
        C9322n.m27781e(destination, "destination");
        System.arraycopy(tArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    /* renamed from: f */
    public static /* synthetic */ byte[] m20438f(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        byte[] m20436d;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        m20436d = m20436d(bArr, bArr2, i10, i11, i12);
        return m20436d;
    }

    /* renamed from: g */
    public static /* synthetic */ Object[] m20439g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        Object[] m20437e;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        m20437e = m20437e(objArr, objArr2, i10, i11, i12);
        return m20437e;
    }

    /* renamed from: h */
    public static byte[] m20440h(byte[] bArr, int i10, int i11) {
        C9322n.m27781e(bArr, "<this>");
        C7015j.m20414b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        C9322n.m27780d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: i */
    public static <T> T[] m20441i(T[] tArr, int i10, int i11) {
        C9322n.m27781e(tArr, "<this>");
        C7015j.m20414b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        C9322n.m27780d(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    /* renamed from: j */
    public static void m20442j(int[] iArr, int i10, int i11, int i12) {
        C9322n.m27781e(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    /* renamed from: k */
    public static <T> void m20443k(T[] tArr, T t10, int i10, int i11) {
        C9322n.m27781e(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    /* renamed from: l */
    public static /* synthetic */ void m20444l(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        m20443k(objArr, obj, i10, i11);
    }

    /* renamed from: m */
    public static <T> T[] m20445m(T[] tArr, T[] elements) {
        C9322n.m27781e(tArr, "<this>");
        C9322n.m27781e(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        C9322n.m27780d(result, "result");
        return result;
    }

    /* renamed from: n */
    public static <T> void m20446n(T[] tArr) {
        C9322n.m27781e(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* renamed from: o */
    public static final <T> void m20447o(T[] tArr, Comparator<? super T> comparator) {
        C9322n.m27781e(tArr, "<this>");
        C9322n.m27781e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
