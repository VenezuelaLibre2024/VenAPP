package com.google.common.collect;

import java.io.Serializable;
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.y0 */
/* loaded from: classes2.dex */
public final class C5912y0<T> extends AbstractC5898r0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final AbstractC5898r0<? super T> f12422a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5912y0(AbstractC5898r0<? super T> abstractC5898r0) {
        this.f12422a = (AbstractC5898r0) C7159o.m21312o(abstractC5898r0);
    }

    @Override // com.google.common.collect.AbstractC5898r0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f12422a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5912y0) {
            return this.f12422a.equals(((C5912y0) obj).f12422a);
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC5898r0
    /* renamed from: f */
    public <S extends T> AbstractC5898r0<S> mo15026f() {
        return this.f12422a;
    }

    public int hashCode() {
        return -this.f12422a.hashCode();
    }

    public String toString() {
        return this.f12422a + ".reverse()";
    }
}
