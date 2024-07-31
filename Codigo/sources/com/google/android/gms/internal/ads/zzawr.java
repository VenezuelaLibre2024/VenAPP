package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzawr implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzaws zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawr(zzaws zzawsVar) {
        this.zza = zzawsVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        long j10;
        zzaws zzawsVar;
        boolean z11;
        long j11;
        long j12;
        zzaws zzawsVar2 = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        if (z10) {
            zzawsVar2.zzb = currentTimeMillis;
            zzawsVar = this.zza;
            z11 = true;
        } else {
            j10 = zzawsVar2.zzc;
            if (j10 > 0) {
                zzaws zzawsVar3 = this.zza;
                j11 = zzawsVar3.zzc;
                if (currentTimeMillis >= j11) {
                    j12 = zzawsVar3.zzc;
                    zzawsVar3.zzd = currentTimeMillis - j12;
                }
            }
            zzawsVar = this.zza;
            z11 = false;
        }
        zzawsVar.zze = z11;
    }
}
