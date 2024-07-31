package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zzcw {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;

    @Deprecated
    public static final zzn zzb;
    private static final zzbp zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;

    @Deprecated
    public Object zzd;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;

    @Deprecated
    public boolean zzk;
    public zzbf zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;
    public static final Object zza = new Object();
    private static final Object zzr = new Object();
    public Object zzc = zza;
    public zzbp zze = zzs;

    static {
        zzar zzarVar = new zzar();
        zzarVar.zza("androidx.media3.common.Timeline");
        zzarVar.zzb(Uri.EMPTY);
        zzs = zzarVar.zzc();
        zzt = Integer.toString(1, 36);
        zzu = Integer.toString(2, 36);
        zzv = Integer.toString(3, 36);
        zzw = Integer.toString(4, 36);
        zzx = Integer.toString(5, 36);
        zzy = Integer.toString(6, 36);
        zzz = Integer.toString(7, 36);
        zzA = Integer.toString(8, 36);
        zzB = Integer.toString(9, 36);
        zzC = Integer.toString(10, 36);
        zzD = Integer.toString(11, 36);
        zzE = Integer.toString(12, 36);
        zzF = Integer.toString(13, 36);
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcv
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcw.class.equals(obj.getClass())) {
            zzcw zzcwVar = (zzcw) obj;
            if (zzfy.zzF(this.zzc, zzcwVar.zzc) && zzfy.zzF(this.zze, zzcwVar.zze) && zzfy.zzF(null, null) && zzfy.zzF(this.zzl, zzcwVar.zzl) && this.zzf == zzcwVar.zzf && this.zzg == zzcwVar.zzg && this.zzh == zzcwVar.zzh && this.zzi == zzcwVar.zzi && this.zzj == zzcwVar.zzj && this.zzm == zzcwVar.zzm && this.zzo == zzcwVar.zzo && this.zzp == zzcwVar.zzp && this.zzq == zzcwVar.zzq) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zzc.hashCode() + 217) * 31) + this.zze.hashCode();
        zzbf zzbfVar = this.zzl;
        int hashCode2 = ((hashCode * 961) + (zzbfVar == null ? 0 : zzbfVar.hashCode())) * 31;
        long j10 = this.zzf;
        int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.zzg;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.zzh;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzm ? 1 : 0);
        long j13 = this.zzo;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.zzp) * 31) + this.zzq) * 31;
    }

    public final zzcw zza(Object obj, zzbp zzbpVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, zzbf zzbfVar, long j13, long j14, int i10, int i11, long j15) {
        this.zzc = obj;
        this.zze = zzbpVar == null ? zzs : zzbpVar;
        this.zzd = null;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = zzbfVar != null;
        this.zzl = zzbfVar;
        this.zzn = 0L;
        this.zzo = j14;
        this.zzp = 0;
        this.zzq = 0;
        this.zzm = false;
        return this;
    }

    public final boolean zzb() {
        zzek.zzf(this.zzk == (this.zzl != null));
        return this.zzl != null;
    }
}
