package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public abstract class zzgei extends zzgeg implements com.google.common.util.concurrent.f {
    @Override // com.google.common.util.concurrent.f
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgeg
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    protected abstract com.google.common.util.concurrent.f zzc();
}
