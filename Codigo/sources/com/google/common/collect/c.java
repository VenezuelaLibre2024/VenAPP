package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class c<K, V> extends d<K, V> implements g0<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.d
    Collection<V> A(K k10, Collection<V> collection) {
        return B(k10, (List) collection, null);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.k0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public List<V> p(K k10) {
        return (List) super.p(k10);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override // com.google.common.collect.f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.k0
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    @Override // com.google.common.collect.d
    <E> Collection<E> z(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }
}
