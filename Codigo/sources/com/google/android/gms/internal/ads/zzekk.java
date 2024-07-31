package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzekk extends zzcae implements zzdch {
    private zzcaf zza;
    private zzdcg zzb;
    private zzdjf zzc;

    @Override // com.google.android.gms.internal.ads.zzdch
    public final synchronized void zza(zzdcg zzdcgVar) {
        this.zzb = zzdcgVar;
    }

    public final synchronized void zzc(zzcaf zzcafVar) {
        this.zza = zzcafVar;
    }

    public final synchronized void zzd(zzdjf zzdjfVar) {
        this.zzc = zzdjfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zze(com.google.android.gms.dynamic.b bVar) {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            ((zzenp) zzcafVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzf(com.google.android.gms.dynamic.b bVar) {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            zzcafVar.zzf(bVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzg(com.google.android.gms.dynamic.b bVar, int i10) {
        zzdcg zzdcgVar = this.zzb;
        if (zzdcgVar != null) {
            zzdcgVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzh(com.google.android.gms.dynamic.b bVar) {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            ((zzenp) zzcafVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzi(com.google.android.gms.dynamic.b bVar) {
        zzdcg zzdcgVar = this.zzb;
        if (zzdcgVar != null) {
            zzdcgVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzj(com.google.android.gms.dynamic.b bVar) {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            ((zzenp) zzcafVar).zza.zzbA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzk(com.google.android.gms.dynamic.b bVar, int i10) {
        zzdjf zzdjfVar = this.zzc;
        if (zzdjfVar != null) {
            zzcec.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzeno) zzdjfVar).zzc.zza)));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzenn.<init>(com.google.android.gms.internal.ads.zzeno, com.google.android.gms.internal.ads.zzfgy, com.google.android.gms.internal.ads.zzfgm, com.google.android.gms.internal.ads.zzeiq):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzl(com.google.android.gms.dynamic.b r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzdjf r6 = r5.zzc     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L29
            r0 = r6
            com.google.android.gms.internal.ads.zzeno r0 = (com.google.android.gms.internal.ads.zzeno) r0     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzenq r0 = r0.zzd     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzenq.zzc(r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzenn r1 = new com.google.android.gms.internal.ads.zzenn     // Catch: java.lang.Throwable -> L2b
            r2 = r6
            com.google.android.gms.internal.ads.zzeno r2 = (com.google.android.gms.internal.ads.zzeno) r2     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzeiq r2 = r2.zzc     // Catch: java.lang.Throwable -> L2b
            r3 = r6
            com.google.android.gms.internal.ads.zzeno r3 = (com.google.android.gms.internal.ads.zzeno) r3     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzfgm r3 = r3.zzb     // Catch: java.lang.Throwable -> L2b
            r4 = r6
            com.google.android.gms.internal.ads.zzeno r4 = (com.google.android.gms.internal.ads.zzeno) r4     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzfgy r4 = r4.zza     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.internal.ads.zzeno r6 = (com.google.android.gms.internal.ads.zzeno) r6     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            r0.execute(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r5)
            return
        L29:
            monitor-exit(r5)
            return
        L2b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekk.zzl(com.google.android.gms.dynamic.b):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzm(com.google.android.gms.dynamic.b bVar, zzcag zzcagVar) {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            ((zzenp) zzcafVar).zzd.zza(zzcagVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzn(com.google.android.gms.dynamic.b bVar) {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            ((zzenp) zzcafVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzo(com.google.android.gms.dynamic.b bVar) {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            ((zzenp) zzcafVar).zzd.zzc();
        }
    }
}
