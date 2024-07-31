package dk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class q {
    public static <E> List<E> a(List<E> builder) {
        kotlin.jvm.internal.n.e(builder, "builder");
        return ((ek.b) builder).o();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        kotlin.jvm.internal.n.e(tArr, "<this>");
        if (z10 && kotlin.jvm.internal.n.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.n.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <E> List<E> c() {
        return new ek.b();
    }

    public static <E> List<E> d(int i10) {
        return new ek.b(i10);
    }

    public static <T> List<T> e(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        kotlin.jvm.internal.n.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
