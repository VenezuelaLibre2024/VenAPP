package dk;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.n.e(map, "<this>");
        if (map instanceof g0) {
            return (V) ((g0) map).h(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }
}
