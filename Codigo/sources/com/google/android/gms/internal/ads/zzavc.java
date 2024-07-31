package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzavc implements Runnable {
    final /* synthetic */ zzavd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavc(zzavd zzavdVar) {
        this.zza = zzavdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z10;
        zzawj zzawjVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzavd.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z11 = false;
            try {
                z10 = ((Boolean) zzbgc.zzcq.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
            if (z10) {
                try {
                    zzawjVar = this.zza.zze;
                    zzavd.zza = zzfst.zzb(zzawjVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z11 = z10;
            this.zza.zzb = Boolean.valueOf(z11);
            conditionVariable2 = zzavd.zzc;
            conditionVariable2.open();
        }
    }
}
