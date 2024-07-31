package dk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public class r extends q {
    public static <T> ArrayList<T> f(T... elements) {
        kotlin.jvm.internal.n.e(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new g(elements, true));
    }

    public static final <T> Collection<T> g(T[] tArr) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        return new g(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int h(List<? extends T> list, T t10, int i10, int i11) {
        int a10;
        kotlin.jvm.internal.n.e(list, "<this>");
        p(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            a10 = fk.b.a(list.get(i13), t10);
            if (a10 < 0) {
                i10 = i13 + 1;
            } else {
                if (a10 <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int i(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return h(list, comparable, i10, i11);
    }

    public static <T> List<T> j() {
        return b0.f14210a;
    }

    public static <T> int k(List<? extends T> list) {
        kotlin.jvm.internal.n.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> l(T... elements) {
        List<T> j10;
        List<T> c10;
        kotlin.jvm.internal.n.e(elements, "elements");
        if (elements.length > 0) {
            c10 = l.c(elements);
            return c10;
        }
        j10 = j();
        return j10;
    }

    public static <T> List<T> m(T... elements) {
        List<T> r10;
        kotlin.jvm.internal.n.e(elements, "elements");
        r10 = m.r(elements);
        return r10;
    }

    public static <T> List<T> n(T... elements) {
        kotlin.jvm.internal.n.e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new g(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> o(List<? extends T> list) {
        List<T> j10;
        List<T> e10;
        kotlin.jvm.internal.n.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            j10 = j();
            return j10;
        }
        if (size != 1) {
            return list;
        }
        e10 = q.e(list.get(0));
        return e10;
    }

    private static final void p(int i10, int i11, int i12) {
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

    public static void q() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
