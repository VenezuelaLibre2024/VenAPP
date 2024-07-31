package dk;

import fk.C7368b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: dk.r */
/* loaded from: classes3.dex */
public class C7031r extends C7029q {
    /* renamed from: f */
    public static <T> ArrayList<T> m20578f(T... elements) {
        C9322n.m27781e(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new C7009g(elements, true));
    }

    /* renamed from: g */
    public static final <T> Collection<T> m20579g(T[] tArr) {
        C9322n.m27781e(tArr, "<this>");
        return new C7009g(tArr, false);
    }

    /* renamed from: h */
    public static final <T extends Comparable<? super T>> int m20580h(List<? extends T> list, T t10, int i10, int i11) {
        int m22236a;
        C9322n.m27781e(list, "<this>");
        m20588p(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            m22236a = C7368b.m22236a(list.get(i13), t10);
            if (m22236a < 0) {
                i10 = i13 + 1;
            } else {
                if (m22236a <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: i */
    public static /* synthetic */ int m20581i(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return m20580h(list, comparable, i10, i11);
    }

    /* renamed from: j */
    public static <T> List<T> m20582j() {
        return C7000b0.f15568a;
    }

    /* renamed from: k */
    public static <T> int m20583k(List<? extends T> list) {
        C9322n.m27781e(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: l */
    public static <T> List<T> m20584l(T... elements) {
        List<T> m20582j;
        List<T> m20435c;
        C9322n.m27781e(elements, "elements");
        if (elements.length > 0) {
            m20435c = C7019l.m20435c(elements);
            return m20435c;
        }
        m20582j = m20582j();
        return m20582j;
    }

    /* renamed from: m */
    public static <T> List<T> m20585m(T... elements) {
        List<T> m20490r;
        C9322n.m27781e(elements, "elements");
        m20490r = C7021m.m20490r(elements);
        return m20490r;
    }

    /* renamed from: n */
    public static <T> List<T> m20586n(T... elements) {
        C9322n.m27781e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C7009g(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static final <T> List<T> m20587o(List<? extends T> list) {
        List<T> m20582j;
        List<T> m20572e;
        C9322n.m27781e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            m20582j = m20582j();
            return m20582j;
        }
        if (size != 1) {
            return list;
        }
        m20572e = C7029q.m20572e(list.get(0));
        return m20572e;
    }

    /* renamed from: p */
    private static final void m20588p(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    /* renamed from: q */
    public static void m20589q() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
