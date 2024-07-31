package p088ek;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: ek.c */
/* loaded from: classes3.dex */
public final class C7200c {
    /* renamed from: d */
    public static final <E> E[] m21476d(int i10) {
        if (i10 >= 0) {
            return (E[]) new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: e */
    public static final <T> T[] m21477e(T[] tArr, int i10) {
        C9322n.m27781e(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        C9322n.m27780d(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    /* renamed from: f */
    public static final <E> void m21478f(E[] eArr, int i10) {
        C9322n.m27781e(eArr, "<this>");
        eArr[i10] = null;
    }

    /* renamed from: g */
    public static final <E> void m21479g(E[] eArr, int i10, int i11) {
        C9322n.m27781e(eArr, "<this>");
        while (i10 < i11) {
            m21478f(eArr, i10);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final <T> boolean m21480h(T[] tArr, int i10, int i11, List<?> list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!C9322n.m27777a(tArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final <T> int m21481i(T[] tArr, int i10, int i11) {
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            T t10 = tArr[i10 + i13];
            i12 = (i12 * 31) + (t10 != null ? t10.hashCode() : 0);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final <T> String m21482j(T[] tArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(tArr[i10 + i12]);
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "sb.toString()");
        return sb3;
    }
}
