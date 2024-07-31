package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzamx implements zzamy {
    private final List zza;
    private final zzaea[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzamx(List list) {
        this.zza = list;
        this.zzb = new zzaea[list.size()];
    }

    private final boolean zzf(zzfp zzfpVar, int i10) {
        if (zzfpVar.zzb() == 0) {
            return false;
        }
        if (zzfpVar.zzm() != i10) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzfp zzfpVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzfpVar, 32)) {
                if (this.zzd != 1 || zzf(zzfpVar, 0)) {
                    int zzd = zzfpVar.zzd();
                    int zzb = zzfpVar.zzb();
                    for (zzaea zzaeaVar : this.zzb) {
                        zzfpVar.zzK(zzd);
                        zzaeaVar.zzr(zzfpVar, zzb);
                    }
                    this.zze += zzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzaoh zzaohVar = (zzaoh) this.zza.get(i10);
            zzaokVar.zzc();
            zzaea zzw = zzacxVar.zzw(zzaokVar.zza(), 3);
            zzak zzakVar = new zzak();
            zzakVar.zzK(zzaokVar.zzb());
            zzakVar.zzW("application/dvbsubs");
            zzakVar.zzL(Collections.singletonList(zzaohVar.zzb));
            zzakVar.zzN(zzaohVar.zza);
            zzw.zzl(zzakVar.zzac());
            this.zzb[i10] = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z10) {
        if (this.zzc) {
            zzek.zzf(this.zzf != -9223372036854775807L);
            for (zzaea zzaeaVar : this.zzb) {
                zzaeaVar.zzt(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j10;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
