package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.u1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcix extends zzcgc implements zzhy, zzms {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcii zzc;
    private final zzyg zzd;
    private final zzcgk zze;
    private final WeakReference zzf;
    private final zzvw zzg;
    private zzjj zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcgb zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcik zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzcio.<init>(com.google.android.gms.internal.ads.zzcix, java.lang.String, boolean):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzbQ)).booleanValue() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        if (r5.zzm == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcio(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        if (r5.zzj == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        r5 = new com.google.android.gms.internal.ads.zzcir(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
    
        r4 = r3.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        if (r4 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
    
        if (r4.limit() <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        r4 = new byte[r3.zzi.limit()];
        r3.zzi.get(r4);
        r5 = new com.google.android.gms.internal.ads.zzcis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r5.zzi <= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzcip(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzciq(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (r5.zzj == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcix(android.content.Context r4, com.google.android.gms.internal.ads.zzcgk r5, com.google.android.gms.internal.ads.zzcgl r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcix.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcgk, com.google.android.gms.internal.ads.zzcgl, java.lang.Integer):void");
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcgc.zzD().decrementAndGet();
        if (u1.c()) {
            u1.a("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j10 = this.zzn;
                Map zze = ((zzht) this.zzs.remove(0)).zze();
                long j11 = 0;
                if (zze != null) {
                    Iterator it = zze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfwk.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j10 + j11;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zzut zzvhVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzvhVar = zzaa(uriArr[0]);
            } else {
                zzut[] zzutVarArr = new zzut[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    zzutVarArr[i10] = zzaa(uriArr[i10]);
                }
                zzvhVar = new zzvh(false, false, zzutVarArr);
            }
            this.zzh.zzB(zzvhVar);
            this.zzh.zzp();
            zzcgc.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzH() {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar != null) {
            zzjjVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzcgc.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzI(long j10) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j10, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzJ(int i10) {
        this.zzc.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzK(int i10) {
        this.zzc.zzl(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzL(zzcgb zzcgbVar) {
        this.zzk = zzcgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzM(int i10) {
        this.zzc.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzN(int i10) {
        this.zzc.zzn(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzO(boolean z10) {
        this.zzh.zzr(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzQ(boolean z10) {
        if (this.zzh == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.zzh.zzy();
            if (i10 >= 2) {
                return;
            }
            zzyg zzygVar = this.zzd;
            zzxs zzc = zzygVar.zze().zzc();
            zzc.zzp(i10, !z10);
            zzygVar.zzl(zzc);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzR(int i10) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcih zzcihVar = (zzcih) ((WeakReference) it.next()).get();
            if (zzcihVar != null) {
                zzcihVar.zzm(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzS(Surface surface, boolean z10) {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar != null) {
            zzjjVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzT(float f10, boolean z10) {
        zzjj zzjjVar = this.zzh;
        if (zzjjVar != null) {
            zzjjVar.zzt(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final boolean zzV() {
        return this.zzh != null;
    }

    public final /* synthetic */ zzgw zzW(String str, boolean z10) {
        zzcix zzcixVar = true != z10 ? null : this;
        zzcgk zzcgkVar = this.zze;
        return new zzcja(str, zzcixVar, zzcgkVar.zzd, zzcgkVar.zzf, zzcgkVar.zzn, zzcgkVar.zzo);
    }

    public final /* synthetic */ zzgw zzX(String str, boolean z10) {
        zzcix zzcixVar = true != z10 ? null : this;
        zzcgk zzcgkVar = this.zze;
        zzcih zzcihVar = new zzcih(str, zzcixVar, zzcgkVar.zzd, zzcgkVar.zzf, zzcgkVar.zzi);
        this.zzu.add(new WeakReference(zzcihVar));
        return zzcihVar;
    }

    public final /* synthetic */ zzgw zzY(String str, boolean z10) {
        zzhe zzheVar = new zzhe();
        zzheVar.zzf(str);
        zzheVar.zze(true != z10 ? null : this);
        zzheVar.zzc(this.zze.zzd);
        zzheVar.zzd(this.zze.zzf);
        zzheVar.zzb(true);
        return zzheVar.zza();
    }

    public final /* synthetic */ zzgw zzZ(zzgv zzgvVar) {
        zzgw zza2 = zzgvVar.zza();
        zzciv zzcivVar = new zzciv(this);
        return new zzcik(this.zzb, zza2, this.zzo, this.zzp, this, zzcivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zza(zzgw zzgwVar, zzhb zzhbVar, boolean z10, int i10) {
        this.zzl += i10;
    }

    final zzut zzaa(Uri uri) {
        zzar zzarVar = new zzar();
        zzarVar.zzb(uri);
        zzbp zzc = zzarVar.zzc();
        zzvw zzvwVar = this.zzg;
        zzvwVar.zza(this.zze.zzg);
        return zzvwVar.zzb(zzc);
    }

    public final /* synthetic */ void zzab(boolean z10, long j10) {
        zzcgb zzcgbVar = this.zzk;
        if (zzcgbVar != null) {
            zzcgbVar.zzi(z10, j10);
        }
    }

    public final /* synthetic */ zzmf[] zzac(Handler handler, zzabk zzabkVar, zzpu zzpuVar, zzwv zzwvVar, zztr zztrVar) {
        zztb zztbVar = zztb.zzb;
        zzpd zzpdVar = zzpd.zza;
        zzdt[] zzdtVarArr = new zzdt[0];
        zzqr zzqrVar = new zzqr();
        if (zzpdVar == null && zzpdVar == null) {
            throw new NullPointerException("Both parameters are null");
        }
        Context context = this.zzb;
        zzqrVar.zzc(zzpdVar);
        zzqrVar.zzd(zzdtVarArr);
        zzrd zze = zzqrVar.zze();
        zzsq zzsqVar = zzsq.zza;
        return new zzmf[]{new zzrj(context, zzsqVar, zztbVar, false, handler, zzpuVar, zze), new zzaah(this.zzb, zzsqVar, zztbVar, 0L, false, handler, zzabkVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzb(zzgw zzgwVar, zzhb zzhbVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzc(zzgw zzgwVar, zzhb zzhbVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzd(zzgw zzgwVar, zzhb zzhbVar, boolean z10) {
        if (zzgwVar instanceof zzht) {
            synchronized (this.zzq) {
                this.zzs.add((zzht) zzgwVar);
            }
        } else if (zzgwVar instanceof zzcik) {
            this.zzt = (zzcik) zzgwVar;
            zzcgl zzcglVar = (zzcgl) this.zzf.get();
            if (((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue() && zzcglVar != null && this.zzt.zzn()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                j2.f8993l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcit
                    public final /* synthetic */ Map zzb;

                    public /* synthetic */ zzcit(Map hashMap2) {
                        r2 = hashMap2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = zzcix.zza;
                        zzcgl.this.zzd("onGcacheInfoEvent", r2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zze(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
        zzcgl zzcglVar = (zzcgl) this.zzf.get();
        if (!((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue() || zzcglVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzamVar.zzl;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcglVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzf(zzmq zzmqVar, int i10, long j10, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzg(zzmq zzmqVar, zzun zzunVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzh(zzmq zzmqVar, int i10, long j10) {
        this.zzm += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzi(zzco zzcoVar, zzmr zzmrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzj(zzmq zzmqVar, zzui zzuiVar, zzun zzunVar, IOException iOException, boolean z10) {
        zzcgb zzcgbVar = this.zzk;
        if (zzcgbVar != null) {
            if (this.zze.zzk) {
                zzcgbVar.zzl("onLoadException", iOException);
            } else {
                zzcgbVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzk(zzmq zzmqVar, int i10) {
        zzcgb zzcgbVar = this.zzk;
        if (zzcgbVar != null) {
            zzcgbVar.zzm(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzl(zzmq zzmqVar, zzce zzceVar) {
        zzcgb zzcgbVar = this.zzk;
        if (zzcgbVar != null) {
            zzcgbVar.zzk("onPlayerError", zzceVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzm(zzmq zzmqVar, zzcn zzcnVar, zzcn zzcnVar2, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzn(zzmq zzmqVar, Object obj, long j10) {
        zzcgb zzcgbVar = this.zzk;
        if (zzcgbVar != null) {
            zzcgbVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzo(zzmq zzmqVar, zzir zzirVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzp(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
        zzcgl zzcglVar = (zzcgl) this.zzf.get();
        if (!((Boolean) a0.c().zza(zzbgc.zzbQ)).booleanValue() || zzcglVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzamVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzamVar.zzi));
        hashMap.put("resolution", zzamVar.zzr + "x" + zzamVar.zzs);
        String str = zzamVar.zzl;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcglVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzq(zzmq zzmqVar, zzdp zzdpVar) {
        zzcgb zzcgbVar = this.zzk;
        if (zzcgbVar != null) {
            zzcgbVar.zzD(zzdpVar.zzc, zzdpVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcgc
    public final long zzz() {
        return this.zzh.zzl();
    }
}
