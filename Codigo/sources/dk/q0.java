package dk;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class q0 extends p0 {
    public static <T> Set<T> e() {
        return d0.f14219a;
    }

    public static <T> HashSet<T> f(T... elements) {
        int e10;
        kotlin.jvm.internal.n.e(elements, "elements");
        e10 = j0.e(elements.length);
        return (HashSet) m.X(elements, new HashSet(e10));
    }

    public static <T> Set<T> g(T... elements) {
        int e10;
        kotlin.jvm.internal.n.e(elements, "elements");
        e10 = j0.e(elements.length);
        return (Set) m.X(elements, new LinkedHashSet(e10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> h(Set<? extends T> set) {
        Set<T> e10;
        Set<T> d10;
        kotlin.jvm.internal.n.e(set, "<this>");
        int size = set.size();
        if (size == 0) {
            e10 = e();
            return e10;
        }
        if (size != 1) {
            return set;
        }
        d10 = p0.d(set.iterator().next());
        return d10;
    }

    public static <T> Set<T> i(T... elements) {
        Set<T> e10;
        kotlin.jvm.internal.n.e(elements, "elements");
        if (elements.length > 0) {
            return m.n0(elements);
        }
        e10 = e();
        return e10;
    }
}
