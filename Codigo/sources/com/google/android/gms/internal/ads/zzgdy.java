package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgdy extends zzgdz {
    final /* synthetic */ zzgea zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgdy(zzgea zzgeaVar, Callable callable, Executor executor) {
        super(zzgeaVar, executor);
        this.zza = zzgeaVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final Object zza() {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
