package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.p */
/* loaded from: classes2.dex */
public class C5893p extends C5909x<Object, Object> {

    /* renamed from: r */
    static final C5893p f12366r = new C5893p();
    private static final long serialVersionUID = 0;

    private C5893p() {
        super(AbstractC5911y.m15111k(), 0);
    }

    private Object readResolve() {
        return f12366r;
    }

    @Override // com.google.common.collect.AbstractC5913z, com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    /* renamed from: k */
    public AbstractC5911y<Object, Collection<Object>> mo14748b() {
        return super.mo14748b();
    }
}
