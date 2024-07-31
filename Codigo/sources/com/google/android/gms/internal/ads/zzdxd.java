package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdxd implements y8.e, zzdds, com.google.android.gms.ads.internal.client.a, zzdax, zzdbr, zzdbs, zzdcl, zzdba, zzfln {
    private final List zza;
    private final zzdwr zzb;
    private long zzc;

    public zzdxd(zzdwr zzdwrVar, zzclg zzclgVar) {
        this.zzb = zzdwrVar;
        this.zza = Collections.singletonList(zzclgVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.a.class, "onAdClicked", new Object[0]);
    }

    @Override // y8.e
    public final void onAppEvent(String str, String str2) {
        zzg(y8.e.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zza() {
        zzg(zzdax.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzb() {
        zzg(zzdax.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzbB(zzbzu zzbzuVar, String str, String str2) {
        zzg(zzdax.class, "onRewarded", zzbzuVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(c3 c3Var) {
        zzg(zzdba.class, "onAdFailedToLoad", Integer.valueOf(c3Var.f8626a), c3Var.f8627b, c3Var.f8628c);
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbL(zzflg zzflgVar, String str) {
        zzg(zzflf.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbM(zzflg zzflgVar, String str, Throwable th2) {
        zzg(zzflf.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbN(zzflg zzflgVar, String str) {
        zzg(zzflf.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbs(Context context) {
        zzg(zzdbs.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbu(Context context) {
        zzg(zzdbs.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv(Context context) {
        zzg(zzdbs.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
        this.zzc = t.b().b();
        zzg(zzdds.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(zzfgy zzfgyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzc() {
        zzg(zzdax.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzd(zzflg zzflgVar, String str) {
        zzg(zzflf.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zze() {
        zzg(zzdax.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdax
    public final void zzf() {
        zzg(zzdax.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbr
    public final void zzq() {
        zzg(zzdbr.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        u1.a("Ad Request Latency : " + (t.b().b() - this.zzc));
        zzg(zzdcl.class, "onAdLoaded", new Object[0]);
    }
}
