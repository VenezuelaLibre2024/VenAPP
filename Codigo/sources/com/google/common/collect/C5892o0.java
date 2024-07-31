package com.google.common.collect;

import java.io.Serializable;
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.o0 */
/* loaded from: classes2.dex */
public final class C5892o0 extends AbstractC5898r0<Comparable<?>> implements Serializable {

    /* renamed from: a */
    static final C5892o0 f12365a = new C5892o0();
    private static final long serialVersionUID = 0;

    private C5892o0() {
    }

    private Object readResolve() {
        return f12365a;
    }

    @Override // com.google.common.collect.AbstractC5898r0
    /* renamed from: f */
    public <S extends Comparable<?>> AbstractC5898r0<S> mo15026f() {
        return C5910x0.f12407a;
    }

    @Override // com.google.common.collect.AbstractC5898r0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C7159o.m21312o(comparable);
        C7159o.m21312o(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
