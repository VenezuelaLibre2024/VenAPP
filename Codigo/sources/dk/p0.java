package dk;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class p0 {
    public static <E> Set<E> a(Set<E> builder) {
        kotlin.jvm.internal.n.e(builder, "builder");
        return ((ek.j) builder).d();
    }

    public static <E> Set<E> b() {
        return new ek.j();
    }

    public static <E> Set<E> c(int i10) {
        return new ek.j(i10);
    }

    public static <T> Set<T> d(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        kotlin.jvm.internal.n.d(singleton, "singleton(element)");
        return singleton;
    }
}
