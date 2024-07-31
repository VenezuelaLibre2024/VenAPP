package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c0 implements Iterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<String> f10018a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ z f10019b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(z zVar) {
        Bundle bundle;
        this.f10019b = zVar;
        bundle = zVar.f10875a;
        this.f10018a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10018a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f10018a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
