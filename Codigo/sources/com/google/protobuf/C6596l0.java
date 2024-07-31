package com.google.protobuf;

import com.google.protobuf.C6633z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.l0 */
/* loaded from: classes2.dex */
public final class C6596l0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final C6596l0<?, ?> f14563b;

    /* renamed from: a */
    private boolean f14564a;

    static {
        C6596l0<?, ?> c6596l0 = new C6596l0<>();
        f14563b = c6596l0;
        c6596l0.m18932k();
    }

    private C6596l0() {
        this.f14564a = true;
    }

    private C6596l0(Map<K, V> map) {
        super(map);
        this.f14564a = true;
    }

    /* renamed from: a */
    static <K, V> int m18924a(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i10 += m18925b(entry.getValue()) ^ m18925b(entry.getKey());
        }
        return i10;
    }

    /* renamed from: b */
    private static int m18925b(Object obj) {
        if (obj instanceof byte[]) {
            return C6633z.m19350d((byte[]) obj);
        }
        if (obj instanceof C6633z.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: c */
    private static void m18926c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C6633z.m19347a(obj);
            C6633z.m19347a(map.get(obj));
        }
    }

    /* renamed from: d */
    public static <K, V> C6596l0<K, V> m18927d() {
        return (C6596l0<K, V>) f14563b;
    }

    /* renamed from: e */
    private void m18928e() {
        if (!m18931j()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private static boolean m18929g(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* renamed from: i */
    static <K, V> boolean m18930i(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m18929g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m18928e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m18930i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m18924a(this);
    }

    /* renamed from: j */
    public boolean m18931j() {
        return this.f14564a;
    }

    /* renamed from: k */
    public void m18932k() {
        this.f14564a = false;
    }

    /* renamed from: l */
    public void m18933l(C6596l0<K, V> c6596l0) {
        m18928e();
        if (c6596l0.isEmpty()) {
            return;
        }
        putAll(c6596l0);
    }

    /* renamed from: m */
    public C6596l0<K, V> m18934m() {
        return isEmpty() ? new C6596l0<>() : new C6596l0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        m18928e();
        C6633z.m19347a(k10);
        C6633z.m19347a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m18928e();
        m18926c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m18928e();
        return (V) super.remove(obj);
    }
}
