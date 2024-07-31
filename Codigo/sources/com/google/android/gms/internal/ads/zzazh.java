package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzazh implements Runnable {
    final /* synthetic */ zzazi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazh(zzazi zzaziVar) {
        this.zza = zzaziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        boolean z11;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzazi zzaziVar = this.zza;
            z10 = zzaziVar.zzd;
            if (z10) {
                z11 = zzaziVar.zze;
                if (z11) {
                    zzaziVar.zzd = false;
                    zzcec.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzazj) it.next()).zza(false);
                        } catch (Exception e10) {
                            zzcec.zzh("", e10);
                        }
                    }
                }
            }
            zzcec.zze("App is still foreground");
        }
    }
}
