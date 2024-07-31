package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzgem {
    private final boolean zza;
    private final zzgaa zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgem(boolean z10, zzgaa zzgaaVar, zzgel zzgelVar) {
        this.zza = z10;
        this.zzb = zzgaaVar;
    }

    public final com.google.common.util.concurrent.f zza(Callable callable, Executor executor) {
        return new zzgea(this.zzb, this.zza, executor, callable);
    }
}
