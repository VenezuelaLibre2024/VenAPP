package com.google.android.gms.internal.ads;

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
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.common.internal.s;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzepk extends t0 implements zzddn {
    private final Context zza;
    private final zzfcy zzb;
    private final String zzc;
    private final zzeqe zzd;
    private z4 zze;
    private final zzfhf zzf;
    private final zzcei zzg;
    private final zzdwf zzh;
    private zzcuf zzi;

    public zzepk(Context context, z4 z4Var, String str, zzfcy zzfcyVar, zzeqe zzeqeVar, zzcei zzceiVar, zzdwf zzdwfVar) {
        this.zza = context;
        this.zzb = zzfcyVar;
        this.zze = z4Var;
        this.zzc = str;
        this.zzd = zzeqeVar;
        this.zzf = zzfcyVar.zzi();
        this.zzg = zzceiVar;
        this.zzh = zzdwfVar;
        zzfcyVar.zzp(this);
    }

    private final synchronized void zze(z4 z4Var) {
        this.zzf.zzr(z4Var);
        this.zzf.zzw(this.zze.f8844y);
    }

    private final synchronized boolean zzf(u4 u4Var) {
        if (zzh()) {
            s.e("loadAd must be called on the main UI thread.");
        }
        t.r();
        if (!j2.g(this.zza) || u4Var.D != null) {
            zzfie.zza(this.zza, u4Var.f8754f);
            return this.zzb.zzb(u4Var, this.zzc, null, new zzepj(this));
        }
        zzcec.zzg("Failed to load the ad because app ID is missing.");
        zzeqe zzeqeVar = this.zzd;
        if (zzeqeVar != null) {
            zzeqeVar.zzbK(zzfij.zzd(4, null, null));
        }
        return false;
    }

    private final boolean zzh() {
        boolean z10;
        if (((Boolean) zzbhy.zzf.zze()).booleanValue()) {
            if (((Boolean) a0.c().zza(zzbgc.zzkG)).booleanValue()) {
                z10 = true;
                return this.zzg.zzc >= ((Integer) a0.c().zza(zzbgc.zzkH)).intValue() || !z10;
            }
        }
        z10 = false;
        if (this.zzg.zzc >= ((Integer) a0.c().zza(zzbgc.zzkH)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzA() {
        s.e("recordManualImpression must be called on the main UI thread.");
        zzcuf zzcufVar = this.zzi;
        if (zzcufVar != null) {
            zzcufVar.zzg();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzkI)).intValue()) goto L31;
     */
    @Override // com.google.android.gms.ads.internal.client.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbhm r0 = com.google.android.gms.internal.ads.zzbhy.zzh     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzkC     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzcei r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.zzc     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbfu r1 = com.google.android.gms.internal.ads.zzbgc.zzkI     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.s.e(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcuf r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzdbw r0 = r0.zzm()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepk.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzC(e0 e0Var) {
        if (zzh()) {
            s.e("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(e0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzD(h0 h0Var) {
        if (zzh()) {
            s.e("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(h0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzE(y0 y0Var) {
        s.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzF(z4 z4Var) {
        s.e("setAdSize must be called on the main UI thread.");
        this.zzf.zzr(z4Var);
        this.zze = z4Var;
        zzcuf zzcufVar = this.zzi;
        if (zzcufVar != null) {
            zzcufVar.zzh(this.zzb.zzd(), z4Var);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzG(c1 c1Var) {
        if (zzh()) {
            s.e("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(c1Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzH(zzbam zzbamVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzI(f5 f5Var) {
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
        if (zzh()) {
            s.e("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzy(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzO(zzbha zzbhaVar) {
        s.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbhaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzP(i2 i2Var) {
        if (zzh()) {
            s.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!i2Var.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e10) {
            zzcec.zzf("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzd.zzl(i2Var);
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
        if (zzh()) {
            s.e("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzF(n4Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzW(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized boolean zzY() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzddn
    public final synchronized void zza() {
        if (!this.zzb.zzr()) {
            this.zzb.zzn();
            return;
        }
        z4 zzg = this.zzf.zzg();
        zzcuf zzcufVar = this.zzi;
        if (zzcufVar != null && zzcufVar.zzf() != null && this.zzf.zzO()) {
            zzg = zzfhn.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
        }
        zze(zzg);
        try {
            zzf(this.zzf.zze());
        } catch (RemoteException unused) {
            zzcec.zzj("Failed to refresh the banner ad.");
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized boolean zzaa(u4 u4Var) {
        zze(this.zze);
        return zzf(u4Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized void zzab(g1 g1Var) {
        s.e("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzQ(g1Var);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final Bundle zzd() {
        s.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized z4 zzg() {
        s.e("getAdSize must be called on the main UI thread.");
        zzcuf zzcufVar = this.zzi;
        if (zzcufVar != null) {
            return zzfhn.zza(this.zza, Collections.singletonList(zzcufVar.zze()));
        }
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final h0 zzi() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final c1 zzj() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized p2 zzk() {
        zzcuf zzcufVar;
        if (((Boolean) a0.c().zza(zzbgc.zzgN)).booleanValue() && (zzcufVar = this.zzi) != null) {
            return zzcufVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized s2 zzl() {
        s.e("getVideoController must be called from the main thread.");
        zzcuf zzcufVar = this.zzi;
        if (zzcufVar == null) {
            return null;
        }
        return zzcufVar.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final com.google.android.gms.dynamic.b zzn() {
        if (zzh()) {
            s.e("getAdFrame must be called on the main UI thread.");
        }
        return com.google.android.gms.dynamic.d.h2(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized String zzs() {
        zzcuf zzcufVar = this.zzi;
        if (zzcufVar == null || zzcufVar.zzl() == null) {
            return null;
        }
        return zzcufVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final synchronized String zzt() {
        zzcuf zzcufVar = this.zzi;
        if (zzcufVar == null || zzcufVar.zzl() == null) {
            return null;
        }
        return zzcufVar.zzl().zzg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzkI)).intValue()) goto L31;
     */
    @Override // com.google.android.gms.ads.internal.client.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbhm r0 = com.google.android.gms.internal.ads.zzbhy.zze     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzkD     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzcei r0 = r3.zzg     // Catch: java.lang.Throwable -> L47
            int r0 = r0.zzc     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbfu r1 = com.google.android.gms.internal.ads.zzbgc.zzkI     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L47
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L47
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.s.e(r0)     // Catch: java.lang.Throwable -> L47
        L3c:
            com.google.android.gms.internal.ads.zzcuf r0 = r3.zzi     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L45
            r0.zzb()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepk.zzx():void");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzy(u4 u4Var, k0 k0Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.a0.c().zza(com.google.android.gms.internal.ads.zzbgc.zzkI)).intValue()) goto L31;
     */
    @Override // com.google.android.gms.ads.internal.client.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbhm r0 = com.google.android.gms.internal.ads.zzbhy.zzg     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzkE     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzcei r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.zzc     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbfu r1 = com.google.android.gms.internal.ads.zzbgc.zzkI     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.a0.c()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.s.e(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcuf r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzdbw r0 = r0.zzm()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepk.zzz():void");
    }
}
