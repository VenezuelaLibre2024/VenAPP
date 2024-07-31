package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcii implements zzlc {
    private final zzyx zzb = new zzyx(true, 65536);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    @Override // com.google.android.gms.internal.ads.zzlc
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ void zze(zzcx zzcxVar, zzur zzurVar, zzmf[] zzmfVarArr, zzws zzwsVar, zzyi[] zzyiVarArr) {
        int i10 = 0;
        this.zzg = 0;
        while (true) {
            int length = zzmfVarArr.length;
            if (i10 >= 2) {
                this.zzb.zzf(this.zzg);
                return;
            } else {
                if (zzyiVarArr[i10] != null) {
                    this.zzg += zzmfVarArr[i10].zzbj() != 1 ? 131072000 : 13107200;
                }
                i10++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final boolean zzg(long j10, long j11, float f10) {
        boolean z10 = true;
        char c10 = j11 > this.zzd ? (char) 0 : j11 < this.zzc ? (char) 2 : (char) 1;
        int zza = this.zzb.zza();
        int i10 = this.zzg;
        if (c10 != 2 && (c10 != 1 || !this.zzh || zza >= i10)) {
            z10 = false;
        }
        this.zzh = z10;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final /* synthetic */ boolean zzh(zzcx zzcxVar, zzur zzurVar, long j10, float f10, boolean z10, long j11) {
        long j12 = z10 ? this.zzf : this.zze;
        return j12 <= 0 || j10 >= j12;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final zzyx zzi() {
        return this.zzb;
    }

    final void zzj(boolean z10) {
        this.zzg = 0;
        this.zzh = false;
        if (z10) {
            this.zzb.zze();
        }
    }

    public final synchronized void zzk(int i10) {
        this.zze = i10 * 1000;
    }

    public final synchronized void zzl(int i10) {
        this.zzf = i10 * 1000;
    }

    public final synchronized void zzm(int i10) {
        this.zzd = i10 * 1000;
    }

    public final synchronized void zzn(int i10) {
        this.zzc = i10 * 1000;
    }
}
