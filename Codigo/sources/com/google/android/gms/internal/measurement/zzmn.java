package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public class zzmn extends Enum<zzmn> {
    public static final zzmn zza;
    public static final zzmn zzb;
    public static final zzmn zzc;
    public static final zzmn zzd;
    public static final zzmn zze;
    public static final zzmn zzf;
    public static final zzmn zzg;
    public static final zzmn zzh;
    public static final zzmn zzi;
    public static final zzmn zzj;
    public static final zzmn zzk;
    public static final zzmn zzl;
    public static final zzmn zzm;
    public static final zzmn zzn;
    public static final zzmn zzo;
    public static final zzmn zzp;
    public static final zzmn zzq;
    public static final zzmn zzr;
    private static final /* synthetic */ zzmn[] zzs;
    private final zzmx zzt;
    private final int zzu;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.measurement.zzmo.<init>(java.lang.String, int, com.google.android.gms.internal.measurement.zzmx, int, com.google.android.gms.internal.measurement.zzmr):void, class status: NOT_LOADED
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
    static {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmn.<clinit>():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzmn(String str, int i10, zzmx zzmxVar, int i11) {
        super(str, i10);
        this.zzt = zzmxVar;
        this.zzu = i11;
    }

    public /* synthetic */ zzmn(String str, int i10, zzmx zzmxVar, int i11, zzmu zzmuVar) {
        this(str, i10, zzmxVar, i11);
    }

    public static zzmn[] values() {
        return (zzmn[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzmx zzb() {
        return this.zzt;
    }
}
