package dk;

import ck.C2028m;
import com.google.android.gms.common.api.C5101a;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p088ek.C7201d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.j0 */
/* loaded from: classes3.dex */
public class C7016j0 extends C7014i0 {
    /* renamed from: b */
    public static <K, V> Map<K, V> m20415b(Map<K, V> builder) {
        C9322n.m27781e(builder, "builder");
        return ((C7201d) builder).m21514k();
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m20416c() {
        return new C7201d();
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m20417d(int i10) {
        return new C7201d(i10);
    }

    /* renamed from: e */
    public static int m20418e(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : C5101a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: f */
    public static <K, V> Map<K, V> m20419f(C2028m<? extends K, ? extends V> pair) {
        C9322n.m27781e(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.m10337c(), pair.m10338d());
        C9322n.m27780d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: g */
    public static final <K, V> Map<K, V> m20420g(Map<? extends K, ? extends V> map) {
        C9322n.m27781e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C9322n.m27780d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
