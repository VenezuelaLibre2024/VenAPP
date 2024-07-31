package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.n */
/* loaded from: classes2.dex */
public final class C5889n<T> extends AbstractC5898r0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator<T> f12360a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5889n(Comparator<T> comparator) {
        this.f12360a = (Comparator) C7159o.m21312o(comparator);
    }

    @Override // com.google.common.collect.AbstractC5898r0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f12360a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5889n) {
            return this.f12360a.equals(((C5889n) obj).f12360a);
        }
        return false;
    }

    public int hashCode() {
        return this.f12360a.hashCode();
    }

    public String toString() {
        return this.f12360a.toString();
    }
}
