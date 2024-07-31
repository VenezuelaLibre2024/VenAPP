package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1147a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.datastore.preferences.protobuf.l0 */
/* loaded from: classes.dex */
public final class C1180l0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final C1180l0 f4931b;

    /* renamed from: a */
    private boolean f4932a;

    static {
        C1180l0 c1180l0 = new C1180l0();
        f4931b = c1180l0;
        c1180l0.m6199k();
    }

    private C1180l0() {
        this.f4932a = true;
    }

    private C1180l0(Map<K, V> map) {
        super(map);
        this.f4932a = true;
    }

    /* renamed from: a */
    static <K, V> int m6191a(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i10 += m6192b(entry.getValue()) ^ m6192b(entry.getKey());
        }
        return i10;
    }

    /* renamed from: b */
    private static int m6192b(Object obj) {
        if (obj instanceof byte[]) {
            return C1147a0.m5646d((byte[]) obj);
        }
        if (obj instanceof C1147a0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: c */
    private static void m6193c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C1147a0.m5643a(obj);
            C1147a0.m5643a(map.get(obj));
        }
    }

    /* renamed from: d */
    public static <K, V> C1180l0<K, V> m6194d() {
        return f4931b;
    }

    /* renamed from: e */
    private void m6195e() {
        if (!m6198j()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private static boolean m6196g(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* renamed from: i */
    static <K, V> boolean m6197i(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m6196g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m6195e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m6197i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m6191a(this);
    }

    /* renamed from: j */
    public boolean m6198j() {
        return this.f4932a;
    }

    /* renamed from: k */
    public void m6199k() {
        this.f4932a = false;
    }

    /* renamed from: l */
    public void m6200l(C1180l0<K, V> c1180l0) {
        m6195e();
        if (c1180l0.isEmpty()) {
            return;
        }
        putAll(c1180l0);
    }

    /* renamed from: m */
    public C1180l0<K, V> m6201m() {
        return isEmpty() ? new C1180l0<>() : new C1180l0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        m6195e();
        C1147a0.m5643a(k10);
        C1147a0.m5643a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m6195e();
        m6193c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m6195e();
        return (V) super.remove(obj);
    }
}
