package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p extends x<Object, Object> {

    /* renamed from: r, reason: collision with root package name */
    static final p f11151r = new p();
    private static final long serialVersionUID = 0;

    private p() {
        super(y.k(), 0);
    }

    private Object readResolve() {
        return f11151r;
    }

    @Override // com.google.common.collect.z, com.google.common.collect.f, com.google.common.collect.k0
    /* renamed from: k */
    public y<Object, Collection<Object>> b() {
        return super.b();
    }
}
