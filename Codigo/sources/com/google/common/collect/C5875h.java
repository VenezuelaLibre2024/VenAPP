package com.google.common.collect;

import java.io.Serializable;
import p082eb.C7155k;
import p082eb.C7159o;
import p082eb.InterfaceC7151g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.h */
/* loaded from: classes2.dex */
public final class C5875h<F, T> extends AbstractC5898r0<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final InterfaceC7151g<F, ? extends T> f12314a;

    /* renamed from: b */
    final AbstractC5898r0<T> f12315b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5875h(InterfaceC7151g<F, ? extends T> interfaceC7151g, AbstractC5898r0<T> abstractC5898r0) {
        this.f12314a = (InterfaceC7151g) C7159o.m21312o(interfaceC7151g);
        this.f12315b = (AbstractC5898r0) C7159o.m21312o(abstractC5898r0);
    }

    @Override // com.google.common.collect.AbstractC5898r0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f12315b.compare(this.f12314a.apply(f10), this.f12314a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5875h)) {
            return false;
        }
        C5875h c5875h = (C5875h) obj;
        return this.f12314a.equals(c5875h.f12314a) && this.f12315b.equals(c5875h.f12315b);
    }

    public int hashCode() {
        return C7155k.m21290b(this.f12314a, this.f12315b);
    }

    public String toString() {
        return this.f12315b + ".onResultOf(" + this.f12314a + ")";
    }
}
