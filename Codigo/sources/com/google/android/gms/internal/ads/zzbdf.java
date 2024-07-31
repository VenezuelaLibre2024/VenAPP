package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzbdf extends zzgzu implements zzhbf {
    private static final zzbdf zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private zzbep zzi;
    private zzbcx zzk;
    private zzbda zzl;
    private zzbdt zzm;
    private zzbcb zzn;
    private zzbed zzo;
    private zzbfk zzp;
    private zzbck zzq;
    private String zzf = "";
    private int zzh = AdError.NETWORK_ERROR_CODE;
    private zzhac zzj = zzgzu.zzaL();

    static {
        zzbdf zzbdfVar = new zzbdf();
        zzb = zzbdfVar;
        zzgzu.zzaU(zzbdf.class, zzbdfVar);
    }

    private zzbdf() {
    }

    public static zzbde zzd() {
        return (zzbde) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzbdf zzbdfVar, String str) {
        str.getClass();
        zzbdfVar.zzd |= 2;
        zzbdfVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzbdf zzbdfVar, Iterable iterable) {
        zzhac zzhacVar = zzbdfVar.zzj;
        if (!zzhacVar.zzc()) {
            zzbdfVar.zzj = zzgzu.zzaM(zzhacVar);
        }
        zzgxt.zzav(iterable, zzbdfVar.zzj);
    }

    public static /* synthetic */ void zzj(zzbdf zzbdfVar, zzbcx zzbcxVar) {
        zzbcxVar.getClass();
        zzbdfVar.zzk = zzbcxVar;
        zzbdfVar.zzd |= 32;
    }

    public static /* synthetic */ void zzk(zzbdf zzbdfVar, zzbcb zzbcbVar) {
        zzbcbVar.getClass();
        zzbdfVar.zzn = zzbcbVar;
        zzbdfVar.zzd |= RecognitionOptions.QR_CODE;
    }

    public static /* synthetic */ void zzl(zzbdf zzbdfVar, zzbed zzbedVar) {
        zzbedVar.getClass();
        zzbdfVar.zzo = zzbedVar;
        zzbdfVar.zzd |= RecognitionOptions.UPC_A;
    }

    public static /* synthetic */ void zzm(zzbdf zzbdfVar, zzbfk zzbfkVar) {
        zzbfkVar.getClass();
        zzbdfVar.zzp = zzbfkVar;
        zzbdfVar.zzd |= RecognitionOptions.UPC_E;
    }

    public static /* synthetic */ void zzn(zzbdf zzbdfVar, zzbck zzbckVar) {
        zzbckVar.getClass();
        zzbdfVar.zzq = zzbckVar;
        zzbdfVar.zzd |= RecognitionOptions.PDF417;
    }

    public final zzbcb zza() {
        zzbcb zzbcbVar = this.zzn;
        return zzbcbVar == null ? zzbcb.zzc() : zzbcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzbdc.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i11 == 3) {
            return new zzbdf();
        }
        if (i11 == 4) {
            return new zzbde(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbcx zzc() {
        zzbcx zzbcxVar = this.zzk;
        return zzbcxVar == null ? zzbcx.zzc() : zzbcxVar;
    }

    public final String zzf() {
        return this.zzf;
    }
}
