package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgea extends zzgdm {
    private zzgdz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgea(zzfzv zzfzvVar, boolean z10, Executor executor, Callable callable) {
        super(zzfzvVar, z10, false);
        this.zza = new zzgdy(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzf(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzq() {
        zzgdz zzgdzVar = this.zza;
        if (zzgdzVar != null) {
            zzgdzVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    final void zzu() {
        zzgdz zzgdzVar = this.zza;
        if (zzgdzVar != null) {
            zzgdzVar.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgdm
    public final void zzy(int i10) {
        super.zzy(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }
}
