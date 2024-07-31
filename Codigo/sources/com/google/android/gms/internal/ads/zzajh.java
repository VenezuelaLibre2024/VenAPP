package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzajh implements zzacu, zzadu {

    @Deprecated
    public static final zzadb zza = zzajf.zza;
    private zzahe zzA;
    private final zzakp zzb;
    private final int zzc;
    private final zzfp zzd;
    private final zzfp zze;
    private final zzfp zzf;
    private final zzfp zzg;
    private final ArrayDeque zzh;
    private final zzajk zzi;
    private final List zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzfp zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private zzacx zzu;
    private zzajg[] zzv;
    private long[][] zzw;
    private int zzx;
    private long zzy;
    private int zzz;

    @Deprecated
    public zzajh() {
        this(zzakp.zza, 16);
    }

    public zzajh(zzakp zzakpVar, int i10) {
        this.zzb = zzakpVar;
        this.zzc = i10;
        this.zzk = (i10 & 4) != 0 ? 3 : 0;
        this.zzi = new zzajk();
        this.zzj = new ArrayList();
        this.zzg = new zzfp(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzfp(zzgm.zza);
        this.zze = new zzfp(4);
        this.zzf = new zzfp();
        this.zzp = -1;
        this.zzu = zzacx.zza;
        this.zzv = new zzajg[0];
    }

    private static int zzf(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzajp zzajpVar, long j10) {
        int zza2 = zzajpVar.zza(j10);
        return zza2 == -1 ? zzajpVar.zzb(j10) : zza2;
    }

    private static long zzj(zzajp zzajpVar, long j10, long j11) {
        int zzi = zzi(zzajpVar, j10);
        return zzi == -1 ? j11 : Math.min(zzajpVar.zzc[zzi], j11);
    }

    private final void zzk() {
        this.zzk = 0;
        this.zzn = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01af A[LOOP:3: B:85:0x01ad->B:86:0x01af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(long r28) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zzl(long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzy;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0335  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacv r33, com.google.android.gms.internal.ads.zzadr r34) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajh.zzb(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzadr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        if ((this.zzc & 16) == 0) {
            zzacxVar = new zzaks(zzacxVar, this.zzb);
        }
        this.zzu = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        this.zzh.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        if (j10 == 0) {
            if (this.zzk != 3) {
                zzk();
                return;
            } else {
                this.zzi.zzb();
                this.zzj.clear();
                return;
            }
        }
        for (zzajg zzajgVar : this.zzv) {
            zzajp zzajpVar = zzajgVar.zzb;
            int zza2 = zzajpVar.zza(j11);
            if (zza2 == -1) {
                zza2 = zzajpVar.zzb(j11);
            }
            zzajgVar.zze = zza2;
            zzaeb zzaebVar = zzajgVar.zzd;
            if (zzaebVar != null) {
                zzaebVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        return zzajl.zzb(zzacvVar, (this.zzc & 2) != 0);
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j10) {
        long j11;
        long j12;
        int zzb;
        zzajg[] zzajgVarArr = this.zzv;
        if (zzajgVarArr.length == 0) {
            zzadv zzadvVar = zzadv.zza;
            return new zzads(zzadvVar, zzadvVar);
        }
        int i10 = this.zzx;
        long j13 = -1;
        if (i10 != -1) {
            zzajp zzajpVar = zzajgVarArr[i10].zzb;
            int zzi = zzi(zzajpVar, j10);
            if (zzi == -1) {
                zzadv zzadvVar2 = zzadv.zza;
                return new zzads(zzadvVar2, zzadvVar2);
            }
            long j14 = zzajpVar.zzf[zzi];
            j11 = zzajpVar.zzc[zzi];
            if (j14 >= j10 || zzi >= zzajpVar.zzb - 1 || (zzb = zzajpVar.zzb(j10)) == -1 || zzb == zzi) {
                j12 = -9223372036854775807L;
            } else {
                j12 = zzajpVar.zzf[zzb];
                j13 = zzajpVar.zzc[zzb];
            }
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            zzajg[] zzajgVarArr2 = this.zzv;
            if (i11 >= zzajgVarArr2.length) {
                break;
            }
            if (i11 != this.zzx) {
                zzajp zzajpVar2 = zzajgVarArr2[i11].zzb;
                long zzj = zzj(zzajpVar2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    j13 = zzj(zzajpVar2, j12, j13);
                }
                j11 = zzj;
            }
            i11++;
        }
        zzadv zzadvVar3 = new zzadv(j10, j11);
        return j12 == -9223372036854775807L ? new zzads(zzadvVar3, zzadvVar3) : new zzads(zzadvVar3, new zzadv(j12, j13));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
