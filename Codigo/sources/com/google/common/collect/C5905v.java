package com.google.common.collect;

import java.io.Serializable;

/* renamed from: com.google.common.collect.v */
/* loaded from: classes2.dex */
class C5905v<K, V> extends AbstractC5866e<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final K f12389a;

    /* renamed from: b */
    final V f12390b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5905v(K k10, V v10) {
        this.f12389a = k10;
        this.f12390b = v10;
    }

    @Override // com.google.common.collect.AbstractC5866e, java.util.Map.Entry
    public final K getKey() {
        return this.f12389a;
    }

    @Override // com.google.common.collect.AbstractC5866e, java.util.Map.Entry
    public final V getValue() {
        return this.f12390b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
