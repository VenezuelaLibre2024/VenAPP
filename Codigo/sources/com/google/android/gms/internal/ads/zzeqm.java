package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
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
import com.google.android.gms.common.internal.s;

/* loaded from: classes2.dex */
public final class zzeqm extends t0 {
    private final z4 zza;
    private final Context zzb;
    private final zzfep zzc;
    private final String zzd;
    private final zzcei zze;
    private final zzeqe zzf;
    private final zzffp zzg;
    private final zzavi zzh;
    private final zzdwf zzi;
    private zzdjn zzj;
    private boolean zzk = ((Boolean) a0.c().zza(zzbgc.zzaD)).booleanValue();

    public zzeqm(Context context, z4 z4Var, String str, zzfep zzfepVar, zzeqe zzeqeVar, zzffp zzffpVar, zzcei zzceiVar, zzavi zzaviVar, zzdwf zzdwfVar) {
        this.zza = z4Var;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfepVar;
        this.zzf = zzeqeVar;
        this.zzg = zzffpVar;
        this.zze = zzceiVar;
        this.zzh = zzaviVar;
        this.zzi = zzdwfVar;
    }

    private final synchronized boolean zze() {
        zzdjn zzdjnVar = this.zzj;
        if (zzdjnVar != null) {
            if (!zzdjnVar.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzB() {
        s.e("resume must be called on the main UI thread.");
        zzdjn zzdjnVar = this.zzj;
        if (zzdjnVar != null) {
            zzdjnVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzC(e0 e0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzD(h0 h0Var) {
        s.e("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(h0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzE(y0 y0Var) {
        s.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzF(z4 z4Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzG(c1 c1Var) {
        s.e("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(c1Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzH(zzbam zzbamVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzI(f5 f5Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzJ(j1 j1Var) {
        this.zzf.zzn(j1Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzK(w2 w2Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzL(boolean z10) {
        s.e("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z10;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzM(zzbxc zzbxcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzO(zzbha zzbhaVar) {
        s.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbhaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzP(i2 i2Var) {
        s.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!i2Var.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e10) {
            zzcec.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzf.zzl(i2Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzQ(zzbxf zzbxfVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzS(zzcaa zzcaaVar) {
        this.zzg.zzm(zzcaaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzU(n4 n4Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzW(com.google.android.gms.dynamic.b bVar) {
        if (this.zzj == null) {
            zzcec.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzp(zzfij.zzd(9, null, null));
            return;
        }
        if (((Boolean) a0.c().zza(zzbgc.zzcz)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) com.google.android.gms.dynamic.d.g2(bVar));
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzX() {
        s.e("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            zzcec.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzp(zzfij.zzd(9, null, null));
        } else {
            if (((Boolean) a0.c().zza(zzbgc.zzcz)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized boolean zzY() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized boolean zzZ() {
        s.e("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0025, B:11:0x0042, B:13:0x004e, B:15:0x0052, B:17:0x005b, B:21:0x0064, B:23:0x006a, B:26:0x003d), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.u4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbhm r0 = com.google.android.gms.internal.ads.zzbhy.zzi     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L8b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8b
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzkG     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = r1
        L25:
            com.google.android.gms.internal.ads.zzcei r2 = r5.zze     // Catch: java.lang.Throwable -> L8b
            int r2 = r2.zzc     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzbfu r3 = com.google.android.gms.internal.ads.zzbgc.zzkH     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzbga r4 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8b
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8b
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.s.e(r0)     // Catch: java.lang.Throwable -> L8b
        L42:
            com.google.android.gms.ads.internal.t.r()     // Catch: java.lang.Throwable -> L8b
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L8b
            boolean r0 = com.google.android.gms.ads.internal.util.j2.g(r0)     // Catch: java.lang.Throwable -> L8b
            r2 = 0
            if (r0 == 0) goto L64
            com.google.android.gms.ads.internal.client.a1 r0 = r6.D     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L64
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcec.zzg(r6)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzeqe r6 = r5.zzf     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L89
            r0 = 4
            com.google.android.gms.ads.internal.client.c3 r0 = com.google.android.gms.internal.ads.zzfij.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L8b
            r6.zzbK(r0)     // Catch: java.lang.Throwable -> L8b
            goto L89
        L64:
            boolean r0 = r5.zze()     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L89
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r6.f8754f     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzfie.zza(r0, r1)     // Catch: java.lang.Throwable -> L8b
            r5.zzj = r2     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzfep r0 = r5.zzc     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.ads.internal.client.z4 r2 = r5.zza     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzfei r3 = new com.google.android.gms.internal.ads.zzfei     // Catch: java.lang.Throwable -> L8b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.internal.ads.zzeql r2 = new com.google.android.gms.internal.ads.zzeql     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L8b
            boolean r6 = r0.zzb(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r5)
            return r6
        L89:
            monitor-exit(r5)
            return r1
        L8b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqm.zzaa(com.google.android.gms.ads.internal.client.u4):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzab(g1 g1Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final Bundle zzd() {
        s.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final z4 zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final h0 zzi() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final c1 zzj() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized p2 zzk() {
        zzdjn zzdjnVar;
        if (((Boolean) a0.c().zza(zzbgc.zzgN)).booleanValue() && (zzdjnVar = this.zzj) != null) {
            return zzdjnVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final s2 zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final com.google.android.gms.dynamic.b zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized String zzs() {
        zzdjn zzdjnVar = this.zzj;
        if (zzdjnVar == null || zzdjnVar.zzl() == null) {
            return null;
        }
        return zzdjnVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized String zzt() {
        zzdjn zzdjnVar = this.zzj;
        if (zzdjnVar == null || zzdjnVar.zzl() == null) {
            return null;
        }
        return zzdjnVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzx() {
        s.e("destroy must be called on the main UI thread.");
        zzdjn zzdjnVar = this.zzj;
        if (zzdjnVar != null) {
            zzdjnVar.zzm().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzy(u4 u4Var, k0 k0Var) {
        this.zzf.zzk(k0Var);
        zzaa(u4Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzz() {
        s.e("pause must be called on the main UI thread.");
        zzdjn zzdjnVar = this.zzj;
        if (zzdjnVar != null) {
            zzdjnVar.zzm().zzb(null);
        }
    }
}
