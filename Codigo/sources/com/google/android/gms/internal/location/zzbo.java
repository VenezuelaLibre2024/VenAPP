package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbo implements r, zzcs {
    final /* synthetic */ zzbp zza;
    private final zzbn zzb;
    private k zzc;
    private boolean zzd = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbo(zzbp zzbpVar, k kVar, zzbn zzbnVar) {
        this.zza = zzbpVar;
        this.zzc = kVar;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        k.a b10;
        boolean z10;
        zzda zzdaVar = (zzda) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            b10 = this.zzc.b();
            z10 = this.zzd;
            this.zzc.a();
        }
        if (b10 == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            this.zzb.zza(zzdaVar, b10, z10, taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized k zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
        k.a<?> b10;
        synchronized (this) {
            this.zzd = false;
            b10 = this.zzc.b();
        }
        if (b10 != null) {
            this.zza.doUnregisterEventListener(b10, 2441);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(k kVar) {
        k kVar2 = this.zzc;
        if (kVar2 != kVar) {
            kVar2.a();
            this.zzc = kVar;
        }
    }
}
