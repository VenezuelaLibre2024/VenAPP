package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatc extends zzgzu implements zzhbf {
    private static final zzatc zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzatc zzatcVar = new zzatc();
        zzb = zzatcVar;
        zzgzu.zzaU(zzatc.class, zzatcVar);
    }

    private zzatc() {
    }

    public static zzatb zza() {
        return (zzatb) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzatc zzatcVar, long j10) {
        zzatcVar.zzd |= 1;
        zzatcVar.zze = j10;
    }

    public static /* synthetic */ void zze(zzatc zzatcVar, long j10) {
        zzatcVar.zzd |= 4;
        zzatcVar.zzg = j10;
    }

    public static /* synthetic */ void zzf(zzatc zzatcVar, long j10) {
        zzatcVar.zzd |= 8;
        zzatcVar.zzh = j10;
    }

    public static /* synthetic */ void zzg(zzatc zzatcVar, long j10) {
        zzatcVar.zzd |= 16;
        zzatcVar.zzi = j10;
    }

    public static /* synthetic */ void zzh(zzatc zzatcVar, long j10) {
        zzatcVar.zzd |= 32;
        zzatcVar.zzj = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzatc();
        }
        if (i11 == 4) {
            return new zzatb(null);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
