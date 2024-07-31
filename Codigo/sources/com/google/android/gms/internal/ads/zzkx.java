package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzkx {
    public zzly zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zzkx(zzly zzlyVar) {
        this.zza = zzlyVar;
    }

    public final void zza(int i10) {
        this.zzg = 1 == ((this.zzg ? 1 : 0) | i10);
        this.zzb += i10;
    }

    public final void zzb(int i10) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i10;
    }

    public final void zzc(zzly zzlyVar) {
        this.zzg |= this.zza != zzlyVar;
        this.zza = zzlyVar;
    }

    public final void zzd(int i10) {
        if (this.zzc && this.zzd != 5) {
            zzek.zzd(i10 == 5);
            return;
        }
        this.zzg = true;
        this.zzc = true;
        this.zzd = i10;
    }
}
