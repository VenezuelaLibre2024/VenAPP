package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfjt {
    private final long zza;
    private long zzc;
    private final zzfjs zzb = new zzfjs();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfjt() {
        long a10 = t.b().a();
        this.zza = a10;
        this.zzc = a10;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfjs zzd() {
        zzfjs zzfjsVar = this.zzb;
        zzfjs clone = zzfjsVar.clone();
        zzfjsVar.zza = false;
        zzfjsVar.zzb = 0;
        return clone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        this.zzc = t.b().a();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
