package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzajs implements zzajz {
    private final zzajy zza;
    private final long zzb;
    private final long zzc;
    private final zzake zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajs(zzake zzakeVar, long j10, long j11, long j12, long j13, boolean z10) {
        zzek.zzd(j10 >= 0 && j11 > j10);
        this.zzd = zzakeVar;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 == j11 - j10 || z10) {
            this.zzf = j13;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzajy();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    @Override // com.google.android.gms.internal.ads.zzajz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzacv r22) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajs.zzd(com.google.android.gms.internal.ads.zzacv):long");
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final /* bridge */ /* synthetic */ zzadu zze() {
        if (this.zzf != 0) {
            return new zzajr(this, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final void zzg(long j10) {
        this.zzh = Math.max(0L, Math.min(j10, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
