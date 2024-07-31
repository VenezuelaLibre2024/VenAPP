package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import i9.g;
import i9.v;
import i9.z;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, v vVar, Bundle bundle, z zVar, Bundle bundle2);
}
