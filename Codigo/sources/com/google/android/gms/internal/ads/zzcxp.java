package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.u4;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcxp {
    private final zzebl zza;
    private final zzfhh zzb;
    private final zzflm zzc;
    private final zzcqt zzd;
    private final zzemo zze;
    private final zzdgc zzf;
    private zzfgy zzg;
    private final zzecq zzh;
    private final zzdab zzi;
    private final Executor zzj;
    private final zzecc zzk;
    private final zzeis zzl;
    private final zzedg zzm;
    private final zzedn zzn;

    public zzcxp(zzebl zzeblVar, zzfhh zzfhhVar, zzflm zzflmVar, zzcqt zzcqtVar, zzemo zzemoVar, zzdgc zzdgcVar, zzfgy zzfgyVar, zzecq zzecqVar, zzdab zzdabVar, Executor executor, zzecc zzeccVar, zzeis zzeisVar, zzedg zzedgVar, zzedn zzednVar) {
        this.zza = zzeblVar;
        this.zzb = zzfhhVar;
        this.zzc = zzflmVar;
        this.zzd = zzcqtVar;
        this.zze = zzemoVar;
        this.zzf = zzdgcVar;
        this.zzg = zzfgyVar;
        this.zzh = zzecqVar;
        this.zzi = zzdabVar;
        this.zzj = executor;
        this.zzk = zzeccVar;
        this.zzl = zzeisVar;
        this.zzm = zzedgVar;
        this.zzn = zzednVar;
    }

    public final c3 zza(Throwable th2) {
        return zzfij.zzb(th2, this.zzl);
    }

    public final zzdgc zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfgy zzd(zzfgy zzfgyVar) {
        this.zzd.zza(zzfgyVar);
        return zzfgyVar;
    }

    public final com.google.common.util.concurrent.f zze(zzfjc zzfjcVar) {
        zzfkr zza = this.zzc.zzb(zzflg.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgdu() { // from class: com.google.android.gms.internal.ads.zzcxl
            public final /* synthetic */ zzfjc zzb;

            public /* synthetic */ zzcxl(zzfjc zzfjcVar2) {
                r2 = zzfjcVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzcxp.this.zzf(r2, (zzbze) obj);
            }
        }).zza();
        zzgen.zzr(zza, new zzcxn(this), this.zzj);
        return zza;
    }

    public final /* synthetic */ com.google.common.util.concurrent.f zzf(zzfjc zzfjcVar, zzbze zzbzeVar) {
        zzbzeVar.zzi = zzfjcVar;
        return this.zzh.zza(zzbzeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ com.google.common.util.concurrent.f zzg(com.google.common.util.concurrent.f fVar, com.google.common.util.concurrent.f fVar2, com.google.common.util.concurrent.f fVar3) {
        return this.zzn.zzc((zzbze) fVar.get(), (JSONObject) fVar2.get(), (zzbzh) fVar3.get());
    }

    public final com.google.common.util.concurrent.f zzh(zzbze zzbzeVar) {
        zzfkr zza = this.zzc.zzb(zzflg.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbzeVar)).zza();
        zzgen.zzr(zza, new zzcxo(this), this.zzj);
        return zza;
    }

    public final com.google.common.util.concurrent.f zzi(com.google.common.util.concurrent.f fVar) {
        zzfld zzf = this.zzc.zzb(zzflg.RENDERER, fVar).zze(new zzfkp() { // from class: com.google.android.gms.internal.ads.zzcxg
            public /* synthetic */ zzcxg() {
            }

            @Override // com.google.android.gms.internal.ads.zzfkp
            public final Object zza(Object obj) {
                zzfgy zzfgyVar = (zzfgy) obj;
                zzcxp.this.zzd(zzfgyVar);
                return zzfgyVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) a0.c().zza(zzbgc.zzfv)).booleanValue()) {
            zzf = zzf.zzi(((Integer) a0.c().zza(zzbgc.zzfx)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final com.google.common.util.concurrent.f zzj() {
        u4 u4Var = this.zzb.zzd;
        if (u4Var.I == null && u4Var.D == null) {
            return zzk(this.zzi.zzc());
        }
        zzflm zzflmVar = this.zzc;
        zzebl zzeblVar = this.zza;
        return zzfkw.zzc(zzeblVar.zza(), zzflg.PRELOADED_LOADER, zzflmVar).zza();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzcxj.<init>(com.google.android.gms.internal.ads.zzcxp, com.google.common.util.concurrent.f, com.google.common.util.concurrent.f, com.google.common.util.concurrent.f):void, class status: GENERATED_AND_UNLOADED
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
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.common.util.concurrent.f zzk(com.google.common.util.concurrent.f r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzfgy r0 = r6.zzg
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzflm r7 = r6.zzc
            com.google.android.gms.internal.ads.zzflg r1 = com.google.android.gms.internal.ads.zzflg.SERVER_TRANSACTION
            com.google.common.util.concurrent.f r0 = com.google.android.gms.internal.ads.zzgen.zzh(r0)
            com.google.android.gms.internal.ads.zzfld r7 = com.google.android.gms.internal.ads.zzfkw.zzc(r0, r1, r7)
        L10:
            com.google.android.gms.internal.ads.zzfkr r7 = r7.zza()
            return r7
        L15:
            com.google.android.gms.internal.ads.zzbax r0 = com.google.android.gms.ads.internal.t.e()
            r0.zzj()
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzkV
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8a
            com.google.android.gms.internal.ads.zzbhm r0 = com.google.android.gms.internal.ads.zzbig.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8a
            com.google.android.gms.internal.ads.zzedg r0 = r6.zzm
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcxh r1 = new com.google.android.gms.internal.ads.zzcxh
            r1.<init>()
            java.util.concurrent.Executor r0 = r6.zzj
            com.google.common.util.concurrent.f r0 = com.google.android.gms.internal.ads.zzgen.zzn(r7, r1, r0)
            com.google.android.gms.internal.ads.zzflm r1 = r6.zzc
            com.google.android.gms.internal.ads.zzflg r2 = com.google.android.gms.internal.ads.zzflg.BUILD_URL
            com.google.android.gms.internal.ads.zzfld r1 = r1.zzb(r2, r0)
            com.google.android.gms.internal.ads.zzecq r2 = r6.zzh
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzcxi r3 = new com.google.android.gms.internal.ads.zzcxi
            r3.<init>()
            com.google.android.gms.internal.ads.zzfld r1 = r1.zzf(r3)
            com.google.android.gms.internal.ads.zzfkr r1 = r1.zza()
            com.google.android.gms.internal.ads.zzflm r2 = r6.zzc
            com.google.android.gms.internal.ads.zzflg r3 = com.google.android.gms.internal.ads.zzflg.SERVER_TRANSACTION
            r4 = 3
            com.google.common.util.concurrent.f[] r4 = new com.google.common.util.concurrent.f[r4]
            r5 = 0
            r4[r5] = r7
            r5 = 1
            r4[r5] = r0
            r5 = 2
            r4[r5] = r1
            com.google.android.gms.internal.ads.zzfku r2 = r2.zza(r3, r4)
            com.google.android.gms.internal.ads.zzcxj r3 = new com.google.android.gms.internal.ads.zzcxj
            r3.<init>()
            com.google.android.gms.internal.ads.zzfld r7 = r2.zza(r3)
            com.google.android.gms.internal.ads.zzcxk r0 = com.google.android.gms.internal.ads.zzcxk.zza
            com.google.android.gms.internal.ads.zzfld r7 = r7.zzf(r0)
            goto L10
        L8a:
            com.google.android.gms.internal.ads.zzflm r0 = r6.zzc
            com.google.android.gms.internal.ads.zzflg r1 = com.google.android.gms.internal.ads.zzflg.SERVER_TRANSACTION
            com.google.android.gms.internal.ads.zzfld r7 = r0.zzb(r1, r7)
            com.google.android.gms.internal.ads.zzecc r0 = r6.zzk
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzcxm r1 = new com.google.android.gms.internal.ads.zzcxm
            r1.<init>()
            com.google.android.gms.internal.ads.zzfld r7 = r7.zzf(r1)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcxp.zzk(com.google.common.util.concurrent.f):com.google.common.util.concurrent.f");
    }

    public final void zzl(zzfgy zzfgyVar) {
        this.zzg = zzfgyVar;
    }
}
