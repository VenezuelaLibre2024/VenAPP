package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Queue;

/* loaded from: classes2.dex */
public abstract class zzds extends zzdq implements Queue {
    @Override // java.util.Queue
    public final Object element() {
        return zzd().element();
    }

    public boolean offer(Object obj) {
        return zzd().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return zzd().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return zzd().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return zzd().remove();
    }

    @Override // com.google.android.recaptcha.internal.zzdq
    protected /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }

    protected abstract Queue zzd();
}
