package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zziq implements zzmf, zzmh {
    private final int zzb;
    private zzmi zzd;
    private int zze;
    private zzpb zzf;
    private zzel zzg;
    private int zzh;
    private zzwh zzi;
    private zzam[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzmg zzq;
    private final Object zza = new Object();
    private final zzlb zzc = new zzlb();
    private long zzm = Long.MIN_VALUE;
    private zzcx zzp = zzcx.zza;

    public zziq(int i10) {
        this.zzb = i10;
    }

    private final void zzY(long j10, boolean z10) {
        this.zzn = false;
        this.zzl = j10;
        this.zzm = j10;
        zzz(j10, z10);
    }

    protected void zzA() {
    }

    protected void zzB() {
    }

    protected void zzC() {
    }

    protected void zzD() {
    }

    protected void zzE(zzam[] zzamVarArr, long j10, long j11, zzur zzurVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzF() {
        zzek.zzf(this.zzh == 0);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzG(zzam[] zzamVarArr, zzwh zzwhVar, long j10, long j11, zzur zzurVar) {
        zzek.zzf(!this.zzn);
        this.zzi = zzwhVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j10;
        }
        this.zzj = zzamVarArr;
        this.zzk = j11;
        zzE(zzamVarArr, j10, j11, zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzH() {
        zzek.zzf(this.zzh == 0);
        zzlb zzlbVar = this.zzc;
        zzlbVar.zzb = null;
        zzlbVar.zza = null;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzI(long j10) {
        zzY(j10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzJ() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzK(zzmg zzmgVar) {
        synchronized (this.zza) {
            this.zzq = zzmgVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public /* synthetic */ void zzL(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzM(zzcx zzcxVar) {
        if (zzfy.zzF(this.zzp, zzcxVar)) {
            return;
        }
        this.zzp = zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzN() {
        zzek.zzf(this.zzh == 1);
        this.zzh = 2;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzO() {
        zzek.zzf(this.zzh == 2);
        this.zzh = 1;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final boolean zzP() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final boolean zzQ() {
        return this.zzn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzR() {
        if (zzP()) {
            return this.zzn;
        }
        zzwh zzwhVar = this.zzi;
        zzwhVar.getClass();
        return zzwhVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzam[] zzS() {
        zzam[] zzamVarArr = this.zzj;
        zzamVarArr.getClass();
        return zzamVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final int zzbf() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzbg(zzlb zzlbVar, zzih zzihVar, int i10) {
        zzwh zzwhVar = this.zzi;
        zzwhVar.getClass();
        int zza = zzwhVar.zza(zzlbVar, zzihVar, i10);
        if (zza == -4) {
            if (zzihVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j10 = zzihVar.zze + this.zzk;
            zzihVar.zze = j10;
            this.zzm = Math.max(this.zzm, j10);
        } else if (zza == -5) {
            zzam zzamVar = zzlbVar.zza;
            zzamVar.getClass();
            long j11 = zzamVar.zzq;
            if (j11 != Long.MAX_VALUE) {
                zzak zzb = zzamVar.zzb();
                zzb.zzaa(j11 + this.zzk);
                zzlbVar.zza = zzb.zzac();
                return -5;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final long zzbh() {
        return this.zzm;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzlb zzbi() {
        zzlb zzlbVar = this.zzc;
        zzlbVar.zzb = null;
        zzlbVar.zza = null;
        return zzlbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmf, com.google.android.gms.internal.ads.zzmh
    public final int zzbj() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzd(long j10) {
        zzwh zzwhVar = this.zzi;
        zzwhVar.getClass();
        return zzwhVar.zzb(j10 - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public int zze() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzf() {
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzel zzh() {
        zzel zzelVar = this.zzg;
        zzelVar.getClass();
        return zzelVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zziz zzi(Throwable th2, zzam zzamVar, boolean z10, int i10) {
        int i11 = 4;
        if (zzamVar != null && !this.zzo) {
            this.zzo = true;
            try {
                i11 = zzX(zzamVar) & 7;
            } catch (zziz unused) {
            } catch (Throwable th3) {
                this.zzo = false;
                throw th3;
            }
            this.zzo = false;
        }
        return zziz.zzb(th2, zzT(), this.zze, zzamVar, i11, z10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public zzlh zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final zzmh zzl() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzmi zzm() {
        zzmi zzmiVar = this.zzd;
        zzmiVar.getClass();
        return zzmiVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzpb zzn() {
        zzpb zzpbVar = this.zzf;
        zzpbVar.getClass();
        return zzpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final zzwh zzo() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzp() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzq() {
        zzek.zzf(this.zzh == 1);
        zzlb zzlbVar = this.zzc;
        zzlbVar.zzb = null;
        zzlbVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzr(zzmi zzmiVar, zzam[] zzamVarArr, zzwh zzwhVar, long j10, boolean z10, boolean z11, long j11, long j12, zzur zzurVar) {
        zzek.zzf(this.zzh == 0);
        this.zzd = zzmiVar;
        this.zzh = 1;
        zzx(z10, z11);
        zzG(zzamVarArr, zzwhVar, j11, j12, zzurVar);
        zzY(j11, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public /* synthetic */ void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzma
    public void zzt(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzu(int i10, zzpb zzpbVar, zzel zzelVar) {
        this.zze = i10;
        this.zzf = zzpbVar;
        this.zzg = zzelVar;
        zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzv() {
        zzwh zzwhVar = this.zzi;
        zzwhVar.getClass();
        zzwhVar.zzd();
    }

    protected void zzw() {
        throw null;
    }

    protected void zzx(boolean z10, boolean z11) {
    }

    protected void zzy() {
    }

    protected void zzz(long j10, boolean z10) {
        throw null;
    }
}
