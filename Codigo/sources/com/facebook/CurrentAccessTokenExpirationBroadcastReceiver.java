package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import i4.e0;
import i4.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        n.e(context, "context");
        n.e(intent, "intent");
        if (n.a("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && e0.F()) {
            g.f16980f.e().g();
        }
    }
}
