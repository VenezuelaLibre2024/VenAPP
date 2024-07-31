package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5950a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l0 */
/* loaded from: classes2.dex */
public final class C5983l0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final C5983l0<?, ?> f12679b;

    /* renamed from: a */
    private boolean f12680a;

    static {
        C5983l0<?, ?> c5983l0 = new C5983l0<>();
        f12679b = c5983l0;
        c5983l0.m15858k();
    }

    private C5983l0() {
        this.f12680a = true;
    }

    private C5983l0(Map<K, V> map) {
        super(map);
        this.f12680a = true;
    }

    /* renamed from: a */
    static <K, V> int m15850a(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i10 += m15851b(entry.getValue()) ^ m15851b(entry.getKey());
        }
        return i10;
    }

    /* renamed from: b */
    private static int m15851b(Object obj) {
        if (obj instanceof byte[]) {
            return C5950a0.m15305d((byte[]) obj);
        }
        if (obj instanceof C5950a0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: c */
    private static void m15852c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C5950a0.m15302a(obj);
            C5950a0.m15302a(map.get(obj));
        }
    }

    /* renamed from: d */
    public static <K, V> C5983l0<K, V> m15853d() {
        return (C5983l0<K, V>) f12679b;
    }

    /* renamed from: e */
    private void m15854e() {
        if (!m15857j()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private static boolean m15855g(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* renamed from: i */
    static <K, V> boolean m15856i(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m15855g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m15854e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m15856i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m15850a(this);
    }

    /* renamed from: j */
    public boolean m15857j() {
        return this.f12680a;
    }

    /* renamed from: k */
    public void m15858k() {
        this.f12680a = false;
    }

    /* renamed from: l */
    public void m15859l(C5983l0<K, V> c5983l0) {
        m15854e();
        if (c5983l0.isEmpty()) {
            return;
        }
        putAll(c5983l0);
    }

    /* renamed from: m */
    public C5983l0<K, V> m15860m() {
        return isEmpty() ? new C5983l0<>() : new C5983l0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        m15854e();
        C5950a0.m15302a(k10);
        C5950a0.m15302a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m15854e();
        m15852c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m15854e();
        return (V) super.remove(obj);
    }
}
