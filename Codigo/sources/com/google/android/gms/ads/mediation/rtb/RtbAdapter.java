package com.google.android.gms.ads.mediation.rtb;

import i9.a;
import i9.c0;
import i9.e;
import i9.h;
import i9.i;
import i9.j;
import i9.k;
import i9.l;
import i9.o;
import i9.p;
import i9.q;
import i9.r;
import i9.t;
import i9.u;
import i9.w;
import i9.x;
import i9.y;
import k9.b;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(k9.a aVar, b bVar);

    public void loadRtbAppOpenAd(i iVar, e<h, Object> eVar) {
        loadAppOpenAd(iVar, eVar);
    }

    public void loadRtbBannerAd(l lVar, e<j, k> eVar) {
        loadBannerAd(lVar, eVar);
    }

    public void loadRtbInterscrollerAd(l lVar, e<o, k> eVar) {
        eVar.onFailure(new x8.b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(r rVar, e<p, q> eVar) {
        loadInterstitialAd(rVar, eVar);
    }

    public void loadRtbNativeAd(u uVar, e<c0, t> eVar) {
        loadNativeAd(uVar, eVar);
    }

    public void loadRtbRewardedAd(y yVar, e<w, x> eVar) {
        loadRewardedAd(yVar, eVar);
    }

    public void loadRtbRewardedInterstitialAd(y yVar, e<w, x> eVar) {
        loadRewardedInterstitialAd(yVar, eVar);
    }
}
