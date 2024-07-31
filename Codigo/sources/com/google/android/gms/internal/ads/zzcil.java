package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzcil implements zzgw {
    private final zzgw zza;
    private final long zzb;
    private final zzgw zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcil(zzgw zzgwVar, int i10, zzgw zzgwVar2) {
        this.zza = zzgwVar;
        this.zzb = i10;
        this.zzc = zzgwVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i10, int i11) {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int zza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + zza;
            this.zzd = j12;
            i12 = zza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < this.zzb) {
            return i12;
        }
        int zza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + zza2;
        this.zzd += zza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final long zzb(zzhb zzhbVar) {
        zzhb zzhbVar2;
        this.zze = zzhbVar.zza;
        long j10 = this.zzb;
        long j11 = zzhbVar.zzf;
        zzhb zzhbVar3 = null;
        if (j11 >= j10) {
            zzhbVar2 = null;
        } else {
            long j12 = zzhbVar.zzg;
            long j13 = j10 - j11;
            if (j12 != -1) {
                j13 = Math.min(j12, j13);
            }
            zzhbVar2 = new zzhb(zzhbVar.zza, null, j11, j11, j13, null, 0);
        }
        long j14 = zzhbVar.zzg;
        if (j14 == -1 || zzhbVar.zzf + j14 > this.zzb) {
            long max = Math.max(this.zzb, zzhbVar.zzf);
            long j15 = zzhbVar.zzg;
            zzhbVar3 = new zzhb(zzhbVar.zza, null, max, max, j15 != -1 ? Math.min(j15, (zzhbVar.zzf + j15) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzhbVar2 != null ? this.zza.zzb(zzhbVar2) : 0L;
        long zzb2 = zzhbVar3 != null ? this.zzc.zzb(zzhbVar3) : 0L;
        this.zzd = zzhbVar.zzf;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final Map zze() {
        return zzgad.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgw
    public final void zzf(zzhy zzhyVar) {
    }
}
