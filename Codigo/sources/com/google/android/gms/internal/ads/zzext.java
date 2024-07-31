package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzext {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfmz zzd;
    private final zzdwf zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzext(Context context, Executor executor, Set set, zzfmz zzfmzVar, zzdwf zzdwfVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfmzVar;
        this.zze = zzdwfVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzexr.<init>(com.google.android.gms.internal.ads.zzext, long, com.google.android.gms.internal.ads.zzexq):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.common.util.concurrent.f zza(java.lang.Object r10) {
        /*
            r9 = this;
            android.content.Context r0 = r9.zza
            r1 = 8
            com.google.android.gms.internal.ads.zzfmo r0 = com.google.android.gms.internal.ads.zzfmn.zza(r0, r1)
            r0.zzh()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r9.zzb
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.zzbfu r3 = com.google.android.gms.internal.ads.zzbgc.zzlh
            com.google.android.gms.internal.ads.zzbga r4 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r4 = r4.zza(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L41
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r2 = r2.zza(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            java.util.List r2 = java.util.Arrays.asList(r2)
        L41:
            la.f r3 = com.google.android.gms.ads.internal.t.b()
            long r3 = r3.b()
            r9.zzf = r3
            java.util.Set r3 = r9.zzb
            java.util.Iterator r3 = r3.iterator()
        L51:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r3.next()
            com.google.android.gms.internal.ads.zzexq r4 = (com.google.android.gms.internal.ads.zzexq) r4
            int r5 = r4.zza()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L51
            la.f r5 = com.google.android.gms.ads.internal.t.b()
            long r5 = r5.b()
            com.google.common.util.concurrent.f r7 = r4.zzb()
            com.google.android.gms.internal.ads.zzexr r8 = new com.google.android.gms.internal.ads.zzexr
            r8.<init>()
            com.google.android.gms.internal.ads.zzgey r4 = com.google.android.gms.internal.ads.zzcep.zzf
            r7.addListener(r8, r4)
            r1.add(r7)
            goto L51
        L85:
            com.google.android.gms.internal.ads.zzgem r2 = com.google.android.gms.internal.ads.zzgen.zzb(r1)
            com.google.android.gms.internal.ads.zzexs r3 = new com.google.android.gms.internal.ads.zzexs
            r3.<init>()
            java.util.concurrent.Executor r10 = r9.zzc
            com.google.common.util.concurrent.f r10 = r2.zza(r3, r10)
            boolean r1 = com.google.android.gms.internal.ads.zzfnc.zza()
            if (r1 == 0) goto L9f
            com.google.android.gms.internal.ads.zzfmz r1 = r9.zzd
            com.google.android.gms.internal.ads.zzfmy.zza(r10, r1, r0)
        L9f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzext.zza(java.lang.Object):com.google.common.util.concurrent.f");
    }

    public final void zzb(long j10, zzexq zzexqVar) {
        long b10 = t.b().b() - j10;
        if (((Boolean) zzbid.zza.zze()).booleanValue()) {
            u1.a("Signal runtime (ms) : " + zzfxt.zzc(zzexqVar.getClass().getCanonicalName()) + " = " + b10);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzca)).booleanValue()) {
            zzdwe zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzexqVar.zza()));
            zza.zzb("clat_ms", String.valueOf(b10));
            if (((Boolean) a0.c().zza(zzbgc.zzcb)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zza.zzb("seq_num", t.q().zzh().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        zza.zzb((zzexqVar.zza() <= 39 || zzexqVar.zza() >= 52) ? "lat_clsg" : "lat_gmssg", String.valueOf(t.b().b() - this.zzf));
                    }
                }
            }
            zza.zzh();
        }
    }
}
