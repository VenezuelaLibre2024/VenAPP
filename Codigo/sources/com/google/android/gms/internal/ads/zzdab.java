package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.w1;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdab {
    private final zzflm zza;
    private final zzcei zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhgx zzg;
    private final String zzh;
    private final zzext zzi;
    private final w1 zzj;
    private final zzfhh zzk;
    private final zzdgg zzl;

    public zzdab(zzflm zzflmVar, zzcei zzceiVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhgx zzhgxVar, w1 w1Var, String str2, zzext zzextVar, zzfhh zzfhhVar, zzdgg zzdggVar) {
        this.zza = zzflmVar;
        this.zzb = zzceiVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhgxVar;
        this.zzh = str2;
        this.zzi = zzextVar;
        this.zzj = w1Var;
        this.zzk = zzfhhVar;
        this.zzl = zzdggVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzbze zza(com.google.common.util.concurrent.f fVar) {
        Bundle bundle = (Bundle) fVar.get();
        String str = (String) ((com.google.common.util.concurrent.f) this.zzg.zzb()).get();
        boolean z10 = ((Boolean) a0.c().zza(zzbgc.zzhh)).booleanValue() && this.zzj.zzQ();
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbze(bundle, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z10, this.zzk.zzb());
    }

    public final com.google.common.util.concurrent.f zzb() {
        this.zzl.zza();
        return zzfkw.zzc(this.zzi.zza(new Bundle()), zzflg.SIGNALS, this.zza).zza();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzdaa.<init>(com.google.android.gms.internal.ads.zzdab, com.google.common.util.concurrent.f):void, class status: GENERATED_AND_UNLOADED
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
    public final com.google.common.util.concurrent.f zzc() {
        /*
            r5 = this;
            com.google.common.util.concurrent.f r0 = r5.zzb()
            com.google.android.gms.internal.ads.zzflg r1 = com.google.android.gms.internal.ads.zzflg.REQUEST_PARCEL
            r2 = 2
            com.google.common.util.concurrent.f[] r2 = new com.google.common.util.concurrent.f[r2]
            r3 = 0
            r2[r3] = r0
            com.google.android.gms.internal.ads.zzhgx r3 = r5.zzg
            java.lang.Object r3 = r3.zzb()
            com.google.common.util.concurrent.f r3 = (com.google.common.util.concurrent.f) r3
            r4 = 1
            r2[r4] = r3
            com.google.android.gms.internal.ads.zzflm r3 = r5.zza
            com.google.android.gms.internal.ads.zzfku r1 = r3.zza(r1, r2)
            com.google.android.gms.internal.ads.zzdaa r2 = new com.google.android.gms.internal.ads.zzdaa
            r2.<init>()
            com.google.android.gms.internal.ads.zzfld r0 = r1.zza(r2)
            com.google.android.gms.internal.ads.zzfkr r0 = r0.zza()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdab.zzc():com.google.common.util.concurrent.f");
    }
}
