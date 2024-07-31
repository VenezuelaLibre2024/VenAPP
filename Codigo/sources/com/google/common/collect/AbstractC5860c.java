package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5860c<K, V> extends AbstractC5863d<K, V> implements InterfaceC5873g0<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5860c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractC5863d
    /* renamed from: A */
    Collection<V> mo14746A(K k10, Collection<V> collection) {
        return m14791B(k10, (List) collection, null);
    }

    @Override // com.google.common.collect.AbstractC5863d, com.google.common.collect.InterfaceC5884k0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public List<V> mo14739p(K k10) {
        return (List) super.mo14739p(k10);
    }

    @Override // com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    /* renamed from: b */
    public Map<K, Collection<V>> mo14748b() {
        return super.mo14748b();
    }

    @Override // com.google.common.collect.AbstractC5869f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC5863d, com.google.common.collect.InterfaceC5884k0
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    @Override // com.google.common.collect.AbstractC5863d
    /* renamed from: z */
    <E> Collection<E> mo14749z(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }
}
