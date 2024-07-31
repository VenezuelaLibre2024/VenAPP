package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzdyi {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdua zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdwp zzl;
    private final zzcei zzm;
    private final zzdht zzo;
    private final zzfnc zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzceu zze = new zzceu();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = t.b().b();

    public zzdyi(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdua zzduaVar, ScheduledExecutorService scheduledExecutorService, zzdwp zzdwpVar, zzcei zzceiVar, zzdht zzdhtVar, zzfnc zzfncVar) {
        this.zzh = zzduaVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdwpVar;
        this.zzm = zzceiVar;
        this.zzo = zzdhtVar;
        this.zzp = zzfncVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzdxz.<init>(com.google.android.gms.internal.ads.zzdyi, java.lang.Object, com.google.android.gms.internal.ads.zzceu, java.lang.String, long, com.google.android.gms.internal.ads.zzfmo):void, class status: GENERATED_AND_UNLOADED
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
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzdyi r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyi.zzj(com.google.android.gms.internal.ads.zzdyi, java.lang.String):void");
    }

    private final synchronized com.google.common.util.concurrent.f zzu() {
        String zzc = t.q().zzi().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgen.zzh(zzc);
        }
        zzceu zzceuVar = new zzceu();
        t.q().zzi().a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyb
            public final /* synthetic */ zzceu zzb;

            public /* synthetic */ zzdyb(zzceu zzceuVar2) {
                r2 = zzceuVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdyi.this.zzo(r2);
            }
        });
        return zzceuVar2;
    }

    public final void zzv(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzbpd(str, z10, i10, str2));
    }

    public final /* synthetic */ Object zzf(zzfmo zzfmoVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfmoVar.zzf(true);
        this.zzp.zzb(zzfmoVar.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbpd zzbpdVar = (zzbpd) this.zzn.get(str);
            arrayList.add(new zzbpd(str, zzbpdVar.zzb, zzbpdVar.zzc, zzbpdVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (t.b().b() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    public final /* synthetic */ void zzn(String str, zzbph zzbphVar, zzfif zzfifVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbphVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfifVar.zzi(context, zzbphVar, list);
            } catch (RemoteException e10) {
                throw new zzfxz(e10);
            } catch (zzfho unused) {
                zzbphVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e11) {
            zzcec.zzh("", e11);
        }
    }

    public final /* synthetic */ void zzo(zzceu zzceuVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxy
            public final /* synthetic */ zzceu zzb;

            public /* synthetic */ zzdxy(zzceu zzceuVar2) {
                r2 = zzceuVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String zzc = t.q().zzi().zzh().zzc();
                boolean isEmpty = TextUtils.isEmpty(zzc);
                zzceu zzceuVar2 = r2;
                if (isEmpty) {
                    zzceuVar2.zzd(new Exception());
                } else {
                    zzceuVar2.zzc(zzc);
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final /* synthetic */ void zzq(Object obj, zzceu zzceuVar, String str, long j10, zzfmo zzfmoVar) {
        synchronized (obj) {
            if (!zzceuVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (t.b().b() - j10));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfnc zzfncVar = this.zzp;
                zzfmoVar.zzc("Timeout");
                zzfmoVar.zzf(false);
                zzfncVar.zzb(zzfmoVar.zzl());
                zzceuVar.zzc(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbig.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) a0.c().zza(zzbgc.zzbN)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdye
                        public /* synthetic */ zzdye() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdyi.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    com.google.common.util.concurrent.f zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxx
                        public /* synthetic */ zzdxx() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdyi.this.zzm();
                        }
                    }, ((Long) a0.c().zza(zzbgc.zzbP)).longValue(), TimeUnit.SECONDS);
                    zzgen.zzr(zzu, new zzdyg(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(zzbpk zzbpkVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyc
            public final /* synthetic */ zzbpk zzb;

            public /* synthetic */ zzdyc(zzbpk zzbpkVar2) {
                r2 = zzbpkVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdyi zzdyiVar = zzdyi.this;
                try {
                    r2.zzb(zzdyiVar.zzg());
                } catch (RemoteException e10) {
                    zzcec.zzh("", e10);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
