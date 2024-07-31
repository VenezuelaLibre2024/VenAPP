package dk;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class v extends u {
    public static <T extends Comparable<? super T>> void s(List<T> list) {
        kotlin.jvm.internal.n.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void t(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.n.e(list, "<this>");
        kotlin.jvm.internal.n.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
