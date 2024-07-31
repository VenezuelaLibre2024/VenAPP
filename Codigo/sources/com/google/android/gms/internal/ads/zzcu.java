package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcu {
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzm = zzd.zza;
    private static final String zzh = Integer.toString(0, 36);
    private static final String zzi = Integer.toString(1, 36);
    private static final String zzj = Integer.toString(2, 36);
    private static final String zzk = Integer.toString(3, 36);
    private static final String zzl = Integer.toString(4, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzct
    };

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcu.class.equals(obj.getClass())) {
            zzcu zzcuVar = (zzcu) obj;
            if (zzfy.zzF(this.zzb, zzcuVar.zzb) && zzfy.zzF(this.zzc, zzcuVar.zzc) && this.zzd == zzcuVar.zzd && this.zze == zzcuVar.zze && this.zzg == zzcuVar.zzg && zzfy.zzF(this.zzm, zzcuVar.zzm)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zzb;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzc;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzd;
        long j10 = this.zze;
        return (((((hashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.zzg ? 1 : 0)) * 31) + this.zzm.hashCode();
    }

    public final int zza(int i10) {
        return this.zzm.zza(i10).zzd;
    }

    public final int zzb() {
        int i10 = this.zzm.zzc;
        return 0;
    }

    public final int zzc(long j10) {
        return -1;
    }

    public final int zzd(long j10) {
        this.zzm.zzb(-1);
        return -1;
    }

    public final int zze(int i10) {
        return this.zzm.zza(i10).zza(-1);
    }

    public final int zzf(int i10, int i11) {
        return this.zzm.zza(i10).zza(i11);
    }

    public final int zzg() {
        int i10 = this.zzm.zze;
        return 0;
    }

    public final long zzh(int i10, int i11) {
        zzc zza2 = this.zzm.zza(i10);
        if (zza2.zzd != -1) {
            return zza2.zzh[i11];
        }
        return -9223372036854775807L;
    }

    public final long zzi(int i10) {
        long j10 = this.zzm.zza(i10).zzc;
        return 0L;
    }

    public final long zzj() {
        long j10 = this.zzm.zzd;
        return 0L;
    }

    public final long zzk(int i10) {
        long j10 = this.zzm.zza(i10).zzi;
        return 0L;
    }

    public final zzcu zzl(Object obj, Object obj2, int i10, long j10, long j11, zzd zzdVar, boolean z10) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = i10;
        this.zze = j10;
        this.zzf = 0L;
        this.zzm = zzdVar;
        this.zzg = z10;
        return this;
    }

    public final boolean zzm(int i10) {
        zzb();
        if (i10 != -1) {
            return false;
        }
        this.zzm.zzb(-1);
        return false;
    }

    public final boolean zzn(int i10) {
        boolean z10 = this.zzm.zza(i10).zzj;
        return false;
    }
}
