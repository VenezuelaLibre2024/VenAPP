package dk;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.i0 */
/* loaded from: classes3.dex */
public class C7014i0 {
    /* renamed from: a */
    public static final <K, V> V m20412a(Map<K, ? extends V> map, K k10) {
        C9322n.m27781e(map, "<this>");
        if (map instanceof InterfaceC7010g0) {
            return (V) ((InterfaceC7010g0) map).m20349h(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }
}
