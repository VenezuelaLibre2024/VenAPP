package com.google.common.collect;

import java.io.Serializable;
import p082eb.C7159o;

/* renamed from: com.google.common.collect.x0 */
/* loaded from: classes2.dex */
final class C5910x0 extends AbstractC5898r0<Comparable<?>> implements Serializable {

    /* renamed from: a */
    static final C5910x0 f12407a = new C5910x0();
    private static final long serialVersionUID = 0;

    private C5910x0() {
    }

    private Object readResolve() {
        return f12407a;
    }

    @Override // com.google.common.collect.AbstractC5898r0
    /* renamed from: f */
    public <S extends Comparable<?>> AbstractC5898r0<S> mo15026f() {
        return AbstractC5898r0.m15040c();
    }

    @Override // com.google.common.collect.AbstractC5898r0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C7159o.m21312o(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
