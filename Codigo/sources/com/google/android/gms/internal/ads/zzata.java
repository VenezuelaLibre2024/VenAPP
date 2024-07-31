package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes2.dex */
public final class zzata extends zzgzu implements zzhbf {
    private static final zzata zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = AdError.NETWORK_ERROR_CODE;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = AdError.NETWORK_ERROR_CODE;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzata zzataVar = new zzata();
        zzb = zzataVar;
        zzgzu.zzaU(zzata.class, zzataVar);
    }

    private zzata() {
    }

    public static zzasz zza() {
        return (zzasz) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzata zzataVar, long j10) {
        zzataVar.zzd |= 1;
        zzataVar.zze = j10;
    }

    public static /* synthetic */ void zze(zzata zzataVar, long j10) {
        zzataVar.zzd |= 2;
        zzataVar.zzf = j10;
    }

    public static /* synthetic */ void zzf(zzata zzataVar, long j10) {
        zzataVar.zzd |= 4;
        zzataVar.zzg = j10;
    }

    public static /* synthetic */ void zzg(zzata zzataVar, long j10) {
        zzataVar.zzd |= 8;
        zzataVar.zzh = j10;
    }

    public static /* synthetic */ void zzh(zzata zzataVar) {
        zzataVar.zzd &= -9;
        zzataVar.zzh = -1L;
    }

    public static /* synthetic */ void zzi(zzata zzataVar, long j10) {
        zzataVar.zzd |= 16;
        zzataVar.zzi = j10;
    }

    public static /* synthetic */ void zzj(zzata zzataVar, long j10) {
        zzataVar.zzd |= 32;
        zzataVar.zzj = j10;
    }

    public static /* synthetic */ void zzk(zzata zzataVar, long j10) {
        zzataVar.zzd |= RecognitionOptions.ITF;
        zzataVar.zzl = j10;
    }

    public static /* synthetic */ void zzl(zzata zzataVar, long j10) {
        zzataVar.zzd |= RecognitionOptions.QR_CODE;
        zzataVar.zzm = j10;
    }

    public static /* synthetic */ void zzm(zzata zzataVar, long j10) {
        zzataVar.zzd |= RecognitionOptions.UPC_A;
        zzataVar.zzn = j10;
    }

    public static /* synthetic */ void zzn(zzata zzataVar, long j10) {
        zzataVar.zzd |= RecognitionOptions.PDF417;
        zzataVar.zzp = j10;
    }

    public static /* synthetic */ void zzo(zzata zzataVar, long j10) {
        zzataVar.zzd |= RecognitionOptions.AZTEC;
        zzataVar.zzq = j10;
    }

    public static /* synthetic */ void zzp(zzata zzataVar, long j10) {
        zzataVar.zzd |= 8192;
        zzataVar.zzr = j10;
    }

    public static /* synthetic */ void zzq(zzata zzataVar, long j10) {
        zzataVar.zzd |= 16384;
        zzataVar.zzs = j10;
    }

    public static /* synthetic */ void zzr(zzata zzataVar, long j10) {
        zzataVar.zzd |= RecognitionOptions.TEZ_CODE;
        zzataVar.zzt = j10;
    }

    public static /* synthetic */ void zzs(zzata zzataVar, long j10) {
        zzataVar.zzd |= 65536;
        zzataVar.zzu = j10;
    }

    public static /* synthetic */ void zzt(zzata zzataVar, long j10) {
        zzataVar.zzd |= 131072;
        zzataVar.zzv = j10;
    }

    public static /* synthetic */ void zzu(zzata zzataVar, long j10) {
        zzataVar.zzd |= 262144;
        zzataVar.zzw = j10;
    }

    public static /* synthetic */ void zzv(zzata zzataVar, int i10) {
        zzataVar.zzk = i10 - 1;
        zzataVar.zzd |= 64;
    }

    public static /* synthetic */ void zzw(zzata zzataVar, int i10) {
        zzataVar.zzo = i10 - 1;
        zzataVar.zzd |= RecognitionOptions.UPC_E;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzgzy zzgzyVar = zzatj.zza;
            return zzgzu.zzaR(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgzyVar, "zzl", "zzm", "zzn", "zzo", zzgzyVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i11 == 3) {
            return new zzata();
        }
        if (i11 == 4) {
            return new zzasz(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
