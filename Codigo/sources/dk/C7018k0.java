package dk;

import ck.C2028m;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.k0 */
/* loaded from: classes3.dex */
public class C7018k0 extends C7016j0 {
    /* renamed from: h */
    public static <K, V> Map<K, V> m20421h() {
        C7002c0 c7002c0 = C7002c0.f15576a;
        C9322n.m27779c(c7002c0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c7002c0;
    }

    /* renamed from: i */
    public static <K, V> V m20422i(Map<K, ? extends V> map, K k10) {
        C9322n.m27781e(map, "<this>");
        return (V) C7014i0.m20412a(map, k10);
    }

    /* renamed from: j */
    public static <K, V> HashMap<K, V> m20423j(C2028m<? extends K, ? extends V>... pairs) {
        C9322n.m27781e(pairs, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C7012h0.m20362e(pairs.length));
        m20429p(hashMap, pairs);
        return hashMap;
    }

    /* renamed from: k */
    public static <K, V> Map<K, V> m20424k(C2028m<? extends K, ? extends V>... pairs) {
        C9322n.m27781e(pairs, "pairs");
        return pairs.length > 0 ? m20433t(pairs, new LinkedHashMap(C7012h0.m20362e(pairs.length))) : C7012h0.m20364h();
    }

    /* renamed from: l */
    public static <K, V> Map<K, V> m20425l(C2028m<? extends K, ? extends V>... pairs) {
        C9322n.m27781e(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7012h0.m20362e(pairs.length));
        m20429p(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final <K, V> Map<K, V> m20426m(Map<K, ? extends V> map) {
        C9322n.m27781e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C7016j0.m20420g(map) : C7012h0.m20364h();
    }

    /* renamed from: n */
    public static <K, V> Map<K, V> m20427n(Map<? extends K, ? extends V> map, C2028m<? extends K, ? extends V> pair) {
        C9322n.m27781e(map, "<this>");
        C9322n.m27781e(pair, "pair");
        if (map.isEmpty()) {
            return C7012h0.m20363f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.m10337c(), pair.m10338d());
        return linkedHashMap;
    }

    /* renamed from: o */
    public static final <K, V> void m20428o(Map<? super K, ? super V> map, Iterable<? extends C2028m<? extends K, ? extends V>> pairs) {
        C9322n.m27781e(map, "<this>");
        C9322n.m27781e(pairs, "pairs");
        for (C2028m<? extends K, ? extends V> c2028m : pairs) {
            map.put(c2028m.m10335a(), c2028m.m10336b());
        }
    }

    /* renamed from: p */
    public static final <K, V> void m20429p(Map<? super K, ? super V> map, C2028m<? extends K, ? extends V>[] pairs) {
        C9322n.m27781e(map, "<this>");
        C9322n.m27781e(pairs, "pairs");
        for (C2028m<? extends K, ? extends V> c2028m : pairs) {
            map.put(c2028m.m10335a(), c2028m.m10336b());
        }
    }

    /* renamed from: q */
    public static <K, V> Map<K, V> m20430q(Iterable<? extends C2028m<? extends K, ? extends V>> iterable) {
        C9322n.m27781e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m20426m(m20431r(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C7012h0.m20364h();
        }
        if (size != 1) {
            return m20431r(iterable, new LinkedHashMap(C7012h0.m20362e(collection.size())));
        }
        return C7012h0.m20363f(iterable instanceof List ? (C2028m<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: r */
    public static final <K, V, M extends Map<? super K, ? super V>> M m20431r(Iterable<? extends C2028m<? extends K, ? extends V>> iterable, M destination) {
        C9322n.m27781e(iterable, "<this>");
        C9322n.m27781e(destination, "destination");
        m20428o(destination, iterable);
        return destination;
    }

    /* renamed from: s */
    public static <K, V> Map<K, V> m20432s(Map<? extends K, ? extends V> map) {
        C9322n.m27781e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? C7012h0.m20372u(map) : C7016j0.m20420g(map) : C7012h0.m20364h();
    }

    /* renamed from: t */
    public static final <K, V, M extends Map<? super K, ? super V>> M m20433t(C2028m<? extends K, ? extends V>[] c2028mArr, M destination) {
        C9322n.m27781e(c2028mArr, "<this>");
        C9322n.m27781e(destination, "destination");
        m20429p(destination, c2028mArr);
        return destination;
    }

    /* renamed from: u */
    public static <K, V> Map<K, V> m20434u(Map<? extends K, ? extends V> map) {
        C9322n.m27781e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
