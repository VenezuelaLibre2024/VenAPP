package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import i9.z;
import j9.d;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends j9.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, z zVar, Bundle bundle);
}
