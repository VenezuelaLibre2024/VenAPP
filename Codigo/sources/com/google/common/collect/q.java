package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class q extends b0<Object, Object> {
    private static final long serialVersionUID = 0;

    /* renamed from: t */
    static final q f11152t = new q();

    private q() {
        super(y.k(), 0, null);
    }

    private Object readResolve() {
        return f11152t;
    }

    @Override // com.google.common.collect.z, com.google.common.collect.f, com.google.common.collect.k0
    /* renamed from: k */
    public y<Object, Collection<Object>> b() {
        return super.b();
    }
}
