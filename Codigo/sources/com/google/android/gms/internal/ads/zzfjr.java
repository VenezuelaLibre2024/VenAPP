package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class zzfjr {
    private final zzfiv zza;
    private final zzfjp zzb;
    private final zzfir zzc;
    private zzfjx zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfjr(zzfiv zzfivVar, zzfir zzfirVar, zzfjp zzfjpVar) {
        this.zza = zzfivVar;
        this.zzc = zzfirVar;
        this.zzb = zzfjpVar;
        zzfirVar.zzb(new zzfjm(this));
    }

    public final synchronized void zzh() {
        if (((Boolean) a0.c().zza(zzbgc.zzgp)).booleanValue() && !t.q().zzi().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfjq zzfjqVar = (zzfjq) this.zzd.pollFirst();
                if (zzfjqVar == null || (zzfjqVar.zza() != null && this.zza.zze(zzfjqVar.zza()))) {
                    zzfjx zzfjxVar = new zzfjx(this.zza, this.zzb, zzfjqVar);
                    this.zze = zzfjxVar;
                    zzfjxVar.zzd(new zzfjn(this, zzfjqVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized com.google.common.util.concurrent.f zza(zzfjq zzfjqVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfjqVar);
    }

    public final synchronized void zze(zzfjq zzfjqVar) {
        this.zzd.add(zzfjqVar);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
