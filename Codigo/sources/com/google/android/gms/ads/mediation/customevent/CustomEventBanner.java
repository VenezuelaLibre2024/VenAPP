package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import i9.f;
import x8.i;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends j9.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, j9.b bVar, String str, i iVar, f fVar, Bundle bundle);
}
