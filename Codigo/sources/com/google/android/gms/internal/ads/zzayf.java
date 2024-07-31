package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzayf extends zzgzu implements zzhbf {
    private static final zzayf zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzayf zzayfVar = new zzayf();
        zzb = zzayfVar;
        zzgzu.zzaU(zzayf.class, zzayfVar);
    }

    private zzayf() {
    }

    public static zzaye zze() {
        return (zzaye) zzb.zzaA();
    }

    public static zzayf zzg() {
        return zzb;
    }

    public static zzayf zzh(zzgyl zzgylVar) {
        return (zzayf) zzgzu.zzaE(zzb, zzgylVar);
    }

    public static zzayf zzi(zzgyl zzgylVar, zzgzf zzgzfVar) {
        return (zzayf) zzgzu.zzaG(zzb, zzgylVar, zzgzfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzayf zzayfVar, String str) {
        str.getClass();
        zzayfVar.zzd |= 1;
        zzayfVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzayf zzayfVar, long j10) {
        zzayfVar.zzd |= 16;
        zzayfVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzayf zzayfVar, String str) {
        str.getClass();
        zzayfVar.zzd |= 2;
        zzayfVar.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzayf zzayfVar, long j10) {
        zzayfVar.zzd |= 4;
        zzayfVar.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzayf zzayfVar, long j10) {
        zzayfVar.zzd |= 8;
        zzayfVar.zzh = j10;
    }

    public final long zza() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgzu
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgzu.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzayf();
        }
        zzayd zzaydVar = null;
        if (i11 == 4) {
            return new zzaye(zzaydVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
