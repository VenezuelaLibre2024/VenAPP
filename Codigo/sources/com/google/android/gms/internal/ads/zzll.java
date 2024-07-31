package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzll {
    private final zzcu zza = new zzcu();
    private final zzcw zzb = new zzcw();
    private final zzmp zzc;
    private final zzew zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzli zzh;
    private zzli zzi;
    private zzli zzj;
    private int zzk;
    private Object zzl;
    private long zzm;
    private final zzkr zzn;

    public zzll(zzmp zzmpVar, zzew zzewVar, zzkr zzkrVar) {
        this.zzc = zzmpVar;
        this.zzd = zzewVar;
        this.zzn = zzkrVar;
    }

    private final boolean zzA(zzcx zzcxVar, zzur zzurVar) {
        if (zzC(zzurVar)) {
            return zzcxVar.zze(zzcxVar.zzn(zzurVar.zza, this.zza).zzd, this.zzb, 0L).zzq == zzcxVar.zza(zzurVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzcx zzcxVar) {
        zzli zzliVar = this.zzh;
        if (zzliVar == null) {
            return true;
        }
        int zza = zzcxVar.zza(zzliVar.zzb);
        while (true) {
            zza = zzcxVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzliVar.getClass();
                if (zzliVar.zzg() == null || zzliVar.zzf.zzg) {
                    break;
                }
                zzliVar = zzliVar.zzg();
            }
            zzli zzg = zzliVar.zzg();
            if (zza == -1 || zzg == null || zzcxVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzliVar = zzg;
        }
        boolean zzn = zzn(zzliVar);
        zzliVar.zzf = zzh(zzcxVar, zzliVar.zzf);
        return !zzn;
    }

    private static final boolean zzC(zzur zzurVar) {
        return !zzurVar.zzb() && zzurVar.zze == -1;
    }

    private final long zzs(zzcx zzcxVar, Object obj, int i10) {
        zzcxVar.zzn(obj, this.zza);
        this.zza.zzi(i10);
        this.zza.zzk(i10);
        return 0L;
    }

    private final zzlj zzt(zzcx zzcxVar, zzli zzliVar, long j10) {
        int zze;
        Object obj;
        long j11;
        long j12;
        Object obj2;
        int i10;
        long j13;
        long j14;
        zzlj zzljVar = zzliVar.zzf;
        long zze2 = (zzliVar.zze() + zzljVar.zze) - j10;
        if (zzljVar.zzg) {
            long j15 = 0;
            int zzi = zzcxVar.zzi(zzcxVar.zza(zzljVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i11 = zzcxVar.zzd(zzi, this.zza, true).zzd;
                Object obj3 = this.zza.zzc;
                obj3.getClass();
                long j16 = zzljVar.zza.zzd;
                if (zzcxVar.zze(i11, this.zzb, 0L).zzp == zzi) {
                    Pair zzm = zzcxVar.zzm(this.zzb, this.zza, i11, -9223372036854775807L, Math.max(0L, zze2));
                    if (zzm != null) {
                        obj3 = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzli zzg = zzliVar.zzg();
                        if (zzg == null || !zzg.zzb.equals(obj3)) {
                            j16 = this.zze;
                            this.zze = 1 + j16;
                        } else {
                            j16 = zzg.zzf.zza.zzd;
                        }
                        j14 = longValue;
                        j15 = -9223372036854775807L;
                    }
                } else {
                    j14 = 0;
                }
                zzur zzx = zzx(zzcxVar, obj3, j14, j16, this.zzb, this.zza);
                if (j15 != -9223372036854775807L && zzljVar.zzc != -9223372036854775807L) {
                    zzcxVar.zzn(zzljVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzcxVar, zzx, j15, j14);
            }
        } else {
            zzur zzurVar = zzljVar.zza;
            zzcxVar.zzn(zzurVar.zza, this.zza);
            if (!zzurVar.zzb()) {
                int i12 = zzurVar.zze;
                if (i12 != -1) {
                    this.zza.zzm(i12);
                }
                zzcu zzcuVar = this.zza;
                int i13 = zzurVar.zze;
                zze = zzcuVar.zze(i13);
                zzcuVar.zzn(i13);
                if (zze != this.zza.zza(zzurVar.zze)) {
                    obj2 = zzurVar.zza;
                    i10 = zzurVar.zze;
                    j13 = zzljVar.zze;
                    return zzv(zzcxVar, obj2, i10, zze, j13, zzurVar.zzd);
                }
                zzs(zzcxVar, zzurVar.zza, zzurVar.zze);
                obj = zzurVar.zza;
                j11 = 0;
                j12 = zzljVar.zze;
                return zzw(zzcxVar, obj, j11, j12, zzurVar.zzd);
            }
            i10 = zzurVar.zzb;
            if (this.zza.zza(i10) != -1) {
                zze = this.zza.zzf(i10, zzurVar.zzc);
                if (zze < 0) {
                    obj2 = zzurVar.zza;
                    j13 = zzljVar.zzc;
                    return zzv(zzcxVar, obj2, i10, zze, j13, zzurVar.zzd);
                }
                long j17 = zzljVar.zzc;
                if (j17 == -9223372036854775807L) {
                    zzcw zzcwVar = this.zzb;
                    zzcu zzcuVar2 = this.zza;
                    Pair zzm2 = zzcxVar.zzm(zzcwVar, zzcuVar2, zzcuVar2.zzd, -9223372036854775807L, Math.max(0L, zze2));
                    if (zzm2 != null) {
                        j17 = ((Long) zzm2.second).longValue();
                    }
                }
                zzs(zzcxVar, zzurVar.zza, zzurVar.zzb);
                obj = zzurVar.zza;
                j11 = Math.max(0L, j17);
                j12 = zzljVar.zzc;
                return zzw(zzcxVar, obj, j11, j12, zzurVar.zzd);
            }
        }
        return null;
    }

    private final zzlj zzu(zzcx zzcxVar, zzur zzurVar, long j10, long j11) {
        zzcxVar.zzn(zzurVar.zza, this.zza);
        boolean zzb = zzurVar.zzb();
        Object obj = zzurVar.zza;
        return zzb ? zzv(zzcxVar, obj, zzurVar.zzb, zzurVar.zzc, j10, zzurVar.zzd) : zzw(zzcxVar, obj, j11, j10, zzurVar.zzd);
    }

    private final zzlj zzv(zzcx zzcxVar, Object obj, int i10, int i11, long j10, long j11) {
        zzur zzurVar = new zzur(obj, i10, i11, j11);
        long zzh = zzcxVar.zzn(zzurVar.zza, this.zza).zzh(zzurVar.zzb, zzurVar.zzc);
        if (i11 == this.zza.zze(i10)) {
            this.zza.zzj();
        }
        this.zza.zzn(zzurVar.zzb);
        return new zzlj(zzurVar, (zzh == -9223372036854775807L || zzh > 0) ? 0L : Math.max(0L, (-1) + zzh), j10, -9223372036854775807L, zzh, false, false, false, false);
    }

    private final zzlj zzw(zzcx zzcxVar, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        zzcxVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j16);
        if (zzc != -1) {
            this.zza.zzm(zzc);
        }
        zzcu zzcuVar = this.zza;
        if (zzc == -1) {
            zzcuVar.zzb();
        } else {
            zzcuVar.zzn(zzc);
        }
        zzur zzurVar = new zzur(obj, j12, zzc);
        boolean zzC = zzC(zzurVar);
        boolean zzA = zzA(zzcxVar, zzurVar);
        boolean zzz = zzz(zzcxVar, zzurVar, zzC);
        if (zzc != -1) {
            this.zza.zzn(zzc);
        }
        if (zzc != -1) {
            this.zza.zzi(zzc);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j14 = 0;
            j15 = 0;
        } else {
            j14 = j13;
            j15 = this.zza.zze;
        }
        if (j15 != -9223372036854775807L && j16 >= j15) {
            j16 = Math.max(0L, j15 - 1);
        }
        return new zzlj(zzurVar, j16, j11, j14, j15, false, zzC, zzA, zzz);
    }

    private static zzur zzx(zzcx zzcxVar, Object obj, long j10, long j11, zzcw zzcwVar, zzcu zzcuVar) {
        zzcxVar.zzn(obj, zzcuVar);
        zzcxVar.zze(zzcuVar.zzd, zzcwVar, 0L);
        zzcxVar.zza(obj);
        zzcuVar.zzb();
        zzcxVar.zzn(obj, zzcuVar);
        int zzd = zzcuVar.zzd(j10);
        return zzd == -1 ? new zzur(obj, j11, zzcuVar.zzc(j10)) : new zzur(obj, zzd, zzcuVar.zze(zzd), j11);
    }

    private final void zzy() {
        final zzfzx zzfzxVar = new zzfzx();
        for (zzli zzliVar = this.zzh; zzliVar != null; zzliVar = zzliVar.zzg()) {
            zzfzxVar.zzf(zzliVar.zzf.zza);
        }
        zzli zzliVar2 = this.zzi;
        final zzur zzurVar = zzliVar2 == null ? null : zzliVar2.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlk
            @Override // java.lang.Runnable
            public final void run() {
                zzll.this.zzk(zzfzxVar, zzurVar);
            }
        });
    }

    private final boolean zzz(zzcx zzcxVar, zzur zzurVar, boolean z10) {
        int zza = zzcxVar.zza(zzurVar.zza);
        return !zzcxVar.zze(zzcxVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzj && zzcxVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z10;
    }

    public final zzli zza() {
        zzli zzliVar = this.zzh;
        if (zzliVar == null) {
            return null;
        }
        if (zzliVar == this.zzi) {
            this.zzi = zzliVar.zzg();
        }
        zzliVar.zzn();
        int i10 = this.zzk - 1;
        this.zzk = i10;
        if (i10 == 0) {
            this.zzj = null;
            zzli zzliVar2 = this.zzh;
            this.zzl = zzliVar2.zzb;
            this.zzm = zzliVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzli zzb() {
        zzli zzliVar = this.zzi;
        zzek.zzb(zzliVar);
        this.zzi = zzliVar.zzg();
        zzy();
        zzli zzliVar2 = this.zzi;
        zzek.zzb(zzliVar2);
        return zzliVar2;
    }

    public final zzli zzc(zzlj zzljVar) {
        zzli zzliVar = this.zzj;
        zzli zzd = zzkz.zzd(this.zzn.zza, zzljVar, zzliVar == null ? 1000000000000L : (zzliVar.zze() + zzliVar.zzf.zze) - zzljVar.zzb);
        zzli zzliVar2 = this.zzj;
        if (zzliVar2 != null) {
            zzliVar2.zzo(zzd);
        } else {
            this.zzh = zzd;
            this.zzi = zzd;
        }
        this.zzl = null;
        this.zzj = zzd;
        this.zzk++;
        zzy();
        return zzd;
    }

    public final zzli zzd() {
        return this.zzj;
    }

    public final zzli zze() {
        return this.zzh;
    }

    public final zzli zzf() {
        return this.zzi;
    }

    public final zzlj zzg(long j10, zzly zzlyVar) {
        zzli zzliVar = this.zzj;
        return zzliVar == null ? zzu(zzlyVar.zza, zzlyVar.zzb, zzlyVar.zzc, zzlyVar.zzr) : zzt(zzlyVar.zza, zzliVar, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzlj zzh(com.google.android.gms.internal.ads.zzcx r19, com.google.android.gms.internal.ads.zzlj r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzur r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzur r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcu r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzcu r9 = r0.zza
            r9.zzi(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcu r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzcu r1 = r0.zza
            long r5 = r1.zze
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzcu r1 = r0.zza
            int r4 = r3.zzb
            r1.zzn(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzcu r4 = r0.zza
            r4.zzn(r1)
        L6e:
            com.google.android.gms.internal.ads.zzlj r15 = new com.google.android.gms.internal.ads.zzlj
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzll.zzh(com.google.android.gms.internal.ads.zzcx, com.google.android.gms.internal.ads.zzlj):com.google.android.gms.internal.ads.zzlj");
    }

    public final zzur zzi(zzcx zzcxVar, Object obj, long j10) {
        long j11;
        int zza;
        int i10 = zzcxVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzcxVar.zza(obj2)) == -1 || zzcxVar.zzd(zza, this.zza, false).zzd != i10) {
            zzli zzliVar = this.zzh;
            while (true) {
                if (zzliVar == null) {
                    zzliVar = this.zzh;
                    while (zzliVar != null) {
                        int zza2 = zzcxVar.zza(zzliVar.zzb);
                        if (zza2 == -1 || zzcxVar.zzd(zza2, this.zza, false).zzd != i10) {
                            zzliVar = zzliVar.zzg();
                        }
                    }
                    j11 = this.zze;
                    this.zze = 1 + j11;
                    if (this.zzh == null) {
                        this.zzl = obj;
                        this.zzm = j11;
                    }
                } else {
                    if (zzliVar.zzb.equals(obj)) {
                        break;
                    }
                    zzliVar = zzliVar.zzg();
                }
            }
            j11 = zzliVar.zzf.zza.zzd;
        } else {
            j11 = this.zzm;
        }
        long j12 = j11;
        zzcxVar.zzn(obj, this.zza);
        zzcxVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzcxVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcw zzcwVar = this.zzb;
            if (zza3 < zzcwVar.zzp) {
                return zzx(zzcxVar, obj3, j10, j12, zzcwVar, this.zza);
            }
            zzcxVar.zzd(zza3, this.zza, true);
            this.zza.zzb();
            zzcu zzcuVar = this.zza;
            if (zzcuVar.zzd(zzcuVar.zze) != -1) {
                obj3 = this.zza.zzc;
                obj3.getClass();
            }
            zza3--;
        }
    }

    public final void zzj() {
        if (this.zzk == 0) {
            return;
        }
        zzli zzliVar = this.zzh;
        zzek.zzb(zzliVar);
        this.zzl = zzliVar.zzb;
        this.zzm = zzliVar.zzf.zza.zzd;
        while (zzliVar != null) {
            zzliVar.zzn();
            zzliVar = zzliVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzfzx zzfzxVar, zzur zzurVar) {
        this.zzc.zzS(zzfzxVar.zzi(), zzurVar);
    }

    public final void zzl(long j10) {
        zzli zzliVar = this.zzj;
        if (zzliVar != null) {
            zzliVar.zzm(j10);
        }
    }

    public final boolean zzm(zzup zzupVar) {
        zzli zzliVar = this.zzj;
        return zzliVar != null && zzliVar.zza == zzupVar;
    }

    public final boolean zzn(zzli zzliVar) {
        zzek.zzb(zzliVar);
        boolean z10 = false;
        if (zzliVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzliVar;
        while (zzliVar.zzg() != null) {
            zzliVar = zzliVar.zzg();
            zzliVar.getClass();
            if (zzliVar == this.zzi) {
                this.zzi = this.zzh;
                z10 = true;
            }
            zzliVar.zzn();
            this.zzk--;
        }
        zzli zzliVar2 = this.zzj;
        zzliVar2.getClass();
        zzliVar2.zzo(null);
        zzy();
        return z10;
    }

    public final boolean zzo() {
        zzli zzliVar = this.zzj;
        if (zzliVar == null) {
            return true;
        }
        if (zzliVar.zzf.zzi || !zzliVar.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    public final boolean zzp(zzcx zzcxVar, long j10, long j11) {
        zzlj zzljVar;
        boolean z10;
        zzli zzliVar = null;
        for (zzli zzliVar2 = this.zzh; zzliVar2 != null; zzliVar2 = zzliVar2.zzg()) {
            zzlj zzljVar2 = zzliVar2.zzf;
            if (zzliVar == null) {
                zzljVar = zzh(zzcxVar, zzljVar2);
            } else {
                zzlj zzt = zzt(zzcxVar, zzliVar, j10);
                if (zzt == null) {
                    return !zzn(zzliVar);
                }
                if (zzljVar2.zzb != zzt.zzb || !zzljVar2.zza.equals(zzt.zza)) {
                    return !zzn(zzliVar);
                }
                zzljVar = zzt;
            }
            zzliVar2.zzf = zzljVar.zza(zzljVar2.zzc);
            long j12 = zzljVar2.zze;
            long j13 = zzljVar.zze;
            if (j12 != -9223372036854775807L && j12 != j13) {
                zzliVar2.zzq();
                long j14 = zzljVar.zze;
                long zze = j14 == -9223372036854775807L ? Long.MAX_VALUE : j14 + zzliVar2.zze();
                if (zzliVar2 == this.zzi) {
                    boolean z11 = zzliVar2.zzf.zzf;
                    if (j11 == Long.MIN_VALUE || j11 >= zze) {
                        z10 = true;
                        return zzn(zzliVar2) && !z10;
                    }
                }
                z10 = false;
                if (zzn(zzliVar2)) {
                }
            }
            zzliVar = zzliVar2;
        }
        return true;
    }

    public final boolean zzq(zzcx zzcxVar, int i10) {
        this.zzf = i10;
        return zzB(zzcxVar);
    }

    public final boolean zzr(zzcx zzcxVar, boolean z10) {
        this.zzg = z10;
        return zzB(zzcxVar);
    }
}
