package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.c1;
import com.google.android.gms.ads.internal.client.e0;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.j1;
import com.google.android.gms.ads.internal.client.k0;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.t0;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.w2;
import com.google.android.gms.ads.internal.client.y0;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.internal.s;
import g9.w;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzfcs extends t0 implements w, zzbad {
    protected zzctz zza;
    private final zzclg zzb;
    private final Context zzc;
    private final String zze;
    private final zzfcm zzf;
    private final zzfck zzg;
    private final zzcei zzh;
    private final zzdwf zzi;
    private zzctn zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzfcs(zzclg zzclgVar, Context context, String str, zzfcm zzfcmVar, zzfck zzfckVar, zzcei zzceiVar, zzdwf zzdwfVar) {
        this.zzb = zzclgVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfcmVar;
        this.zzg = zzfckVar;
        this.zzh = zzceiVar;
        this.zzi = zzdwfVar;
        zzfckVar.zzm(this);
    }

    private final synchronized void zzq(int i10) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzctn zzctnVar = this.zzk;
            if (zzctnVar != null) {
                t.d().zze(zzctnVar);
            }
            if (this.zza != null) {
                long j10 = -1;
                if (this.zzj != -1) {
                    j10 = t.b().b() - this.zzj;
                }
                this.zza.zze(j10, i10);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzB() {
        s.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzC(e0 e0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzD(h0 h0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzE(y0 y0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzF(z4 z4Var) {
        s.e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzG(c1 c1Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzH(zzbam zzbamVar) {
        this.zzg.zzo(zzbamVar);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzI(f5 f5Var) {
        this.zzf.zzl(f5Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzJ(j1 j1Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzK(w2 w2Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzL(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzM(zzbxc zzbxcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzO(zzbha zzbhaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzP(i2 i2Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzQ(zzbxf zzbxfVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzS(zzcaa zzcaaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzU(n4 n4Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzW(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized boolean zzY() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zza() {
        zzq(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0025, B:11:0x0042, B:13:0x004d, B:16:0x0052, B:20:0x0064, B:24:0x006c, B:27:0x003d), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.u4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbhm r0 = com.google.android.gms.internal.ads.zzbhy.zzd     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzkG     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = r1
        L25:
            com.google.android.gms.internal.ads.zzcei r2 = r5.zzh     // Catch: java.lang.Throwable -> L87
            int r2 = r2.zzc     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbfu r3 = com.google.android.gms.internal.ads.zzbgc.zzkH     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbga r4 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L87
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L87
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.s.e(r0)     // Catch: java.lang.Throwable -> L87
        L42:
            com.google.android.gms.ads.internal.t.r()     // Catch: java.lang.Throwable -> L87
            android.content.Context r0 = r5.zzc     // Catch: java.lang.Throwable -> L87
            boolean r0 = com.google.android.gms.ads.internal.util.j2.g(r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L64
            com.google.android.gms.ads.internal.client.a1 r0 = r6.D     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcec.zzg(r6)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfck r6 = r5.zzg     // Catch: java.lang.Throwable -> L87
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.c3 r0 = com.google.android.gms.internal.ads.zzfij.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L87
            r6.zzbK(r0)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r1
        L64:
            boolean r0 = r5.zzY()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6c
            monitor-exit(r5)
            return r1
        L6c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            r5.zzd = r0     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfcq r0 = new com.google.android.gms.internal.ads.zzfcq     // Catch: java.lang.Throwable -> L87
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfcm r1 = r5.zzf     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r5.zze     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzfcr r3 = new com.google.android.gms.internal.ads.zzfcr     // Catch: java.lang.Throwable -> L87
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L87
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r6
        L87:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcs.zzaa(com.google.android.gms.ads.internal.client.u4):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzab(g1 g1Var) {
    }

    @Override // g9.w
    public final synchronized void zzbA() {
        if (this.zza != null) {
            this.zzj = t.b().b();
            int zza = this.zza.zza();
            if (zza > 0) {
                zzctn zzctnVar = new zzctn(this.zzb.zzC(), t.b());
                this.zzk = zzctnVar;
                zzctnVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcp
                    public /* synthetic */ zzfcp() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfcs.this.zzp();
                    }
                });
            }
        }
    }

    @Override // g9.w
    public final synchronized void zzbC() {
        zzctz zzctzVar = this.zza;
        if (zzctzVar != null) {
            zzctzVar.zze(t.b().b() - this.zzj, 1);
        }
    }

    @Override // g9.w
    public final void zzbD(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 != 0) {
            zzq(i11 != 1 ? i11 != 2 ? 6 : 3 : 4);
        } else {
            zzq(2);
        }
    }

    @Override // g9.w
    public final void zzbP() {
    }

    @Override // g9.w
    public final void zzbt() {
    }

    @Override // g9.w
    public final void zzbz() {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized z4 zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final h0 zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final c1 zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized p2 zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized s2 zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final com.google.android.gms.dynamic.b zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    public final void zzp() {
        this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfco
            public /* synthetic */ zzfco() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzfcs.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzx() {
        s.e("destroy must be called on the main UI thread.");
        zzctz zzctzVar = this.zza;
        if (zzctzVar != null) {
            zzctzVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzy(u4 u4Var, k0 k0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzz() {
        s.e("pause must be called on the main UI thread.");
    }
}
