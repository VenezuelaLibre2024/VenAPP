package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.google.android.gms.common.internal.s;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzepf extends t0 {
    private final Context zza;
    private final h0 zzb;
    private final zzfhh zzc;
    private final zzcuf zzd;
    private final ViewGroup zze;
    private final zzdwf zzf;

    public zzepf(Context context, h0 h0Var, zzfhh zzfhhVar, zzcuf zzcufVar, zzdwf zzdwfVar) {
        this.zza = context;
        this.zzb = h0Var;
        this.zzc = zzfhhVar;
        this.zzd = zzcufVar;
        this.zzf = zzdwfVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzc = zzcufVar.zzc();
        t.r();
        frameLayout.addView(zzc, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().f8833c);
        frameLayout.setMinimumWidth(zzg().f8836f);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzA() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzB() {
        s.e("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc(null);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzC(e0 e0Var) {
        zzcec.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzD(h0 h0Var) {
        zzcec.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzE(y0 y0Var) {
        zzcec.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzF(z4 z4Var) {
        s.e("setAdSize must be called on the main UI thread.");
        zzcuf zzcufVar = this.zzd;
        if (zzcufVar != null) {
            zzcufVar.zzh(this.zze, z4Var);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzG(c1 c1Var) {
        zzeqe zzeqeVar = this.zzc.zzc;
        if (zzeqeVar != null) {
            zzeqeVar.zzm(c1Var);
        }
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
    public final void zzN(boolean z10) {
        zzcec.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzO(zzbha zzbhaVar) {
        zzcec.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzP(i2 i2Var) {
        if (!((Boolean) a0.c().zza(zzbgc.zzkY)).booleanValue()) {
            zzcec.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzeqe zzeqeVar = this.zzc.zzc;
        if (zzeqeVar != null) {
            try {
                if (!i2Var.zzf()) {
                    this.zzf.zze();
                }
            } catch (RemoteException e10) {
                zzcec.zzf("Error in making CSI ping for reporting paid event callback", e10);
            }
            zzeqeVar.zzl(i2Var);
        }
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
    public final void zzU(n4 n4Var) {
        zzcec.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzW(com.google.android.gms.dynamic.b bVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final boolean zzaa(u4 u4Var) {
        zzcec.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzab(g1 g1Var) {
        zzcec.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final Bundle zzd() {
        zzcec.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final z4 zzg() {
        s.e("getAdSize must be called on the main UI thread.");
        return zzfhn.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final h0 zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final c1 zzj() {
        return this.zzc.zzn;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final p2 zzk() {
        return this.zzd.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final s2 zzl() {
        return this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final com.google.android.gms.dynamic.b zzn() {
        return com.google.android.gms.dynamic.d.h2(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final String zzr() {
        return this.zzc.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final String zzs() {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final String zzt() {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzx() {
        s.e("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzy(u4 u4Var, k0 k0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.u0
    public final void zzz() {
        s.e("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb(null);
    }
}
