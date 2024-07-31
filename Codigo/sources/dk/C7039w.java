package dk;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.w */
/* loaded from: classes3.dex */
public class C7039w extends C7038v {
    /* renamed from: u */
    public static <T> boolean m20597u(Collection<? super T> collection, Iterable<? extends T> elements) {
        C9322n.m27781e(collection, "<this>");
        C9322n.m27781e(elements, "elements");
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

    /* renamed from: v */
    public static <T> boolean m20598v(Collection<? super T> collection, T[] elements) {
        List m20435c;
        C9322n.m27781e(collection, "<this>");
        C9322n.m27781e(elements, "elements");
        m20435c = C7019l.m20435c(elements);
        return collection.addAll(m20435c);
    }
}
