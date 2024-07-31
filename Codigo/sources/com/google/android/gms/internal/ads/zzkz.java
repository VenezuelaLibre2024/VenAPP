package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkz implements Handler.Callback, zzuo, zzyn, zzlw, zziw, zzlz {
    private boolean zzB;
    private boolean zzE;
    private int zzF;
    private zzky zzG;
    private long zzH;
    private int zzI;
    private boolean zzJ;
    private zziz zzK;
    private final zzjk zzM;
    private final zziu zzN;
    private final zzmf[] zza;
    private final Set zzb;
    private final zzmh[] zzc;
    private final zzyo zzd;
    private final zzyp zze;
    private final zzlc zzf;
    private final zzyw zzg;
    private final zzew zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzcw zzk;
    private final zzcu zzl;
    private final long zzm;
    private final zzix zzn;
    private final ArrayList zzo;
    private final zzel zzp;
    private final zzll zzq;
    private final zzlx zzr;
    private final long zzs;
    private zzmj zzt;
    private zzly zzu;
    private zzkx zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzz;
    private int zzC = 0;
    private boolean zzD = false;
    private boolean zzx = false;
    private long zzL = -9223372036854775807L;
    private long zzA = -9223372036854775807L;

    public zzkz(zzmf[] zzmfVarArr, zzyo zzyoVar, zzyp zzypVar, zzlc zzlcVar, zzyw zzywVar, int i10, boolean z10, zzmp zzmpVar, zzmj zzmjVar, zziu zziuVar, long j10, boolean z11, Looper looper, zzel zzelVar, zzjk zzjkVar, zzpb zzpbVar, Looper looper2) {
        this.zzM = zzjkVar;
        this.zza = zzmfVarArr;
        this.zzd = zzyoVar;
        this.zze = zzypVar;
        this.zzf = zzlcVar;
        this.zzg = zzywVar;
        this.zzt = zzmjVar;
        this.zzN = zziuVar;
        this.zzs = j10;
        this.zzp = zzelVar;
        this.zzm = zzlcVar.zza();
        zzlcVar.zzf();
        zzly zzg = zzly.zzg(zzypVar);
        this.zzu = zzg;
        this.zzv = new zzkx(zzg);
        int length = zzmfVarArr.length;
        this.zzc = new zzmh[2];
        zzmg zzd = zzyoVar.zzd();
        for (int i11 = 0; i11 < 2; i11++) {
            zzmfVarArr[i11].zzu(i11, zzpbVar, zzelVar);
            this.zzc[i11] = zzmfVarArr[i11].zzl();
            this.zzc[i11].zzK(zzd);
        }
        this.zzn = new zzix(this, zzelVar);
        this.zzo = new ArrayList();
        this.zzb = Collections.newSetFromMap(new IdentityHashMap());
        this.zzk = new zzcw();
        this.zzl = new zzcu();
        zzyoVar.zzs(this, zzywVar);
        this.zzJ = true;
        zzew zzb = zzelVar.zzb(looper, null);
        this.zzq = new zzll(zzmpVar, zzb, new zzkr(this));
        this.zzr = new zzlx(this, zzmpVar, zzb, zzpbVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.zzi = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.zzj = looper3;
        this.zzh = zzelVar.zzb(looper3, this);
    }

    private final void zzA(zzmf zzmfVar) {
        if (zzaf(zzmfVar)) {
            this.zzn.zzd(zzmfVar);
            zzam(zzmfVar);
            zzmfVar.zzq();
            this.zzF--;
        }
    }

    private final void zzB() {
        int length = this.zza.length;
        zzC(new boolean[2], this.zzq.zzf().zzf());
    }

    private final void zzC(boolean[] zArr, long j10) {
        zzli zzf = this.zzq.zzf();
        zzyp zzi = zzf.zzi();
        int i10 = 0;
        while (true) {
            int length = this.zza.length;
            if (i10 >= 2) {
                break;
            }
            if (!zzi.zzb(i10) && this.zzb.remove(this.zza[i10])) {
                this.zza[i10].zzH();
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i11 >= 2) {
                zzf.zzg = true;
                return;
            }
            if (zzi.zzb(i11)) {
                boolean z10 = zArr[i11];
                zzmf zzmfVar = this.zza[i11];
                if (!zzaf(zzmfVar)) {
                    zzll zzllVar = this.zzq;
                    zzli zzf2 = zzllVar.zzf();
                    boolean z11 = zzf2 == zzllVar.zze();
                    zzyp zzi2 = zzf2.zzi();
                    zzmi zzmiVar = zzi2.zzb[i11];
                    zzam[] zzak = zzak(zzi2.zzc[i11]);
                    boolean z12 = zzai() && this.zzu.zze == 3;
                    boolean z13 = !z10 && z12;
                    this.zzF++;
                    this.zzb.add(zzmfVar);
                    zzmfVar.zzr(zzmiVar, zzak, zzf2.zzc[i11], this.zzH, z13, z11, j10, zzf2.zze(), zzf2.zzf.zza);
                    zzmfVar.zzt(11, new zzks(this));
                    this.zzn.zze(zzmfVar);
                    if (z12) {
                        zzmfVar.zzN();
                    }
                }
            }
            i11++;
        }
    }

    private final void zzD(IOException iOException, int i10) {
        zzll zzllVar = this.zzq;
        zziz zzc = zziz.zzc(iOException, i10);
        zzli zze = zzllVar.zze();
        if (zze != null) {
            zzc = zzc.zza(zze.zzf.zza);
        }
        zzff.zzd("ExoPlayerImplInternal", "Playback error", zzc);
        zzW(false, false);
        this.zzu = this.zzu.zzd(zzc);
    }

    private final void zzE(boolean z10) {
        zzli zzd = this.zzq.zzd();
        zzur zzurVar = zzd == null ? this.zzu.zzb : zzd.zzf.zza;
        boolean z11 = !this.zzu.zzk.equals(zzurVar);
        if (z11) {
            this.zzu = this.zzu.zza(zzurVar);
        }
        zzly zzlyVar = this.zzu;
        zzlyVar.zzp = zzd == null ? zzlyVar.zzr : zzd.zzc();
        this.zzu.zzq = zzt();
        if ((z11 || z10) && zzd != null && zzd.zzd) {
            zzZ(zzd.zzf.zza, zzd.zzh(), zzd.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0387: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:136:0x0386 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x039f  */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82, types: [int] */
    /* JADX WARN: Type inference failed for: r1v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzF(com.google.android.gms.internal.ads.zzcx r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.zzF(com.google.android.gms.internal.ads.zzcx, boolean):void");
    }

    private final void zzG(zzcg zzcgVar, boolean z10) {
        zzH(zzcgVar, zzcgVar.zzc, true, z10);
    }

    private final void zzH(zzcg zzcgVar, float f10, boolean z10, boolean z11) {
        int i10;
        zzkz zzkzVar = this;
        if (z10) {
            if (z11) {
                zzkzVar.zzv.zza(1);
            }
            zzly zzlyVar = zzkzVar.zzu;
            zzkzVar = this;
            zzkzVar.zzu = new zzly(zzlyVar.zza, zzlyVar.zzb, zzlyVar.zzc, zzlyVar.zzd, zzlyVar.zze, zzlyVar.zzf, zzlyVar.zzg, zzlyVar.zzh, zzlyVar.zzi, zzlyVar.zzj, zzlyVar.zzk, zzlyVar.zzl, zzlyVar.zzm, zzcgVar, zzlyVar.zzp, zzlyVar.zzq, zzlyVar.zzr, zzlyVar.zzs, false);
        }
        float f11 = zzcgVar.zzc;
        zzli zze = zzkzVar.zzq.zze();
        while (true) {
            i10 = 0;
            if (zze == null) {
                break;
            }
            zzyi[] zzyiVarArr = zze.zzi().zzc;
            int length = zzyiVarArr.length;
            while (i10 < length) {
                zzyi zzyiVar = zzyiVarArr[i10];
                i10++;
            }
            zze = zze.zzg();
        }
        zzmf[] zzmfVarArr = zzkzVar.zza;
        int length2 = zzmfVarArr.length;
        while (i10 < 2) {
            zzmf zzmfVar = zzmfVarArr[i10];
            if (zzmfVar != null) {
                zzmfVar.zzL(f10, zzcgVar.zzc);
            }
            i10++;
        }
    }

    private final void zzI() {
        long zze;
        long j10;
        boolean z10 = false;
        if (zzae()) {
            zzli zzd = this.zzq.zzd();
            long zzu = zzu(zzd.zzd());
            if (zzd == this.zzq.zze()) {
                zze = this.zzH;
                j10 = zzd.zze();
            } else {
                zze = this.zzH - zzd.zze();
                j10 = zzd.zzf.zzb;
            }
            long j11 = zze - j10;
            boolean zzg = this.zzf.zzg(j11, zzu, this.zzn.zzc().zzc);
            if (zzg || zzu >= 500000 || this.zzm <= 0) {
                z10 = zzg;
            } else {
                this.zzq.zze().zza.zzj(this.zzu.zzr, false);
                z10 = this.zzf.zzg(j11, zzu, this.zzn.zzc().zzc);
            }
        }
        this.zzB = z10;
        if (z10) {
            this.zzq.zzd().zzk(this.zzH, this.zzn.zzc().zzc, this.zzA);
        }
        zzY();
    }

    private final void zzJ() {
        boolean z10;
        this.zzv.zzc(this.zzu);
        z10 = this.zzv.zzg;
        if (z10) {
            zzjk zzjkVar = this.zzM;
            zzjkVar.zza.zzT(this.zzv);
            this.zzv = new zzkx(this.zzu);
        }
    }

    private final void zzK() {
        int i10;
        float f10 = this.zzn.zzc().zzc;
        zzll zzllVar = this.zzq;
        zzli zzf = zzllVar.zzf();
        boolean z10 = true;
        for (zzli zze = zzllVar.zze(); zze != null && zze.zzd; zze = zze.zzg()) {
            zzyp zzj = zze.zzj(f10, this.zzu.zza);
            zzyp zzi = zze.zzi();
            boolean z11 = false;
            if (zzi != null) {
                if (zzi.zzc.length == zzj.zzc.length) {
                    for (int i11 = 0; i11 < zzj.zzc.length; i11++) {
                        if (zzj.zza(zzi, i11)) {
                        }
                    }
                    if (zze != zzf) {
                        z11 = true;
                    }
                    z10 &= z11;
                }
            }
            if (z10) {
                zzll zzllVar2 = this.zzq;
                zzli zze2 = zzllVar2.zze();
                boolean zzn = zzllVar2.zzn(zze2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                long zzb = zze2.zzb(zzj, this.zzu.zzr, zzn, zArr);
                zzly zzlyVar = this.zzu;
                boolean z12 = (zzlyVar.zze == 4 || zzb == zzlyVar.zzr) ? false : true;
                zzly zzlyVar2 = this.zzu;
                i10 = 2;
                this.zzu = zzz(zzlyVar2.zzb, zzb, zzlyVar2.zzc, zzlyVar2.zzd, z12, 5);
                if (z12) {
                    zzO(zzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (true) {
                    zzmf[] zzmfVarArr = this.zza;
                    int length3 = zzmfVarArr.length;
                    if (i12 >= 2) {
                        break;
                    }
                    zzmf zzmfVar = zzmfVarArr[i12];
                    boolean zzaf = zzaf(zzmfVar);
                    zArr2[i12] = zzaf;
                    zzwh zzwhVar = zze2.zzc[i12];
                    if (zzaf) {
                        if (zzwhVar != zzmfVar.zzo()) {
                            zzA(zzmfVar);
                        } else if (zArr[i12]) {
                            zzmfVar.zzI(this.zzH);
                        }
                    }
                    i12++;
                }
                zzC(zArr2, this.zzH);
            } else {
                i10 = 2;
                this.zzq.zzn(zze);
                if (zze.zzd) {
                    zze.zza(zzj, Math.max(zze.zzf.zzb, this.zzH - zze.zze()), false);
                }
            }
            zzE(true);
            if (this.zzu.zze != 4) {
                zzI();
                zzaa();
                this.zzh.zzi(i10);
                return;
            }
            return;
        }
    }

    private final void zzL() {
        zzK();
        zzR(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r2.equals(r32.zzu.zzb) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzM(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.zzM(boolean, boolean, boolean, boolean):void");
    }

    private final void zzN() {
        zzli zze = this.zzq.zze();
        boolean z10 = false;
        if (zze != null && zze.zzf.zzh && this.zzx) {
            z10 = true;
        }
        this.zzy = z10;
    }

    private final void zzO(long j10) {
        zzli zze = this.zzq.zze();
        long zze2 = j10 + (zze == null ? 1000000000000L : zze.zze());
        this.zzH = zze2;
        this.zzn.zzf(zze2);
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzmf zzmfVar = zzmfVarArr[i10];
            if (zzaf(zzmfVar)) {
                zzmfVar.zzI(this.zzH);
            }
        }
        for (zzli zze3 = this.zzq.zze(); zze3 != null; zze3 = zze3.zzg()) {
            for (zzyi zzyiVar : zze3.zzi().zzc) {
            }
        }
    }

    private final void zzP(zzcx zzcxVar, zzcx zzcxVar2) {
        if (zzcxVar.zzo() && zzcxVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
        } else {
            Object obj = ((zzkw) this.zzo.get(size)).zzb;
            int i10 = zzfy.zza;
            throw null;
        }
    }

    private final void zzQ(long j10, long j11) {
        this.zzh.zzj(2, j10 + j11);
    }

    private final void zzR(boolean z10) {
        zzur zzurVar = this.zzq.zze().zzf.zza;
        long zzw = zzw(zzurVar, this.zzu.zzr, true, false);
        if (zzw != this.zzu.zzr) {
            zzly zzlyVar = this.zzu;
            this.zzu = zzz(zzurVar, zzw, zzlyVar.zzc, zzlyVar.zzd, z10, 5);
        }
    }

    private final void zzS(zzcg zzcgVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzcgVar);
    }

    private final void zzT(boolean z10, int i10, boolean z11, int i11) {
        this.zzv.zza(z11 ? 1 : 0);
        this.zzv.zzb(i11);
        this.zzu = this.zzu.zzc(z10, i10);
        zzac(false, false);
        for (zzli zze = this.zzq.zze(); zze != null; zze = zze.zzg()) {
            for (zzyi zzyiVar : zze.zzi().zzc) {
            }
        }
        if (!zzai()) {
            zzX();
            zzaa();
            return;
        }
        int i12 = this.zzu.zze;
        if (i12 == 3) {
            zzV();
            this.zzh.zzi(2);
        } else if (i12 == 2) {
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int i10) {
        zzly zzlyVar = this.zzu;
        if (zzlyVar.zze != i10) {
            if (i10 != 2) {
                this.zzL = -9223372036854775807L;
            }
            this.zzu = zzlyVar.zze(i10);
        }
    }

    private final void zzV() {
        zzac(false, false);
        this.zzn.zzh();
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzmf zzmfVar = zzmfVarArr[i10];
            if (zzaf(zzmfVar)) {
                zzmfVar.zzN();
            }
        }
    }

    private final void zzW(boolean z10, boolean z11) {
        zzM(z10 || !this.zzE, false, true, false);
        this.zzv.zza(z11 ? 1 : 0);
        this.zzf.zzd();
        zzU(1);
    }

    private final void zzX() {
        this.zzn.zzi();
        zzmf[] zzmfVarArr = this.zza;
        int length = zzmfVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            zzmf zzmfVar = zzmfVarArr[i10];
            if (zzaf(zzmfVar)) {
                zzam(zzmfVar);
            }
        }
    }

    private final void zzY() {
        zzli zzd = this.zzq.zzd();
        boolean z10 = this.zzB || (zzd != null && zzd.zza.zzp());
        zzly zzlyVar = this.zzu;
        if (z10 != zzlyVar.zzg) {
            this.zzu = new zzly(zzlyVar.zza, zzlyVar.zzb, zzlyVar.zzc, zzlyVar.zzd, zzlyVar.zze, zzlyVar.zzf, z10, zzlyVar.zzh, zzlyVar.zzi, zzlyVar.zzj, zzlyVar.zzk, zzlyVar.zzl, zzlyVar.zzm, zzlyVar.zzn, zzlyVar.zzp, zzlyVar.zzq, zzlyVar.zzr, zzlyVar.zzs, false);
        }
    }

    private final void zzZ(zzur zzurVar, zzws zzwsVar, zzyp zzypVar) {
        zzcx zzcxVar = this.zzu.zza;
        zzyi[] zzyiVarArr = zzypVar.zzc;
        this.zzf.zze(zzcxVar, zzurVar, this.zza, zzwsVar, zzyiVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        if (r3 > 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r5 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        if (r2 < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        if (r2 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
    
        if (r0 >= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c7, code lost:
    
        if (r3 >= r11.zzo.size()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        r0 = (com.google.android.gms.internal.ads.zzkw) r11.zzo.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        r11.zzI = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b0, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
    
        if (r3 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b4, code lost:
    
        r5 = (com.google.android.gms.internal.ads.zzkw) r11.zzo.get(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a4, code lost:
    
        r5 = (com.google.android.gms.internal.ads.zzkw) r11.zzo.get(r3 - 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b2 -> B:38:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaa() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.zzaa():void");
    }

    private final void zzab(zzcx zzcxVar, zzur zzurVar, zzcx zzcxVar2, zzur zzurVar2, long j10, boolean z10) {
        if (!zzaj(zzcxVar, zzurVar)) {
            zzcg zzcgVar = zzurVar.zzb() ? zzcg.zza : this.zzu.zzn;
            if (this.zzn.zzc().equals(zzcgVar)) {
                return;
            }
            zzS(zzcgVar);
            zzH(this.zzu.zzn, zzcgVar.zzc, false, false);
            return;
        }
        zzcxVar.zze(zzcxVar.zzn(zzurVar.zza, this.zzl).zzd, this.zzk, 0L);
        zziu zziuVar = this.zzN;
        zzbf zzbfVar = this.zzk.zzl;
        int i10 = zzfy.zza;
        zziuVar.zzd(zzbfVar);
        if (j10 != -9223372036854775807L) {
            this.zzN.zze(zzs(zzcxVar, zzurVar.zza, j10));
            return;
        }
        if (!zzfy.zzF(!zzcxVar2.zzo() ? zzcxVar2.zze(zzcxVar2.zzn(zzurVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc) || z10) {
            this.zzN.zze(-9223372036854775807L);
        }
    }

    private final void zzac(boolean z10, boolean z11) {
        this.zzz = z10;
        this.zzA = z11 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    private final synchronized void zzad(zzfxu zzfxuVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!Boolean.valueOf(((zzkp) zzfxuVar).zza.zzw).booleanValue() && j10 > 0) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzae() {
        zzli zzd = this.zzq.zzd();
        return (zzd == null || zzd.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzaf(zzmf zzmfVar) {
        return zzmfVar.zzbf() != 0;
    }

    private final boolean zzag() {
        zzli zze = this.zzq.zze();
        long j10 = zze.zzf.zze;
        if (!zze.zzd) {
            return false;
        }
        if (j10 == -9223372036854775807L || this.zzu.zzr < j10) {
            return true;
        }
        return !zzai();
    }

    private static boolean zzah(zzly zzlyVar, zzcu zzcuVar) {
        zzur zzurVar = zzlyVar.zzb;
        zzcx zzcxVar = zzlyVar.zza;
        return zzcxVar.zzo() || zzcxVar.zzn(zzurVar.zza, zzcuVar).zzg;
    }

    private final boolean zzai() {
        zzly zzlyVar = this.zzu;
        return zzlyVar.zzl && zzlyVar.zzm == 0;
    }

    private final boolean zzaj(zzcx zzcxVar, zzur zzurVar) {
        if (!zzurVar.zzb() && !zzcxVar.zzo()) {
            zzcxVar.zze(zzcxVar.zzn(zzurVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzcw zzcwVar = this.zzk;
                if (zzcwVar.zzj && zzcwVar.zzg != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzam[] zzak(zzyi zzyiVar) {
        int zzc = zzyiVar != null ? zzyiVar.zzc() : 0;
        zzam[] zzamVarArr = new zzam[zzc];
        for (int i10 = 0; i10 < zzc; i10++) {
            zzamVarArr[i10] = zzyiVar.zzd(i10);
        }
        return zzamVarArr;
    }

    private static final void zzal(zzmb zzmbVar) {
        zzmbVar.zzj();
        try {
            zzmbVar.zzc().zzt(zzmbVar.zza(), zzmbVar.zzg());
        } finally {
            zzmbVar.zzh(true);
        }
    }

    private static final void zzam(zzmf zzmfVar) {
        if (zzmfVar.zzbf() == 2) {
            zzmfVar.zzO();
        }
    }

    private static final void zzan(zzmf zzmfVar, long j10) {
        zzmfVar.zzJ();
        if (zzmfVar instanceof zzww) {
            throw null;
        }
    }

    public static /* synthetic */ zzli zzd(zzkz zzkzVar, zzlj zzljVar, long j10) {
        zzlc zzlcVar = zzkzVar.zzf;
        zzyo zzyoVar = zzkzVar.zzd;
        zzyx zzi = zzlcVar.zzi();
        zzyp zzypVar = zzkzVar.zze;
        return new zzli(zzkzVar.zzc, j10, zzyoVar, zzi, zzkzVar.zzr, zzljVar, zzypVar);
    }

    static Object zzf(zzcw zzcwVar, zzcu zzcuVar, int i10, boolean z10, Object obj, zzcx zzcxVar, zzcx zzcxVar2) {
        int zza = zzcxVar.zza(obj);
        int zzb = zzcxVar.zzb();
        int i11 = 0;
        int i12 = zza;
        int i13 = -1;
        while (true) {
            if (i11 >= zzb || i13 != -1) {
                break;
            }
            i12 = zzcxVar.zzi(i12, zzcuVar, zzcwVar, i10, z10);
            if (i12 == -1) {
                i13 = -1;
                break;
            }
            i13 = zzcxVar2.zza(zzcxVar.zzf(i12));
            i11++;
        }
        if (i13 == -1) {
            return null;
        }
        return zzcxVar2.zzf(i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzr(zzmb zzmbVar) {
        try {
            zzal(zzmbVar);
        } catch (zziz e10) {
            zzff.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private final long zzs(zzcx zzcxVar, Object obj, long j10) {
        zzcxVar.zze(zzcxVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzcw zzcwVar = this.zzk;
        if (zzcwVar.zzg != -9223372036854775807L && zzcwVar.zzb()) {
            zzcw zzcwVar2 = this.zzk;
            if (zzcwVar2.zzj) {
                long j11 = zzcwVar2.zzh;
                return zzfy.zzq((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - this.zzk.zzg) - j10;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzu.zzp);
    }

    private final long zzu(long j10) {
        zzli zzd = this.zzq.zzd();
        if (zzd == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzH - zzd.zze()));
    }

    private final long zzv(zzur zzurVar, long j10, boolean z10) {
        zzll zzllVar = this.zzq;
        return zzw(zzurVar, j10, zzllVar.zze() != zzllVar.zzf(), z10);
    }

    private final long zzw(zzur zzurVar, long j10, boolean z10, boolean z11) {
        zzX();
        zzac(false, true);
        if (z11 || this.zzu.zze == 3) {
            zzU(2);
        }
        zzli zze = this.zzq.zze();
        zzli zzliVar = zze;
        while (zzliVar != null && !zzurVar.equals(zzliVar.zzf.zza)) {
            zzliVar = zzliVar.zzg();
        }
        if (z10 || zze != zzliVar || (zzliVar != null && zzliVar.zze() + j10 < 0)) {
            zzmf[] zzmfVarArr = this.zza;
            int length = zzmfVarArr.length;
            for (int i10 = 0; i10 < 2; i10++) {
                zzA(zzmfVarArr[i10]);
            }
            if (zzliVar != null) {
                while (this.zzq.zze() != zzliVar) {
                    this.zzq.zza();
                }
                this.zzq.zzn(zzliVar);
                zzliVar.zzp(1000000000000L);
                zzB();
            }
        }
        zzll zzllVar = this.zzq;
        if (zzliVar != null) {
            zzllVar.zzn(zzliVar);
            if (!zzliVar.zzd) {
                zzliVar.zzf = zzliVar.zzf.zzb(j10);
            } else if (zzliVar.zze) {
                j10 = zzliVar.zza.zze(j10);
                zzliVar.zza.zzj(j10 - this.zzm, false);
            }
            zzO(j10);
            zzI();
        } else {
            zzllVar.zzj();
            zzO(j10);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j10;
    }

    private final Pair zzx(zzcx zzcxVar) {
        long j10 = 0;
        if (zzcxVar.zzo()) {
            return Pair.create(zzly.zzh(), 0L);
        }
        Pair zzl = zzcxVar.zzl(this.zzk, this.zzl, zzcxVar.zzg(this.zzD), -9223372036854775807L);
        zzur zzi = this.zzq.zzi(zzcxVar, zzl.first, 0L);
        long longValue = ((Long) zzl.second).longValue();
        if (zzi.zzb()) {
            zzcxVar.zzn(zzi.zza, this.zzl);
            if (zzi.zzc == this.zzl.zze(zzi.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(zzi, Long.valueOf(j10));
    }

    private static Pair zzy(zzcx zzcxVar, zzky zzkyVar, boolean z10, int i10, boolean z11, zzcw zzcwVar, zzcu zzcuVar) {
        Pair zzl;
        int i11;
        long j10;
        zzcx zzcxVar2 = zzkyVar.zza;
        if (zzcxVar.zzo()) {
            return null;
        }
        zzcx zzcxVar3 = true == zzcxVar2.zzo() ? zzcxVar : zzcxVar2;
        try {
            zzl = zzcxVar3.zzl(zzcwVar, zzcuVar, zzkyVar.zzb, zzkyVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzcxVar.equals(zzcxVar3)) {
            return zzl;
        }
        if (zzcxVar.zza(zzl.first) == -1) {
            Object zzf = zzf(zzcwVar, zzcuVar, i10, z11, zzl.first, zzcxVar3, zzcxVar);
            if (zzf != null) {
                i11 = zzcxVar.zzn(zzf, zzcuVar).zzd;
                j10 = -9223372036854775807L;
            }
            return null;
        }
        if (!zzcxVar3.zzn(zzl.first, zzcuVar).zzg || zzcxVar3.zze(zzcuVar.zzd, zzcwVar, 0L).zzp != zzcxVar3.zza(zzl.first)) {
            return zzl;
        }
        i11 = zzcxVar.zzn(zzl.first, zzcuVar).zzd;
        j10 = zzkyVar.zzc;
        return zzcxVar.zzl(zzcwVar, zzcuVar, i11, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.zzly zzz(com.google.android.gms.internal.ads.zzur r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.zzz(com.google.android.gms.internal.ads.zzur, long, long, long, boolean, int):com.google.android.gms.internal.ads.zzly");
    }

    /* JADX WARN: Code restructure failed: missing block: B:506:0x07c1, code lost:
    
        if (zzag() != false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0865, code lost:
    
        if (r7 == false) goto L442;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b8 A[Catch: RuntimeException -> 0x097e, IOException -> 0x09a8, zztt -> 0x09ad, zzgx -> 0x09b2, zzcc -> 0x09b7, zzrq -> 0x09ce, zziz -> 0x09d8, TryCatch #8 {zzcc -> 0x09b7, zzgx -> 0x09b2, zziz -> 0x09d8, zzrq -> 0x09ce, zztt -> 0x09ad, IOException -> 0x09a8, RuntimeException -> 0x097e, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:9:0x0029, B:13:0x002e, B:14:0x0033, B:17:0x003a, B:19:0x0043, B:21:0x0051, B:22:0x0054, B:24:0x0059, B:25:0x0064, B:26:0x0074, B:27:0x0088, B:28:0x009a, B:30:0x00a9, B:31:0x00ad, B:32:0x00bb, B:34:0x00ca, B:35:0x00e6, B:36:0x00f6, B:37:0x00ff, B:39:0x0111, B:40:0x011d, B:41:0x012d, B:43:0x0139, B:46:0x0144, B:47:0x014b, B:48:0x0158, B:51:0x015f, B:53:0x0167, B:55:0x016b, B:57:0x0171, B:59:0x0179, B:61:0x0181, B:63:0x0184, B:68:0x0189, B:77:0x0196, B:79:0x0197, B:82:0x019e, B:84:0x01ac, B:86:0x01b1, B:88:0x01c1, B:89:0x01c6, B:90:0x01cb, B:92:0x01d7, B:93:0x01de, B:94:0x01e3, B:96:0x01ef, B:98:0x021b, B:99:0x023c, B:100:0x0240, B:102:0x0245, B:104:0x0256, B:106:0x0262, B:107:0x0265, B:116:0x0270, B:117:0x0271, B:118:0x0277, B:119:0x027e, B:120:0x028f, B:122:0x02b6, B:130:0x03cd, B:131:0x039a, B:158:0x0396, B:173:0x03de, B:174:0x03eb, B:188:0x02d8, B:191:0x02eb, B:193:0x02fb, B:195:0x0312, B:197:0x031c, B:204:0x03ec, B:206:0x0400, B:209:0x040a, B:211:0x0419, B:213:0x0425, B:215:0x043a, B:216:0x043f, B:217:0x0443, B:219:0x0447, B:220:0x0454, B:223:0x05b0, B:225:0x05b8, B:227:0x05c0, B:230:0x05c5, B:231:0x05d1, B:233:0x05d7, B:235:0x05df, B:240:0x05ef, B:242:0x05f5, B:244:0x0615, B:246:0x061b, B:239:0x0620, B:253:0x0625, B:255:0x0629, B:257:0x062f, B:259:0x0633, B:261:0x063b, B:263:0x0641, B:265:0x064b, B:268:0x0651, B:269:0x0654, B:271:0x065d, B:273:0x066f, B:275:0x0678, B:277:0x0680, B:280:0x068a, B:281:0x06b6, B:283:0x06bc, B:285:0x06c2, B:287:0x06c9, B:300:0x0463, B:302:0x0469, B:305:0x046f, B:308:0x047a, B:310:0x047f, B:313:0x048d, B:316:0x0493, B:318:0x049b, B:322:0x049e, B:324:0x04a6, B:326:0x04b4, B:328:0x04f0, B:330:0x04fa, B:333:0x0505, B:335:0x050d, B:337:0x0510, B:340:0x0513, B:342:0x0519, B:344:0x0528, B:346:0x052e, B:348:0x053a, B:350:0x0544, B:352:0x0555, B:356:0x055b, B:355:0x0566, B:361:0x056b, B:363:0x0576, B:366:0x057b, B:368:0x0581, B:370:0x0589, B:372:0x058f, B:374:0x0595, B:378:0x05a3, B:379:0x05aa, B:381:0x05ad, B:387:0x0451, B:388:0x06d5, B:392:0x06e0, B:394:0x06ea, B:395:0x06ef, B:397:0x06fd, B:398:0x0715, B:400:0x071b, B:402:0x0723, B:404:0x072a, B:407:0x0733, B:411:0x0742, B:416:0x074f, B:418:0x0755, B:426:0x0768, B:429:0x076d, B:437:0x0779, B:439:0x077f, B:443:0x078c, B:445:0x0794, B:447:0x0798, B:448:0x07a3, B:450:0x07a9, B:451:0x089b, B:454:0x08a3, B:456:0x08a8, B:458:0x08b0, B:460:0x08be, B:462:0x08c5, B:466:0x08c9, B:468:0x08cf, B:470:0x08d8, B:472:0x08de, B:474:0x08e9, B:475:0x08ed, B:476:0x090c, B:478:0x0912, B:481:0x091b, B:484:0x093b, B:490:0x092c, B:492:0x0930, B:493:0x0936, B:495:0x08f0, B:498:0x08fe, B:499:0x0905, B:501:0x07b2, B:503:0x07b9, B:505:0x07bd, B:508:0x0843, B:510:0x084f, B:513:0x07ca, B:515:0x07ce, B:517:0x07e2, B:518:0x07f0, B:520:0x07fc, B:523:0x0805, B:525:0x080f, B:530:0x081a, B:536:0x0853, B:538:0x085a, B:540:0x085e, B:543:0x0867, B:545:0x0877, B:547:0x087f, B:549:0x0889, B:551:0x088e, B:553:0x0893, B:554:0x0898, B:556:0x0772, B:557:0x0940, B:560:0x0947, B:562:0x094f, B:565:0x096d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05d7 A[Catch: RuntimeException -> 0x097e, IOException -> 0x09a8, zztt -> 0x09ad, zzgx -> 0x09b2, zzcc -> 0x09b7, zzrq -> 0x09ce, zziz -> 0x09d8, TryCatch #8 {zzcc -> 0x09b7, zzgx -> 0x09b2, zziz -> 0x09d8, zzrq -> 0x09ce, zztt -> 0x09ad, IOException -> 0x09a8, RuntimeException -> 0x097e, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:9:0x0029, B:13:0x002e, B:14:0x0033, B:17:0x003a, B:19:0x0043, B:21:0x0051, B:22:0x0054, B:24:0x0059, B:25:0x0064, B:26:0x0074, B:27:0x0088, B:28:0x009a, B:30:0x00a9, B:31:0x00ad, B:32:0x00bb, B:34:0x00ca, B:35:0x00e6, B:36:0x00f6, B:37:0x00ff, B:39:0x0111, B:40:0x011d, B:41:0x012d, B:43:0x0139, B:46:0x0144, B:47:0x014b, B:48:0x0158, B:51:0x015f, B:53:0x0167, B:55:0x016b, B:57:0x0171, B:59:0x0179, B:61:0x0181, B:63:0x0184, B:68:0x0189, B:77:0x0196, B:79:0x0197, B:82:0x019e, B:84:0x01ac, B:86:0x01b1, B:88:0x01c1, B:89:0x01c6, B:90:0x01cb, B:92:0x01d7, B:93:0x01de, B:94:0x01e3, B:96:0x01ef, B:98:0x021b, B:99:0x023c, B:100:0x0240, B:102:0x0245, B:104:0x0256, B:106:0x0262, B:107:0x0265, B:116:0x0270, B:117:0x0271, B:118:0x0277, B:119:0x027e, B:120:0x028f, B:122:0x02b6, B:130:0x03cd, B:131:0x039a, B:158:0x0396, B:173:0x03de, B:174:0x03eb, B:188:0x02d8, B:191:0x02eb, B:193:0x02fb, B:195:0x0312, B:197:0x031c, B:204:0x03ec, B:206:0x0400, B:209:0x040a, B:211:0x0419, B:213:0x0425, B:215:0x043a, B:216:0x043f, B:217:0x0443, B:219:0x0447, B:220:0x0454, B:223:0x05b0, B:225:0x05b8, B:227:0x05c0, B:230:0x05c5, B:231:0x05d1, B:233:0x05d7, B:235:0x05df, B:240:0x05ef, B:242:0x05f5, B:244:0x0615, B:246:0x061b, B:239:0x0620, B:253:0x0625, B:255:0x0629, B:257:0x062f, B:259:0x0633, B:261:0x063b, B:263:0x0641, B:265:0x064b, B:268:0x0651, B:269:0x0654, B:271:0x065d, B:273:0x066f, B:275:0x0678, B:277:0x0680, B:280:0x068a, B:281:0x06b6, B:283:0x06bc, B:285:0x06c2, B:287:0x06c9, B:300:0x0463, B:302:0x0469, B:305:0x046f, B:308:0x047a, B:310:0x047f, B:313:0x048d, B:316:0x0493, B:318:0x049b, B:322:0x049e, B:324:0x04a6, B:326:0x04b4, B:328:0x04f0, B:330:0x04fa, B:333:0x0505, B:335:0x050d, B:337:0x0510, B:340:0x0513, B:342:0x0519, B:344:0x0528, B:346:0x052e, B:348:0x053a, B:350:0x0544, B:352:0x0555, B:356:0x055b, B:355:0x0566, B:361:0x056b, B:363:0x0576, B:366:0x057b, B:368:0x0581, B:370:0x0589, B:372:0x058f, B:374:0x0595, B:378:0x05a3, B:379:0x05aa, B:381:0x05ad, B:387:0x0451, B:388:0x06d5, B:392:0x06e0, B:394:0x06ea, B:395:0x06ef, B:397:0x06fd, B:398:0x0715, B:400:0x071b, B:402:0x0723, B:404:0x072a, B:407:0x0733, B:411:0x0742, B:416:0x074f, B:418:0x0755, B:426:0x0768, B:429:0x076d, B:437:0x0779, B:439:0x077f, B:443:0x078c, B:445:0x0794, B:447:0x0798, B:448:0x07a3, B:450:0x07a9, B:451:0x089b, B:454:0x08a3, B:456:0x08a8, B:458:0x08b0, B:460:0x08be, B:462:0x08c5, B:466:0x08c9, B:468:0x08cf, B:470:0x08d8, B:472:0x08de, B:474:0x08e9, B:475:0x08ed, B:476:0x090c, B:478:0x0912, B:481:0x091b, B:484:0x093b, B:490:0x092c, B:492:0x0930, B:493:0x0936, B:495:0x08f0, B:498:0x08fe, B:499:0x0905, B:501:0x07b2, B:503:0x07b9, B:505:0x07bd, B:508:0x0843, B:510:0x084f, B:513:0x07ca, B:515:0x07ce, B:517:0x07e2, B:518:0x07f0, B:520:0x07fc, B:523:0x0805, B:525:0x080f, B:530:0x081a, B:536:0x0853, B:538:0x085a, B:540:0x085e, B:543:0x0867, B:545:0x0877, B:547:0x087f, B:549:0x0889, B:551:0x088e, B:553:0x0893, B:554:0x0898, B:556:0x0772, B:557:0x0940, B:560:0x0947, B:562:0x094f, B:565:0x096d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0623 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x062f A[Catch: RuntimeException -> 0x097e, IOException -> 0x09a8, zztt -> 0x09ad, zzgx -> 0x09b2, zzcc -> 0x09b7, zzrq -> 0x09ce, zziz -> 0x09d8, TryCatch #8 {zzcc -> 0x09b7, zzgx -> 0x09b2, zziz -> 0x09d8, zzrq -> 0x09ce, zztt -> 0x09ad, IOException -> 0x09a8, RuntimeException -> 0x097e, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:9:0x0029, B:13:0x002e, B:14:0x0033, B:17:0x003a, B:19:0x0043, B:21:0x0051, B:22:0x0054, B:24:0x0059, B:25:0x0064, B:26:0x0074, B:27:0x0088, B:28:0x009a, B:30:0x00a9, B:31:0x00ad, B:32:0x00bb, B:34:0x00ca, B:35:0x00e6, B:36:0x00f6, B:37:0x00ff, B:39:0x0111, B:40:0x011d, B:41:0x012d, B:43:0x0139, B:46:0x0144, B:47:0x014b, B:48:0x0158, B:51:0x015f, B:53:0x0167, B:55:0x016b, B:57:0x0171, B:59:0x0179, B:61:0x0181, B:63:0x0184, B:68:0x0189, B:77:0x0196, B:79:0x0197, B:82:0x019e, B:84:0x01ac, B:86:0x01b1, B:88:0x01c1, B:89:0x01c6, B:90:0x01cb, B:92:0x01d7, B:93:0x01de, B:94:0x01e3, B:96:0x01ef, B:98:0x021b, B:99:0x023c, B:100:0x0240, B:102:0x0245, B:104:0x0256, B:106:0x0262, B:107:0x0265, B:116:0x0270, B:117:0x0271, B:118:0x0277, B:119:0x027e, B:120:0x028f, B:122:0x02b6, B:130:0x03cd, B:131:0x039a, B:158:0x0396, B:173:0x03de, B:174:0x03eb, B:188:0x02d8, B:191:0x02eb, B:193:0x02fb, B:195:0x0312, B:197:0x031c, B:204:0x03ec, B:206:0x0400, B:209:0x040a, B:211:0x0419, B:213:0x0425, B:215:0x043a, B:216:0x043f, B:217:0x0443, B:219:0x0447, B:220:0x0454, B:223:0x05b0, B:225:0x05b8, B:227:0x05c0, B:230:0x05c5, B:231:0x05d1, B:233:0x05d7, B:235:0x05df, B:240:0x05ef, B:242:0x05f5, B:244:0x0615, B:246:0x061b, B:239:0x0620, B:253:0x0625, B:255:0x0629, B:257:0x062f, B:259:0x0633, B:261:0x063b, B:263:0x0641, B:265:0x064b, B:268:0x0651, B:269:0x0654, B:271:0x065d, B:273:0x066f, B:275:0x0678, B:277:0x0680, B:280:0x068a, B:281:0x06b6, B:283:0x06bc, B:285:0x06c2, B:287:0x06c9, B:300:0x0463, B:302:0x0469, B:305:0x046f, B:308:0x047a, B:310:0x047f, B:313:0x048d, B:316:0x0493, B:318:0x049b, B:322:0x049e, B:324:0x04a6, B:326:0x04b4, B:328:0x04f0, B:330:0x04fa, B:333:0x0505, B:335:0x050d, B:337:0x0510, B:340:0x0513, B:342:0x0519, B:344:0x0528, B:346:0x052e, B:348:0x053a, B:350:0x0544, B:352:0x0555, B:356:0x055b, B:355:0x0566, B:361:0x056b, B:363:0x0576, B:366:0x057b, B:368:0x0581, B:370:0x0589, B:372:0x058f, B:374:0x0595, B:378:0x05a3, B:379:0x05aa, B:381:0x05ad, B:387:0x0451, B:388:0x06d5, B:392:0x06e0, B:394:0x06ea, B:395:0x06ef, B:397:0x06fd, B:398:0x0715, B:400:0x071b, B:402:0x0723, B:404:0x072a, B:407:0x0733, B:411:0x0742, B:416:0x074f, B:418:0x0755, B:426:0x0768, B:429:0x076d, B:437:0x0779, B:439:0x077f, B:443:0x078c, B:445:0x0794, B:447:0x0798, B:448:0x07a3, B:450:0x07a9, B:451:0x089b, B:454:0x08a3, B:456:0x08a8, B:458:0x08b0, B:460:0x08be, B:462:0x08c5, B:466:0x08c9, B:468:0x08cf, B:470:0x08d8, B:472:0x08de, B:474:0x08e9, B:475:0x08ed, B:476:0x090c, B:478:0x0912, B:481:0x091b, B:484:0x093b, B:490:0x092c, B:492:0x0930, B:493:0x0936, B:495:0x08f0, B:498:0x08fe, B:499:0x0905, B:501:0x07b2, B:503:0x07b9, B:505:0x07bd, B:508:0x0843, B:510:0x084f, B:513:0x07ca, B:515:0x07ce, B:517:0x07e2, B:518:0x07f0, B:520:0x07fc, B:523:0x0805, B:525:0x080f, B:530:0x081a, B:536:0x0853, B:538:0x085a, B:540:0x085e, B:543:0x0867, B:545:0x0877, B:547:0x087f, B:549:0x0889, B:551:0x088e, B:553:0x0893, B:554:0x0898, B:556:0x0772, B:557:0x0940, B:560:0x0947, B:562:0x094f, B:565:0x096d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0651 A[Catch: RuntimeException -> 0x097e, IOException -> 0x09a8, zztt -> 0x09ad, zzgx -> 0x09b2, zzcc -> 0x09b7, zzrq -> 0x09ce, zziz -> 0x09d8, TryCatch #8 {zzcc -> 0x09b7, zzgx -> 0x09b2, zziz -> 0x09d8, zzrq -> 0x09ce, zztt -> 0x09ad, IOException -> 0x09a8, RuntimeException -> 0x097e, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:9:0x0029, B:13:0x002e, B:14:0x0033, B:17:0x003a, B:19:0x0043, B:21:0x0051, B:22:0x0054, B:24:0x0059, B:25:0x0064, B:26:0x0074, B:27:0x0088, B:28:0x009a, B:30:0x00a9, B:31:0x00ad, B:32:0x00bb, B:34:0x00ca, B:35:0x00e6, B:36:0x00f6, B:37:0x00ff, B:39:0x0111, B:40:0x011d, B:41:0x012d, B:43:0x0139, B:46:0x0144, B:47:0x014b, B:48:0x0158, B:51:0x015f, B:53:0x0167, B:55:0x016b, B:57:0x0171, B:59:0x0179, B:61:0x0181, B:63:0x0184, B:68:0x0189, B:77:0x0196, B:79:0x0197, B:82:0x019e, B:84:0x01ac, B:86:0x01b1, B:88:0x01c1, B:89:0x01c6, B:90:0x01cb, B:92:0x01d7, B:93:0x01de, B:94:0x01e3, B:96:0x01ef, B:98:0x021b, B:99:0x023c, B:100:0x0240, B:102:0x0245, B:104:0x0256, B:106:0x0262, B:107:0x0265, B:116:0x0270, B:117:0x0271, B:118:0x0277, B:119:0x027e, B:120:0x028f, B:122:0x02b6, B:130:0x03cd, B:131:0x039a, B:158:0x0396, B:173:0x03de, B:174:0x03eb, B:188:0x02d8, B:191:0x02eb, B:193:0x02fb, B:195:0x0312, B:197:0x031c, B:204:0x03ec, B:206:0x0400, B:209:0x040a, B:211:0x0419, B:213:0x0425, B:215:0x043a, B:216:0x043f, B:217:0x0443, B:219:0x0447, B:220:0x0454, B:223:0x05b0, B:225:0x05b8, B:227:0x05c0, B:230:0x05c5, B:231:0x05d1, B:233:0x05d7, B:235:0x05df, B:240:0x05ef, B:242:0x05f5, B:244:0x0615, B:246:0x061b, B:239:0x0620, B:253:0x0625, B:255:0x0629, B:257:0x062f, B:259:0x0633, B:261:0x063b, B:263:0x0641, B:265:0x064b, B:268:0x0651, B:269:0x0654, B:271:0x065d, B:273:0x066f, B:275:0x0678, B:277:0x0680, B:280:0x068a, B:281:0x06b6, B:283:0x06bc, B:285:0x06c2, B:287:0x06c9, B:300:0x0463, B:302:0x0469, B:305:0x046f, B:308:0x047a, B:310:0x047f, B:313:0x048d, B:316:0x0493, B:318:0x049b, B:322:0x049e, B:324:0x04a6, B:326:0x04b4, B:328:0x04f0, B:330:0x04fa, B:333:0x0505, B:335:0x050d, B:337:0x0510, B:340:0x0513, B:342:0x0519, B:344:0x0528, B:346:0x052e, B:348:0x053a, B:350:0x0544, B:352:0x0555, B:356:0x055b, B:355:0x0566, B:361:0x056b, B:363:0x0576, B:366:0x057b, B:368:0x0581, B:370:0x0589, B:372:0x058f, B:374:0x0595, B:378:0x05a3, B:379:0x05aa, B:381:0x05ad, B:387:0x0451, B:388:0x06d5, B:392:0x06e0, B:394:0x06ea, B:395:0x06ef, B:397:0x06fd, B:398:0x0715, B:400:0x071b, B:402:0x0723, B:404:0x072a, B:407:0x0733, B:411:0x0742, B:416:0x074f, B:418:0x0755, B:426:0x0768, B:429:0x076d, B:437:0x0779, B:439:0x077f, B:443:0x078c, B:445:0x0794, B:447:0x0798, B:448:0x07a3, B:450:0x07a9, B:451:0x089b, B:454:0x08a3, B:456:0x08a8, B:458:0x08b0, B:460:0x08be, B:462:0x08c5, B:466:0x08c9, B:468:0x08cf, B:470:0x08d8, B:472:0x08de, B:474:0x08e9, B:475:0x08ed, B:476:0x090c, B:478:0x0912, B:481:0x091b, B:484:0x093b, B:490:0x092c, B:492:0x0930, B:493:0x0936, B:495:0x08f0, B:498:0x08fe, B:499:0x0905, B:501:0x07b2, B:503:0x07b9, B:505:0x07bd, B:508:0x0843, B:510:0x084f, B:513:0x07ca, B:515:0x07ce, B:517:0x07e2, B:518:0x07f0, B:520:0x07fc, B:523:0x0805, B:525:0x080f, B:530:0x081a, B:536:0x0853, B:538:0x085a, B:540:0x085e, B:543:0x0867, B:545:0x0877, B:547:0x087f, B:549:0x0889, B:551:0x088e, B:553:0x0893, B:554:0x0898, B:556:0x0772, B:557:0x0940, B:560:0x0947, B:562:0x094f, B:565:0x096d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x066f A[Catch: RuntimeException -> 0x097e, IOException -> 0x09a8, zztt -> 0x09ad, zzgx -> 0x09b2, zzcc -> 0x09b7, zzrq -> 0x09ce, zziz -> 0x09d8, TryCatch #8 {zzcc -> 0x09b7, zzgx -> 0x09b2, zziz -> 0x09d8, zzrq -> 0x09ce, zztt -> 0x09ad, IOException -> 0x09a8, RuntimeException -> 0x097e, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:9:0x0029, B:13:0x002e, B:14:0x0033, B:17:0x003a, B:19:0x0043, B:21:0x0051, B:22:0x0054, B:24:0x0059, B:25:0x0064, B:26:0x0074, B:27:0x0088, B:28:0x009a, B:30:0x00a9, B:31:0x00ad, B:32:0x00bb, B:34:0x00ca, B:35:0x00e6, B:36:0x00f6, B:37:0x00ff, B:39:0x0111, B:40:0x011d, B:41:0x012d, B:43:0x0139, B:46:0x0144, B:47:0x014b, B:48:0x0158, B:51:0x015f, B:53:0x0167, B:55:0x016b, B:57:0x0171, B:59:0x0179, B:61:0x0181, B:63:0x0184, B:68:0x0189, B:77:0x0196, B:79:0x0197, B:82:0x019e, B:84:0x01ac, B:86:0x01b1, B:88:0x01c1, B:89:0x01c6, B:90:0x01cb, B:92:0x01d7, B:93:0x01de, B:94:0x01e3, B:96:0x01ef, B:98:0x021b, B:99:0x023c, B:100:0x0240, B:102:0x0245, B:104:0x0256, B:106:0x0262, B:107:0x0265, B:116:0x0270, B:117:0x0271, B:118:0x0277, B:119:0x027e, B:120:0x028f, B:122:0x02b6, B:130:0x03cd, B:131:0x039a, B:158:0x0396, B:173:0x03de, B:174:0x03eb, B:188:0x02d8, B:191:0x02eb, B:193:0x02fb, B:195:0x0312, B:197:0x031c, B:204:0x03ec, B:206:0x0400, B:209:0x040a, B:211:0x0419, B:213:0x0425, B:215:0x043a, B:216:0x043f, B:217:0x0443, B:219:0x0447, B:220:0x0454, B:223:0x05b0, B:225:0x05b8, B:227:0x05c0, B:230:0x05c5, B:231:0x05d1, B:233:0x05d7, B:235:0x05df, B:240:0x05ef, B:242:0x05f5, B:244:0x0615, B:246:0x061b, B:239:0x0620, B:253:0x0625, B:255:0x0629, B:257:0x062f, B:259:0x0633, B:261:0x063b, B:263:0x0641, B:265:0x064b, B:268:0x0651, B:269:0x0654, B:271:0x065d, B:273:0x066f, B:275:0x0678, B:277:0x0680, B:280:0x068a, B:281:0x06b6, B:283:0x06bc, B:285:0x06c2, B:287:0x06c9, B:300:0x0463, B:302:0x0469, B:305:0x046f, B:308:0x047a, B:310:0x047f, B:313:0x048d, B:316:0x0493, B:318:0x049b, B:322:0x049e, B:324:0x04a6, B:326:0x04b4, B:328:0x04f0, B:330:0x04fa, B:333:0x0505, B:335:0x050d, B:337:0x0510, B:340:0x0513, B:342:0x0519, B:344:0x0528, B:346:0x052e, B:348:0x053a, B:350:0x0544, B:352:0x0555, B:356:0x055b, B:355:0x0566, B:361:0x056b, B:363:0x0576, B:366:0x057b, B:368:0x0581, B:370:0x0589, B:372:0x058f, B:374:0x0595, B:378:0x05a3, B:379:0x05aa, B:381:0x05ad, B:387:0x0451, B:388:0x06d5, B:392:0x06e0, B:394:0x06ea, B:395:0x06ef, B:397:0x06fd, B:398:0x0715, B:400:0x071b, B:402:0x0723, B:404:0x072a, B:407:0x0733, B:411:0x0742, B:416:0x074f, B:418:0x0755, B:426:0x0768, B:429:0x076d, B:437:0x0779, B:439:0x077f, B:443:0x078c, B:445:0x0794, B:447:0x0798, B:448:0x07a3, B:450:0x07a9, B:451:0x089b, B:454:0x08a3, B:456:0x08a8, B:458:0x08b0, B:460:0x08be, B:462:0x08c5, B:466:0x08c9, B:468:0x08cf, B:470:0x08d8, B:472:0x08de, B:474:0x08e9, B:475:0x08ed, B:476:0x090c, B:478:0x0912, B:481:0x091b, B:484:0x093b, B:490:0x092c, B:492:0x0930, B:493:0x0936, B:495:0x08f0, B:498:0x08fe, B:499:0x0905, B:501:0x07b2, B:503:0x07b9, B:505:0x07bd, B:508:0x0843, B:510:0x084f, B:513:0x07ca, B:515:0x07ce, B:517:0x07e2, B:518:0x07f0, B:520:0x07fc, B:523:0x0805, B:525:0x080f, B:530:0x081a, B:536:0x0853, B:538:0x085a, B:540:0x085e, B:543:0x0867, B:545:0x0877, B:547:0x087f, B:549:0x0889, B:551:0x088e, B:553:0x0893, B:554:0x0898, B:556:0x0772, B:557:0x0940, B:560:0x0947, B:562:0x094f, B:565:0x096d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06bc A[Catch: RuntimeException -> 0x097e, IOException -> 0x09a8, zztt -> 0x09ad, zzgx -> 0x09b2, zzcc -> 0x09b7, zzrq -> 0x09ce, zziz -> 0x09d8, TryCatch #8 {zzcc -> 0x09b7, zzgx -> 0x09b2, zziz -> 0x09d8, zzrq -> 0x09ce, zztt -> 0x09ad, IOException -> 0x09a8, RuntimeException -> 0x097e, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:9:0x0029, B:13:0x002e, B:14:0x0033, B:17:0x003a, B:19:0x0043, B:21:0x0051, B:22:0x0054, B:24:0x0059, B:25:0x0064, B:26:0x0074, B:27:0x0088, B:28:0x009a, B:30:0x00a9, B:31:0x00ad, B:32:0x00bb, B:34:0x00ca, B:35:0x00e6, B:36:0x00f6, B:37:0x00ff, B:39:0x0111, B:40:0x011d, B:41:0x012d, B:43:0x0139, B:46:0x0144, B:47:0x014b, B:48:0x0158, B:51:0x015f, B:53:0x0167, B:55:0x016b, B:57:0x0171, B:59:0x0179, B:61:0x0181, B:63:0x0184, B:68:0x0189, B:77:0x0196, B:79:0x0197, B:82:0x019e, B:84:0x01ac, B:86:0x01b1, B:88:0x01c1, B:89:0x01c6, B:90:0x01cb, B:92:0x01d7, B:93:0x01de, B:94:0x01e3, B:96:0x01ef, B:98:0x021b, B:99:0x023c, B:100:0x0240, B:102:0x0245, B:104:0x0256, B:106:0x0262, B:107:0x0265, B:116:0x0270, B:117:0x0271, B:118:0x0277, B:119:0x027e, B:120:0x028f, B:122:0x02b6, B:130:0x03cd, B:131:0x039a, B:158:0x0396, B:173:0x03de, B:174:0x03eb, B:188:0x02d8, B:191:0x02eb, B:193:0x02fb, B:195:0x0312, B:197:0x031c, B:204:0x03ec, B:206:0x0400, B:209:0x040a, B:211:0x0419, B:213:0x0425, B:215:0x043a, B:216:0x043f, B:217:0x0443, B:219:0x0447, B:220:0x0454, B:223:0x05b0, B:225:0x05b8, B:227:0x05c0, B:230:0x05c5, B:231:0x05d1, B:233:0x05d7, B:235:0x05df, B:240:0x05ef, B:242:0x05f5, B:244:0x0615, B:246:0x061b, B:239:0x0620, B:253:0x0625, B:255:0x0629, B:257:0x062f, B:259:0x0633, B:261:0x063b, B:263:0x0641, B:265:0x064b, B:268:0x0651, B:269:0x0654, B:271:0x065d, B:273:0x066f, B:275:0x0678, B:277:0x0680, B:280:0x068a, B:281:0x06b6, B:283:0x06bc, B:285:0x06c2, B:287:0x06c9, B:300:0x0463, B:302:0x0469, B:305:0x046f, B:308:0x047a, B:310:0x047f, B:313:0x048d, B:316:0x0493, B:318:0x049b, B:322:0x049e, B:324:0x04a6, B:326:0x04b4, B:328:0x04f0, B:330:0x04fa, B:333:0x0505, B:335:0x050d, B:337:0x0510, B:340:0x0513, B:342:0x0519, B:344:0x0528, B:346:0x052e, B:348:0x053a, B:350:0x0544, B:352:0x0555, B:356:0x055b, B:355:0x0566, B:361:0x056b, B:363:0x0576, B:366:0x057b, B:368:0x0581, B:370:0x0589, B:372:0x058f, B:374:0x0595, B:378:0x05a3, B:379:0x05aa, B:381:0x05ad, B:387:0x0451, B:388:0x06d5, B:392:0x06e0, B:394:0x06ea, B:395:0x06ef, B:397:0x06fd, B:398:0x0715, B:400:0x071b, B:402:0x0723, B:404:0x072a, B:407:0x0733, B:411:0x0742, B:416:0x074f, B:418:0x0755, B:426:0x0768, B:429:0x076d, B:437:0x0779, B:439:0x077f, B:443:0x078c, B:445:0x0794, B:447:0x0798, B:448:0x07a3, B:450:0x07a9, B:451:0x089b, B:454:0x08a3, B:456:0x08a8, B:458:0x08b0, B:460:0x08be, B:462:0x08c5, B:466:0x08c9, B:468:0x08cf, B:470:0x08d8, B:472:0x08de, B:474:0x08e9, B:475:0x08ed, B:476:0x090c, B:478:0x0912, B:481:0x091b, B:484:0x093b, B:490:0x092c, B:492:0x0930, B:493:0x0936, B:495:0x08f0, B:498:0x08fe, B:499:0x0905, B:501:0x07b2, B:503:0x07b9, B:505:0x07bd, B:508:0x0843, B:510:0x084f, B:513:0x07ca, B:515:0x07ce, B:517:0x07e2, B:518:0x07f0, B:520:0x07fc, B:523:0x0805, B:525:0x080f, B:530:0x081a, B:536:0x0853, B:538:0x085a, B:540:0x085e, B:543:0x0867, B:545:0x0877, B:547:0x087f, B:549:0x0889, B:551:0x088e, B:553:0x0893, B:554:0x0898, B:556:0x0772, B:557:0x0940, B:560:0x0947, B:562:0x094f, B:565:0x096d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0768 A[Catch: RuntimeException -> 0x097e, IOException -> 0x09a8, zztt -> 0x09ad, zzgx -> 0x09b2, zzcc -> 0x09b7, zzrq -> 0x09ce, zziz -> 0x09d8, TryCatch #8 {zzcc -> 0x09b7, zzgx -> 0x09b2, zziz -> 0x09d8, zzrq -> 0x09ce, zztt -> 0x09ad, IOException -> 0x09a8, RuntimeException -> 0x097e, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:9:0x0029, B:13:0x002e, B:14:0x0033, B:17:0x003a, B:19:0x0043, B:21:0x0051, B:22:0x0054, B:24:0x0059, B:25:0x0064, B:26:0x0074, B:27:0x0088, B:28:0x009a, B:30:0x00a9, B:31:0x00ad, B:32:0x00bb, B:34:0x00ca, B:35:0x00e6, B:36:0x00f6, B:37:0x00ff, B:39:0x0111, B:40:0x011d, B:41:0x012d, B:43:0x0139, B:46:0x0144, B:47:0x014b, B:48:0x0158, B:51:0x015f, B:53:0x0167, B:55:0x016b, B:57:0x0171, B:59:0x0179, B:61:0x0181, B:63:0x0184, B:68:0x0189, B:77:0x0196, B:79:0x0197, B:82:0x019e, B:84:0x01ac, B:86:0x01b1, B:88:0x01c1, B:89:0x01c6, B:90:0x01cb, B:92:0x01d7, B:93:0x01de, B:94:0x01e3, B:96:0x01ef, B:98:0x021b, B:99:0x023c, B:100:0x0240, B:102:0x0245, B:104:0x0256, B:106:0x0262, B:107:0x0265, B:116:0x0270, B:117:0x0271, B:118:0x0277, B:119:0x027e, B:120:0x028f, B:122:0x02b6, B:130:0x03cd, B:131:0x039a, B:158:0x0396, B:173:0x03de, B:174:0x03eb, B:188:0x02d8, B:191:0x02eb, B:193:0x02fb, B:195:0x0312, B:197:0x031c, B:204:0x03ec, B:206:0x0400, B:209:0x040a, B:211:0x0419, B:213:0x0425, B:215:0x043a, B:216:0x043f, B:217:0x0443, B:219:0x0447, B:220:0x0454, B:223:0x05b0, B:225:0x05b8, B:227:0x05c0, B:230:0x05c5, B:231:0x05d1, B:233:0x05d7, B:235:0x05df, B:240:0x05ef, B:242:0x05f5, B:244:0x0615, B:246:0x061b, B:239:0x0620, B:253:0x0625, B:255:0x0629, B:257:0x062f, B:259:0x0633, B:261:0x063b, B:263:0x0641, B:265:0x064b, B:268:0x0651, B:269:0x0654, B:271:0x065d, B:273:0x066f, B:275:0x0678, B:277:0x0680, B:280:0x068a, B:281:0x06b6, B:283:0x06bc, B:285:0x06c2, B:287:0x06c9, B:300:0x0463, B:302:0x0469, B:305:0x046f, B:308:0x047a, B:310:0x047f, B:313:0x048d, B:316:0x0493, B:318:0x049b, B:322:0x049e, B:324:0x04a6, B:326:0x04b4, B:328:0x04f0, B:330:0x04fa, B:333:0x0505, B:335:0x050d, B:337:0x0510, B:340:0x0513, B:342:0x0519, B:344:0x0528, B:346:0x052e, B:348:0x053a, B:350:0x0544, B:352:0x0555, B:356:0x055b, B:355:0x0566, B:361:0x056b, B:363:0x0576, B:366:0x057b, B:368:0x0581, B:370:0x0589, B:372:0x058f, B:374:0x0595, B:378:0x05a3, B:379:0x05aa, B:381:0x05ad, B:387:0x0451, B:388:0x06d5, B:392:0x06e0, B:394:0x06ea, B:395:0x06ef, B:397:0x06fd, B:398:0x0715, B:400:0x071b, B:402:0x0723, B:404:0x072a, B:407:0x0733, B:411:0x0742, B:416:0x074f, B:418:0x0755, B:426:0x0768, B:429:0x076d, B:437:0x0779, B:439:0x077f, B:443:0x078c, B:445:0x0794, B:447:0x0798, B:448:0x07a3, B:450:0x07a9, B:451:0x089b, B:454:0x08a3, B:456:0x08a8, B:458:0x08b0, B:460:0x08be, B:462:0x08c5, B:466:0x08c9, B:468:0x08cf, B:470:0x08d8, B:472:0x08de, B:474:0x08e9, B:475:0x08ed, B:476:0x090c, B:478:0x0912, B:481:0x091b, B:484:0x093b, B:490:0x092c, B:492:0x0930, B:493:0x0936, B:495:0x08f0, B:498:0x08fe, B:499:0x0905, B:501:0x07b2, B:503:0x07b9, B:505:0x07bd, B:508:0x0843, B:510:0x084f, B:513:0x07ca, B:515:0x07ce, B:517:0x07e2, B:518:0x07f0, B:520:0x07fc, B:523:0x0805, B:525:0x080f, B:530:0x081a, B:536:0x0853, B:538:0x085a, B:540:0x085e, B:543:0x0867, B:545:0x0877, B:547:0x087f, B:549:0x0889, B:551:0x088e, B:553:0x0893, B:554:0x0898, B:556:0x0772, B:557:0x0940, B:560:0x0947, B:562:0x094f, B:565:0x096d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0912 A[Catch: RuntimeException -> 0x097e, IOException -> 0x09a8, zztt -> 0x09ad, zzgx -> 0x09b2, zzcc -> 0x09b7, zzrq -> 0x09ce, zziz -> 0x09d8, TryCatch #8 {zzcc -> 0x09b7, zzgx -> 0x09b2, zziz -> 0x09d8, zzrq -> 0x09ce, zztt -> 0x09ad, IOException -> 0x09a8, RuntimeException -> 0x097e, blocks: (B:3:0x0006, B:4:0x0011, B:8:0x0016, B:9:0x0029, B:13:0x002e, B:14:0x0033, B:17:0x003a, B:19:0x0043, B:21:0x0051, B:22:0x0054, B:24:0x0059, B:25:0x0064, B:26:0x0074, B:27:0x0088, B:28:0x009a, B:30:0x00a9, B:31:0x00ad, B:32:0x00bb, B:34:0x00ca, B:35:0x00e6, B:36:0x00f6, B:37:0x00ff, B:39:0x0111, B:40:0x011d, B:41:0x012d, B:43:0x0139, B:46:0x0144, B:47:0x014b, B:48:0x0158, B:51:0x015f, B:53:0x0167, B:55:0x016b, B:57:0x0171, B:59:0x0179, B:61:0x0181, B:63:0x0184, B:68:0x0189, B:77:0x0196, B:79:0x0197, B:82:0x019e, B:84:0x01ac, B:86:0x01b1, B:88:0x01c1, B:89:0x01c6, B:90:0x01cb, B:92:0x01d7, B:93:0x01de, B:94:0x01e3, B:96:0x01ef, B:98:0x021b, B:99:0x023c, B:100:0x0240, B:102:0x0245, B:104:0x0256, B:106:0x0262, B:107:0x0265, B:116:0x0270, B:117:0x0271, B:118:0x0277, B:119:0x027e, B:120:0x028f, B:122:0x02b6, B:130:0x03cd, B:131:0x039a, B:158:0x0396, B:173:0x03de, B:174:0x03eb, B:188:0x02d8, B:191:0x02eb, B:193:0x02fb, B:195:0x0312, B:197:0x031c, B:204:0x03ec, B:206:0x0400, B:209:0x040a, B:211:0x0419, B:213:0x0425, B:215:0x043a, B:216:0x043f, B:217:0x0443, B:219:0x0447, B:220:0x0454, B:223:0x05b0, B:225:0x05b8, B:227:0x05c0, B:230:0x05c5, B:231:0x05d1, B:233:0x05d7, B:235:0x05df, B:240:0x05ef, B:242:0x05f5, B:244:0x0615, B:246:0x061b, B:239:0x0620, B:253:0x0625, B:255:0x0629, B:257:0x062f, B:259:0x0633, B:261:0x063b, B:263:0x0641, B:265:0x064b, B:268:0x0651, B:269:0x0654, B:271:0x065d, B:273:0x066f, B:275:0x0678, B:277:0x0680, B:280:0x068a, B:281:0x06b6, B:283:0x06bc, B:285:0x06c2, B:287:0x06c9, B:300:0x0463, B:302:0x0469, B:305:0x046f, B:308:0x047a, B:310:0x047f, B:313:0x048d, B:316:0x0493, B:318:0x049b, B:322:0x049e, B:324:0x04a6, B:326:0x04b4, B:328:0x04f0, B:330:0x04fa, B:333:0x0505, B:335:0x050d, B:337:0x0510, B:340:0x0513, B:342:0x0519, B:344:0x0528, B:346:0x052e, B:348:0x053a, B:350:0x0544, B:352:0x0555, B:356:0x055b, B:355:0x0566, B:361:0x056b, B:363:0x0576, B:366:0x057b, B:368:0x0581, B:370:0x0589, B:372:0x058f, B:374:0x0595, B:378:0x05a3, B:379:0x05aa, B:381:0x05ad, B:387:0x0451, B:388:0x06d5, B:392:0x06e0, B:394:0x06ea, B:395:0x06ef, B:397:0x06fd, B:398:0x0715, B:400:0x071b, B:402:0x0723, B:404:0x072a, B:407:0x0733, B:411:0x0742, B:416:0x074f, B:418:0x0755, B:426:0x0768, B:429:0x076d, B:437:0x0779, B:439:0x077f, B:443:0x078c, B:445:0x0794, B:447:0x0798, B:448:0x07a3, B:450:0x07a9, B:451:0x089b, B:454:0x08a3, B:456:0x08a8, B:458:0x08b0, B:460:0x08be, B:462:0x08c5, B:466:0x08c9, B:468:0x08cf, B:470:0x08d8, B:472:0x08de, B:474:0x08e9, B:475:0x08ed, B:476:0x090c, B:478:0x0912, B:481:0x091b, B:484:0x093b, B:490:0x092c, B:492:0x0930, B:493:0x0936, B:495:0x08f0, B:498:0x08fe, B:499:0x0905, B:501:0x07b2, B:503:0x07b9, B:505:0x07bd, B:508:0x0843, B:510:0x084f, B:513:0x07ca, B:515:0x07ce, B:517:0x07e2, B:518:0x07f0, B:520:0x07fc, B:523:0x0805, B:525:0x080f, B:530:0x081a, B:536:0x0853, B:538:0x085a, B:540:0x085e, B:543:0x0867, B:545:0x0877, B:547:0x087f, B:549:0x0889, B:551:0x088e, B:553:0x0893, B:554:0x0898, B:556:0x0772, B:557:0x0940, B:560:0x0947, B:562:0x094f, B:565:0x096d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0924  */
    /* JADX WARN: Type inference failed for: r2v36, types: [com.google.android.gms.internal.ads.zzyw, com.google.android.gms.internal.ads.zzhy] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r36) {
        /*
            Method dump skipped, instructions count: 2748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkz.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zziw
    public final void zza(zzcg zzcgVar) {
        this.zzh.zzc(16, zzcgVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final /* bridge */ /* synthetic */ void zzg(zzwj zzwjVar) {
        this.zzh.zzc(9, (zzup) zzwjVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        this.zzh.zzc(8, zzupVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzcx zzcxVar, int i10, long j10) {
        this.zzh.zzc(3, new zzky(zzcxVar, i10, j10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final synchronized void zzm(zzmb zzmbVar) {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzmbVar).zza();
            return;
        }
        zzff.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzmbVar.zzh(false);
    }

    public final void zzn(boolean z10, int i10) {
        this.zzh.zzd(1, z10 ? 1 : 0, i10).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzw && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzad(new zzkp(this), this.zzs);
            return this.zzw;
        }
        return true;
    }

    public final void zzq(List list, int i10, long j10, zzwk zzwkVar) {
        this.zzh.zzc(17, new zzku(list, zzwkVar, i10, j10, null)).zza();
    }
}
