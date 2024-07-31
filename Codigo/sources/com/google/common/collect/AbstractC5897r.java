package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.r */
/* loaded from: classes2.dex */
public abstract class AbstractC5897r<K, V> extends AbstractC5899s implements Map<K, V> {
    /* renamed from: b */
    protected abstract Map<K, V> mo9605b();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public boolean m15036c(Object obj) {
        return C5882j0.m14889b(this, obj);
    }

    @Override // java.util.Map
    public void clear() {
        mo9605b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo9605b().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo9605b().containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public boolean m15037d(Object obj) {
        return C5882j0.m14890c(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m15038e() {
        return C5862c1.m14774d(entrySet());
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return mo9605b().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || mo9605b().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return mo9605b().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo9605b().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo9605b().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return mo9605b().keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return mo9605b().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        mo9605b().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return mo9605b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo9605b().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return mo9605b().values();
    }
}
