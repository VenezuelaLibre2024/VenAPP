package dk;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class w extends v {
    public static <T> boolean u(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.n.e(collection, "<this>");
        kotlin.jvm.internal.n.e(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean v(Collection<? super T> collection, T[] elements) {
        List c10;
        kotlin.jvm.internal.n.e(collection, "<this>");
        kotlin.jvm.internal.n.e(elements, "elements");
        c10 = l.c(elements);
        return collection.addAll(c10);
    }
}
