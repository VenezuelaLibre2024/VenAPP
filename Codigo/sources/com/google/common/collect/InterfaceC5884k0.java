package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.k0 */
/* loaded from: classes2.dex */
public interface InterfaceC5884k0<K, V> {
    /* renamed from: a */
    Collection<Map.Entry<K, V>> mo14737a();

    /* renamed from: b */
    Map<K, Collection<V>> mo14748b();

    /* renamed from: c */
    boolean mo14845c(Object obj, Object obj2);

    void clear();

    Collection<V> get(K k10);

    Set<K> keySet();

    boolean put(K k10, V v10);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
