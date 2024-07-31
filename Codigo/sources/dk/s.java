package dk;

import java.util.Collection;

/* loaded from: classes3.dex */
public class s extends r {
    public static <T> int r(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
