package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import i9.f;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends j9.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, j9.c cVar, String str, f fVar, Bundle bundle);

    void showInterstitial();
}
