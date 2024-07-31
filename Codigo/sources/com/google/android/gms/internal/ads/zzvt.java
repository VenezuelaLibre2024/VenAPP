package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzvt implements zzup, zzacx, zzzc, zzzh, zzwf {
    private static final Map zzb;
    private static final zzam zzc;
    private long zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private boolean zzJ;
    private int zzK;
    private boolean zzL;
    private boolean zzM;
    private final zzzb zzN;
    private final zzyx zzO;
    private final Uri zzd;
    private final zzgw zze;
    private final zzry zzf;
    private final zzva zzg;
    private final zzrs zzh;
    private final zzvp zzi;
    private final long zzj;
    private final zzzk zzk = new zzzk("ProgressiveMediaPeriod");
    private final zzvi zzl;
    private final zzeo zzm;
    private final Runnable zzn;
    private final Runnable zzo;
    private final Handler zzp;
    private final boolean zzq;
    private zzuo zzr;
    private zzaga zzs;
    private zzwg[] zzt;
    private zzvr[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzvs zzy;
    private zzadu zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzak zzakVar = new zzak();
        zzakVar.zzK("icy");
        zzakVar.zzW("application/x-icy");
        zzc = zzakVar.zzac();
    }

    public zzvt(Uri uri, zzgw zzgwVar, zzvi zzviVar, zzry zzryVar, zzrs zzrsVar, zzzb zzzbVar, zzva zzvaVar, zzvp zzvpVar, zzyx zzyxVar, String str, int i10, long j10) {
        this.zzd = uri;
        this.zze = zzgwVar;
        this.zzf = zzryVar;
        this.zzh = zzrsVar;
        this.zzN = zzzbVar;
        this.zzg = zzvaVar;
        this.zzi = zzvpVar;
        this.zzO = zzyxVar;
        this.zzj = i10;
        this.zzl = zzviVar;
        this.zzA = j10;
        this.zzq = j10 != -9223372036854775807L;
        this.zzm = new zzeo(zzel.zza);
        this.zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvk
            public /* synthetic */ zzvk() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzvt.this.zzU();
            }
        };
        this.zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvl
            public /* synthetic */ zzvl() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzvt.this.zzE();
            }
        };
        this.zzp = zzfy.zzw(null);
        this.zzu = new zzvr[0];
        this.zzt = new zzwg[0];
        this.zzI = -9223372036854775807L;
        this.zzC = 1;
    }

    private final int zzQ() {
        int i10 = 0;
        for (zzwg zzwgVar : this.zzt) {
            i10 += zzwgVar.zzd();
        }
        return i10;
    }

    public final long zzR(boolean z10) {
        int i10;
        long j10 = Long.MIN_VALUE;
        while (true) {
            zzwg[] zzwgVarArr = this.zzt;
            if (i10 >= zzwgVarArr.length) {
                return j10;
            }
            if (!z10) {
                zzvs zzvsVar = this.zzy;
                zzvsVar.getClass();
                i10 = zzvsVar.zzc[i10] ? 0 : i10 + 1;
            }
            j10 = Math.max(j10, zzwgVarArr[i10].zzh());
        }
    }

    private final zzaea zzS(zzvr zzvrVar) {
        int length = this.zzt.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzvrVar.equals(this.zzu[i10])) {
                return this.zzt[i10];
            }
        }
        zzwg zzwgVar = new zzwg(this.zzO, this.zzf, this.zzh);
        zzwgVar.zzv(this);
        int i11 = length + 1;
        zzvr[] zzvrVarArr = (zzvr[]) Arrays.copyOf(this.zzu, i11);
        zzvrVarArr[length] = zzvrVar;
        int i12 = zzfy.zza;
        this.zzu = zzvrVarArr;
        zzwg[] zzwgVarArr = (zzwg[]) Arrays.copyOf(this.zzt, i11);
        zzwgVarArr[length] = zzwgVar;
        this.zzt = zzwgVarArr;
        return zzwgVar;
    }

    private final void zzT() {
        zzek.zzf(this.zzw);
        this.zzy.getClass();
        this.zzz.getClass();
    }

    public final void zzU() {
        int i10;
        if (this.zzM || this.zzw || !this.zzv || this.zzz == null) {
            return;
        }
        for (zzwg zzwgVar : this.zzt) {
            if (zzwgVar.zzi() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzt.length;
        zzcz[] zzczVarArr = new zzcz[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zzam zzi = this.zzt[i11].zzi();
            zzi.getClass();
            String str = zzi.zzm;
            boolean zzg = zzcb.zzg(str);
            boolean z10 = zzg || zzcb.zzh(str);
            zArr[i11] = z10;
            this.zzx = z10 | this.zzx;
            zzaga zzagaVar = this.zzs;
            if (zzagaVar != null) {
                if (zzg || this.zzu[i11].zzb) {
                    zzby zzbyVar = zzi.zzk;
                    zzby zzbyVar2 = zzbyVar == null ? new zzby(-9223372036854775807L, zzagaVar) : zzbyVar.zzc(zzagaVar);
                    zzak zzb2 = zzi.zzb();
                    zzb2.zzP(zzbyVar2);
                    zzi = zzb2.zzac();
                }
                if (zzg && zzi.zzg == -1 && zzi.zzh == -1 && (i10 = zzagaVar.zza) != -1) {
                    zzak zzb3 = zzi.zzb();
                    zzb3.zzx(i10);
                    zzi = zzb3.zzac();
                }
            }
            zzczVarArr[i11] = new zzcz(Integer.toString(i11), zzi.zzc(this.zzf.zza(zzi)));
        }
        this.zzy = new zzvs(new zzws(zzczVarArr), zArr);
        this.zzw = true;
        zzuo zzuoVar = this.zzr;
        zzuoVar.getClass();
        zzuoVar.zzi(this);
    }

    private final void zzV(int i10) {
        zzT();
        zzvs zzvsVar = this.zzy;
        boolean[] zArr = zzvsVar.zzd;
        if (zArr[i10]) {
            return;
        }
        zzam zzb2 = zzvsVar.zza.zzb(i10).zzb(0);
        this.zzg.zzc(new zzun(1, zzcb.zzb(zzb2.zzm), zzb2, 0, null, zzfy.zzt(this.zzH), -9223372036854775807L));
        zArr[i10] = true;
    }

    private final void zzW(int i10) {
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (this.zzJ && zArr[i10] && !this.zzt[i10].zzy(false)) {
            this.zzI = 0L;
            this.zzJ = false;
            this.zzE = true;
            this.zzH = 0L;
            this.zzK = 0;
            for (zzwg zzwgVar : this.zzt) {
                zzwgVar.zzq(false);
            }
            zzuo zzuoVar = this.zzr;
            zzuoVar.getClass();
            zzuoVar.zzg(this);
        }
    }

    private final void zzX() {
        zzhb zzhbVar;
        long j10;
        long j11;
        zzvo zzvoVar = new zzvo(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzw) {
            zzek.zzf(zzY());
            long j12 = this.zzA;
            if (j12 != -9223372036854775807L && this.zzI > j12) {
                this.zzL = true;
                this.zzI = -9223372036854775807L;
                return;
            }
            zzadu zzaduVar = this.zzz;
            zzaduVar.getClass();
            zzvo.zzf(zzvoVar, zzaduVar.zzg(this.zzI).zza.zzc, this.zzI);
            for (zzwg zzwgVar : this.zzt) {
                zzwgVar.zzu(this.zzI);
            }
            this.zzI = -9223372036854775807L;
        }
        this.zzK = zzQ();
        long zza = this.zzk.zza(zzvoVar, this, zzzb.zza(this.zzC));
        zzhbVar = zzvoVar.zzl;
        zzva zzvaVar = this.zzg;
        j10 = zzvoVar.zzb;
        zzui zzuiVar = new zzui(j10, zzhbVar, zzhbVar.zza, Collections.emptyMap(), zza, 0L, 0L);
        j11 = zzvoVar.zzk;
        zzvaVar.zzg(zzuiVar, new zzun(1, -1, null, 0, null, zzfy.zzt(j11), zzfy.zzt(this.zzA)));
    }

    private final boolean zzY() {
        return this.zzI != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzE || zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzD() {
        this.zzv = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzM) {
            return;
        }
        zzuo zzuoVar = this.zzr;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    public final /* synthetic */ void zzF() {
        this.zzG = true;
    }

    public final /* synthetic */ void zzG(zzadu zzaduVar) {
        this.zzz = this.zzs == null ? zzaduVar : new zzadt(-9223372036854775807L, 0L);
        if (zzaduVar.zza() == -9223372036854775807L && this.zzA != -9223372036854775807L) {
            this.zzz = new zzvn(this, this.zzz);
        }
        this.zzA = this.zzz.zza();
        boolean z10 = false;
        if (!this.zzG && zzaduVar.zza() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzB = z10;
        this.zzC = true == z10 ? 7 : 1;
        this.zzi.zza(this.zzA, zzaduVar.zzh(), this.zzB);
        if (this.zzw) {
            return;
        }
        zzU();
    }

    final void zzH() {
        this.zzk.zzi(zzzb.zza(this.zzC));
    }

    public final void zzI(int i10) {
        this.zzt[i10].zzn();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final /* bridge */ /* synthetic */ void zzJ(zzzg zzzgVar, long j10, long j11, boolean z10) {
        zzhx zzhxVar;
        long j12;
        zzhb zzhbVar;
        long j13;
        long unused;
        zzvo zzvoVar = (zzvo) zzzgVar;
        zzhxVar = zzvoVar.zzd;
        j12 = zzvoVar.zzb;
        zzhbVar = zzvoVar.zzl;
        zzui zzuiVar = new zzui(j12, zzhbVar, zzhxVar.zzh(), zzhxVar.zzi(), j10, j11, zzhxVar.zzg());
        unused = zzvoVar.zzb;
        j13 = zzvoVar.zzk;
        this.zzg.zzd(zzuiVar, new zzun(1, -1, null, 0, null, zzfy.zzt(j13), zzfy.zzt(this.zzA)));
        if (z10) {
            return;
        }
        for (zzwg zzwgVar : this.zzt) {
            zzwgVar.zzq(false);
        }
        if (this.zzF > 0) {
            zzuo zzuoVar = this.zzr;
            zzuoVar.getClass();
            zzuoVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final /* bridge */ /* synthetic */ void zzK(zzzg zzzgVar, long j10, long j11) {
        zzhx zzhxVar;
        long j12;
        zzhb zzhbVar;
        long j13;
        zzadu zzaduVar;
        long unused;
        if (this.zzA == -9223372036854775807L && (zzaduVar = this.zzz) != null) {
            boolean zzh = zzaduVar.zzh();
            long zzR = zzR(true);
            long j14 = zzR == Long.MIN_VALUE ? 0L : zzR + 10000;
            this.zzA = j14;
            this.zzi.zza(j14, zzh, this.zzB);
        }
        zzvo zzvoVar = (zzvo) zzzgVar;
        zzhxVar = zzvoVar.zzd;
        j12 = zzvoVar.zzb;
        zzhbVar = zzvoVar.zzl;
        zzui zzuiVar = new zzui(j12, zzhbVar, zzhxVar.zzh(), zzhxVar.zzi(), j10, j11, zzhxVar.zzg());
        unused = zzvoVar.zzb;
        zzva zzvaVar = this.zzg;
        j13 = zzvoVar.zzk;
        zzvaVar.zze(zzuiVar, new zzun(1, -1, null, 0, null, zzfy.zzt(j13), zzfy.zzt(this.zzA)));
        this.zzL = true;
        zzuo zzuoVar = this.zzr;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final void zzL() {
        for (zzwg zzwgVar : this.zzt) {
            zzwgVar.zzp();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzM(zzam zzamVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzwg zzwgVar : this.zzt) {
                zzwgVar.zzo();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzM = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final void zzO(zzadu zzaduVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvm
            public final /* synthetic */ zzadu zzb;

            public /* synthetic */ zzvm(zzadu zzaduVar2) {
                r2 = zzaduVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzvt.this.zzG(r2);
            }
        });
    }

    public final boolean zzP(int i10) {
        return !zzZ() && this.zzt[i10].zzy(this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j10, zzmj zzmjVar) {
        zzT();
        if (!this.zzz.zzh()) {
            return 0L;
        }
        zzads zzg = this.zzz.zzg(j10);
        zzadv zzadvVar = zzg.zza;
        zzadv zzadvVar2 = zzg.zzb;
        long j11 = zzmjVar.zzf;
        if (j11 == 0) {
            if (zzmjVar.zzg == 0) {
                return j10;
            }
            j11 = 0;
        }
        long j12 = zzadvVar.zzb;
        int i10 = zzfy.zza;
        long j13 = j10 - j11;
        long j14 = zzmjVar.zzg;
        long j15 = j10 + j14;
        long j16 = j10 ^ j15;
        long j17 = j14 ^ j15;
        if (((j10 ^ j11) & (j10 ^ j13)) < 0) {
            j13 = Long.MIN_VALUE;
        }
        if ((j16 & j17) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z10 = j13 <= j12 && j12 <= j15;
        long j18 = zzadvVar2.zzb;
        boolean z11 = j13 <= j18 && j18 <= j15;
        if (z10 && z11) {
            if (Math.abs(j12 - j10) > Math.abs(j18 - j10)) {
                return j18;
            }
        } else if (!z10) {
            return z11 ? j18 : j13;
        }
        return j12;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzb() {
        long j10;
        zzT();
        if (this.zzL || this.zzF == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzI;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzvs zzvsVar = this.zzy;
                if (zzvsVar.zzb[i10] && zzvsVar.zzc[i10] && !this.zzt[i10].zzx()) {
                    j10 = Math.min(j10, this.zzt[i10].zzh());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = zzR(false);
        }
        return j10 == Long.MIN_VALUE ? this.zzH : j10;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        if (!this.zzE) {
            return -9223372036854775807L;
        }
        if (!this.zzL && zzQ() <= this.zzK) {
            return -9223372036854775807L;
        }
        this.zzE = false;
        return this.zzH;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zze(long j10) {
        int i10;
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (true != this.zzz.zzh()) {
            j10 = 0;
        }
        this.zzE = false;
        this.zzH = j10;
        if (zzY()) {
            this.zzI = j10;
            return j10;
        }
        if (this.zzC != 7) {
            int length = this.zzt.length;
            for (0; i10 < length; i10 + 1) {
                zzwg zzwgVar = this.zzt[i10];
                i10 = ((this.zzq ? zzwgVar.zzz(zzwgVar.zza()) : zzwgVar.zzA(j10, false)) || (!zArr[i10] && this.zzx)) ? i10 + 1 : 0;
            }
            return j10;
        }
        this.zzJ = false;
        this.zzI = j10;
        this.zzL = false;
        zzzk zzzkVar = this.zzk;
        if (zzzkVar.zzl()) {
            for (zzwg zzwgVar2 : this.zzt) {
                zzwgVar2.zzk();
            }
            this.zzk.zzg();
        } else {
            zzzkVar.zzh();
            for (zzwg zzwgVar3 : this.zzt) {
                zzwgVar3.zzq(false);
            }
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r2 == 0) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    @Override // com.google.android.gms.internal.ads.zzup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.zzyi[] r8, boolean[] r9, com.google.android.gms.internal.ads.zzwh[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvt.zzf(com.google.android.gms.internal.ads.zzyi[], boolean[], com.google.android.gms.internal.ads.zzwh[], boolean[], long):long");
    }

    public final int zzg(int i10, zzlb zzlbVar, zzih zzihVar, int i11) {
        if (zzZ()) {
            return -3;
        }
        zzV(i10);
        int zze = this.zzt[i10].zze(zzlbVar, zzihVar, i11, this.zzL);
        if (zze == -3) {
            zzW(i10);
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzws zzh() {
        zzT();
        return this.zzy.zza;
    }

    public final int zzi(int i10, long j10) {
        if (zzZ()) {
            return 0;
        }
        zzV(i10);
        zzwg zzwgVar = this.zzt[i10];
        int zzc2 = zzwgVar.zzc(j10, this.zzL);
        zzwgVar.zzw(zzc2);
        if (zzc2 != 0) {
            return zzc2;
        }
        zzW(i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j10, boolean z10) {
        if (this.zzq) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzy.zzc;
        int length = this.zzt.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.zzt[i10].zzj(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() {
        zzH();
        if (this.zzL && !this.zzw) {
            throw zzcc.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j10) {
        this.zzr = zzuoVar;
        this.zzm.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final void zzm(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzo(zzlg zzlgVar) {
        if (this.zzL) {
            return false;
        }
        zzzk zzzkVar = this.zzk;
        if (zzzkVar.zzk() || this.zzJ) {
            return false;
        }
        if (this.zzw && this.zzF == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (zzzkVar.zzl()) {
            return zze;
        }
        zzX();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // com.google.android.gms.internal.ads.zzzc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzze zzu(com.google.android.gms.internal.ads.zzzg r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvt.zzu(com.google.android.gms.internal.ads.zzzg, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzze");
    }

    public final zzaea zzv() {
        return zzS(new zzvr(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzacx
    public final zzaea zzw(int i10, int i11) {
        return zzS(new zzvr(i10, false));
    }
}
