package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.x;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeem extends zzbyp {
    private final Context zza;
    private final zzgey zzb;
    private final zzefe zzc;
    private final zzcqs zzd;
    private final ArrayDeque zze;
    private final zzfnc zzf;
    private final zzbzq zzg;
    private final zzefb zzh;

    public zzeem(Context context, zzgey zzgeyVar, zzbzq zzbzqVar, zzcqs zzcqsVar, zzefe zzefeVar, ArrayDeque arrayDeque, zzefb zzefbVar, zzfnc zzfncVar) {
        zzbgc.zza(context);
        this.zza = context;
        this.zzb = zzgeyVar;
        this.zzg = zzbzqVar;
        this.zzc = zzefeVar;
        this.zzd = zzcqsVar;
        this.zze = arrayDeque;
        this.zzh = zzefbVar;
        this.zzf = zzfncVar;
    }

    private final synchronized zzeej zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzeej zzeejVar = (zzeej) it.next();
            if (zzeejVar.zzc.equals(str)) {
                it.remove();
                return zzeejVar;
            }
        }
        return null;
    }

    private static com.google.common.util.concurrent.f zzl(com.google.common.util.concurrent.f fVar, zzflm zzflmVar, zzbrx zzbrxVar, zzfmz zzfmzVar, zzfmo zzfmoVar) {
        zzbrn zza = zzbrxVar.zza("AFMA_getAdDictionary", zzbru.zza, zzeef.zza);
        zzfmy.zzd(fVar, zzfmoVar);
        zzfkr zza2 = zzflmVar.zzb(zzflg.BUILD_URL, fVar).zzf(zza).zza();
        zzfmy.zzc(zza2, zzfmzVar, zzfmoVar);
        return zza2;
    }

    private static com.google.common.util.concurrent.f zzm(zzbze zzbzeVar, zzflm zzflmVar, zzeyo zzeyoVar) {
        zzedz zzedzVar = new zzgdu() { // from class: com.google.android.gms.internal.ads.zzedz
            public /* synthetic */ zzedz() {
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzeyo.this.zzb().zza(x.b().zzh((Bundle) obj));
            }
        };
        return zzflmVar.zzb(zzflg.GMS_SIGNALS, zzgen.zzh(zzbzeVar.zza)).zzf(zzedzVar).zze(zzeea.zza).zza();
    }

    private final synchronized void zzn(zzeej zzeejVar) {
        zzo();
        this.zze.addLast(zzeejVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbih.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(com.google.common.util.concurrent.f fVar, zzbza zzbzaVar) {
        zzgen.zzr(zzgen.zzn(fVar, new zzgdu() { // from class: com.google.android.gms.internal.ads.zzedx
            public /* synthetic */ zzedx() {
            }

            @Override // com.google.android.gms.internal.ads.zzgdu
            public final com.google.common.util.concurrent.f zza(Object obj) {
                return zzgen.zzh(zzfii.zza((InputStream) obj));
            }
        }, zzcep.zza), new zzeei(this, zzbzaVar), zzcep.zzf);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzeed.<init>(com.google.android.gms.internal.ads.zzeem, com.google.common.util.concurrent.f, com.google.common.util.concurrent.f, com.google.android.gms.internal.ads.zzbze, com.google.android.gms.internal.ads.zzfmo):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.common.util.concurrent.f zzb(com.google.android.gms.internal.ads.zzbze r9, int r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzbhm r0 = com.google.android.gms.internal.ads.zzbih.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1a
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Split request is disabled."
            r9.<init>(r10)
            com.google.common.util.concurrent.f r9 = com.google.android.gms.internal.ads.zzgen.zzg(r9)
            return r9
        L1a:
            com.google.android.gms.internal.ads.zzfjc r0 = r9.zzi
            if (r0 != 0) goto L2a
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Pool configuration missing from request."
            r9.<init>(r10)
            com.google.common.util.concurrent.f r9 = com.google.android.gms.internal.ads.zzgen.zzg(r9)
            return r9
        L2a:
            int r1 = r0.zzc
            if (r1 == 0) goto L81
            int r0 = r0.zzd
            if (r0 != 0) goto L33
            goto L81
        L33:
            android.content.Context r0 = r8.zza
            com.google.android.gms.internal.ads.zzfnc r1 = r8.zzf
            com.google.android.gms.internal.ads.zzbro r2 = com.google.android.gms.ads.internal.t.h()
            com.google.android.gms.internal.ads.zzcei r3 = com.google.android.gms.internal.ads.zzcei.zza()
            com.google.android.gms.internal.ads.zzbrx r0 = r2.zzb(r0, r3, r1)
            com.google.android.gms.internal.ads.zzcqs r1 = r8.zzd
            com.google.android.gms.internal.ads.zzeyo r10 = r1.zzq(r9, r10)
            com.google.android.gms.internal.ads.zzflm r1 = r10.zzc()
            com.google.common.util.concurrent.f r5 = zzm(r9, r1, r10)
            com.google.android.gms.internal.ads.zzfmz r10 = r10.zzd()
            android.content.Context r2 = r8.zza
            r3 = 9
            com.google.android.gms.internal.ads.zzfmo r7 = com.google.android.gms.internal.ads.zzfmn.zza(r2, r3)
            com.google.common.util.concurrent.f r4 = zzl(r5, r1, r0, r10, r7)
            com.google.android.gms.internal.ads.zzflg r10 = com.google.android.gms.internal.ads.zzflg.GET_URL_AND_CACHE_KEY
            r0 = 2
            com.google.common.util.concurrent.f[] r0 = new com.google.common.util.concurrent.f[r0]
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r4
            com.google.android.gms.internal.ads.zzfku r10 = r1.zza(r10, r0)
            com.google.android.gms.internal.ads.zzeed r0 = new com.google.android.gms.internal.ads.zzeed
            r2 = r0
            r3 = r8
            r6 = r9
            r2.<init>()
            com.google.android.gms.internal.ads.zzfld r9 = r10.zza(r0)
            com.google.android.gms.internal.ads.zzfkr r9 = r9.zza()
            return r9
        L81:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Caching is disabled."
            r9.<init>(r10)
            com.google.common.util.concurrent.f r9 = com.google.android.gms.internal.ads.zzgen.zzg(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeem.zzb(com.google.android.gms.internal.ads.zzbze, int):com.google.common.util.concurrent.f");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzeeb.<init>(com.google.common.util.concurrent.f, com.google.common.util.concurrent.f):void, class status: GENERATED_AND_UNLOADED
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
    public final com.google.common.util.concurrent.f zzc(com.google.android.gms.internal.ads.zzbze r14, int r15) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeem.zzc(com.google.android.gms.internal.ads.zzbze, int):com.google.common.util.concurrent.f");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzeeg.<init>(com.google.android.gms.internal.ads.zzext):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.common.util.concurrent.f zzd(com.google.android.gms.internal.ads.zzbze r7, int r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbro r0 = com.google.android.gms.ads.internal.t.h()
            android.content.Context r1 = r6.zza
            com.google.android.gms.internal.ads.zzcei r2 = com.google.android.gms.internal.ads.zzcei.zza()
            com.google.android.gms.internal.ads.zzfnc r3 = r6.zzf
            com.google.android.gms.internal.ads.zzbrx r0 = r0.zzb(r1, r2, r3)
            com.google.android.gms.internal.ads.zzbhm r1 = com.google.android.gms.internal.ads.zzbim.zza
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2a
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "Signal collection disabled."
            r7.<init>(r8)
            com.google.common.util.concurrent.f r7 = com.google.android.gms.internal.ads.zzgen.zzg(r7)
            return r7
        L2a:
            com.google.android.gms.internal.ads.zzcqs r1 = r6.zzd
            com.google.android.gms.internal.ads.zzeyo r8 = r1.zzq(r7, r8)
            com.google.android.gms.internal.ads.zzext r1 = r8.zza()
            com.google.android.gms.internal.ads.zzbrr r2 = com.google.android.gms.internal.ads.zzbru.zza
            com.google.android.gms.internal.ads.zzbrp r3 = com.google.android.gms.internal.ads.zzbru.zzb
            java.lang.String r4 = "google.afma.request.getSignals"
            com.google.android.gms.internal.ads.zzbrn r0 = r0.zza(r4, r2, r3)
            android.content.Context r2 = r6.zza
            r3 = 22
            com.google.android.gms.internal.ads.zzfmo r2 = com.google.android.gms.internal.ads.zzfmn.zza(r2, r3)
            com.google.android.gms.internal.ads.zzflm r3 = r8.zzc()
            com.google.android.gms.internal.ads.zzflg r4 = com.google.android.gms.internal.ads.zzflg.GET_SIGNALS
            android.os.Bundle r5 = r7.zza
            com.google.common.util.concurrent.f r5 = com.google.android.gms.internal.ads.zzgen.zzh(r5)
            com.google.android.gms.internal.ads.zzfld r3 = r3.zzb(r4, r5)
            com.google.android.gms.internal.ads.zzfmu r4 = new com.google.android.gms.internal.ads.zzfmu
            r4.<init>(r2)
            com.google.android.gms.internal.ads.zzfld r3 = r3.zze(r4)
            com.google.android.gms.internal.ads.zzeeg r4 = new com.google.android.gms.internal.ads.zzeeg
            r4.<init>()
            com.google.android.gms.internal.ads.zzfld r1 = r3.zzf(r4)
            com.google.android.gms.internal.ads.zzflg r3 = com.google.android.gms.internal.ads.zzflg.JS_SIGNALS
            com.google.android.gms.internal.ads.zzfld r1 = r1.zzb(r3)
            com.google.android.gms.internal.ads.zzfld r0 = r1.zzf(r0)
            com.google.android.gms.internal.ads.zzfkr r0 = r0.zza()
            com.google.android.gms.internal.ads.zzfmz r8 = r8.zzd()
            android.os.Bundle r7 = r7.zza
            java.lang.String r1 = "ad_types"
            java.util.ArrayList r7 = r7.getStringArrayList(r1)
            r8.zzd(r7)
            com.google.android.gms.internal.ads.zzfmy.zzb(r0, r8, r2)
            com.google.android.gms.internal.ads.zzbhm r7 = com.google.android.gms.internal.ads.zzbia.zze
            java.lang.Object r7 = r7.zze()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto La5
            com.google.android.gms.internal.ads.zzefe r7 = r6.zzc
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.zzeee r8 = new com.google.android.gms.internal.ads.zzeee
            r8.<init>(r7)
            com.google.android.gms.internal.ads.zzgey r7 = r6.zzb
            r0.addListener(r8, r7)
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeem.zzd(com.google.android.gms.internal.ads.zzbze, int):com.google.common.util.concurrent.f");
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zze(zzbze zzbzeVar, zzbza zzbzaVar) {
        zzp(zzb(zzbzeVar, Binder.getCallingUid()), zzbzaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzf(zzbze zzbzeVar, zzbza zzbzaVar) {
        zzp(zzd(zzbzeVar, Binder.getCallingUid()), zzbzaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzg(zzbze zzbzeVar, zzbza zzbzaVar) {
        com.google.common.util.concurrent.f zzc = zzc(zzbzeVar, Binder.getCallingUid());
        zzp(zzc, zzbzaVar);
        if (((Boolean) zzbia.zzc.zze()).booleanValue()) {
            zzefe zzefeVar = this.zzc;
            Objects.requireNonNull(zzefeVar);
            zzc.addListener(new zzeee(zzefeVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzh(String str, zzbza zzbzaVar) {
        zzp(zzi(str), zzbzaVar);
    }

    public final com.google.common.util.concurrent.f zzi(String str) {
        if (((Boolean) zzbih.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzgen.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgen.zzh(new zzeeh(this));
        }
        return zzgen.zzg(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zzj(com.google.common.util.concurrent.f fVar, com.google.common.util.concurrent.f fVar2, zzbze zzbzeVar, zzfmo zzfmoVar) {
        String zzc = ((zzbzh) fVar.get()).zzc();
        zzn(new zzeej((zzbzh) fVar.get(), (JSONObject) fVar2.get(), zzbzeVar.zzh, zzc, zzfmoVar));
        return new ByteArrayInputStream(zzc.getBytes(zzfwq.zzc));
    }
}
