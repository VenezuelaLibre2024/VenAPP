package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c0 */
/* loaded from: classes2.dex */
public final class C5448c0 implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f11138a;

    /* renamed from: b */
    private final /* synthetic */ C5742z f11139b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5448c0(C5742z c5742z) {
        Bundle bundle;
        this.f11139b = c5742z;
        bundle = c5742z.f12090a;
        this.f11138a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11138a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f11138a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
