package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzcdv;
import i9.b0;
import i9.d0;
import i9.f;
import i9.m;
import i9.s;
import i9.v;
import i9.z;
import java.util.Iterator;
import java.util.Set;
import x8.g;
import x8.h;
import x8.i;
import x8.k;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, b0, d0 {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private g adLoader;
    protected k mAdView;
    protected h9.a mInterstitialAd;

    h buildAdRequest(Context context, f fVar, Bundle bundle, Bundle bundle2) {
        h.a aVar = new h.a();
        Set<String> keywords = fVar.getKeywords();
        if (keywords != null) {
            Iterator<String> it = keywords.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
        }
        if (fVar.isTesting()) {
            x.b();
            aVar.h(zzcdv.zzy(context));
        }
        if (fVar.taggedForChildDirectedTreatment() != -1) {
            aVar.j(fVar.taggedForChildDirectedTreatment() == 1);
        }
        aVar.i(fVar.isDesignedForFamilies());
        aVar.b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.k();
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString("pubid");
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    h9.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // i9.d0
    public s2 getVideoController() {
        k kVar = this.mAdView;
        if (kVar != null) {
            return kVar.e().b();
        }
        return null;
    }

    g.a newAdLoader(Context context, String str) {
        return new g.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, i9.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        k kVar = this.mAdView;
        if (kVar != null) {
            kVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // i9.b0
    public void onImmersiveModeUpdated(boolean z10) {
        h9.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.setImmersiveMode(z10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, i9.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        k kVar = this.mAdView;
        if (kVar != null) {
            kVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, i9.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        k kVar = this.mAdView;
        if (kVar != null) {
            kVar.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, m mVar, Bundle bundle, i iVar, f fVar, Bundle bundle2) {
        k kVar = new k(context);
        this.mAdView = kVar;
        kVar.setAdSize(new i(iVar.j(), iVar.c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, mVar));
        this.mAdView.b(buildAdRequest(context, fVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, s sVar, Bundle bundle, f fVar, Bundle bundle2) {
        h9.a.load(context, getAdUnitId(bundle), buildAdRequest(context, fVar, bundle2, bundle), new c(this, sVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, v vVar, Bundle bundle, z zVar, Bundle bundle2) {
        e eVar = new e(this, vVar);
        g.a c10 = newAdLoader(context, bundle.getString("pubid")).c(eVar);
        c10.g(zVar.getNativeAdOptions());
        c10.d(zVar.getNativeAdRequestOptions());
        if (zVar.isUnifiedNativeAdRequested()) {
            c10.f(eVar);
        }
        if (zVar.zzb()) {
            for (String str : zVar.zza().keySet()) {
                c10.e(str, eVar, true != ((Boolean) zVar.zza().get(str)).booleanValue() ? null : eVar);
            }
        }
        g a10 = c10.a();
        this.adLoader = a10;
        a10.a(buildAdRequest(context, zVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        h9.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.show(null);
        }
    }
}
