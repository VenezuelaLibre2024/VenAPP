package dk;

import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class j0 extends i0 {
    public static <K, V> Map<K, V> b(Map<K, V> builder) {
        kotlin.jvm.internal.n.e(builder, "builder");
        return ((ek.d) builder).k();
    }

    public static <K, V> Map<K, V> c() {
        return new ek.d();
    }

    public static <K, V> Map<K, V> d(int i10) {
        return new ek.d(i10);
    }

    public static int e(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
    }

    public static <K, V> Map<K, V> f(ck.m<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.n.e(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.c(), pair.d());
        kotlin.jvm.internal.n.d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> g(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.n.e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.n.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
