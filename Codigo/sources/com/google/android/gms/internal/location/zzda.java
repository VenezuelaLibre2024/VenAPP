package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ca.d;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.l;
import com.google.android.gms.location.m0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzda extends h {
    public static final /* synthetic */ int zze = 0;
    private final androidx.collection.h zzf;
    private final androidx.collection.h zzg;
    private final androidx.collection.h zzh;

    public zzda(Context context, Looper looper, e eVar, f fVar, n nVar) {
        super(context, looper, 23, eVar, fVar, nVar);
        this.zzf = new androidx.collection.h();
        this.zzg = new androidx.collection.h();
        this.zzh = new androidx.collection.h();
    }

    private final boolean zzE(d dVar) {
        d dVar2;
        d[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                dVar2 = null;
                break;
            }
            dVar2 = availableFeatures[i10];
            if (dVar.u1().equals(dVar2.u1())) {
                break;
            }
            i10++;
        }
        return dVar2 != null && dVar2.v1() >= dVar.v1();
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    public final d[] getApiFeatures() {
        return m0.f9864l;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionSuspended(int i10) {
        super.onConnectionSuspended(i10);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(boolean z10, TaskCompletionSource taskCompletionSource) {
        if (zzE(m0.f9859g)) {
            ((zzo) getService()).zzx(z10, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzw(z10);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzB(k.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            zzcw zzcwVar = (zzcw) this.zzg.remove(aVar);
            if (zzcwVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            zzcwVar.zzh();
            if (!z10) {
                taskCompletionSource.setResult(Boolean.TRUE);
            } else if (zzE(m0.f9862j)) {
                ((zzo) getService()).zzy(zzdb.zzb(null, zzcwVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
            } else {
                ((zzo) getService()).zzz(new zzdf(2, null, null, zzcwVar, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
            }
        }
    }

    public final void zzC(k.a aVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzf) {
            zzcz zzczVar = (zzcz) this.zzf.remove(aVar);
            if (zzczVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            zzczVar.zzg();
            if (!z10) {
                taskCompletionSource.setResult(Boolean.TRUE);
            } else if (zzE(m0.f9862j)) {
                ((zzo) getService()).zzy(zzdb.zzc(null, zzczVar, null, null), new zzcl(this, Boolean.TRUE, taskCompletionSource));
            } else {
                ((zzo) getService()).zzz(new zzdf(2, null, zzczVar, null, null, new zzcn(Boolean.TRUE, taskCompletionSource), null));
            }
        }
    }

    public final void zzD(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource, Object obj) {
        if (zzE(m0.f9862j)) {
            ((zzo) getService()).zzy(zzdb.zza(pendingIntent, null, null), new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzz(new zzdf(2, null, null, null, pendingIntent, new zzcn(null, taskCompletionSource), null));
        }
    }

    public final LocationAvailability zzp() {
        return ((zzo) getService()).zzf(getContext().getPackageName());
    }

    public final void zzq(com.google.android.gms.location.k kVar, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) {
        s.k(kVar, "geofencingRequest can't be null.");
        s.k(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzg(kVar, pendingIntent, new zzci(taskCompletionSource));
    }

    public final void zzr(TaskCompletionSource taskCompletionSource) {
        ((zzo) getService()).zzi(new zzcn(null, taskCompletionSource));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.location.zzcf.<init>(com.google.android.gms.common.internal.l):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final void zzs(com.google.android.gms.location.e r8, com.google.android.gms.tasks.CancellationToken r9, com.google.android.gms.tasks.TaskCompletionSource r10) {
        /*
            r7 = this;
            r7.getContext()
            ca.d r0 = com.google.android.gms.location.m0.f9857e
            boolean r0 = r7.zzE(r0)
            if (r0 == 0) goto L25
            android.os.IInterface r0 = r7.getService()
            com.google.android.gms.internal.location.zzo r0 = (com.google.android.gms.internal.location.zzo) r0
            com.google.android.gms.internal.location.zzcm r1 = new com.google.android.gms.internal.location.zzcm
            r1.<init>(r7, r10)
            com.google.android.gms.common.internal.l r8 = r0.zze(r8, r1)
            if (r9 == 0) goto La5
            com.google.android.gms.internal.location.zzcf r10 = new com.google.android.gms.internal.location.zzcf
            r10.<init>()
            r9.onCanceledRequested(r10)
            return
        L25:
            com.google.android.gms.internal.location.zzcj r0 = new com.google.android.gms.internal.location.zzcj
            r0.<init>(r7, r10)
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.location.zzdx.zza()
            java.lang.String r2 = "GetCurrentLocation"
            com.google.android.gms.common.api.internal.k r0 = com.google.android.gms.common.api.internal.l.b(r0, r1, r2)
            com.google.android.gms.common.api.internal.k$a r1 = r0.b()
            r1.getClass()
            com.google.android.gms.internal.location.zzck r2 = new com.google.android.gms.internal.location.zzck
            r2.<init>(r7, r0, r10)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.android.gms.location.LocationRequest$a r3 = new com.google.android.gms.location.LocationRequest$a
            int r4 = r8.x1()
            r5 = 0
            r3.<init>(r4, r5)
            r3.g(r5)
            long r4 = r8.u1()
            r3.b(r4)
            int r4 = r8.v1()
            r3.c(r4)
            long r4 = r8.w1()
            r3.e(r4)
            boolean r4 = r8.zze()
            r3.j(r4)
            int r4 = r8.zza()
            r3.l(r4)
            r4 = 1
            r3.i(r4)
            java.lang.String r4 = r8.zzd()
            r3.k(r4)
            android.os.WorkSource r8 = r8.y1()
            r3.m(r8)
            com.google.android.gms.location.LocationRequest r8 = r3.a()
            r7.zzu(r2, r8, r0)
            com.google.android.gms.tasks.Task r8 = r0.getTask()
            com.google.android.gms.internal.location.zzcg r0 = new com.google.android.gms.internal.location.zzcg
            r0.<init>()
            r8.addOnCompleteListener(r0)
            if (r9 == 0) goto La5
            com.google.android.gms.internal.location.zzch r8 = new com.google.android.gms.internal.location.zzch
            r8.<init>()
            r9.onCanceledRequested(r8)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzda.zzs(com.google.android.gms.location.e, com.google.android.gms.tasks.CancellationToken, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public final void zzt(l lVar, TaskCompletionSource taskCompletionSource) {
        getContext();
        if (zzE(m0.f9858f)) {
            ((zzo) getService()).zzj(lVar, new zzcm(this, taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((zzo) getService()).zzd());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003b, B:11:0x0044, B:12:0x0080, B:16:0x0057, B:17:0x002e), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003b, B:11:0x0044, B:12:0x0080, B:16:0x0057, B:17:0x002e), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzu(com.google.android.gms.internal.location.zzcs r18, com.google.android.gms.location.LocationRequest r19, com.google.android.gms.tasks.TaskCompletionSource r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.k r3 = r18.zza()
            com.google.android.gms.common.api.internal.k$a r4 = r3.b()
            r4.getClass()
            ca.d r5 = com.google.android.gms.location.m0.f9862j
            boolean r5 = r1.zzE(r5)
            androidx.collection.h r6 = r1.zzg
            monitor-enter(r6)
            androidx.collection.h r7 = r1.zzg     // Catch: java.lang.Throwable -> L82
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcw r7 = (com.google.android.gms.internal.location.zzcw) r7     // Catch: java.lang.Throwable -> L82
            r8 = 0
            if (r7 == 0) goto L2e
            if (r5 == 0) goto L28
            goto L2e
        L28:
            r7.zzg(r3)     // Catch: java.lang.Throwable -> L82
            r13 = r7
            r7 = r8
            goto L3b
        L2e:
            com.google.android.gms.internal.location.zzcw r3 = new com.google.android.gms.internal.location.zzcw     // Catch: java.lang.Throwable -> L82
            r9 = r18
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L82
            androidx.collection.h r9 = r1.zzg     // Catch: java.lang.Throwable -> L82
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L82
            r13 = r3
        L3b:
            r17.getContext()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r4.a()     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L57
            android.os.IInterface r4 = r17.getService()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdb r3 = com.google.android.gms.internal.location.zzdb.zzb(r7, r13, r8, r3)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcl r5 = new com.google.android.gms.internal.location.zzcl     // Catch: java.lang.Throwable -> L82
            r5.<init>(r1, r8, r2)     // Catch: java.lang.Throwable -> L82
            r4.zzk(r3, r0, r5)     // Catch: java.lang.Throwable -> L82
            goto L80
        L57:
            android.os.IInterface r4 = r17.getService()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch: java.lang.Throwable -> L82
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L82
            r5.k(r8)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest r0 = r5.a()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdd r11 = com.google.android.gms.internal.location.zzdd.zza(r8, r0)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcp r15 = new com.google.android.gms.internal.location.zzcp     // Catch: java.lang.Throwable -> L82
            r15.<init>(r2, r13)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdf r0 = new com.google.android.gms.internal.location.zzdf     // Catch: java.lang.Throwable -> L82
            r10 = 1
            r12 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L82
            r4.zzz(r0)     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            return
        L82:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzda.zzu(com.google.android.gms.internal.location.zzcs, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003b, B:11:0x0044, B:12:0x0080, B:16:0x0057, B:17:0x002e), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003b, B:11:0x0044, B:12:0x0080, B:16:0x0057, B:17:0x002e), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzv(com.google.android.gms.internal.location.zzcs r18, com.google.android.gms.location.LocationRequest r19, com.google.android.gms.tasks.TaskCompletionSource r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.k r3 = r18.zza()
            com.google.android.gms.common.api.internal.k$a r4 = r3.b()
            r4.getClass()
            ca.d r5 = com.google.android.gms.location.m0.f9862j
            boolean r5 = r1.zzE(r5)
            androidx.collection.h r6 = r1.zzf
            monitor-enter(r6)
            androidx.collection.h r7 = r1.zzf     // Catch: java.lang.Throwable -> L82
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcz r7 = (com.google.android.gms.internal.location.zzcz) r7     // Catch: java.lang.Throwable -> L82
            r8 = 0
            if (r7 == 0) goto L2e
            if (r5 == 0) goto L28
            goto L2e
        L28:
            r7.zzf(r3)     // Catch: java.lang.Throwable -> L82
            r12 = r7
            r7 = r8
            goto L3b
        L2e:
            com.google.android.gms.internal.location.zzcz r3 = new com.google.android.gms.internal.location.zzcz     // Catch: java.lang.Throwable -> L82
            r9 = r18
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L82
            androidx.collection.h r9 = r1.zzf     // Catch: java.lang.Throwable -> L82
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L82
            r12 = r3
        L3b:
            r17.getContext()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = r4.a()     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L57
            android.os.IInterface r4 = r17.getService()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdb r3 = com.google.android.gms.internal.location.zzdb.zzc(r7, r12, r8, r3)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzcl r5 = new com.google.android.gms.internal.location.zzcl     // Catch: java.lang.Throwable -> L82
            r5.<init>(r1, r8, r2)     // Catch: java.lang.Throwable -> L82
            r4.zzk(r3, r0, r5)     // Catch: java.lang.Throwable -> L82
            goto L80
        L57:
            android.os.IInterface r4 = r17.getService()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzo r4 = (com.google.android.gms.internal.location.zzo) r4     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest$a r5 = new com.google.android.gms.location.LocationRequest$a     // Catch: java.lang.Throwable -> L82
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L82
            r5.k(r8)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.location.LocationRequest r0 = r5.a()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdd r11 = com.google.android.gms.internal.location.zzdd.zza(r8, r0)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzco r15 = new com.google.android.gms.internal.location.zzco     // Catch: java.lang.Throwable -> L82
            r15.<init>(r2, r12)     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.internal.location.zzdf r0 = new com.google.android.gms.internal.location.zzdf     // Catch: java.lang.Throwable -> L82
            r10 = 1
            r13 = 0
            r14 = 0
            r9 = r0
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L82
            r4.zzz(r0)     // Catch: java.lang.Throwable -> L82
        L80:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            return
        L82:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L82
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzda.zzv(com.google.android.gms.internal.location.zzcs, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public final void zzw(PendingIntent pendingIntent, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        getContext();
        if (zzE(m0.f9862j)) {
            ((zzo) getService()).zzk(zzdb.zza(pendingIntent, null, null), locationRequest, new zzcl(this, null, taskCompletionSource));
            return;
        }
        zzo zzoVar = (zzo) getService();
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        aVar.k(null);
        zzoVar.zzz(new zzdf(1, zzdd.zza(null, aVar.a()), null, null, pendingIntent, new zzcn(null, taskCompletionSource), "PendingIntent@" + pendingIntent.hashCode()));
    }

    public final void zzx(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) {
        s.k(pendingIntent, "PendingIntent must be specified.");
        ((zzo) getService()).zzn(pendingIntent, new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzy(List list, TaskCompletionSource taskCompletionSource) {
        s.b((list == null || list.isEmpty()) ? false : true, "geofenceRequestIds can't be null nor empty.");
        ((zzo) getService()).zzo((String[]) list.toArray(new String[0]), new zzci(taskCompletionSource), getContext().getPackageName());
    }

    public final void zzz(Location location, TaskCompletionSource taskCompletionSource) {
        if (zzE(m0.f9860h)) {
            ((zzo) getService()).zzv(location, new zzcl(this, null, taskCompletionSource));
        } else {
            ((zzo) getService()).zzu(location);
            taskCompletionSource.setResult(null);
        }
    }
}
