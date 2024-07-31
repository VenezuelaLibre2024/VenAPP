package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzko extends zzm implements zzjj {
    public static final /* synthetic */ int zzd = 0;
    private final zzmo zzA;
    private final long zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private int zzF;
    private zzmj zzG;
    private zzck zzH;
    private zzbv zzI;
    private zzbv zzJ;
    private zzam zzK;
    private zzam zzL;
    private Object zzM;
    private Surface zzN;
    private int zzO;
    private zzfq zzP;
    private zzir zzQ;
    private zzir zzR;
    private int zzS;
    private zzk zzT;
    private float zzU;
    private boolean zzV;
    private zzee zzW;
    private boolean zzX;
    private boolean zzY;
    private zzaa zzZ;
    private zzdp zzaa;
    private zzbv zzab;
    private zzly zzac;
    private int zzad;
    private long zzae;
    private final zzjk zzaf;
    private zzwk zzag;
    final zzyp zzb;
    final zzck zzc;
    private final zzeo zze;
    private final Context zzf;
    private final zzco zzg;
    private final zzmf[] zzh;
    private final zzyo zzi;
    private final zzew zzj;
    private final zzkz zzk;
    private final zzfc zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcu zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzuq zzq;
    private final zzmp zzr;
    private final Looper zzs;
    private final zzyw zzt;
    private final zzel zzu;
    private final zzkk zzv;
    private final zzkm zzw;
    private final zzil zzx;
    private final zzip zzy;
    private final zzmn zzz;

    static {
        zzbq.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzyv, java.lang.Object, com.google.android.gms.internal.ads.zzmp] */
    public zzko(zzji zzjiVar, zzco zzcoVar) {
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zze = zzeoVar;
        try {
            zzff.zze("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + zzfy.zze + "]");
            Context applicationContext = zzjiVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzjiVar.zzh.apply(zzjiVar.zzb);
            this.zzr = apply;
            this.zzT = zzjiVar.zzj;
            this.zzO = zzjiVar.zzk;
            this.zzV = false;
            this.zzB = zzjiVar.zzo;
            zzkk zzkkVar = new zzkk(this, null);
            this.zzv = zzkkVar;
            zzkm zzkmVar = new zzkm(null);
            this.zzw = zzkmVar;
            Handler handler = new Handler(zzjiVar.zzi);
            zzmf[] zza = ((zzjb) zzjiVar.zzc).zza.zza(handler, zzkkVar, zzkkVar, zzkkVar, zzkkVar);
            this.zzh = zza;
            int length = zza.length;
            zzyo zzyoVar = (zzyo) zzjiVar.zze.zza();
            this.zzi = zzyoVar;
            this.zzq = zzji.zza(((zzjc) zzjiVar.zzd).zza);
            zzza zzg = zzza.zzg(((zzjf) zzjiVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = zzjiVar.zzl;
            this.zzG = zzjiVar.zzm;
            Looper looper = zzjiVar.zzi;
            this.zzs = looper;
            zzel zzelVar = zzjiVar.zzb;
            this.zzu = zzelVar;
            this.zzg = zzcoVar;
            zzfc zzfcVar = new zzfc(looper, zzelVar, new zzfa() { // from class: com.google.android.gms.internal.ads.zzke
                public /* synthetic */ zzke() {
                }

                @Override // com.google.android.gms.internal.ads.zzfa
                public final void zza(Object obj, zzah zzahVar) {
                }
            });
            this.zzl = zzfcVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzag = new zzwk(0);
            int length2 = zza.length;
            zzyp zzypVar = new zzyp(new zzmi[2], new zzyi[2], zzdk.zza, null);
            this.zzb = zzypVar;
            this.zzn = new zzcu();
            zzci zzciVar = new zzci();
            zzciVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzyoVar.zzn();
            zzciVar.zzd(29, true);
            zzciVar.zzd(23, false);
            zzciVar.zzd(25, false);
            zzciVar.zzd(33, false);
            zzciVar.zzd(26, false);
            zzciVar.zzd(34, false);
            zzck zze = zzciVar.zze();
            this.zzc = zze;
            zzci zzciVar2 = new zzci();
            zzciVar2.zzb(zze);
            zzciVar2.zza(4);
            zzciVar2.zza(10);
            this.zzH = zzciVar2.zze();
            this.zzj = zzelVar.zzb(looper, null);
            zzjk zzjkVar = new zzjk(this);
            this.zzaf = zzjkVar;
            this.zzac = zzly.zzg(zzypVar);
            apply.zzR(zzcoVar, looper);
            this.zzk = new zzkz(zza, zzyoVar, zzypVar, (zzlc) zzjiVar.zzf.zza(), zzg, 0, false, apply, this.zzG, zzjiVar.zzr, zzjiVar.zzn, false, looper, zzelVar, zzjkVar, zzfy.zza < 31 ? new zzpb() : zzkf.zza(applicationContext, this, zzjiVar.zzp), null);
            this.zzU = 1.0f;
            zzbv zzbvVar = zzbv.zza;
            this.zzI = zzbvVar;
            this.zzJ = zzbvVar;
            this.zzab = zzbvVar;
            int i10 = -1;
            this.zzad = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager != null) {
                i10 = audioManager.generateAudioSessionId();
            }
            this.zzS = i10;
            this.zzW = zzee.zza;
            this.zzX = true;
            apply.getClass();
            zzfcVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzkkVar);
            this.zzx = new zzil(zzjiVar.zza, handler, zzkkVar);
            this.zzy = new zzip(zzjiVar.zza, handler, zzkkVar);
            zzfy.zzF(null, null);
            this.zzz = new zzmn(zzjiVar.zza);
            this.zzA = new zzmo(zzjiVar.zza);
            this.zzZ = new zzy(0).zza();
            this.zzaa = zzdp.zza;
            this.zzP = zzfq.zza;
            zzyoVar.zzk(this.zzT);
            zzag(1, 10, Integer.valueOf(this.zzS));
            zzag(2, 10, Integer.valueOf(this.zzS));
            zzag(1, 3, this.zzT);
            zzag(2, 4, Integer.valueOf(this.zzO));
            zzag(2, 5, 0);
            zzag(1, 9, Boolean.valueOf(this.zzV));
            zzag(2, 7, zzkmVar);
            zzag(6, 8, zzkmVar);
            zzeoVar.zze();
        } catch (Throwable th2) {
            this.zze.zze();
            throw th2;
        }
    }

    public static /* bridge */ /* synthetic */ void zzP(zzko zzkoVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzkoVar.zzai(surface);
        zzkoVar.zzN = surface;
    }

    private final int zzW(zzly zzlyVar) {
        return zzlyVar.zza.zzo() ? this.zzad : zzlyVar.zza.zzn(zzlyVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzX(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    private final long zzY(zzly zzlyVar) {
        if (!zzlyVar.zzb.zzb()) {
            return zzfy.zzt(zzZ(zzlyVar));
        }
        zzlyVar.zza.zzn(zzlyVar.zzb.zza, this.zzn);
        long j10 = zzlyVar.zzc;
        if (j10 != -9223372036854775807L) {
            return zzfy.zzt(j10) + zzfy.zzt(0L);
        }
        long j11 = zzlyVar.zza.zze(zzW(zzlyVar), this.zza, 0L).zzn;
        return zzfy.zzt(0L);
    }

    private final long zzZ(zzly zzlyVar) {
        if (zzlyVar.zza.zzo()) {
            return zzfy.zzq(this.zzae);
        }
        long j10 = zzlyVar.zzr;
        if (zzlyVar.zzb.zzb()) {
            return j10;
        }
        zzab(zzlyVar.zza, zzlyVar.zzb, j10);
        return j10;
    }

    private static long zzaa(zzly zzlyVar) {
        zzcw zzcwVar = new zzcw();
        zzcu zzcuVar = new zzcu();
        zzlyVar.zza.zzn(zzlyVar.zzb.zza, zzcuVar);
        long j10 = zzlyVar.zzc;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        long j11 = zzlyVar.zza.zze(zzcuVar.zzd, zzcwVar, 0L).zzn;
        return 0L;
    }

    private final long zzab(zzcx zzcxVar, zzur zzurVar, long j10) {
        zzcxVar.zzn(zzurVar.zza, this.zzn);
        return j10;
    }

    private final Pair zzac(zzcx zzcxVar, int i10, long j10) {
        if (zzcxVar.zzo()) {
            this.zzad = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.zzae = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzcxVar.zzc()) {
            i10 = zzcxVar.zzg(false);
            long j11 = zzcxVar.zze(i10, this.zza, 0L).zzn;
            j10 = zzfy.zzt(0L);
        }
        return zzcxVar.zzl(this.zza, this.zzn, i10, zzfy.zzq(j10));
    }

    private final zzly zzad(zzly zzlyVar, zzcx zzcxVar, Pair pair) {
        zzek.zzd(zzcxVar.zzo() || pair != null);
        zzcx zzcxVar2 = zzlyVar.zza;
        long zzY = zzY(zzlyVar);
        zzly zzf = zzlyVar.zzf(zzcxVar);
        if (zzcxVar.zzo()) {
            zzur zzh = zzly.zzh();
            long zzq = zzfy.zzq(this.zzae);
            zzly zza = zzf.zzb(zzh, zzq, zzq, zzq, 0L, zzws.zza, this.zzb, zzgaa.zzl()).zza(zzh);
            zza.zzp = zza.zzr;
            return zza;
        }
        Object obj = zzf.zzb.zza;
        int i10 = zzfy.zza;
        boolean z10 = !obj.equals(pair.first);
        zzur zzurVar = z10 ? new zzur(pair.first, -1L) : zzf.zzb;
        long longValue = ((Long) pair.second).longValue();
        long zzq2 = zzfy.zzq(zzY);
        if (!zzcxVar2.zzo()) {
            zzcxVar2.zzn(obj, this.zzn);
        }
        if (z10 || longValue < zzq2) {
            zzek.zzf(!zzurVar.zzb());
            zzly zza2 = zzf.zzb(zzurVar, longValue, longValue, longValue, 0L, z10 ? zzws.zza : zzf.zzh, z10 ? this.zzb : zzf.zzi, z10 ? zzgaa.zzl() : zzf.zzj).zza(zzurVar);
            zza2.zzp = longValue;
            return zza2;
        }
        if (longValue != zzq2) {
            zzek.zzf(!zzurVar.zzb());
            long max = Math.max(0L, zzf.zzq - (longValue - zzq2));
            long j10 = zzf.zzp;
            if (zzf.zzk.equals(zzf.zzb)) {
                j10 = longValue + max;
            }
            zzly zzb = zzf.zzb(zzurVar, longValue, longValue, longValue, max, zzf.zzh, zzf.zzi, zzf.zzj);
            zzb.zzp = j10;
            return zzb;
        }
        int zza3 = zzcxVar.zza(zzf.zzk.zza);
        if (zza3 != -1 && zzcxVar.zzd(zza3, this.zzn, false).zzd == zzcxVar.zzn(zzurVar.zza, this.zzn).zzd) {
            return zzf;
        }
        zzcxVar.zzn(zzurVar.zza, this.zzn);
        long zzh2 = zzurVar.zzb() ? this.zzn.zzh(zzurVar.zzb, zzurVar.zzc) : this.zzn.zze;
        zzly zza4 = zzf.zzb(zzurVar, zzf.zzr, zzf.zzr, zzf.zzd, zzh2 - zzf.zzr, zzf.zzh, zzf.zzi, zzf.zzj).zza(zzurVar);
        zza4.zzp = zzh2;
        return zza4;
    }

    private final zzmb zzae(zzma zzmaVar) {
        int zzW = zzW(this.zzac);
        zzcx zzcxVar = this.zzac.zza;
        if (zzW == -1) {
            zzW = 0;
        }
        zzel zzelVar = this.zzu;
        zzkz zzkzVar = this.zzk;
        return new zzmb(zzkzVar, zzmaVar, zzcxVar, zzW, zzelVar, zzkzVar.zzb());
    }

    public final void zzaf(int i10, int i11) {
        if (i10 == this.zzP.zzb() && i11 == this.zzP.zza()) {
            return;
        }
        this.zzP = new zzfq(i10, i11);
        zzfc zzfcVar = this.zzl;
        zzfcVar.zzd(24, new zzez() { // from class: com.google.android.gms.internal.ads.zzkb
            public final /* synthetic */ int zza;
            public final /* synthetic */ int zzb;

            public /* synthetic */ zzkb(int i102, int i112) {
                r1 = i102;
                r2 = i112;
            }

            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj) {
                int i12 = zzko.zzd;
                ((zzcl) obj).zzo(r1, r2);
            }
        });
        zzfcVar.zzc();
        zzag(2, 14, new zzfq(i102, i112));
    }

    private final void zzag(int i10, int i11, Object obj) {
        zzmf[] zzmfVarArr = this.zzh;
        int length = zzmfVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzmf zzmfVar = zzmfVarArr[i12];
            if (zzmfVar.zzbj() == i10) {
                zzmb zzae = zzae(zzmfVar);
                zzae.zzf(i11);
                zzae.zze(obj);
                zzae.zzd();
            }
        }
    }

    public final void zzah() {
        zzag(1, 2, Float.valueOf(this.zzU * this.zzy.zza()));
    }

    public final void zzai(Object obj) {
        ArrayList arrayList = new ArrayList();
        zzmf[] zzmfVarArr = this.zzh;
        int length = zzmfVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            zzmf zzmfVar = zzmfVarArr[i10];
            if (zzmfVar.zzbj() == 2) {
                zzmb zzae = zzae(zzmfVar);
                zzae.zzf(1);
                zzae.zze(obj);
                zzae.zzd();
                arrayList.add(zzae);
            }
        }
        Object obj2 = this.zzM;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzmb) it.next()).zzi(this.zzB);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.zzM;
            Surface surface = this.zzN;
            if (obj3 == surface) {
                surface.release();
                this.zzN = null;
            }
        }
        this.zzM = obj;
        if (z10) {
            zzaj(zziz.zzd(new zzla(3), 1003));
        }
    }

    private final void zzaj(zziz zzizVar) {
        zzly zzlyVar = this.zzac;
        zzly zza = zzlyVar.zza(zzlyVar.zzb);
        zza.zzp = zza.zzr;
        zza.zzq = 0L;
        zzly zze = zza.zze(1);
        if (zzizVar != null) {
            zze = zze.zzd(zzizVar);
        }
        this.zzC++;
        this.zzk.zzo();
        zzal(zze, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void zzak(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        zzly zzlyVar = this.zzac;
        if (zzlyVar.zzl == z11 && zzlyVar.zzm == i12) {
            return;
        }
        this.zzC++;
        zzly zzc = zzlyVar.zzc(z11, i12);
        this.zzk.zzn(z11, i12);
        zzal(zzc, 0, i11, false, 5, -9223372036854775807L, -1, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzjt.<init>(com.google.android.gms.internal.ads.zzbp, int):void, class status: GENERATED_AND_UNLOADED
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
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0229, code lost:
    
        if (r4 != false) goto L305;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0465 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x046f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e9  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r6v22, types: [com.google.android.gms.internal.ads.zzcx] */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzal(com.google.android.gms.internal.ads.zzly r43, int r44, int r45, boolean r46, int r47, long r48, int r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzko.zzal(com.google.android.gms.internal.ads.zzly, int, int, boolean, int, long, int, boolean):void");
    }

    private final void zzam() {
        int zzf = zzf();
        if (zzf == 2 || zzf == 3) {
            zzan();
            boolean z10 = this.zzac.zzo;
            zzv();
            zzv();
        }
    }

    private final void zzan() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (this.zzX) {
                throw new IllegalStateException(format);
            }
            zzff.zzg("ExoPlayerImpl", format, this.zzY ? null : new IllegalStateException());
            this.zzY = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzA(zzms zzmsVar) {
        zzan();
        this.zzr.zzQ(zzmsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzB(zzut zzutVar) {
        zzan();
        List singletonList = Collections.singletonList(zzutVar);
        zzan();
        zzan();
        zzW(this.zzac);
        zzk();
        this.zzC++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                this.zzo.remove(i10);
            }
            this.zzag = this.zzag.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            zzlv zzlvVar = new zzlv((zzut) singletonList.get(i11), this.zzp);
            arrayList.add(zzlvVar);
            this.zzo.add(i11, new zzkn(zzlvVar.zzb, zzlvVar.zza));
        }
        this.zzag = this.zzag.zzg(0, arrayList.size());
        zzmd zzmdVar = new zzmd(this.zzo, this.zzag);
        if (!zzmdVar.zzo() && zzmdVar.zzc() < 0) {
            throw new zzan(zzmdVar, -1, -9223372036854775807L);
        }
        int zzg = zzmdVar.zzg(false);
        zzly zzad = zzad(this.zzac, zzmdVar, zzac(zzmdVar, zzg, -9223372036854775807L));
        int i12 = zzad.zze;
        if (zzg != -1 && i12 != 1) {
            i12 = 4;
            if (!zzmdVar.zzo() && zzg < zzmdVar.zzc()) {
                i12 = 2;
            }
        }
        zzly zze = zzad.zze(i12);
        this.zzk.zzq(arrayList, zzg, zzfy.zzq(-9223372036854775807L), this.zzag);
        zzal(zze, 0, 1, (this.zzac.zzb.zza.equals(zze.zzb.zza) || this.zzac.zza.zzo()) ? false : true, 4, zzZ(zze), -1, false);
    }

    public final zziz zzE() {
        zzan();
        return this.zzac.zzf;
    }

    public final /* synthetic */ void zzS(zzkx zzkxVar) {
        long j10;
        boolean z10;
        int i10 = this.zzC - zzkxVar.zzb;
        this.zzC = i10;
        boolean z11 = true;
        if (zzkxVar.zzc) {
            this.zzD = zzkxVar.zzd;
            this.zzE = true;
        }
        if (zzkxVar.zze) {
            this.zzF = zzkxVar.zzf;
        }
        if (i10 == 0) {
            zzcx zzcxVar = zzkxVar.zza.zza;
            if (!this.zzac.zza.zzo() && zzcxVar.zzo()) {
                this.zzad = -1;
                this.zzae = 0L;
            }
            if (!zzcxVar.zzo()) {
                List zzw = ((zzmd) zzcxVar).zzw();
                zzek.zzf(zzw.size() == this.zzo.size());
                for (int i11 = 0; i11 < zzw.size(); i11++) {
                    ((zzkn) this.zzo.get(i11)).zzc((zzcx) zzw.get(i11));
                }
            }
            if (this.zzE) {
                if (zzkxVar.zza.zzb.equals(this.zzac.zzb) && zzkxVar.zza.zzd == this.zzac.zzr) {
                    z11 = false;
                }
                if (!z11) {
                    j10 = -9223372036854775807L;
                } else if (zzcxVar.zzo() || zzkxVar.zza.zzb.zzb()) {
                    j10 = zzkxVar.zza.zzd;
                } else {
                    zzly zzlyVar = zzkxVar.zza;
                    zzur zzurVar = zzlyVar.zzb;
                    j10 = zzlyVar.zzd;
                    zzab(zzcxVar, zzurVar, j10);
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.zzE = false;
            zzal(zzkxVar.zza, 1, this.zzF, z10, this.zzD, j10, -1, false);
        }
    }

    public final /* synthetic */ void zzT(zzkx zzkxVar) {
        this.zzj.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkd
            public final /* synthetic */ zzkx zzb;

            public /* synthetic */ zzkd(zzkx zzkxVar2) {
                r2 = zzkxVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzko.this.zzS(r2);
            }
        });
    }

    public final /* synthetic */ void zzU(zzcl zzclVar) {
        zzclVar.zza(this.zzH);
    }

    @Override // com.google.android.gms.internal.ads.zzm
    public final void zza(int i10, long j10, int i11, boolean z10) {
        zzan();
        zzek.zzd(i10 >= 0);
        this.zzr.zzu();
        zzcx zzcxVar = this.zzac.zza;
        if (zzcxVar.zzo() || i10 < zzcxVar.zzc()) {
            this.zzC++;
            if (zzx()) {
                zzff.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkx zzkxVar = new zzkx(this.zzac);
                zzkxVar.zza(1);
                this.zzaf.zza.zzT(zzkxVar);
                return;
            }
            zzly zzlyVar = this.zzac;
            int i12 = zzlyVar.zze;
            if (i12 == 3 || (i12 == 4 && !zzcxVar.zzo())) {
                zzlyVar = this.zzac.zze(2);
            }
            int zzd2 = zzd();
            zzly zzad = zzad(zzlyVar, zzcxVar, zzac(zzcxVar, i10, j10));
            this.zzk.zzl(zzcxVar, i10, zzfy.zzq(j10));
            zzal(zzad, 0, 1, true, 1, zzZ(zzad), zzd2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzb() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzc() {
        zzan();
        if (zzx()) {
            return this.zzac.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzd() {
        zzan();
        int zzW = zzW(this.zzac);
        if (zzW == -1) {
            return 0;
        }
        return zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zze() {
        zzan();
        if (this.zzac.zza.zzo()) {
            return 0;
        }
        zzly zzlyVar = this.zzac;
        return zzlyVar.zza.zza(zzlyVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzf() {
        zzan();
        return this.zzac.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzg() {
        zzan();
        return this.zzac.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final int zzh() {
        zzan();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzi() {
        long j10;
        zzan();
        if (zzx()) {
            zzly zzlyVar = this.zzac;
            if (!zzlyVar.zzk.equals(zzlyVar.zzb)) {
                return zzl();
            }
            j10 = this.zzac.zzp;
        } else {
            zzan();
            if (this.zzac.zza.zzo()) {
                return this.zzae;
            }
            zzly zzlyVar2 = this.zzac;
            long j11 = 0;
            if (zzlyVar2.zzk.zzd == zzlyVar2.zzb.zzd) {
                long j12 = zzlyVar2.zzp;
                if (this.zzac.zzk.zzb()) {
                    zzly zzlyVar3 = this.zzac;
                    zzlyVar3.zza.zzn(zzlyVar3.zzk.zza, this.zzn).zzi(this.zzac.zzk.zzb);
                } else {
                    j11 = j12;
                }
                zzly zzlyVar4 = this.zzac;
                zzab(zzlyVar4.zza, zzlyVar4.zzk, j11);
                return zzfy.zzt(j11);
            }
            j10 = zzlyVar2.zza.zze(zzd(), this.zza, 0L).zzo;
        }
        return zzfy.zzt(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzj() {
        zzan();
        return zzY(this.zzac);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzk() {
        zzan();
        return zzfy.zzt(zzZ(this.zzac));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzl() {
        long zzh;
        zzan();
        if (zzx()) {
            zzly zzlyVar = this.zzac;
            zzur zzurVar = zzlyVar.zzb;
            zzlyVar.zza.zzn(zzurVar.zza, this.zzn);
            zzh = this.zzn.zzh(zzurVar.zzb, zzurVar.zzc);
        } else {
            zzcx zzn = zzn();
            if (zzn.zzo()) {
                return -9223372036854775807L;
            }
            zzh = zzn.zze(zzd(), this.zza, 0L).zzo;
        }
        return zzfy.zzt(zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final long zzm() {
        zzan();
        return zzfy.zzt(this.zzac.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzcx zzn() {
        zzan();
        return this.zzac.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final zzdk zzo() {
        zzan();
        return this.zzac.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzp() {
        zzan();
        zzip zzipVar = this.zzy;
        boolean zzv = zzv();
        int zzb = zzipVar.zzb(zzv, 2);
        zzak(zzv, zzb, zzX(zzv, zzb));
        zzly zzlyVar = this.zzac;
        if (zzlyVar.zze != 1) {
            return;
        }
        zzly zzd2 = zzlyVar.zzd(null);
        zzly zze = zzd2.zze(true == zzd2.zza.zzo() ? 4 : 2);
        this.zzC++;
        this.zzk.zzk();
        zzal(zze, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzq() {
        zzff.zze("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.1] [" + zzfy.zze + "] [" + zzbq.zza() + "]");
        zzan();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzfc zzfcVar = this.zzl;
            zzfcVar.zzd(10, zzkc.zza);
            zzfcVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zze(null);
        this.zzt.zzf(this.zzr);
        zzly zzlyVar = this.zzac;
        boolean z10 = zzlyVar.zzo;
        zzly zze = zzlyVar.zze(1);
        this.zzac = zze;
        zzly zza = zze.zza(zze.zzb);
        this.zzac = zza;
        zza.zzp = zza.zzr;
        this.zzac.zzq = 0L;
        this.zzr.zzP();
        this.zzi.zzj();
        Surface surface = this.zzN;
        if (surface != null) {
            surface.release();
            this.zzN = null;
        }
        this.zzW = zzee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzr(boolean z10) {
        zzan();
        int zzb = this.zzy.zzb(z10, zzf());
        zzak(z10, zzb, zzX(z10, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzs(Surface surface) {
        zzan();
        zzai(surface);
        int i10 = surface == null ? 0 : -1;
        zzaf(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzt(float f10) {
        zzan();
        float max = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzU == max) {
            return;
        }
        this.zzU = max;
        zzah();
        zzfc zzfcVar = this.zzl;
        zzfcVar.zzd(22, new zzez() { // from class: com.google.android.gms.internal.ads.zzjs
            public final /* synthetic */ float zza;

            public /* synthetic */ zzjs(float max2) {
                r1 = max2;
            }

            @Override // com.google.android.gms.internal.ads.zzez
            public final void zza(Object obj) {
                int i10 = zzko.zzd;
                ((zzcl) obj).zzs(r1);
            }
        });
        zzfcVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzu() {
        zzan();
        this.zzy.zzb(zzv(), 1);
        zzaj(null);
        this.zzW = new zzee(zzgaa.zzl(), this.zzac.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzv() {
        zzan();
        return this.zzac.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzw() {
        zzan();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final boolean zzx() {
        zzan();
        return this.zzac.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final int zzy() {
        zzan();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzz(zzms zzmsVar) {
        this.zzr.zzt(zzmsVar);
    }
}
