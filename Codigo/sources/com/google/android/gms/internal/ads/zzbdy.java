package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbdy extends zzgzu implements zzhbf {
    private static final zzhaa zzb = new zzbdw();
    private static final zzbdy zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgzz zzj = zzgzu.zzaJ();
    private zzbdt zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzbdy zzbdyVar = new zzbdy();
        zzd = zzbdyVar;
        zzgzu.zzaU(zzbdy.class, zzbdyVar);
    }

    private zzbdy() {
    }

    public static /* synthetic */ void zzA(zzbdy zzbdyVar, int i10) {
        zzbdyVar.zzm = i10 - 1;
        zzbdyVar.zze |= 64;
    }

    public static /* synthetic */ void zzB(zzbdy zzbdyVar, int i10) {
        zzbdyVar.zzn = i10 - 1;
        zzbdyVar.zze |= RecognitionOptions.ITF;
    }

    public static /* synthetic */ void zzC(zzbdy zzbdyVar, int i10) {
        zzbdyVar.zzp = i10 - 1;
        zzbdyVar.zze |= RecognitionOptions.UPC_A;
    }

    public static zzbdx zzg() {
        return (zzbdx) zzd.zzaA();
    }

    public static zzbdy zzi(byte[] bArr) {
        return (zzbdy) zzgzu.zzaF(zzd, bArr);
    }

    public static /* synthetic */ void zzl(zzbdy zzbdyVar, long j10) {
        zzbdyVar.zze |= 1;
        zzbdyVar.zzf = j10;
    }

    public static /* synthetic */ void zzm(zzbdy zzbdyVar, long j10) {
        zzbdyVar.zze |= 4;
        zzbdyVar.zzh = j10;
    }

    public static /* synthetic */ void zzn(zzbdy zzbdyVar, long j10) {
        zzbdyVar.zze |= 8;
        zzbdyVar.zzi = j10;
    }

    public static /* synthetic */ void zzo(zzbdy zzbdyVar, Iterable iterable) {
        zzgzz zzgzzVar = zzbdyVar.zzj;
        if (!zzgzzVar.zzc()) {
            zzbdyVar.zzj = zzgzu.zzaK(zzgzzVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbdyVar.zzj.zzh(((zzbcn) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzp(zzbdy zzbdyVar, zzbdt zzbdtVar) {
        zzbdtVar.getClass();
        zzbdyVar.zzk = zzbdtVar;
        zzbdyVar.zze |= 16;
    }

    public static /* synthetic */ void zzq(zzbdy zzbdyVar, int i10) {
        zzbdyVar.zze |= RecognitionOptions.QR_CODE;
        zzbdyVar.zzo = i10;
    }

    public static /* synthetic */ void zzr(zzbdy zzbdyVar, zzbec zzbecVar) {
        zzbdyVar.zzq = zzbecVar.zza();
        zzbdyVar.zze |= RecognitionOptions.UPC_E;
    }

    public static /* synthetic */ void zzs(zzbdy zzbdyVar, long j10) {
        zzbdyVar.zze |= RecognitionOptions.PDF417;
        zzbdyVar.zzr = j10;
    }

    public static /* synthetic */ void zzy(zzbdy zzbdyVar, int i10) {
        zzbdyVar.zzg = i10 - 1;
        zzbdyVar.zze |= 2;
    }

    public static /* synthetic */ void zzz(zzbdy zzbdyVar, int i10) {
        zzbdyVar.zzl = i10 - 1;
        zzbdyVar.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgzy zzgzyVar = zzbdc.zza;
            return zzgzu.zzaR(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzgzyVar, "zzh", "zzi", "zzj", zzbcm.zza, "zzk", "zzl", zzgzyVar, "zzm", zzgzyVar, "zzn", zzgzyVar, "zzo", "zzp", zzgzyVar, "zzq", zzbeb.zza, "zzr"});
        }
        if (i11 == 3) {
            return new zzbdy();
        }
        if (i11 == 4) {
            return new zzbdx(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzbdt zzf() {
        zzbdt zzbdtVar = this.zzk;
        return zzbdtVar == null ? zzbdt.zzd() : zzbdtVar;
    }

    public final zzbec zzj() {
        zzbec zzb2 = zzbec.zzb(this.zzq);
        return zzb2 == null ? zzbec.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzhab(this.zzj, zzb);
    }

    public final int zzt() {
        int zza = zzbdd.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzbdd.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzbdd.zza(this.zzp);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzbdd.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzbdd.zza(this.zzl);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
