package dk;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class k0 extends j0 {
    public static <K, V> Map<K, V> h() {
        c0 c0Var = c0.f14218a;
        kotlin.jvm.internal.n.c(c0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c0Var;
    }

    public static <K, V> V i(Map<K, ? extends V> map, K k10) {
        kotlin.jvm.internal.n.e(map, "<this>");
        return (V) i0.a(map, k10);
    }

    public static <K, V> HashMap<K, V> j(ck.m<? extends K, ? extends V>... pairs) {
        int e10;
        kotlin.jvm.internal.n.e(pairs, "pairs");
        e10 = j0.e(pairs.length);
        HashMap<K, V> hashMap = new HashMap<>(e10);
        p(hashMap, pairs);
        return hashMap;
    }

    public static <K, V> Map<K, V> k(ck.m<? extends K, ? extends V>... pairs) {
        Map<K, V> h10;
        int e10;
        kotlin.jvm.internal.n.e(pairs, "pairs");
        if (pairs.length > 0) {
            e10 = j0.e(pairs.length);
            return t(pairs, new LinkedHashMap(e10));
        }
        h10 = h();
        return h10;
    }

    public static <K, V> Map<K, V> l(ck.m<? extends K, ? extends V>... pairs) {
        int e10;
        kotlin.jvm.internal.n.e(pairs, "pairs");
        e10 = j0.e(pairs.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e10);
        p(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> m(Map<K, ? extends V> map) {
        Map<K, V> h10;
        kotlin.jvm.internal.n.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : j0.g(map);
        }
        h10 = h();
        return h10;
    }

    public static <K, V> Map<K, V> n(Map<? extends K, ? extends V> map, ck.m<? extends K, ? extends V> pair) {
        Map<K, V> f10;
        kotlin.jvm.internal.n.e(map, "<this>");
        kotlin.jvm.internal.n.e(pair, "pair");
        if (map.isEmpty()) {
            f10 = j0.f(pair);
            return f10;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static final <K, V> void o(Map<? super K, ? super V> map, Iterable<? extends ck.m<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.n.e(map, "<this>");
        kotlin.jvm.internal.n.e(pairs, "pairs");
        for (ck.m<? extends K, ? extends V> mVar : pairs) {
            map.put(mVar.a(), mVar.b());
        }
    }

    public static final <K, V> void p(Map<? super K, ? super V> map, ck.m<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.n.e(map, "<this>");
        kotlin.jvm.internal.n.e(pairs, "pairs");
        for (ck.m<? extends K, ? extends V> mVar : pairs) {
            map.put(mVar.a(), mVar.b());
        }
    }

    public static <K, V> Map<K, V> q(Iterable<? extends ck.m<? extends K, ? extends V>> iterable) {
        Map<K, V> h10;
        Map<K, V> f10;
        int e10;
        kotlin.jvm.internal.n.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m(r(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            h10 = h();
            return h10;
        }
        if (size != 1) {
            e10 = j0.e(collection.size());
            return r(iterable, new LinkedHashMap(e10));
        }
        f10 = j0.f(iterable instanceof List ? (ck.m<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
        return f10;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M r(Iterable<? extends ck.m<? extends K, ? extends V>> iterable, M destination) {
        kotlin.jvm.internal.n.e(iterable, "<this>");
        kotlin.jvm.internal.n.e(destination, "destination");
        o(destination, iterable);
        return destination;
    }

    public static <K, V> Map<K, V> s(Map<? extends K, ? extends V> map) {
        Map<K, V> h10;
        Map<K, V> u10;
        kotlin.jvm.internal.n.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            h10 = h();
            return h10;
        }
        if (size == 1) {
            return j0.g(map);
        }
        u10 = u(map);
        return u10;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M t(ck.m<? extends K, ? extends V>[] mVarArr, M destination) {
        kotlin.jvm.internal.n.e(mVarArr, "<this>");
        kotlin.jvm.internal.n.e(destination, "destination");
        p(destination, mVarArr);
        return destination;
    }

    public static <K, V> Map<K, V> u(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.n.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
