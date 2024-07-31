package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes2.dex */
class v<K, V> extends e<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final K f11174a;

    /* renamed from: b, reason: collision with root package name */
    final V f11175b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(K k10, V v10) {
        this.f11174a = k10;
        this.f11175b = v10;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final K getKey() {
        return this.f11174a;
    }

    @Override // com.google.common.collect.e, java.util.Map.Entry
    public final V getValue() {
        return this.f11175b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
