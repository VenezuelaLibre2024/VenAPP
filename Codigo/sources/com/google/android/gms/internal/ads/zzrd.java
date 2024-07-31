package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzrd implements zzqb {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private float zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private zzl zzQ;
    private zzqp zzR;
    private long zzS;
    private boolean zzT;
    private boolean zzU;
    private long zzV;
    private long zzW;
    private Handler zzX;
    private final zzqt zzY;
    private final zzqj zzZ;
    private final zzqg zzd;
    private final zzrn zze;
    private final zzgaa zzf;
    private final zzgaa zzg;
    private final zzeo zzh;
    private final zzqf zzi;
    private final ArrayDeque zzj;
    private zzrb zzk;
    private final zzqw zzl;
    private final zzqw zzm;
    private final zzqq zzn;
    private zzpb zzo;
    private zzpy zzp;
    private zzqs zzq;
    private zzqs zzr;
    private zzdq zzs;
    private AudioTrack zzt;
    private zzpd zzu;
    private zzk zzv = zzk.zza;
    private zzqv zzw;
    private zzqv zzx;
    private zzcg zzy;
    private boolean zzz;

    public /* synthetic */ zzrd(zzqr zzqrVar, zzrc zzrcVar) {
        zzpd zzpdVar;
        zzqt zzqtVar;
        zzqq zzqqVar;
        zzqj zzqjVar;
        zzpdVar = zzqrVar.zza;
        this.zzu = zzpdVar;
        zzqtVar = zzqrVar.zzd;
        this.zzY = zzqtVar;
        int i10 = zzfy.zza;
        zzqqVar = zzqrVar.zzc;
        this.zzn = zzqqVar;
        zzqjVar = zzqrVar.zze;
        zzqjVar.getClass();
        this.zzZ = zzqjVar;
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zzh = zzeoVar;
        zzeoVar.zze();
        this.zzi = new zzqf(new zzqy(this, null));
        zzqg zzqgVar = new zzqg();
        this.zzd = zzqgVar;
        zzrn zzrnVar = new zzrn();
        this.zze = zzrnVar;
        this.zzf = zzgaa.zzo(new zzdx(), zzqgVar, zzrnVar);
        this.zzg = zzgaa.zzm(new zzrm());
        this.zzI = 1.0f;
        this.zzP = 0;
        this.zzQ = new zzl(0, 0.0f);
        zzcg zzcgVar = zzcg.zza;
        this.zzx = new zzqv(zzcgVar, 0L, 0L, null);
        this.zzy = zzcgVar;
        this.zzz = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqw(100L);
        this.zzm = new zzqw(100L);
    }

    public static /* synthetic */ void zzF(zzrd zzrdVar) {
        if (zzrdVar.zzW >= 1000000) {
            ((zzri) zzrdVar.zzp).zza.zzn = true;
        }
        zzrdVar.zzW = 0L;
    }

    public static /* synthetic */ void zzG(AudioTrack audioTrack, zzpy zzpyVar, Handler handler, zzpv zzpvVar, zzeo zzeoVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpyVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzql
                    public final /* synthetic */ zzpv zzb;

                    public /* synthetic */ zzql(zzpv zzpvVar2) {
                        r2 = zzpvVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpt zzptVar;
                        zzptVar = ((zzri) zzpy.this).zza.zzc;
                        zzptVar.zzd(r2);
                    }
                });
            }
            zzeoVar.zze();
            synchronized (zza) {
                int i10 = zzc - 1;
                zzc = i10;
                if (i10 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th2) {
            if (zzpyVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzql
                    public final /* synthetic */ zzpv zzb;

                    public /* synthetic */ zzql(zzpv zzpvVar2) {
                        r2 = zzpvVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpt zzptVar;
                        zzptVar = ((zzri) zzpy.this).zza.zzc;
                        zzptVar.zzd(r2);
                    }
                });
            }
            zzeoVar.zze();
            synchronized (zza) {
                int i11 = zzc - 1;
                zzc = i11;
                if (i11 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th2;
            }
        }
    }

    public final long zzI() {
        return this.zzr.zzc == 0 ? this.zzA / r0.zzb : this.zzB;
    }

    public final long zzJ() {
        zzqs zzqsVar = this.zzr;
        if (zzqsVar.zzc != 0) {
            return this.zzD;
        }
        long j10 = this.zzC;
        long j11 = zzqsVar.zzd;
        int i10 = zzfy.zza;
        return ((j10 + j11) - 1) / j11;
    }

    private final AudioTrack zzK(zzqs zzqsVar) {
        try {
            return zzqsVar.zza(this.zzv, this.zzP);
        } catch (zzpx e10) {
            zzpy zzpyVar = this.zzp;
            if (zzpyVar != null) {
                zzpyVar.zza(e10);
            }
            throw e10;
        }
    }

    private final void zzL(long j10) {
        zzcg zzcgVar;
        boolean z10;
        zzpt zzptVar;
        if (zzW()) {
            zzqt zzqtVar = this.zzY;
            zzcgVar = this.zzy;
            zzqtVar.zzc(zzcgVar);
        } else {
            zzcgVar = zzcg.zza;
        }
        zzcg zzcgVar2 = zzcgVar;
        this.zzy = zzcgVar2;
        if (zzW()) {
            zzqt zzqtVar2 = this.zzY;
            z10 = this.zzz;
            zzqtVar2.zzd(z10);
        } else {
            z10 = false;
        }
        this.zzz = z10;
        this.zzj.add(new zzqv(zzcgVar2, Math.max(0L, j10), zzfy.zzr(zzJ(), this.zzr.zze), null));
        zzR();
        zzpy zzpyVar = this.zzp;
        if (zzpyVar != null) {
            boolean z11 = this.zzz;
            zzptVar = ((zzri) zzpyVar).zza.zzc;
            zzptVar.zzw(z11);
        }
    }

    private final void zzM() {
        if (this.zzr.zzc()) {
            this.zzT = true;
        }
    }

    private final void zzN() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        this.zzi.zzb(zzJ());
        this.zzt.stop();
    }

    private final void zzO(long j10) {
        ByteBuffer zzb2;
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzJ;
            if (byteBuffer == null) {
                byteBuffer = zzdt.zza;
            }
            zzS(byteBuffer, j10);
            return;
        }
        while (!this.zzs.zzg()) {
            do {
                zzb2 = this.zzs.zzb();
                if (zzb2.hasRemaining()) {
                    zzS(zzb2, j10);
                } else {
                    ByteBuffer byteBuffer2 = this.zzJ;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzs.zze(this.zzJ);
                    }
                }
            } while (!zzb2.hasRemaining());
            return;
        }
    }

    private final void zzP(zzcg zzcgVar) {
        zzqv zzqvVar = new zzqv(zzcgVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzU()) {
            this.zzw = zzqvVar;
        } else {
            this.zzx = zzqvVar;
        }
    }

    private final void zzQ() {
        if (zzU()) {
            int i10 = zzfy.zza;
            this.zzt.setVolume(this.zzI);
        }
    }

    private final void zzR() {
        zzdq zzdqVar = this.zzr.zzi;
        this.zzs = zzdqVar;
        zzdqVar.zzc();
    }

    private final void zzS(ByteBuffer byteBuffer, long j10) {
        zzpy zzpyVar;
        zzme zzmeVar;
        zzme zzmeVar2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzL;
            if (byteBuffer2 != null) {
                zzek.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzL = byteBuffer;
                int i10 = zzfy.zza;
            }
            int remaining = byteBuffer.remaining();
            int i11 = zzfy.zza;
            int write = this.zzt.write(byteBuffer, remaining, 1);
            this.zzS = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((zzfy.zza >= 24 && write == -6) || write == -32) {
                    if (zzJ() <= 0) {
                        if (zzV(this.zzt)) {
                            zzM();
                        }
                    }
                    r10 = true;
                }
                zzqa zzqaVar = new zzqa(write, this.zzr.zza, r10);
                zzpy zzpyVar2 = this.zzp;
                if (zzpyVar2 != null) {
                    zzpyVar2.zza(zzqaVar);
                }
                if (zzqaVar.zzb) {
                    this.zzu = zzpd.zza;
                    throw zzqaVar;
                }
                this.zzm.zzb(zzqaVar);
                return;
            }
            this.zzm.zza();
            if (zzV(this.zzt)) {
                if (this.zzD > 0) {
                    this.zzU = false;
                }
                if (this.zzO && (zzpyVar = this.zzp) != null && write < remaining) {
                    zzrj zzrjVar = ((zzri) zzpyVar).zza;
                    zzmeVar = zzrjVar.zzm;
                    if (zzmeVar != null) {
                        zzmeVar2 = zzrjVar.zzm;
                        zzmeVar2.zza();
                    }
                }
            }
            int i12 = this.zzr.zzc;
            if (i12 == 0) {
                this.zzC += write;
            }
            if (write == remaining) {
                if (i12 != 0) {
                    zzek.zzf(byteBuffer == this.zzJ);
                    this.zzD += this.zzE * this.zzK;
                }
                this.zzL = null;
            }
        }
    }

    private final boolean zzT() {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer == null) {
                return true;
            }
            zzS(byteBuffer, Long.MIN_VALUE);
            return this.zzL == null;
        }
        this.zzs.zzd();
        zzO(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzL;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzU() {
        return this.zzt != null;
    }

    private static boolean zzV(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzfy.zza < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    private final boolean zzW() {
        zzqs zzqsVar = this.zzr;
        if (zzqsVar.zzc != 0) {
            return false;
        }
        int i10 = zzqsVar.zza.zzB;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final int zza(zzam zzamVar) {
        if (!"audio/raw".equals(zzamVar.zzm)) {
            return this.zzu.zza(zzamVar, this.zzv) != null ? 2 : 0;
        }
        boolean zzH = zzfy.zzH(zzamVar.zzB);
        int i10 = zzamVar.zzB;
        if (zzH) {
            return i10 != 2 ? 1 : 2;
        }
        zzff.zzf("DefaultAudioSink", "Invalid PCM encoding: " + i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final long zzb(boolean z10) {
        long zzo;
        if (!zzU() || this.zzG) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzi.zza(z10), zzfy.zzr(zzJ(), this.zzr.zze));
        while (!this.zzj.isEmpty() && min >= ((zzqv) this.zzj.getFirst()).zzc) {
            this.zzx = (zzqv) this.zzj.remove();
        }
        zzqv zzqvVar = this.zzx;
        long j10 = min - zzqvVar.zzc;
        if (zzqvVar.zza.equals(zzcg.zza)) {
            zzo = this.zzx.zzb + j10;
        } else if (this.zzj.isEmpty()) {
            zzo = this.zzY.zza(j10) + this.zzx.zzb;
        } else {
            zzqv zzqvVar2 = (zzqv) this.zzj.getFirst();
            zzo = zzqvVar2.zzb - zzfy.zzo(zzqvVar2.zzc - min, this.zzx.zza.zzc);
        }
        long zzb2 = this.zzY.zzb();
        long zzr = zzo + zzfy.zzr(zzb2, this.zzr.zze);
        long j11 = this.zzV;
        if (zzb2 > j11) {
            long zzr2 = zzfy.zzr(zzb2 - j11, this.zzr.zze);
            this.zzV = zzb2;
            this.zzW += zzr2;
            if (this.zzX == null) {
                this.zzX = new Handler(Looper.myLooper());
            }
            this.zzX.removeCallbacksAndMessages(null);
            this.zzX.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqm
                public /* synthetic */ zzqm() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzrd.zzF(zzrd.this);
                }
            }, 100L);
        }
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final zzcg zzc() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final zzpg zzd(zzam zzamVar) {
        return this.zzT ? zzpg.zza : this.zzZ.zza(zzamVar, this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zze(zzam zzamVar, int i10, int[] iArr) {
        int intValue;
        zzdq zzdqVar;
        int i11;
        int intValue2;
        int i12;
        int i13;
        int i14;
        int i15;
        int max;
        if ("audio/raw".equals(zzamVar.zzm)) {
            zzek.zzd(zzfy.zzH(zzamVar.zzB));
            i11 = zzfy.zzl(zzamVar.zzB, zzamVar.zzz);
            zzfzx zzfzxVar = new zzfzx();
            zzfzxVar.zzh(this.zzf);
            zzfzxVar.zzg(this.zzY.zze());
            zzdq zzdqVar2 = new zzdq(zzfzxVar.zzi());
            if (zzdqVar2.equals(this.zzs)) {
                zzdqVar2 = this.zzs;
            }
            this.zze.zzq(zzamVar.zzC, zzamVar.zzD);
            this.zzd.zzo(iArr);
            try {
                zzdr zza2 = zzdqVar2.zza(new zzdr(zzamVar.zzA, zzamVar.zzz, zzamVar.zzB));
                intValue = zza2.zzd;
                i13 = zza2.zzb;
                int i16 = zza2.zzc;
                intValue2 = zzfy.zzg(i16);
                zzdqVar = zzdqVar2;
                i12 = zzfy.zzl(intValue, i16);
                i14 = 0;
            } catch (zzds e10) {
                throw new zzpw(e10, zzamVar);
            }
        } else {
            zzdq zzdqVar3 = new zzdq(zzgaa.zzl());
            int i17 = zzamVar.zzA;
            zzpg zzpgVar = zzpg.zza;
            Pair zza3 = this.zzu.zza(zzamVar, this.zzv);
            if (zza3 == null) {
                throw new zzpw("Unable to configure passthrough for: ".concat(String.valueOf(zzamVar)), zzamVar);
            }
            intValue = ((Integer) zza3.first).intValue();
            zzdqVar = zzdqVar3;
            i11 = -1;
            intValue2 = ((Integer) zza3.second).intValue();
            i12 = -1;
            i13 = i17;
            i14 = 2;
        }
        if (intValue == 0) {
            throw new zzpw("Invalid output encoding (mode=" + i14 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        if (intValue2 == 0) {
            throw new zzpw("Invalid output channel config (mode=" + i14 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i13, intValue2, intValue);
        zzek.zzf(minBufferSize != -2);
        int i18 = i12 != -1 ? i12 : 1;
        int i19 = zzamVar.zzi;
        int i20 = 250000;
        if (i14 == 0) {
            i15 = i14;
            max = Math.max(zzrf.zza(250000, i13, i18), Math.min(minBufferSize * 4, zzrf.zza(750000, i13, i18)));
        } else if (i14 != 1) {
            if (intValue == 5) {
                i20 = 500000;
            } else if (intValue == 8) {
                i20 = 1000000;
                intValue = 8;
            }
            i15 = i14;
            max = zzgcu.zza((i20 * (i19 != -1 ? zzgco.zza(i19, 8, RoundingMode.CEILING) : zzrf.zzb(intValue))) / 1000000);
        } else {
            i15 = i14;
            max = zzgcu.zza((zzrf.zzb(intValue) * 50000000) / 1000000);
        }
        this.zzT = false;
        zzqs zzqsVar = new zzqs(zzamVar, i11, i15, i12, i13, intValue2, intValue, (((Math.max(minBufferSize, max) + i18) - 1) / i18) * i18, zzdqVar, false, false, false);
        if (zzU()) {
            this.zzq = zzqsVar;
        } else {
            this.zzr = zzqsVar;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzqk.<init>(android.media.AudioTrack, com.google.android.gms.internal.ads.zzpy, android.os.Handler, com.google.android.gms.internal.ads.zzpv, com.google.android.gms.internal.ads.zzeo):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzf() {
        /*
            r12 = this;
            boolean r0 = r12.zzU()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Lad
            r12.zzA = r2
            r12.zzB = r2
            r12.zzC = r2
            r12.zzD = r2
            r0 = 0
            r12.zzU = r0
            r12.zzE = r0
            com.google.android.gms.internal.ads.zzqv r11 = new com.google.android.gms.internal.ads.zzqv
            com.google.android.gms.internal.ads.zzcg r5 = r12.zzy
            r6 = 0
            r8 = 0
            r10 = 0
            r4 = r11
            r4.<init>(r5, r6, r8, r10)
            r12.zzx = r11
            r12.zzH = r2
            r12.zzw = r1
            java.util.ArrayDeque r4 = r12.zzj
            r4.clear()
            r12.zzJ = r1
            r12.zzK = r0
            r12.zzL = r1
            r12.zzN = r0
            r12.zzM = r0
            com.google.android.gms.internal.ads.zzrn r0 = r12.zze
            r0.zzp()
            r12.zzR()
            com.google.android.gms.internal.ads.zzqf r0 = r12.zzi
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L4d
            android.media.AudioTrack r0 = r12.zzt
            r0.pause()
        L4d:
            android.media.AudioTrack r0 = r12.zzt
            boolean r0 = zzV(r0)
            if (r0 == 0) goto L5f
            com.google.android.gms.internal.ads.zzrb r0 = r12.zzk
            r0.getClass()
            android.media.AudioTrack r4 = r12.zzt
            r0.zzb(r4)
        L5f:
            int r0 = com.google.android.gms.internal.ads.zzfy.zza
            com.google.android.gms.internal.ads.zzqs r0 = r12.zzr
            com.google.android.gms.internal.ads.zzpv r8 = r0.zzb()
            com.google.android.gms.internal.ads.zzqs r0 = r12.zzq
            if (r0 == 0) goto L6f
            r12.zzr = r0
            r12.zzq = r1
        L6f:
            com.google.android.gms.internal.ads.zzqf r0 = r12.zzi
            r0.zzc()
            android.media.AudioTrack r5 = r12.zzt
            com.google.android.gms.internal.ads.zzeo r9 = r12.zzh
            com.google.android.gms.internal.ads.zzpy r6 = r12.zzp
            r9.zzc()
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.myLooper()
            r7.<init>(r0)
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzrd.zza
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r4 = com.google.android.gms.internal.ads.zzrd.zzb     // Catch: java.lang.Throwable -> Laa
            if (r4 != 0) goto L95
            java.lang.String r4 = "ExoPlayer:AudioTrackReleaseThread"
            java.util.concurrent.ExecutorService r4 = com.google.android.gms.internal.ads.zzfy.zzD(r4)     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.ads.zzrd.zzb = r4     // Catch: java.lang.Throwable -> Laa
        L95:
            int r4 = com.google.android.gms.internal.ads.zzrd.zzc     // Catch: java.lang.Throwable -> Laa
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.zzrd.zzc = r4     // Catch: java.lang.Throwable -> Laa
            java.util.concurrent.ExecutorService r10 = com.google.android.gms.internal.ads.zzrd.zzb     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.internal.ads.zzqk r11 = new com.google.android.gms.internal.ads.zzqk     // Catch: java.lang.Throwable -> Laa
            r4 = r11
            r4.<init>()     // Catch: java.lang.Throwable -> Laa
            r10.execute(r11)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            r12.zzt = r1
            goto Lad
        Laa:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            throw r1
        Lad:
            com.google.android.gms.internal.ads.zzqw r0 = r12.zzm
            r0.zza()
            com.google.android.gms.internal.ads.zzqw r0 = r12.zzl
            r0.zza()
            r12.zzV = r2
            r12.zzW = r2
            android.os.Handler r0 = r12.zzX
            if (r0 == 0) goto Lc2
            r0.removeCallbacksAndMessages(r1)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrd.zzf():void");
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzg() {
        this.zzF = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzh() {
        this.zzO = false;
        if (zzU()) {
            if (this.zzi.zzk() || zzV(this.zzt)) {
                this.zzt.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzi() {
        this.zzO = true;
        if (zzU()) {
            this.zzi.zzf();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzj() {
        if (!this.zzM && zzU() && zzT()) {
            zzN();
            this.zzM = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzk() {
        zzf();
        zzgaa zzgaaVar = this.zzf;
        int size = zzgaaVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzdt) zzgaaVar.get(i10)).zzf();
        }
        zzgaa zzgaaVar2 = this.zzg;
        int size2 = zzgaaVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((zzdt) zzgaaVar2.get(i11)).zzf();
        }
        zzdq zzdqVar = this.zzs;
        if (zzdqVar != null) {
            zzdqVar.zzf();
        }
        this.zzO = false;
        this.zzT = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzl(zzk zzkVar) {
        if (this.zzv.equals(zzkVar)) {
            return;
        }
        this.zzv = zzkVar;
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzm(int i10) {
        if (this.zzP != i10) {
            this.zzP = i10;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzn(zzl zzlVar) {
        if (this.zzQ.equals(zzlVar)) {
            return;
        }
        if (this.zzt != null) {
            int i10 = this.zzQ.zza;
        }
        this.zzQ = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzo(zzel zzelVar) {
        this.zzi.zze(zzelVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzp(zzpy zzpyVar) {
        this.zzp = zzpyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzq(int i10, int i11) {
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzV(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzr(zzcg zzcgVar) {
        this.zzy = new zzcg(Math.max(0.1f, Math.min(zzcgVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzcgVar.zzd, 8.0f)));
        zzP(zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzs(zzpb zzpbVar) {
        this.zzo = zzpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzt(AudioDeviceInfo audioDeviceInfo) {
        zzqp zzqpVar = audioDeviceInfo == null ? null : new zzqp(audioDeviceInfo);
        this.zzR = zzqpVar;
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzqn.zza(audioTrack, zzqpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzu(boolean z10) {
        this.zzz = z10;
        zzP(this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final void zzv(float f10) {
        if (this.zzI != f10) {
            this.zzI = f10;
            zzQ();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0192. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ca A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzw(java.nio.ByteBuffer r28, long r29, int r31) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrd.zzw(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final boolean zzx() {
        return zzU() && this.zzi.zzg(zzJ());
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final boolean zzy() {
        if (zzU()) {
            return this.zzM && !zzx();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqb
    public final boolean zzz(zzam zzamVar) {
        return zza(zzamVar) != 0;
    }
}
